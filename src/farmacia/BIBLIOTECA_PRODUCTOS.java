
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
import objetos.producto;

/**
 *
 * @author Marlon_Mendoza
 */
public class BIBLIOTECA_PRODUCTOS extends javax.swing.JPanel {

    
    public BIBLIOTECA_PRODUCTOS() {
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
                
                
                    DAOProductos dao = new DAOProductoImpl();
                    System.out.println("visualizar: " + row);
                    int fila = tabla_productos.getSelectedRow();
                    String id = tabla_productos.getValueAt(fila, 0).toString();
                    try {
                        producto p = dao.visualizar(id);
                        EDITOR_PRODUCTO frame = new EDITOR_PRODUCTO(p);
                        frame.setVisible(true);
                        
                        visualizador(new BIBLIOTECA_PRODUCTOS());
                        
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_PRODUCTOS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
   
            }

            @Override
            public void borrar(int row) {
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE ELIMINAR ESTE PRODUCTO","AVISO",JOptionPane.CANCEL_OPTION );
                
                if (i == 0) {
                    int fila = tabla_productos.getSelectedRow();
                    String id = tabla_productos.getValueAt(fila, 0).toString();
                    
                    DAOProductos dao = new DAOProductoImpl();

                    try {
                        dao.eliminar(id);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_PRODUCTOS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"ELIMINADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new BIBLIOTECA_PRODUCTOS());
                }
            }

            @Override
            public void vizualisar(int row) {
                try {
                    DAOProductos dao = new DAOProductoImpl();
                    System.out.println("visualizar: " + row);
                    int fila = tabla_productos.getSelectedRow();
                    String id = tabla_productos.getValueAt(fila, 0).toString();
                    producto p = dao.visualizar(id);
                    
                    
                    
                    
                    
                    String css = "<style>"
                            + "body { font-family: Arial, sans-serif; font-size: 14pt; }"
                            + "h1 { font-size: 18pt; color: #007bff; }"
                            + "table { border-collapse: collapse; margin-top: 10px; width: 100%; }"
                            + "th, td { padding: 8px; border-bottom: 1px solid #dee2e6; white-space: normal; word-wrap: break-word; }"
                            + "th { background-color: #f8f9fa; }"
                            + "</style>";
                    
                    
                    String mensaje = "<html><body>"
                        + "<h1>Información del Producto</h1>"
                        + "<table>"
                        + "<tr><th>Código Único</th><td>" + p.getCodigo_unico() + "</td></tr>"
                        + "<tr><th>Nombre Producto</th><td>" + p.getNombre_producto() + "</td></tr>"
                        + "<tr><th>Laboratorio</th><td>" + p.getLaboratorio() + "</td></tr>"
                        + "<tr><th>Descripción</th><td>" + p.getDescripcion_produto() + "</td></tr>"
                        + "<tr><th>Principio Activo</th><td>" + p.getPrincipo_activo() + "</td></tr>"
                        + "<tr><th>Código Digemid</th><td>" + p.getCodigo_digemid() + "</td></tr>"
                        + "<tr><th>Lote</th><td>" + p.getLote() + "</td></tr>"
                        + "<tr><th>Ubicación</th><td>" + p.getUbicacion() + "</td></tr>"
                        + "<tr><th>Fecha Vencimiento</th><td>" + p.getFecha_vencimiento() + "</td></tr>"
                        + "<tr><th>Stock</th><td>" + p.getStock() + "</td></tr>"
                        + "<tr><th>Mínimo para Aviso</th><td>" + p.getMinimo_para_aviso() + "</td></tr>"
                        + "<tr><th>Unidad por Blíster</th><td>" + p.getUnidad_x_blister() + "</td></tr>"
                        + "<tr><th>Unidad por Caja</th><td>" + p.getUnidad_x_caja() + "</td></tr>"
                        + "<tr><th>Precio por Unidad</th><td>" + p.getPrecio_x_unidad() + "</td></tr>"
                        + "<tr><th>Precio por Blíster</th><td>" + p.getPrecio_x_blister() + "</td></tr>"
                        + "<tr><th>Precio por Caja</th><td>" + p.getPrecio_x_caja() + "</td></tr>"
                        + "</table>"
                        + "</body></html>";


                    
                    JOptionPane.showMessageDialog(null, "<html>" + css + mensaje, "Información del Cliente", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception ex) {
                    Logger.getLogger(BIBLIOTECA_PRODUCTOS.class.getName()).log(Level.SEVERE, null, ex);
                }


                
            }
        };
        tabla_productos.getColumnModel().getColumn(10).setCellRenderer( new render());
        tabla_productos.getColumnModel().getColumn(10).setCellEditor(new editor(evento));
    }
    public void cargar_tabla()
    {
        try {
            DAOProductos dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
            model.setRowCount(0);
            
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getLaboratorio(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getCodigo_digemid(),u.getUbicacion(),u.getFecha_vencimiento(),u.getStock(),u.getPrecio_x_unidad()}));
        } catch (Exception e) {
        }
    }
    public void buscador(String buscador)
    {
        try {
            DAOProductos dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
            model.setRowCount(0);
            
            dao.buscar(buscador).forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getLaboratorio(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getCodigo_digemid(),u.getUbicacion(),u.getFecha_vencimiento(),u.getStock(),u.getPrecio_x_unidad()}));
        } catch (Exception e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        C.setBackground(new java.awt.Color(204, 226, 235));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));

        tabla_productos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_productos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "LABORATORIO", "DESCRIPCION", "PRINCIPIO ACTIVO", "CODIGO DIGEMID", "UBICACION", "FECHA", "STOCK", "P.UNI", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_productos.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_productos.setRowHeight(40);
        tabla_productos.setSelectionBackground(new java.awt.Color(109, 175, 195));
        tabla_productos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_productos);
        if (tabla_productos.getColumnModel().getColumnCount() > 0) {
            tabla_productos.getColumnModel().getColumn(0).setResizable(false);
            tabla_productos.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_productos.getColumnModel().getColumn(1).setResizable(false);
            tabla_productos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla_productos.getColumnModel().getColumn(2).setResizable(false);
            tabla_productos.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla_productos.getColumnModel().getColumn(3).setResizable(false);
            tabla_productos.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla_productos.getColumnModel().getColumn(4).setResizable(false);
            tabla_productos.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla_productos.getColumnModel().getColumn(5).setResizable(false);
            tabla_productos.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla_productos.getColumnModel().getColumn(6).setResizable(false);
            tabla_productos.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabla_productos.getColumnModel().getColumn(7).setResizable(false);
            tabla_productos.getColumnModel().getColumn(7).setPreferredWidth(100);
            tabla_productos.getColumnModel().getColumn(8).setResizable(false);
            tabla_productos.getColumnModel().getColumn(8).setPreferredWidth(60);
            tabla_productos.getColumnModel().getColumn(9).setResizable(false);
            tabla_productos.getColumnModel().getColumn(9).setPreferredWidth(50);
            tabla_productos.getColumnModel().getColumn(10).setResizable(false);
            tabla_productos.getColumnModel().getColumn(10).setPreferredWidth(140);
        }

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4.png"))); // NOI18N

        jButton1.setText("jButton1");
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
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_buscar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
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
        visualizador(new BIBLIOTECA_PRODUCTOS());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    
}
