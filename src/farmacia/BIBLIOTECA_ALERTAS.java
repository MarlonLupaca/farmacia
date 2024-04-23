
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor;
import controladores_tabla.render;
import interfaces.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Map;
import objetos.alerta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Marlon_Mendoza
 */
public class BIBLIOTECA_ALERTAS extends javax.swing.JPanel {

    
    public BIBLIOTECA_ALERTAS() {
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
                
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE QUIERES MODIFICAR ESTA ALERTA?","AVISO",JOptionPane.CANCEL_OPTION);
                
                if (i == 0) {
                    int fila = tabla_alerta.getSelectedRow();
                    int id = Integer.parseInt(tabla_alerta.getValueAt(fila, 0).toString());
                    String dni = tabla_alerta.getValueAt(fila, 1).toString();
                    String nombre = tabla_alerta.getValueAt(fila, 2).toString();
                    String descripcion = tabla_alerta.getValueAt(fila, 3).toString();
                    String fecha = tabla_alerta.getValueAt(fila, 4).toString();
                    String numero = tabla_alerta.getValueAt(fila, 5).toString();
                    
                    alerta p = new alerta(dni, nombre, descripcion, fecha, numero);

                    DAOAlertas dao = new DAOAlertasImpl();
                    try {
                        dao.modificar(p, id);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_ALERTAS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"MODIFICADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new BIBLIOTECA_ALERTAS());
                }
                
   
            }

            @Override
            public void borrar(int row) {
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE ELIMINAR ESTA ALERTA?","AVISO",JOptionPane.CANCEL_OPTION );
                
                if (i == 0) {
                    int fila = tabla_alerta.getSelectedRow();
                    String id = tabla_alerta.getValueAt(fila, 0).toString();
                    
                    DAOAlertas dao = new DAOAlertasImpl();

                    try {
                        dao.eliminar(id);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_ALERTAS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"ELIMINADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new BIBLIOTECA_ALERTAS());
                }
            }

            @Override
            public void vizualisar(int row) {
                int fila = tabla_alerta.getSelectedRow();
                String id = tabla_alerta.getValueAt(fila, 0).toString();
                String dni = tabla_alerta.getValueAt(fila, 1).toString();
                String nombre = tabla_alerta.getValueAt(fila, 2).toString();
                String descripcion = tabla_alerta.getValueAt(fila, 3).toString();
                String fecha = tabla_alerta.getValueAt(fila, 4).toString();
                String numero = tabla_alerta.getValueAt(fila, 5).toString();

                String mensaje = "ID: " + id + "\n"
                               + "DNI: " + dni + "\n"
                               + "Numero: " + numero + "\n"
                               + "Nombre: " + nombre + "\n"
                               + "Fecha: " + fecha + "\n"
                               + "Descripción: " + descripcion;
                 int fontSize = 14;
                Font font = new Font(Font.SANS_SERIF, Font.PLAIN, fontSize);
                UIManager.put("OptionPane.messageFont", font);
                JOptionPane.showMessageDialog(null, mensaje, "Información del Cliente", JOptionPane.PLAIN_MESSAGE);
            }
        };
        tabla_alerta.getColumnModel().getColumn(6).setCellRenderer( new render());
        tabla_alerta.getColumnModel().getColumn(6).setCellEditor(new editor(evento));
    }
    public void cargar_tabla()
    {
        try {
            DAOAlertas dao = new DAOAlertasImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_alerta.getModel();
            tabla_alerta.getTableHeader().setBackground(new Color(0xB1D4E0));
            model.setRowCount(0);
            Map <String, alerta> mapa = dao.listar3();
             for (Map.Entry<String, alerta> entry : mapa.entrySet()) {
                String id = entry.getKey();
                alerta contenido = entry.getValue();
                String dni = contenido.getDni();
                String nombre = contenido.getNombre();
                String descripcion = contenido.getDescripcion();
                String fecha = contenido.getFecha();
                String numero = contenido.getNumero();
            
            
            model.addRow(new Object[]{id,dni,nombre,descripcion,fecha,numero});
             }
        } catch (Exception e) {
        }
    }
    public void buscador(String buscador)
    {
        try {
            DAOAlertas dao = new DAOAlertasImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_alerta.getModel();
            model.setRowCount(0);
            Map <String, alerta> mapa = dao.buscar(buscador);
            for (Map.Entry<String, alerta> entry : mapa.entrySet()) {
                String id = entry.getKey();
                alerta contenido = entry.getValue();
                String dni = contenido.getDni();
                String nombre = contenido.getNombre();
                String descripcion = contenido.getDescripcion();
                String fecha = contenido.getFecha();
            
            
            model.addRow(new Object[]{id,dni,nombre,descripcion,fecha});
            }
        } catch (Exception e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alerta = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));

        tabla_alerta.setBackground(new java.awt.Color(255, 255, 255));
        tabla_alerta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_alerta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "DESCRIPCION", "FECHA", "NUMERO", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_alerta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_alerta.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_alerta.setRowHeight(40);
        tabla_alerta.setSelectionBackground(new java.awt.Color(109, 175, 195));
        tabla_alerta.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_alerta);
        if (tabla_alerta.getColumnModel().getColumnCount() > 0) {
            tabla_alerta.getColumnModel().getColumn(6).setMinWidth(140);
            tabla_alerta.getColumnModel().getColumn(6).setMaxWidth(140);
        }

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4.png"))); // NOI18N

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_buscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_alerta;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    
}
