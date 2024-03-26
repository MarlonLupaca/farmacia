
package farmacia;

import Implementaciones.DAOProductoImpl;
import interfaces.DAOProductos;
import java.awt.Color;
import javax.swing.JOptionPane;
import objetos.producto;


/**
 *
 * @author Marlon_Mendoza
 */
public class EDITOR_PRODUCTO extends javax.swing.JFrame {
    static int a=0;

    public static int getA() {
        return a;
    }
    public static boolean validarNumeros(String datos) {
        return datos.matches("\\d+");
    }

    public static boolean validarDoubles(String datos) {
        try {
            Double.parseDouble(datos); 
            return true;
        } catch (NumberFormatException e) {
            return false; 
        }
    }

    public static void setA(int a) {
        EDITOR_PRODUCTO.a = a;
    }
    private boolean isNumeric(String str) {
    if (str == null || str.isEmpty()) {
        return false;
    }
    for (char c : str.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }
    return true;
}
    
   

    
    public EDITOR_PRODUCTO(producto p) {
        initComponents();
        codigo_unico.setText(String.valueOf(p.getCodigo_unico()));
        nombre_producto.setText(p.getNombre_producto());
        descripcion_producto.setText(p.getDescripcion_produto());
        codigo_digemid.setText(p.getCodigo_digemid());
 
        String fecha = p.getFecha_vencimiento();
        
        String[] partes = fecha.split("-");

        String año = partes[0].trim();
        int mes = Integer.parseInt(partes[1]);
        String día = partes[2];
        
        String nombreMes = "";
        switch(mes) {
        case 1: nombreMes = "enero"; break;
        case 2: nombreMes = "febrero"; break;
        case 3: nombreMes = "marzo"; break;
        case 4: nombreMes = "abril"; break;
        case 5: nombreMes = "mayo"; break;
        case 6: nombreMes = "junio"; break;
        case 7: nombreMes = "julio"; break;
        case 8: nombreMes = "agosto"; break;
        case 9: nombreMes = "septiembre"; break;
        case 10: nombreMes = "octubre"; break;
        case 11: nombreMes = "noviembre"; break;
        case 12: nombreMes = "diciembre"; break;
        default: nombreMes = "mes inválido"; break;
        }
        año_v.setSelectedItem(año);
        mes_v.setSelectedItem(nombreMes);
        dia_V.setSelectedItem(día);
        
        System.out.println("Año: " + año);
        System.out.println("Mes: " + mes);
        System.out.println("Día: " + día);

        
        stock.setText(String.valueOf(p.getStock()));
        unidad_blister.setText(String.valueOf(p.getUnidad_x_blister()));
        laboratorio.setText(p.getLaboratorio());
        principio_activo.setText(p.getPrincipo_activo());
        lote.setText(p.getLote());
        precio_unitario.setText(String.valueOf(p.getPrecio_x_unidad()));
        minimo_aviso.setText(String.valueOf(p.getMinimo_para_aviso()));
        unidad_caja.setText(String.valueOf(p.getUnidad_x_caja()));
        ubicacion.setText(p.getUbicacion());
        precio_blister.setText(String.valueOf(p.getPrecio_x_blister()));
        precio_caja.setText(String.valueOf(p.getPrecio_x_caja()));
        
        
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
        jLabel7 = new javax.swing.JLabel();
        nombre_producto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        codigo_digemid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        principio_activo = new javax.swing.JTextField();
        laboratorio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion_producto = new javax.swing.JTextArea();
        minimo_aviso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ubicacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lote = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        año_v = new javax.swing.JComboBox<>();
        mes_v = new javax.swing.JComboBox<>();
        dia_V = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        precio_unitario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        unidad_caja = new javax.swing.JTextField();
        unidad_blister = new javax.swing.JTextField();
        precio_blister = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        precio_caja = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(236, 255, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 212, 224), new java.awt.Color(177, 212, 224)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(177, 212, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 46, 56));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDITAR PRODUCTO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 900, 50));

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

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre del producto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, 30));

        nombre_producto.setBackground(new java.awt.Color(255, 255, 255));
        nombre_producto.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre_producto.setForeground(new java.awt.Color(0, 0, 0));
        nombre_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_productoActionPerformed(evt);
            }
        });
        jPanel1.add(nombre_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Codigo Digemid:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 30));

        codigo_digemid.setBackground(new java.awt.Color(255, 255, 255));
        codigo_digemid.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        codigo_digemid.setForeground(new java.awt.Color(0, 0, 0));
        codigo_digemid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_digemidActionPerformed(evt);
            }
        });
        jPanel1.add(codigo_digemid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Principio activo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 170, 30));

        principio_activo.setBackground(new java.awt.Color(255, 255, 255));
        principio_activo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        principio_activo.setForeground(new java.awt.Color(0, 0, 0));
        principio_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principio_activoActionPerformed(evt);
            }
        });
        jPanel1.add(principio_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 250, 35));

        laboratorio.setBackground(new java.awt.Color(255, 255, 255));
        laboratorio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        laboratorio.setForeground(new java.awt.Color(0, 0, 0));
        laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laboratorioActionPerformed(evt);
            }
        });
        jPanel1.add(laboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 250, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Laboratorio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion de producto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 230, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descripcion_producto.setLineWrap(true);
        descripcion_producto.setBackground(new java.awt.Color(255, 255, 255));
        descripcion_producto.setColumns(20);
        descripcion_producto.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        descripcion_producto.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_producto.setRows(5);
        jScrollPane1.setViewportView(descripcion_producto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 250, 130));

        minimo_aviso.setBackground(new java.awt.Color(255, 255, 255));
        minimo_aviso.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        minimo_aviso.setForeground(new java.awt.Color(0, 0, 0));
        minimo_aviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimo_avisoActionPerformed(evt);
            }
        });
        jPanel1.add(minimo_aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 250, 35));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Minimo para aviso:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 140, 30));

        ubicacion.setBackground(new java.awt.Color(255, 255, 255));
        ubicacion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ubicacion.setForeground(new java.awt.Color(0, 0, 0));
        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });
        jPanel1.add(ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 250, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ubicacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 120, 30));

        lote.setBackground(new java.awt.Color(255, 255, 255));
        lote.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lote.setForeground(new java.awt.Color(0, 0, 0));
        lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loteActionPerformed(evt);
            }
        });
        jPanel1.add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 250, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lote:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 120, 30));

        año_v.setBackground(new java.awt.Color(255, 255, 255));
        año_v.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_v.setForeground(new java.awt.Color(0, 0, 0));
        año_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel1.add(año_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 80, 35));

        mes_v.setBackground(new java.awt.Color(255, 255, 255));
        mes_v.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_v.setForeground(new java.awt.Color(0, 0, 0));
        mes_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel1.add(mes_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 110, 35));

        dia_V.setBackground(new java.awt.Color(255, 255, 255));
        dia_V.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_V.setForeground(new java.awt.Color(0, 0, 0));
        dia_V.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dia_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 60, 35));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de vencimiento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 140, 30));

        precio_unitario.setBackground(new java.awt.Color(255, 255, 255));
        precio_unitario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_unitario.setForeground(new java.awt.Color(0, 0, 0));
        precio_unitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_unitarioActionPerformed(evt);
            }
        });
        jPanel1.add(precio_unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 250, 35));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Precio unitario");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 140, 30));

        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        stock.setForeground(new java.awt.Color(0, 0, 0));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 250, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Stock:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 140, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Unidad x caja:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 140, 30));

        unidad_caja.setBackground(new java.awt.Color(255, 255, 255));
        unidad_caja.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        unidad_caja.setForeground(new java.awt.Color(0, 0, 0));
        unidad_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_cajaActionPerformed(evt);
            }
        });
        jPanel1.add(unidad_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 110, 35));

        unidad_blister.setBackground(new java.awt.Color(255, 255, 255));
        unidad_blister.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        unidad_blister.setForeground(new java.awt.Color(0, 0, 0));
        unidad_blister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidad_blisterActionPerformed(evt);
            }
        });
        jPanel1.add(unidad_blister, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 110, 35));

        precio_blister.setBackground(new java.awt.Color(255, 255, 255));
        precio_blister.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_blister.setForeground(new java.awt.Color(0, 0, 0));
        precio_blister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_blisterActionPerformed(evt);
            }
        });
        jPanel1.add(precio_blister, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 110, 35));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Unidad x blister:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 140, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Precio blister");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 140, 30));

        precio_caja.setBackground(new java.awt.Color(255, 255, 255));
        precio_caja.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        precio_caja.setForeground(new java.awt.Color(0, 0, 0));
        precio_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_cajaActionPerformed(evt);
            }
        });
        jPanel1.add(precio_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 110, 35));

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Precio caja");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 140, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 20, 560));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 20, 560));

        jPanel4.setBackground(new java.awt.Color(236, 255, 254));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_editar_1.png"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 105));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 90, 105));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void nombre_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_productoActionPerformed

    private void codigo_digemidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_digemidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_digemidActionPerformed

    private void principio_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principio_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principio_activoActionPerformed

    private void laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laboratorioActionPerformed

    private void minimo_avisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimo_avisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimo_avisoActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loteActionPerformed

    private void precio_unitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_unitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_unitarioActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void unidad_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidad_cajaActionPerformed

    private void unidad_blisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidad_blisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidad_blisterActionPerformed

    private void precio_blisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_blisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_blisterActionPerformed

    private void precio_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_cajaActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        int i = JOptionPane.showConfirmDialog(null, "¿SEGURO QUE QUIERES MODIFICAR ESTE PRODUCTO?", "AVISO", JOptionPane.CANCEL_OPTION);

        if (i == 0) {
            try {
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

                String fecha = año_v.getSelectedItem() + "-" + numeroMes + "-" + dia_V.getSelectedItem();

                if (!validarNumeros(stock.getText()) || !validarNumeros(minimo_aviso.getText()) || !validarNumeros(unidad_blister.getText()) || !validarNumeros(unidad_caja.getText()) || !validarDoubles(precio_unitario.getText()) || !validarDoubles(precio_blister.getText()) || !validarDoubles(precio_caja.getText())) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos en los campos numéricos.");
                    return;
                }

                producto p = new producto(Integer.parseInt(codigo_unico.getText()), nombre_producto.getText(), laboratorio.getText(), descripcion_producto.getText(), principio_activo.getText(), codigo_digemid.getText(), lote.getText(), ubicacion.getText(), fecha, Integer.parseInt(stock.getText()), Integer.parseInt(minimo_aviso.getText()), Integer.parseInt(unidad_blister.getText()), Integer.parseInt(unidad_caja.getText()), Double.parseDouble(precio_unitario.getText()), Double.parseDouble(precio_blister.getText()), Double.parseDouble(precio_caja.getText()));
                DAOProductos dao = new DAOProductoImpl();
                dao.modificar(p);
                
                this.dispose();
                JOptionPane.showMessageDialog(null, "MODIFICADO", "ESTADO", JOptionPane.PLAIN_MESSAGE);
                a = 1;

            } catch (Exception ex) {
                
            }
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_jPanel4MouseExited

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año_v;
    private javax.swing.JTextField codigo_digemid;
    private javax.swing.JLabel codigo_unico;
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
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
