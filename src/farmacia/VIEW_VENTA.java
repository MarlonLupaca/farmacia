
package farmacia;

import Implementaciones.DAOVentaImpl;
import interfaces.DAOVenta;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.cabecera;
import objetos.detalle;


public class VIEW_VENTA extends javax.swing.JFrame {

    private String id_view;
    public VIEW_VENTA(String id) {
        initComponents();
        id_view = id;
        codigo_unico.setText(id);
        ver();
    }
    
    public void ver() {
     DAOVenta dao = new DAOVentaImpl();
     try {
        cabecera p = dao.visualizarCabecera(id_view);
        List<detalle> detalles = dao.visualizardetalle(id_view);

        txfecha.setText(p.getFecha_venta());
        txcliente.setText(p.getCliente());
        txmetodo.setText(p.getMetodo());
        txvendedor.setText(p.getVendedor());
        txtotal.setText(String.valueOf(p.getTotalVenta()));

        DefaultTableModel model = (DefaultTableModel) tabla_Venta.getModel();
        

        for (detalle u : detalles) {
            System.out.println(u.getProducto());
            model.addRow(new Object[]{u.getId_producto(), u.getProducto(), u.getCantidad(), u.getUnitario_precio(), u.getSubtotal(), u.getUnidad()});
        }

     } catch (Exception ex) {
         JOptionPane.showMessageDialog(this, "Error al visualizar la venta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
         Logger.getLogger(VIEW_VENTA.class.getName()).log(Level.SEVERE, null, ex);
     }
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        codigo_unico = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtotal = new javax.swing.JLabel();
        txmetodo = new javax.swing.JLabel();
        txfecha = new javax.swing.JLabel();
        txcliente = new javax.swing.JLabel();
        txvendedor = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Venta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(236, 255, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 212, 224), new java.awt.Color(177, 212, 224)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(177, 212, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 46, 56));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VENTA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 900, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_borrar_ventana.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(236, 255, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo_unico.setFont(new java.awt.Font("Segoe UI Symbol", 0, 30)); // NOI18N
        codigo_unico.setForeground(new java.awt.Color(0, 0, 0));
        codigo_unico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigo_unico.setText("Precio caja");
        jPanel3.add(codigo_unico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 212, 224), new java.awt.Color(177, 212, 224)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtotal.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtotal.setForeground(new java.awt.Color(0, 0, 0));
        txtotal.setText("Total:");
        jPanel4.add(txtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        txmetodo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txmetodo.setForeground(new java.awt.Color(0, 0, 0));
        txmetodo.setText("Metodo:");
        jPanel4.add(txmetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        txfecha.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txfecha.setForeground(new java.awt.Color(0, 0, 0));
        txfecha.setText("Fecha:");
        jPanel4.add(txfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        txcliente.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txcliente.setForeground(new java.awt.Color(0, 0, 0));
        txcliente.setText("Cliente:");
        jPanel4.add(txcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txvendedor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txvendedor.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor.setText("Vendedor:");
        jPanel4.add(txvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cliente:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Metodo:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Vendedor:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Total: S/.");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 520));

        tabla_Venta.setBackground(new java.awt.Color(255, 255, 255));
        tabla_Venta.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tabla_Venta.setForeground(new java.awt.Color(0, 0, 0));
        tabla_Venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "CANTIDAD", "PRECIO.U", "SUBTOTAL", "UNIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Venta.setRowHeight(40);
        jScrollPane1.setViewportView(tabla_Venta);
        if (tabla_Venta.getColumnModel().getColumnCount() > 0) {
            tabla_Venta.getColumnModel().getColumn(0).setResizable(false);
            tabla_Venta.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_Venta.getColumnModel().getColumn(1).setResizable(false);
            tabla_Venta.getColumnModel().getColumn(2).setResizable(false);
            tabla_Venta.getColumnModel().getColumn(3).setResizable(false);
            tabla_Venta.getColumnModel().getColumn(4).setResizable(false);
            tabla_Venta.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 550, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigo_unico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_Venta;
    private javax.swing.JLabel txcliente;
    private javax.swing.JLabel txfecha;
    private javax.swing.JLabel txmetodo;
    private javax.swing.JLabel txtotal;
    private javax.swing.JLabel txvendedor;
    // End of variables declaration//GEN-END:variables
}
