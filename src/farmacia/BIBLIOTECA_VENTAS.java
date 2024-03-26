
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor;
import controladores_tabla.editor_venta_view;
import controladores_tabla.render;
import controladores_tabla.render_view;
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
import objetos.cabecera;
import objetos.cliente;
import objetos.producto;

/**
 *
 * @author Marlon_Mendoza
 */
public class BIBLIOTECA_VENTAS extends javax.swing.JPanel {

    
    public BIBLIOTECA_VENTAS() {
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
            }

            @Override
            public void borrar(int row) {
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE ELIMINAR ESTE PRODUCTO","AVISO",JOptionPane.CANCEL_OPTION );
                
                if (i == 0) {
                    int fila = tabla_ventas.getSelectedRow();
                    String id = tabla_ventas.getValueAt(fila, 0).toString();
                    int id2 = Integer.parseInt(id);
                    DAOVenta dao = new DAOVentaImpl();

                    try {
                        dao.aumentoStock(id2);
                        dao.eliminar(id);
                        
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_VENTAS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"ELIMINADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new BIBLIOTECA_VENTAS());
                }
            }

            @Override
            public void vizualisar(int row) {
                try {
                    
                    int fila = tabla_ventas.getSelectedRow();
                    String id = tabla_ventas.getValueAt(fila, 0).toString();
                    VIEW_VENTA V = new VIEW_VENTA(id);
                    V.setVisible(true);
     
                } catch (Exception ex) {
                    Logger.getLogger(BIBLIOTECA_VENTAS.class.getName()).log(Level.SEVERE, null, ex);
                }


                
            };
        };
        tabla_ventas.getColumnModel().getColumn(6).setCellRenderer( new render_view());
        tabla_ventas.getColumnModel().getColumn(6).setCellEditor(new editor_venta_view(evento));
    }
    public void cargar_tabla()
    {
        try {
            DAOVenta dao = new DAOVentaImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_ventas.getModel();
            model.setRowCount(0);
            
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getId(),u.getFecha_venta(),u.getCliente(),u.getTotalVenta(),u.getMetodo(),u.getVendedor()}));
        } catch (Exception e) {
        }
    }
    public void buscador(String buscador)
    {
        try {
            DAOProductos dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_ventas.getModel();
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
        tabla_ventas = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));

        tabla_ventas.setBackground(new java.awt.Color(255, 255, 255));
        tabla_ventas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA DE VENTA", "CLIENTE", "TOTAL VENTA", "METODO DE PAGO", "VENDEDOR", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_ventas.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_ventas.setRowHeight(40);
        tabla_ventas.setSelectionBackground(new java.awt.Color(109, 175, 195));
        tabla_ventas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_ventas);
        if (tabla_ventas.getColumnModel().getColumnCount() > 0) {
            tabla_ventas.getColumnModel().getColumn(0).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_ventas.getColumnModel().getColumn(1).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla_ventas.getColumnModel().getColumn(2).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla_ventas.getColumnModel().getColumn(3).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla_ventas.getColumnModel().getColumn(4).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla_ventas.getColumnModel().getColumn(5).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla_ventas.getColumnModel().getColumn(6).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(6).setPreferredWidth(50);
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons_actualizar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(477, 477, 477)
                .addComponent(jLabel2))
            .addGroup(CLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        visualizador(new BIBLIOTECA_VENTAS());
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    
}