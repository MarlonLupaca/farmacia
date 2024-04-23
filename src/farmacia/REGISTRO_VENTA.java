
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
import java.awt.Color;
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


    private  double total = 0.0;
    
    
    public REGISTRO_VENTA() {
        initComponents();
        cantidad.setValue(1);
        login g = new login();
        txvendedor.setText(g.getLogin());
        EFECTIVO.setSelected(true);
        c_unidad.setSelected(true);
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
        tabla_productos.getTableHeader().setBackground(new Color(0xB1D4E0));
        tabla_venta.getTableHeader().setBackground(new Color(0xB1D4E0));
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
            int id = dao.id();
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
                    int fila = tabla_productos.getSelectedRow();
                    String id = tabla_productos.getValueAt(fila, 0).toString();
                    try {
                        producto p = dao.visualizar(id);
                        VISUALIZADOR_PRODUCTO frame = new VISUALIZADOR_PRODUCTO(p);
                        frame.setVisible(true);
                        
                        
                        
                    } catch (Exception ex) {
                        
                    }
                    
                } catch (Exception ex) {
                    
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
                String unidad = "";
                if(c_unidad.isSelected())
                {
                    unidad = c_unidad.getText().toString();
                    
                }
                if(c_blister.isSelected())
                {
                    unidad = c_blister.getText().toString();
                    
                }
                if(c_caja.isSelected())
                {
                    unidad = c_caja.getText().toString();
                    
                }
                  
                  // Verificar si el producto ya está en la tabla
                boolean encontrado = false;
                for (int i = 0; i < tabla_venta.getRowCount(); i++) {
                    String codigoTabla = tabla_venta.getValueAt(i, 0).toString();
                    String unidadTabla = tabla_venta.getValueAt(i, 5).toString();
                    String t = String.valueOf(p.getCodigo_unico()) ;
                    
                    if (codigoTabla.equals(t) && unidadTabla.equals(unidad)) {
                    System.out.println("entro");
                    // El producto ya está en la tabla con la misma unidad, aumentar la cantidad y actualizar subtotal
                    int cantidadExistente = (int) tabla_venta.getValueAt(i, 2);
                    double precioUnitario = (double) tabla_venta.getValueAt(i, 3);
                    double subtotalExistente = (double) tabla_venta.getValueAt(i, 4);

                    if (c_unidad.isSelected()) {
                        // Si la unidad es "unidad", simplemente aumenta la cantidad
                        tabla_venta.setValueAt(cantidadExistente + input, i, 2);
                    } else if (c_blister.isSelected()) {
                        // Si la unidad es "blister", debes tener en cuenta la cantidad por blister
                        // Calcula la cantidad total (blister * input) y suma a la cantidad existente
                        int cantidadTotal = cantidadExistente + input * p.getUnidad_x_blister();
                        tabla_venta.setValueAt(cantidadTotal, i, 2);
                    } else if (c_caja.isSelected()) {
                        // Si la unidad es "caja", debes tener en cuenta la cantidad por caja
                        // Calcula la cantidad total (caja * input) y suma a la cantidad existente
                        int cantidadTotal = cantidadExistente + input * p.getUnidad_x_caja();
                        tabla_venta.setValueAt(cantidadTotal, i, 2);
                    }

                    // Actualiza el subtotal sumando el nuevo subtotal al subtotal existente
                    tabla_venta.setValueAt(subtotalExistente + input * precioUnitario, i, 4);

                    encontrado = true;
                    break;
                }

}

                  if (!encontrado) {    
                      // El producto no está en la tabla, agregar una nueva fila
                      double subtotal =0.0;
                      int cantidad = 0;
                      double precio = 0;
                      String unidad_v = "";
                      DefaultTableModel model = (DefaultTableModel) tabla_venta.getModel();
                      
                      if(c_unidad.isSelected())
                      {
                          subtotal = input * p.getPrecio_x_unidad();
                          cantidad = input;
                          precio = p.getPrecio_x_unidad();
                          unidad_v = c_unidad.getText();
                      }
                      if(c_blister.isSelected())
                      {
                          subtotal = input * p.getPrecio_x_blister();
                          cantidad = input * p.getUnidad_x_blister();
                          precio = p.getPrecio_x_blister();
                          unidad_v = c_blister.getText();
                      }
                      if(c_caja.isSelected())
                      {
                          subtotal = input * p.getPrecio_x_caja();
                          cantidad = input * p.getUnidad_x_caja();
                          precio = p.getPrecio_x_caja();
                          unidad_v = c_caja.getText();
                      }
                      
                      
                      
                      model.addRow(new Object[]{p.getCodigo_unico(), p.getNombre_producto(), cantidad,precio, subtotal,unidad});
                      
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
            tabla_productos.getTableHeader().setBackground(new Color(0xB1D4E0));
            model.setRowCount(0);
            if (c_unidad.isSelected()){
                dao.listar().forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock(),u.getPrecio_x_unidad()}));
            }
            if (c_blister.isSelected()){
                dao.listar().forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock()/u.getUnidad_x_blister(),u.getPrecio_x_blister()}));
            }
            if (c_caja.isSelected()){
                dao.listar().forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock()/u.getUnidad_x_caja(),u.getPrecio_x_caja()}));
            }
            
            
        } catch (Exception e) {
        }
    }
    public void buscador(String buscador)
    {
        try {
            DAOProductos dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
            
            model.setRowCount(0);
            if (c_unidad.isSelected()){
                dao.buscar(buscador).forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock(),u.getPrecio_x_unidad()}));
            }
            if (c_blister.isSelected()){
                dao.buscar(buscador).forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock()/u.getUnidad_x_blister(),u.getPrecio_x_blister()}));
            }
            if (c_caja.isSelected()){
                dao.buscar(buscador).forEach((u) -> model.addRow(new Object[]{u.getCodigo_unico(),u.getNombre_producto(),u.getDescripcion_produto(),u.getPrincipo_activo(),u.getUbicacion(),u.getStock()/u.getUnidad_x_caja(),u.getPrecio_x_caja()}));
            }
            
        } catch (Exception e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelPadre = new javax.swing.JPanel();
        C = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        txt_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        cantidad = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txcambio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbfecha = new javax.swing.JLabel();
        id_venta = new javax.swing.JLabel();
        txvendedor = new javax.swing.JLabel();
        txvendedor2 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        txvendedor1 = new javax.swing.JLabel();
        YAPE = new javax.swing.JRadioButton();
        EFECTIVO = new javax.swing.JRadioButton();
        txvendedor3 = new javax.swing.JLabel();
        txvendedor4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txvendedor5 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        txvendedor6 = new javax.swing.JLabel();
        c_unidad = new javax.swing.JRadioButton();
        c_blister = new javax.swing.JRadioButton();
        c_caja = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 680));

        panelPadre.setPreferredSize(new java.awt.Dimension(1050, 680));

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));
        C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons_actualizar.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        C.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, -1, -1));

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

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        C.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 35, 20, 295));

        tabla_venta.setBackground(new java.awt.Color(255, 255, 255));
        tabla_venta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_venta.setForeground(new java.awt.Color(0, 0, 0));
        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "c", "PRODUCTO", "CANTIDAD", "P.UNITARIO", "SUBTOTAL", "UNIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tabla_venta.getColumnModel().getColumn(2).setResizable(false);
            tabla_venta.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla_venta.getColumnModel().getColumn(3).setResizable(false);
            tabla_venta.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabla_venta.getColumnModel().getColumn(4).setResizable(false);
            tabla_venta.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabla_venta.getColumnModel().getColumn(5).setResizable(false);
        }

        C.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 260));
        C.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 80, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("S/.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        txcambio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txcambio.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txcambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        C.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 100, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("S/.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        TOTAL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));
        TOTAL.setText("0.0");
        jPanel1.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        C.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad:");
        C.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, 30));

        jPanel2.setBackground(new java.awt.Color(177, 212, 224));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(236, 255, 254), new java.awt.Color(236, 255, 254)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbfecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(0, 0, 0));
        lbfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 110, 30));

        id_venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id_venta.setForeground(new java.awt.Color(0, 0, 0));
        id_venta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(id_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 110, 30));

        txvendedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txvendedor.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor.setText("vendedor");
        jPanel2.add(txvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 30));

        txvendedor2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txvendedor2.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txvendedor2.setText("Cuenta:");
        jPanel2.add(txvendedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        C.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 420, 35));

        cliente.setBackground(new java.awt.Color(255, 255, 255));
        cliente.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        cliente.setForeground(new java.awt.Color(0, 0, 0));
        C.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 160, 30));

        txvendedor1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txvendedor1.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor1.setText("Metodo:");
        C.add(txvendedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 70, 30));

        buttonGroup1.add(YAPE);
        YAPE.setForeground(new java.awt.Color(0, 0, 0));
        YAPE.setText("YAPE");
        YAPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YAPEActionPerformed(evt);
            }
        });
        C.add(YAPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, 30));

        buttonGroup1.add(EFECTIVO);
        EFECTIVO.setForeground(new java.awt.Color(0, 0, 0));
        EFECTIVO.setText("EFECTIVO");
        C.add(EFECTIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, 30));

        txvendedor3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txvendedor3.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor3.setText("Total:");
        C.add(txvendedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 70, 30));

        txvendedor4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txvendedor4.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor4.setText("Cliente:");
        C.add(txvendedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 70, 30));
        C.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1050, 20));

        txvendedor5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txvendedor5.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor5.setText("Cambio:");
        C.add(txvendedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 70, 30));

        pago.setBackground(new java.awt.Color(255, 255, 255));
        pago.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        pago.setForeground(new java.awt.Color(0, 0, 0));
        pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pagoKeyReleased(evt);
            }
        });
        C.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 100, 40));

        txvendedor6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txvendedor6.setForeground(new java.awt.Color(0, 0, 0));
        txvendedor6.setText("Pago:");
        C.add(txvendedor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 70, 30));

        buttonGroup2.add(c_unidad);
        c_unidad.setForeground(new java.awt.Color(0, 0, 0));
        c_unidad.setText("Unidad");
        c_unidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_unidadMouseClicked(evt);
            }
        });
        c_unidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_unidadKeyPressed(evt);
            }
        });
        C.add(c_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, -1, -1));

        buttonGroup2.add(c_blister);
        c_blister.setForeground(new java.awt.Color(0, 0, 0));
        c_blister.setText("Blister");
        c_blister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_blisterMouseClicked(evt);
            }
        });
        C.add(c_blister, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, -1, -1));

        buttonGroup2.add(c_caja);
        c_caja.setForeground(new java.awt.Color(0, 0, 0));
        c_caja.setText("Caja");
        c_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_cajaMouseClicked(evt);
            }
        });
        C.add(c_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_registrar.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        C.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 90, 90));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons2.png"))); // NOI18N
        jLabel7.setText(" Eliminar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        C.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        javax.swing.GroupLayout panelPadreLayout = new javax.swing.GroupLayout(panelPadre);
        panelPadre.setLayout(panelPadreLayout);
        panelPadreLayout.setHorizontalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPadreLayout.setVerticalGroup(
            panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(panelPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void YAPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YAPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YAPEActionPerformed

    private void pagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagoKeyReleased
        
        String totalText = TOTAL.getText();
        String pagoText = this.pago.getText();

        
        if (!totalText.isEmpty() && !pagoText.isEmpty()) {
            
            double total = Double.parseDouble(totalText);
            double pago = Double.parseDouble(pagoText);

            
            double cambio = pago - total;

            
            txcambio.setText(String.valueOf(cambio));
        } else {
            
            txcambio.setText("0.0"); 
        }

        
    }//GEN-LAST:event_pagoKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cargar_tabla();
        tabla_productos.clearSelection(); // Limpiar cualquier selección existente
        tabla_productos.setRowSelectionInterval(0, 0); // Seleccionar la primera fila
        tabla_productos.setColumnSelectionInterval(0, 0); // Seleccionar la primera columna (o la columna que no sea la personalizada)


    }//GEN-LAST:event_jLabel2MouseClicked

    private void c_unidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_unidadKeyPressed
        
    }//GEN-LAST:event_c_unidadKeyPressed

    private void c_unidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_unidadMouseClicked
        cargar_tabla();
        tabla_productos.clearSelection(); // Limpiar cualquier selección existente
        tabla_productos.setRowSelectionInterval(0, 0); // Seleccionar la primera fila
        tabla_productos.setColumnSelectionInterval(0, 0); // Seleccionar la primera columna (o la columna que no sea la personalizada)

    }//GEN-LAST:event_c_unidadMouseClicked

    private void c_blisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_blisterMouseClicked
        cargar_tabla();
        tabla_productos.clearSelection(); // Limpiar cualquier selección existente
        tabla_productos.setRowSelectionInterval(0, 0); // Seleccionar la primera fila
        tabla_productos.setColumnSelectionInterval(0, 0); // Seleccionar la primera columna (o la columna que no sea la personalizada)

    }//GEN-LAST:event_c_blisterMouseClicked

    private void c_cajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_cajaMouseClicked
        cargar_tabla();
        tabla_productos.clearSelection(); // Limpiar cualquier selección existente
        tabla_productos.setRowSelectionInterval(0, 0); // Seleccionar la primera fila
        tabla_productos.setColumnSelectionInterval(0, 0); // Seleccionar la primera columna (o la columna que no sea la personalizada)

    }//GEN-LAST:event_c_cajaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    int A = JOptionPane.showConfirmDialog(null,"¿REGISTRAR VENTA?","AVISO",JOptionPane.CANCEL_OPTION );

        if (A == 0) {


            try {
                DAOVenta dao = new DAOVentaImpl();
                //encabezado
                String metodo="";
                if(EFECTIVO.isSelected()){metodo = "EFECTIVO";}
                if(YAPE.isSelected()){metodo = "YAPE";}
                cabecera venta = new cabecera(lbfecha.getText(), cliente.getText(), Double.parseDouble(TOTAL.getText()), metodo, txvendedor.getText());
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
                    String unidad = modelo.getValueAt(i, 5).toString();

                    detalle.setNumero_venta(Integer.parseInt(id_venta.getText()));
                    detalle.setId_producto(idProducto);
                    detalle.setProducto(producto);
                    detalle.setCantidad(cantidad);
                    detalle.setUnitario_precio(precioUnitario);
                    detalle.setSubtotal(subtotal);
                    detalle.setUnidad(unidad);

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
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
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
                
            } else {
                JOptionPane.showMessageDialog(null, "El precio de la venta es inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JRadioButton EFECTIVO;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JRadioButton YAPE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton c_blister;
    private javax.swing.JRadioButton c_caja;
    private javax.swing.JRadioButton c_unidad;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JTextField cliente;
    private javax.swing.JLabel id_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JTextField pago;
    private javax.swing.JPanel panelPadre;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTable tabla_venta;
    private javax.swing.JLabel txcambio;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JLabel txvendedor;
    private javax.swing.JLabel txvendedor1;
    private javax.swing.JLabel txvendedor2;
    private javax.swing.JLabel txvendedor3;
    private javax.swing.JLabel txvendedor4;
    private javax.swing.JLabel txvendedor5;
    private javax.swing.JLabel txvendedor6;
    // End of variables declaration//GEN-END:variables

    
}
