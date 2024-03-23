
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor;
import controladores_tabla.render;
import interfaces.*;
import interfaces.DAOClientes;
import java.awt.BorderLayout;
import java.util.Map;
import objetos.alerta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import objetos.cliente;

/**
 *
 * @author Marlon_Mendoza
 */
public class BIBLIOTECA_CLIENTES extends javax.swing.JPanel {

    
    public BIBLIOTECA_CLIENTES() {
        initComponents();
        
        xxx();
        
        cargar_tabla();
    }
    
    public void visualizador (JPanel p)
    {
        p.setSize(1050, 680);
        p.setLocation(0,0);
        C.removeAll();
        C.add(p,BorderLayout.CENTER);
        C.revalidate();
        C.repaint();
    }
    
    public void xxx()
    {
        acciones_botones_inte evento = new acciones_botones_inte() {
            @Override
            public void editar(int row) {
                
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE QUIERES MODIFICAR ESTE CLIENTE?","AVISO",JOptionPane.CANCEL_OPTION);
                
                if (i == 0) {
                    int fila = tabla_clientes.getSelectedRow();
                    String dni = tabla_clientes.getValueAt(fila, 0).toString();
                    String nombre = tabla_clientes.getValueAt(fila, 1).toString();
                    String genero = tabla_clientes.getValueAt(fila, 2).toString();
                    String fecha_nacimiento = tabla_clientes.getValueAt(fila, 3).toString();
                    String numero = tabla_clientes.getValueAt(fila, 4).toString();
                    String direccion = tabla_clientes.getValueAt(fila, 5).toString();
                    String correo = tabla_clientes.getValueAt(fila, 6).toString();
                    String descripcion = tabla_clientes.getValueAt(fila, 7).toString();


                    cliente p = new cliente(dni, nombre, genero, fecha_nacimiento, numero, direccion, correo, descripcion);

                    DAOClientes dao = new DAOClientesImpl();
                    try {
                        dao.modificar(p);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"MODIFICADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new BIBLIOTECA_CLIENTES());
                }
                
   
            }

            @Override
            public void borrar(int row) {
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE ELIMINAR ESTE CLIENTE?","AVISO",JOptionPane.CANCEL_OPTION );
                
                if (i == 0) {
                    int fila = tabla_clientes.getSelectedRow();
                    String dni = tabla_clientes.getValueAt(fila, 0).toString();
                    System.out.println(dni);
                    DAOClientes dao = new DAOClientesImpl();

                    try {
                        dao.eliminar(dni);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"ELIMINADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new BIBLIOTECA_CLIENTES());
                }
            }

            @Override
            public void vizualisar(int row) {
                System.out.println("visualizar: " + row);
                int fila = tabla_clientes.getSelectedRow();
                String dni = tabla_clientes.getValueAt(fila, 0).toString();
                String nombre = tabla_clientes.getValueAt(fila, 1).toString();
                String genero = tabla_clientes.getValueAt(fila, 2).toString();
                String fecha_nacimiento = tabla_clientes.getValueAt(fila, 3).toString();
                String numero = tabla_clientes.getValueAt(fila, 4).toString();
                String direccion = tabla_clientes.getValueAt(fila, 5).toString();
                String correo = tabla_clientes.getValueAt(fila, 6).toString();
                String descripcion = tabla_clientes.getValueAt(fila, 7).toString();
                
                
                
                String css = "<style>"
                            + "body { font-family: Arial, sans-serif; font-size: 14pt; }"
                            + "h1 { font-size: 18pt; color: #007bff; }"
                            + "table { border-collapse: collapse; margin-top: 10px; width: 100%; }"
                            + "th, td { padding: 8px; border-bottom: 1px solid #dee2e6; white-space: normal; word-wrap: break-word; }"
                            + "th { background-color: #f8f9fa; }"
                            + "</style>";


                String mensaje = "<html><body>"
                               + "<h1>Información del Cliente</h1>"
                               + "<table>"
                               + "<tr><th>DNI</th><td>" + dni + "</td></tr>"
                               + "<tr><th>Nombre</th><td>" + nombre + "</td></tr>"
                               + "<tr><th>Género</th><td>" + genero + "</td></tr>"
                               + "<tr><th>Fecha de nacimiento</th><td>" + fecha_nacimiento + "</td></tr>"
                               + "<tr><th>Número</th><td>" + numero + "</td></tr>"
                               + "<tr><th>Dirección</th><td>" + direccion + "</td></tr>"
                               + "<tr><th>Correo</th><td>" + correo + "</td></tr>"
                               + "<tr><th>Descripción</th><td class='descripcion'>" + descripcion + "</td></tr>"
                               + "</table>"
                               + "</body></html>";

                JOptionPane.showMessageDialog(null, "<html>" + css + mensaje, "Información del Cliente", JOptionPane.PLAIN_MESSAGE);


                
            }
        };
        tabla_clientes.getColumnModel().getColumn(8).setCellRenderer( new render());
        tabla_clientes.getColumnModel().getColumn(8).setCellEditor(new editor(evento));
    }
    public void cargar_tabla()
    {
        try {
            DAOClientes dao = new DAOClientesImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_clientes.getModel();
            model.setRowCount(0);
            
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getDNI(),u.getNombre(),u.getGenero(),u.getFechanacimiento(),u.getNumerotelefono(),u.getDireccion(),u.getCorreoelectronico(),u.getDescripcionmedica()}));
        } catch (Exception e) {
        }
    }
    public void buscador(String buscador)
    {
        try {
            DAOClientes dao = new DAOClientesImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_clientes.getModel();
            model.setRowCount(0);
            
            dao.buscar(buscador).forEach((u) -> model.addRow(new Object[]{u.getDNI(),u.getNombre(),u.getGenero(),u.getFechanacimiento(),u.getNumerotelefono(),u.getDireccion(),u.getCorreoelectronico(),u.getDescripcionmedica()}));
        } catch (Exception e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        C.setBackground(new java.awt.Color(204, 226, 235));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));

        tabla_clientes.setBackground(new java.awt.Color(255, 255, 255));
        tabla_clientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dni", "nombre", "genero", "fecha de nacimiento", "numero", "direccion", "correo", "descripcion", "acciones"
            }
        ));
        tabla_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_clientes.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_clientes.setRowHeight(40);
        tabla_clientes.setSelectionBackground(new java.awt.Color(109, 175, 195));
        tabla_clientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_clientes);
        if (tabla_clientes.getColumnModel().getColumnCount() > 0) {
            tabla_clientes.getColumnModel().getColumn(8).setMinWidth(140);
            tabla_clientes.getColumnModel().getColumn(8).setMaxWidth(140);
        }

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4.png"))); // NOI18N

        jButton1.setText("REGISTRAR ALERTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_buscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        buscador(txt_buscar.getText());
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tabla_clientes.getSelectedRow();
        String dni = tabla_clientes.getValueAt(fila, 0).toString();
        String nombre = tabla_clientes.getValueAt(fila, 1).toString();
        REGISTRO_DE_ALERTAS newframe = new REGISTRO_DE_ALERTAS(dni,nombre);
        newframe.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    
}
