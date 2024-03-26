
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor;
import controladores_tabla.editor_venta_pastel;
import controladores_tabla.editor_venta_view;
import controladores_tabla.render;
import controladores_tabla.render_pastel;
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
        tabla_ventas.getColumnModel().getColumn(6).setCellRenderer( new render_pastel());
        tabla_ventas.getColumnModel().getColumn(6).setCellEditor(new editor_venta_pastel(evento));
    }


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C = new javax.swing.JPanel();
        año_inicio = new javax.swing.JComboBox<>();
        mes_inicio = new javax.swing.JComboBox<>();
        dia_inicio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        año_fin = new javax.swing.JComboBox<>();
        mes_fin = new javax.swing.JComboBox<>();
        dia_fin = new javax.swing.JComboBox<>();
        vende = new javax.swing.JRadioButton();
        ven = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));
        C.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        año_inicio.setBackground(new java.awt.Color(255, 255, 255));
        año_inicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_inicio.setForeground(new java.awt.Color(0, 0, 0));
        año_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        C.add(año_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 35));

        mes_inicio.setBackground(new java.awt.Color(255, 255, 255));
        mes_inicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_inicio.setForeground(new java.awt.Color(0, 0, 0));
        mes_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        C.add(mes_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 35));

        dia_inicio.setBackground(new java.awt.Color(255, 255, 255));
        dia_inicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_inicio.setForeground(new java.awt.Color(0, 0, 0));
        dia_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        C.add(dia_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 60, 35));

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

        C.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 1038, 600));

        año_fin.setBackground(new java.awt.Color(255, 255, 255));
        año_fin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_fin.setForeground(new java.awt.Color(0, 0, 0));
        año_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        C.add(año_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 80, 35));

        mes_fin.setBackground(new java.awt.Color(255, 255, 255));
        mes_fin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_fin.setForeground(new java.awt.Color(0, 0, 0));
        mes_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        C.add(mes_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 110, 35));

        dia_fin.setBackground(new java.awt.Color(255, 255, 255));
        dia_fin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_fin.setForeground(new java.awt.Color(0, 0, 0));
        dia_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        C.add(dia_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 60, 35));

        vende.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        vende.setForeground(new java.awt.Color(0, 0, 0));
        vende.setText("Vendedora");
        C.add(vende, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 30));

        ven.setBackground(new java.awt.Color(255, 255, 255));
        ven.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        ven.setForeground(new java.awt.Color(0, 0, 0));
        C.add(ven, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 130, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fin:");
        C.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inicio:");
        C.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        C.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, 30));

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
            model.setRowCount(0);
            if (vende.isSelected()) {
                dao.filtrar_fecha_vendedore(fechaInicio, fechaFin, ven.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getFecha_venta(), u.getCliente(), u.getTotalVenta(), u.getMetodo(), u.getVendedor()}));
            } else {
                dao.filtrar_fecha(fechaInicio, fechaFin).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getFecha_venta(), u.getCliente(), u.getTotalVenta(), u.getMetodo(), u.getVendedor()}));
            }
        } catch (Exception ex) {
            Logger.getLogger(BALANCE_VENTAS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JComboBox<String> año_fin;
    private javax.swing.JComboBox<String> año_inicio;
    private javax.swing.JComboBox<String> dia_fin;
    private javax.swing.JComboBox<String> dia_inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mes_fin;
    private javax.swing.JComboBox<String> mes_inicio;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JTextField ven;
    private javax.swing.JRadioButton vende;
    // End of variables declaration//GEN-END:variables

    
}
