package farmacia;

import Implementaciones.DAOProductoImpl;
import db.conexion;
import interfaces.DAOProductos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.producto;

public class REGISTRO_PRODUCTO extends javax.swing.JPanel {

    public REGISTRO_PRODUCTO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        laboratorio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        principio_activo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre_producto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        codigo_digemid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lote = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        minimo_aviso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        unidad_blister = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        unidad_caja = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        precio_unitario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        precio_blister = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        precio_caja = new javax.swing.JTextField();
        año_v = new javax.swing.JComboBox<>();
        mes_v = new javax.swing.JComboBox<>();
        dia_V = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion_producto = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 255, 254));
        setPreferredSize(new java.awt.Dimension(1050, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(177, 212, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AGREGAR PRODUCTOS AL ALMACEN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Laboratorio:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 90, 30));

        laboratorio.setBackground(new java.awt.Color(255, 255, 255));
        laboratorio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        laboratorio.setForeground(new java.awt.Color(0, 0, 0));
        laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboratorioActionPerformed(evt);
            }
        });
        add(laboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 250, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion de producto:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 230, 30));

        principio_activo.setBackground(new java.awt.Color(255, 255, 255));
        principio_activo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        principio_activo.setForeground(new java.awt.Color(0, 0, 0));
        principio_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principio_activoActionPerformed(evt);
            }
        });
        add(principio_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 250, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Principio activo:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre del producto:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 30));

        nombre_producto.setBackground(new java.awt.Color(255, 255, 255));
        nombre_producto.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_producto.setForeground(new java.awt.Color(0, 0, 0));
        nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_productoActionPerformed(evt);
            }
        });
        add(nombre_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 250, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Codigo Digemid:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 30));

        codigo_digemid.setBackground(new java.awt.Color(255, 255, 255));
        codigo_digemid.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        codigo_digemid.setForeground(new java.awt.Color(0, 0, 0));
        codigo_digemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_digemidActionPerformed(evt);
            }
        });
        add(codigo_digemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 250, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lote:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 120, 30));

        lote.setBackground(new java.awt.Color(255, 255, 255));
        lote.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lote.setForeground(new java.awt.Color(0, 0, 0));
        lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loteActionPerformed(evt);
            }
        });
        add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 250, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ubicacion:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 120, 30));

        ubicacion.setBackground(new java.awt.Color(255, 255, 255));
        ubicacion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ubicacion.setForeground(new java.awt.Color(0, 0, 0));
        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 250, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Stock:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 140, 30));

        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        stock.setForeground(new java.awt.Color(0, 0, 0));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 250, 35));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de vencimiento:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, 30));

        minimo_aviso.setBackground(new java.awt.Color(255, 255, 255));
        minimo_aviso.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        minimo_aviso.setForeground(new java.awt.Color(0, 0, 0));
        minimo_aviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimo_avisoActionPerformed(evt);
            }
        });
        add(minimo_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 250, 35));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Minimo para aviso:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 140, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Unidad x blister:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 140, 30));

        unidad_blister.setBackground(new java.awt.Color(255, 255, 255));
        unidad_blister.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        unidad_blister.setForeground(new java.awt.Color(0, 0, 0));
        unidad_blister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_blisterActionPerformed(evt);
            }
        });
        add(unidad_blister, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 110, 35));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Unidad x caja:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 140, 30));

        unidad_caja.setBackground(new java.awt.Color(255, 255, 255));
        unidad_caja.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        unidad_caja.setForeground(new java.awt.Color(0, 0, 0));
        unidad_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_cajaActionPerformed(evt);
            }
        });
        add(unidad_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 110, 35));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Precio unitario");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 140, 30));

        precio_unitario.setBackground(new java.awt.Color(255, 255, 255));
        precio_unitario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_unitario.setForeground(new java.awt.Color(0, 0, 0));
        precio_unitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_unitarioActionPerformed(evt);
            }
        });
        add(precio_unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 250, 35));

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Precio blister");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 140, 30));

        precio_blister.setBackground(new java.awt.Color(255, 255, 255));
        precio_blister.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_blister.setForeground(new java.awt.Color(0, 0, 0));
        precio_blister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_blisterActionPerformed(evt);
            }
        });
        add(precio_blister, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 110, 35));

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Precio caja");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 140, 30));

        precio_caja.setBackground(new java.awt.Color(255, 255, 255));
        precio_caja.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_caja.setForeground(new java.awt.Color(0, 0, 0));
        precio_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_cajaActionPerformed(evt);
            }
        });
        add(precio_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 110, 35));

        año_v.setBackground(new java.awt.Color(255, 255, 255));
        año_v.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_v.setForeground(new java.awt.Color(0, 0, 0));
        año_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        add(año_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 80, 35));

        mes_v.setBackground(new java.awt.Color(255, 255, 255));
        mes_v.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_v.setForeground(new java.awt.Color(0, 0, 0));
        mes_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        add(mes_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, 35));

        dia_V.setBackground(new java.awt.Color(255, 255, 255));
        dia_V.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_V.setForeground(new java.awt.Color(0, 0, 0));
        dia_V.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(dia_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 60, 35));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descripcion_producto.setLineWrap(true);
        descripcion_producto.setBackground(new java.awt.Color(255, 255, 255));
        descripcion_producto.setColumns(20);
        descripcion_producto.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        descripcion_producto.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_producto.setRows(5);
        jScrollPane1.setViewportView(descripcion_producto);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 250, 130));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 20, 560));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 20, 560));

        jPanel2.setBackground(new java.awt.Color(236, 255, 254));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_registrar.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 90, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laboratorioActionPerformed

    private void principio_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principio_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principio_activoActionPerformed

    private void nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_productoActionPerformed

    private void codigo_digemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_digemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_digemidActionPerformed

    private void loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loteActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void minimo_avisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimo_avisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimo_avisoActionPerformed

    private void unidad_blisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_blisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidad_blisterActionPerformed

    private void unidad_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidad_cajaActionPerformed

    private void precio_unitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_unitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_unitarioActionPerformed

    private void precio_blisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_blisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_blisterActionPerformed

    private void precio_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_cajaActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        int A = JOptionPane.showConfirmDialog(null,"¿REGISTRAR PRODUCTO?","AVISO",JOptionPane.CANCEL_OPTION );
                
            if (A == 0) {
            String nombreMes = (String) mes_v.getSelectedItem();
            int numeroMes;
            if (nombreMes.equals("enero")) {
                numeroMes = 1;
            } else if (nombreMes.equals("febrero")) {
                numeroMes = 2;
            } else if (nombreMes.equals("marzo")) {
                numeroMes = 3;
            } else if (nombreMes.equals("abril")) {
                numeroMes = 4;
            } else if (nombreMes.equals("mayo")) {
                numeroMes = 5;
            } else if (nombreMes.equals("junio")) {
                numeroMes = 6;
            } else if (nombreMes.equals("julio")) {
                numeroMes = 7;
            } else if (nombreMes.equals("agosto")) {
                numeroMes = 8;
            } else if (nombreMes.equals("septiembre")) {
                numeroMes = 9;
            } else if (nombreMes.equals("octubre")) {
                numeroMes = 10;
            } else if (nombreMes.equals("noviembre")) {
                numeroMes = 11;
            } else if (nombreMes.equals("diciembre")) {
                numeroMes = 12;
            } else {
                numeroMes = 0; 
            }

            String fecha = año_v.getSelectedItem()+"-"+numeroMes+"-"+dia_V.getSelectedItem();

            try {
                if (nombre_producto.getText().isEmpty() || precio_unitario.getText().isEmpty() || stock.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete los campos obligatorios: Nombre del producto, Precio y Stock.");
                    return;
                }

                producto p = new producto(
                    nombre_producto.getText(), 
                    null, 
                    null, 
                    null, 
                    null, 
                    null, 
                    null, 
                    fecha, 
                    Integer.parseInt(stock.getText()), 
                    0, 
                    0, 
                    0, 
                    Double.parseDouble(precio_unitario.getText()), 
                    0.0, 
                    0.0
                );

                DAOProductos dao = new DAOProductoImpl();
                dao.registrar(p);

                nombre_producto.setText("");
                laboratorio.setText("");
                descripcion_producto.setText("");
                principio_activo.setText("");
                codigo_digemid.setText("");
                lote.setText("");
                ubicacion.setText("");
                stock.setText("");
                minimo_aviso.setText("");
                unidad_blister.setText("");
                unidad_caja.setText("");
                precio_unitario.setText("");
                precio_blister.setText("");
                precio_caja.setText("");

                JOptionPane.showMessageDialog(null, "El producto se ha guardado correctamente.");        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para el stock y el precio.");
            } catch (Exception ex) {
                Logger.getLogger(REGISTRO_PRODUCTO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_jPanel2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año_v;
    private javax.swing.JTextField codigo_digemid;
    private javax.swing.JTextArea descripcion_producto;
    private javax.swing.JComboBox<String> dia_V;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField laboratorio;
    private javax.swing.JTextField lote;
    private javax.swing.JComboBox<String> mes_v;
    private javax.swing.JTextField minimo_aviso;
    private javax.swing.JTextField nombre_producto;
    private javax.swing.JTextField precio_blister;
    private javax.swing.JTextField precio_caja;
    private javax.swing.JTextField precio_unitario;
    private javax.swing.JTextField principio_activo;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField ubicacion;
    private javax.swing.JTextField unidad_blister;
    private javax.swing.JTextField unidad_caja;
    // End of variables declaration//GEN-END:variables
}
