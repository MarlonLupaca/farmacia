
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor_venta_pastel;
import controladores_tabla.render_pastel;
import interfaces.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marlon_Mendoza
 */
public class BALANCE_VENTAS extends javax.swing.JPanel {

    
    public BALANCE_VENTAS() {
        initComponents();
        
        xxx();
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

            }

            @Override
            public void vizualisar(int row) {
                try {
                    
                    int fila = tabla_ventas.getSelectedRow();
                    String id = tabla_ventas.getValueAt(fila, 0).toString();
                    VIEW_VENTA V = new VIEW_VENTA(id);
                    V.setVisible(true);
     
                } catch (Exception ex) {
                    Logger.getLogger(BALANCE_VENTAS.class.getName()).log(Level.SEVERE, null, ex);
                }


                
            };
        };
        tabla_ventas.getColumnModel().getColumn(9).setCellRenderer( new render_pastel());
        tabla_ventas.getColumnModel().getColumn(9).setCellEditor(new editor_venta_pastel(evento));
    }


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoMetod = new javax.swing.ButtonGroup();
        C = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        año_inicio = new javax.swing.JComboBox<>();
        mes_inicio = new javax.swing.JComboBox<>();
        dia_inicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        año_fin = new javax.swing.JComboBox<>();
        mes_fin = new javax.swing.JComboBox<>();
        dia_fin = new javax.swing.JComboBox<>();
        vende = new javax.swing.JRadioButton();
        ven = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        yape = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        duo = new javax.swing.JRadioButton();
        efectivo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        t_yape = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        t_efectivo = new javax.swing.JLabel();

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));
        C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(177, 212, 224));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        C.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 90, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 212, 224), new java.awt.Color(177, 212, 224)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("S/.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        TOTAL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TOTAL.setForeground(new java.awt.Color(0, 0, 0));
        TOTAL.setText("0.0");
        jPanel1.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        C.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 100, 40));

        jButton2.setBackground(new java.awt.Color(177, 212, 224));
        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Totalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        C.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 90, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(177, 212, 224)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        año_inicio.setBackground(new java.awt.Color(255, 255, 255));
        año_inicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_inicio.setForeground(new java.awt.Color(0, 0, 0));
        año_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel2.add(año_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, 35));

        mes_inicio.setBackground(new java.awt.Color(255, 255, 255));
        mes_inicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_inicio.setForeground(new java.awt.Color(0, 0, 0));
        mes_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel2.add(mes_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 35));

        dia_inicio.setBackground(new java.awt.Color(255, 255, 255));
        dia_inicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_inicio.setForeground(new java.awt.Color(0, 0, 0));
        dia_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(dia_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 60, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fin:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, 30));

        año_fin.setBackground(new java.awt.Color(255, 255, 255));
        año_fin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_fin.setForeground(new java.awt.Color(0, 0, 0));
        año_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel2.add(año_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, 35));

        mes_fin.setBackground(new java.awt.Color(255, 255, 255));
        mes_fin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_fin.setForeground(new java.awt.Color(0, 0, 0));
        mes_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel2.add(mes_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, 35));

        dia_fin.setBackground(new java.awt.Color(255, 255, 255));
        dia_fin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_fin.setForeground(new java.awt.Color(0, 0, 0));
        dia_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(dia_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 60, 35));

        vende.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        vende.setForeground(new java.awt.Color(0, 0, 0));
        vende.setText("Vendedora");
        jPanel2.add(vende, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 30));

        ven.setBackground(new java.awt.Color(255, 255, 255));
        ven.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ven.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 220, 30));

        jPanel3.setBackground(new java.awt.Color(177, 212, 224));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 20));

        GrupoMetod.add(yape);
        yape.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        yape.setForeground(new java.awt.Color(0, 0, 0));
        yape.setText("Yape");
        jPanel2.add(yape, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Inicio:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 10, 150));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 10, 150));

        GrupoMetod.add(duo);
        duo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        duo.setForeground(new java.awt.Color(0, 0, 0));
        duo.setText("Duo");
        jPanel2.add(duo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, 30));

        GrupoMetod.add(efectivo);
        efectivo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        efectivo.setForeground(new java.awt.Color(0, 0, 0));
        efectivo.setText("Efectivo");
        jPanel2.add(efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Metodo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 30));

        C.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 810, 170));

        tabla_ventas.setBackground(new java.awt.Color(255, 255, 255));
        tabla_ventas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA DE VENTA", "CLIENTE", "TOTAL VENTA", "METODO DE PAGO", "VENDEDOR", "HORA", "M. Efectivo", "M. Yape", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
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
            tabla_ventas.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_ventas.getColumnModel().getColumn(1).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(2).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(3).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(4).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(5).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(6).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(7).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(8).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(8).setPreferredWidth(30);
            tabla_ventas.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        C.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 990, 420));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Efectivo:");
        C.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 70, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total:");
        C.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 50, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Yape:");
        C.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, 50, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 212, 224), new java.awt.Color(177, 212, 224)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("S/.");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        t_yape.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        t_yape.setForeground(new java.awt.Color(0, 0, 0));
        t_yape.setText("0.0");
        jPanel4.add(t_yape, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        C.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 100, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(177, 212, 224), new java.awt.Color(177, 212, 224)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("S/.");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        t_efectivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        t_efectivo.setForeground(new java.awt.Color(0, 0, 0));
        t_efectivo.setText("0.0");
        jPanel5.add(t_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 40));

        C.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 100, 40));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DAOVenta dao = new DAOVentaImpl();

        String nombreMes = (String) mes_inicio.getSelectedItem();
        int numeroMes;
        switch (nombreMes) {
            case "enero":
                numeroMes = 1;
                break;
            case "febrero":
                numeroMes = 2;
                break;
            case "marzo":
                numeroMes = 3;
                break;
            case "abril":
                numeroMes = 4;
                break;
            case "mayo":
                numeroMes = 5;
                break;
            case "junio":
                numeroMes = 6;
                break;
            case "julio":
                numeroMes = 7;
                break;
            case "agosto":
                numeroMes = 8;
                break;
            case "septiembre":
                numeroMes = 9;
                break;
            case "octubre":
                numeroMes = 10;
                break;
            case "noviembre":
                numeroMes = 11;
                break;
            case "diciembre":
                numeroMes = 12;
                break;
            default:
                numeroMes = 0;
        }

        String fechaInicio = año_inicio.getSelectedItem() + "-" + numeroMes + "-" + dia_inicio.getSelectedItem();

        String nombreMes1 = (String) mes_fin.getSelectedItem();
        int numeroMes1;
        switch (nombreMes1) {
            case "enero":
                numeroMes1 = 1;
                break;
            case "febrero":
                numeroMes1 = 2;
                break;
            case "marzo":
                numeroMes1 = 3;
                break;
            case "abril":
                numeroMes1 = 4;
                break;
            case "mayo":
                numeroMes1 = 5;
                break;
            case "junio":
                numeroMes1 = 6;
                break;
            case "julio":
                numeroMes1 = 7;
                break;
            case "agosto":
                numeroMes1 = 8;
                break;
            case "septiembre":
                numeroMes1 = 9;
                break;
            case "octubre":
                numeroMes1 = 10;
                break;
            case "noviembre":
                numeroMes1 = 11;
                break;
            case "diciembre":
                numeroMes1 = 12;
                break;
            default:
                numeroMes1 = 0;
        }

        String fechaFin = año_fin.getSelectedItem() + "-" + numeroMes1 + "-" + dia_fin.getSelectedItem();

        try {
            DefaultTableModel model = (DefaultTableModel) tabla_ventas.getModel();
            tabla_ventas.getTableHeader().setBackground(new Color(0xB1D4E0));
            model.setRowCount(0);
            String metodo="";
            if(efectivo.isSelected()){metodo = "Efectivo";}
            if(yape.isSelected()){metodo = "Yape";}
            if(duo.isSelected()){metodo = "Duo";}
            
            if (vende.isSelected() && !metodo.isEmpty()){
                dao.filtrar_fecha_metodo_vendedora(fechaInicio, fechaFin,ven.getText(),metodo).forEach((u) -> model.addRow(new Object[]{u.getId(),u.getFecha_venta(),u.getCliente(),"S/."+u.getTotalVenta(),u.getMetodo(),u.getVendedor(),u.getHora(),"S/."+u.getMEfectivo(),"S/."+u.getMYape()}));
            }else if (vende.isSelected()) {
                dao.filtrar_fecha_vendedore(fechaInicio, fechaFin, ven.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(),u.getFecha_venta(),u.getCliente(),"S/."+u.getTotalVenta(),u.getMetodo(),u.getVendedor(),u.getHora(),"S/."+u.getMEfectivo(),"S/."+u.getMYape()}));
            }else if(!metodo.isEmpty()){
                dao.filtrar_fecha_metodo(fechaInicio, fechaFin,metodo).forEach((u) -> model.addRow(new Object[]{u.getId(),u.getFecha_venta(),u.getCliente(),"S/."+u.getTotalVenta(),u.getMetodo(),u.getVendedor(),u.getHora(),"S/."+u.getMEfectivo(),"S/."+u.getMYape()}));
            }else{
               dao.filtrar_fecha(fechaInicio, fechaFin).forEach((u) -> model.addRow(new Object[]{u.getId(),u.getFecha_venta(),u.getCliente(),"S/."+u.getTotalVenta(),u.getMetodo(),u.getVendedor(),u.getHora(),"S/."+u.getMEfectivo(),"S/."+u.getMYape()}));
            }

        } catch (Exception ex) {
            Logger.getLogger(BALANCE_VENTAS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double total = 0.0;
        double total_yape = 0.0;
        double total_efectivo = 0.0;
        
        for (int i = 0; i < tabla_ventas.getRowCount(); i++) {
            String valorCelda = tabla_ventas.getValueAt(i, 3).toString();
            String valorSinSimbolo = valorCelda.replace("S/.", "");
            total += Double.parseDouble(valorSinSimbolo);
        }
        TOTAL.setText(String.valueOf(total));
        
        for (int i = 0; i < tabla_ventas.getRowCount(); i++) {
            String valorCelda = tabla_ventas.getValueAt(i, 8).toString();
            String valorSinSimbolo = valorCelda.replace("S/.", "");
            total_yape += Double.parseDouble(valorSinSimbolo);
        }
        t_yape.setText(String.valueOf(total_yape));
        
        for (int i = 0; i < tabla_ventas.getRowCount(); i++) {
            String valorCelda = tabla_ventas.getValueAt(i, 7).toString();
            String valorSinSimbolo = valorCelda.replace("S/.", "");
            total_efectivo += Double.parseDouble(valorSinSimbolo);
        }
       t_efectivo.setText(String.valueOf(total_efectivo));

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.ButtonGroup GrupoMetod;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JComboBox<String> año_fin;
    private javax.swing.JComboBox<String> año_inicio;
    private javax.swing.JComboBox<String> dia_fin;
    private javax.swing.JComboBox<String> dia_inicio;
    private javax.swing.JRadioButton duo;
    private javax.swing.JRadioButton efectivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> mes_fin;
    private javax.swing.JComboBox<String> mes_inicio;
    private javax.swing.JLabel t_efectivo;
    private javax.swing.JLabel t_yape;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JTextField ven;
    private javax.swing.JRadioButton vende;
    private javax.swing.JRadioButton yape;
    // End of variables declaration//GEN-END:variables

    
}
