
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.acciones_botones_inte_venta;
import controladores_tabla.editor;
import controladores_tabla.editor_venta;
import controladores_tabla.render;
import controladores_tabla.render_venta;
import interfaces.*;
import interfaces.DAOClientes;
import java.awt.BorderLayout;
import java.awt.Container;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import objetos.alerta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import objetos.cabecera;
import objetos.cliente;
import objetos.detalle;
import objetos.producto;

/**
 *
 * @author Marlon_Mendoza
 */
public class REGISTRO_VENTA extends javax.swing.JPanel {

    private static Map <Integer, producto> detalle = new HashMap<>();
    private  double total = 0.0;
    
    
    public REGISTRO_VENTA() {
        initComponents();
        cantidad.setValue(1);
        xxx();
        cargar_tabla();
        id();
        
        //cambiar color de una celda
        TableColumnModel columnModel = tabla_venta.getColumnModel();
        TableColumn edadColumn = columnModel.getColumn(0); 
        edadColumn.setCellRenderer(new CustomColorRenderer());
        
        //fecha
        LocalDate fechaActual = obtenerFechaActual();
        lbfecha.setText(String.valueOf(fechaActual));
    }
    
    class CustomColorRenderer extends DefaultTableCellRenderer {
        public void setValue(Object value) {
            // Establecer el valor de la celda
            setText((value == null) ? "" : value.toString());

            // Establecer el color de la letra (en este caso, rojo)
            setForeground(java.awt.Color.WHITE);
        }
    }
    public void id()
    {
        DAOVenta dao = new DAOVentaImpl();
        String factura = "";
        try {
            int id = 1 + dao.id();
            if (id >= 1 && id <= 9) {
                factura = "0000" + String.valueOf(id);
            } else if (id >= 10 && id <= 99) {
                factura = "000" + String.valueOf(id);
            } else if (id >= 100 && id <= 999) {
                factura = "00" + String.valueOf(id);
            } else if (id >= 1000 && id <= 9999) {
                factura = "0" + String.valueOf(id);
            } else if (id >= 10000 && id <= 99999) {
                factura = String.valueOf(id);
            }
            id_venta.setText(factura);
        } catch (Exception ex) {
            Logger.getLogger(REGISTRO_VENTA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public LocalDate obtenerFechaActual() {
        return LocalDate.now();
    }
    
    public void visualizador (JPanel p)
    {
        p.setSize(1050, 680);
        p.setLocation(0,0);
        panelPadre.removeAll();
        panelPadre.add(p,BorderLayout.CENTER);
        panelPadre.revalidate();
        panelPadre.repaint();
    }
    
    
    public void xxx()
    {
        acciones_botones_inte_venta evento1 = new acciones_botones_inte_venta() {

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
                    Logger.getLogger(REGISTRO_VENTA.class.getName()).log(Level.SEVERE, null, ex);
                }


                
            }

            @Override
            public void anadir(int row) {
            total = 0.0;

              try {
                  int input = (int) cantidad.getValue();
                  DAOProductos dao = new DAOProductoImpl();
                  int fila = tabla_productos.getSelectedRow();
                  String id = tabla_productos.getValueAt(fila, 0).toString();
                  producto p = dao.visualizar(id);
                  int clave = Integer.parseInt(id);

                  // Verificar si el producto ya está en la tabla
                  boolean encontrado = false;
                  for (int i = 0; i < tabla_venta.getRowCount(); i++) {
                      if (tabla_venta.getValueAt(i, 0).equals(p.getCodigo_unico())) {
                          // El producto ya está en la tabla, aumentar la cantidad y actualizar subtotal
                          int cantidadExistente = (int) tabla_venta.getValueAt(i, 2);
                          double precioUnitario = (double) tabla_venta.getValueAt(i, 3);
                          double subtotalExistente = (double) tabla_venta.getValueAt(i, 4);
                          tabla_venta.setValueAt(cantidadExistente + input, i, 2);
                          tabla_venta.setValueAt(subtotalExistente + input * precioUnitario, i, 4);
                          encontrado = true;
                          break;
                      }
                  }

                  if (!encontrado) {
                      // El producto no está en la tabla, agregar una nueva fila
                      double subtotal = input * p.getPrecio_x_unidad();
                      DefaultTableModel model = (DefaultTableModel) tabla_venta.getModel();
                      model.addRow(new Object[]{p.getCodigo_unico(), p.getNombre_producto(), input, p.getPrecio_x_unidad(), subtotal});
                  }

                  // Actualizar el total después de verificar todos los productos en la tabla
                  for (int i = 0; i < tabla_venta.getRowCount(); i++) {
                      
                      double subtotal = (double) tabla_venta.getValueAt(i, 4);
          
                      total = total + subtotal;
 
                  }
                  
                  TOTAL.setText(String.valueOf(total));
              } catch (Exception ex) {
                  Logger.getLogger(REGISTRO_VENTA.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          }


        };
        tabla_productos.getColumnModel().getColumn(7).setCellRenderer( new render_venta());
        tabla_productos.getColumnModel().getColumn(7).setCellEditor(new editor_venta(evento1));
    }
    public void cargar_tabla()
    {
        try {
            DAOProductos dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
            model.setRowCount(0);
            
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock(),u.getPrecio_x_unidad()}));
        } catch (Exception e) {
        }
    }
    public void buscador(String buscador)
    {
        try {
            DAOProductos dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
            model.setRowCount(0);
            
            dao.buscar(buscador).forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock(),u.getPrecio_x_unidad()}));
        } catch (Exception e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPadre = new javax.swing.JPanel();
        C = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        cantidad = new javax.swing.JSpinner();
        cliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id_venta = new javax.swing.JLabel();

        C.setBackground(new java.awt.Color(204, 226, 235));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));
        C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_productos.setBackground(new java.awt.Color(255, 255, 255));
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "PRINCIPIO ACTIVO", "UBICACION", "STOCK", "P.UNI", "VIEW"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
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
            tabla_productos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabla_productos.getColumnModel().getColumn(3).setResizable(false);
            tabla_productos.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabla_productos.getColumnModel().getColumn(4).setResizable(false);
            tabla_productos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla_productos.getColumnModel().getColumn(5).setResizable(false);
            tabla_productos.getColumnModel().getColumn(5).setPreferredWidth(60);
            tabla_productos.getColumnModel().getColumn(6).setResizable(false);
            tabla_productos.getColumnModel().getColumn(6).setPreferredWidth(50);
            tabla_productos.getColumnModel().getColumn(7).setPreferredWidth(65);
        }

        C.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 1010, 270));

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
        C.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 457, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4.png"))); // NOI18N
        C.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        tabla_venta.setBackground(new java.awt.Color(255, 255, 255));
        tabla_venta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_venta.setForeground(new java.awt.Color(0, 0, 0));
        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "c", "PRODUCTO", "CANTIDAD", "P.UNITARIO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_venta.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_venta.setRowHeight(40);
        tabla_venta.setSelectionBackground(new java.awt.Color(109, 175, 195));
        tabla_venta.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(tabla_venta);
        if (tabla_venta.getColumnModel().getColumnCount() > 0) {
            tabla_venta.getColumnModel().getColumn(0).setResizable(false);
            tabla_venta.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_venta.getColumnModel().getColumn(1).setResizable(false);
            tabla_venta.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabla_venta.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla_venta.getColumnModel().getColumn(3).setResizable(false);
            tabla_venta.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabla_venta.getColumnModel().getColumn(4).setResizable(false);
            tabla_venta.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        C.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 468, 290));
        C.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1050, 20));
        C.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 80, 30));

        cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cliente.setForeground(new java.awt.Color(0, 0, 0));
        cliente.setText("cliente fantasma");
        C.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("S/.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        TOTAL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));
        TOTAL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        C.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad:");
        C.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, 30));

        lbfecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(0, 0, 0));
        lbfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 110, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        C.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 80, 30));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        C.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, -1, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total:");
        C.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, 30));

        id_venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_venta.setForeground(new java.awt.Color(0, 0, 0));
        id_venta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C.add(id_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 110, 30));

        javax.swing.GroupLayout panelPadreLayout = new javax.swing.GroupLayout(panelPadre);
        panelPadre.setLayout(panelPadreLayout);
        panelPadreLayout.setHorizontalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
            .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE))
        );
        panelPadreLayout.setVerticalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        buscador(txt_buscar.getText());
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tabla_venta.getSelectedRow();
        if (fila != -1) { // Verificar si hay una fila seleccionada
            int id = Integer.parseInt(tabla_venta.getValueAt(fila, 0).toString());
            String precioStr = tabla_venta.getValueAt(fila, 4).toString();
            if (!precioStr.isEmpty()) {
                double precio = Double.parseDouble(precioStr);
                System.out.println(precio);
                System.out.println(total);
                total = total - precio;
                TOTAL.setText(String.valueOf(total));
                // Eliminar la fila seleccionada de tabla_venta
                DefaultTableModel model = (DefaultTableModel) tabla_venta.getModel();
                model.removeRow(fila);

                // Eliminar el elemento correspondiente en detalle
                detalle.remove(id);
            } else {
                JOptionPane.showMessageDialog(null, "El precio de la venta es inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int A = JOptionPane.showConfirmDialog(null,"¿REGISTRAR VEMTA?","AVISO",JOptionPane.CANCEL_OPTION );
                
            if (A == 0) {
        
        
                try {
                    DAOVenta dao = new DAOVentaImpl();
                    //encabezado
                    cabecera venta = new cabecera(lbfecha.getText(), cliente.getText(), Double.parseDouble(TOTAL.getText()), "metodo", "venderora");
                    dao.registrarEncabezado(venta);
                    //detalle
                    List<detalle> pila = new ArrayList<>();
                    DefaultTableModel modelo = (DefaultTableModel) tabla_venta.getModel();
                    int filas = modelo.getRowCount();

                    for (int i = 0; i < filas; i++) {
                        detalle detalle = new detalle();

                        int idProducto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                        String producto = modelo.getValueAt(i, 1).toString();
                        int cantidad = Integer.parseInt(modelo.getValueAt(i, 2).toString());
                        double precioUnitario = Double.parseDouble(modelo.getValueAt(i, 3).toString());
                        double subtotal = Double.parseDouble(modelo.getValueAt(i, 4).toString());

                        detalle.setNumero_venta(Integer.parseInt(id_venta.getText()));
                        detalle.setId_producto(idProducto);
                        detalle.setProducto(producto);
                        detalle.setCantidad(cantidad);
                        detalle.setUnitario_precio(precioUnitario);
                        detalle.setSubtotal(subtotal);

                        pila.add(detalle);
                    }
                    dao.registrarDetalle(pila);
                    
                    //Reduccion de stock
                    dao.reduccionStock(Integer.parseInt(id_venta.getText()));
                    
                    
                    visualizador(new REGISTRO_VENTA());
                    
                    

                    
                    

                } catch (Exception ex) {
                    Logger.getLogger(REGISTRO_VENTA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel id_venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JPanel panelPadre;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTable tabla_venta;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    
}
