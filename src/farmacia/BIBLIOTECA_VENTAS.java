
package farmacia;

import Implementaciones.*;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor_venta_view;
import controladores_tabla.render_view;
import interfaces.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BIBLIOTECA_VENTAS extends javax.swing.JPanel {

    private String permiso;
    private String per;
    public BIBLIOTECA_VENTAS() {
        initComponents();
        login lo = new login();
        permiso = lo.getLogin();
        per = lo.getRola();
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
                int fila = tabla_ventas.getSelectedRow();
                String id = tabla_ventas.getValueAt(fila, 0).toString();
                String vende = tabla_ventas.getValueAt(fila, 5).toString();
                
                if (per.equals("admin")) {
                    int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE ELIMINAR ESTE PRODUCTO","AVISO",JOptionPane.CANCEL_OPTION );
                
                    if (i == 0) {

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
                } else 
                {
                   JOptionPane.showMessageDialog(null,"PERMISOS INSUFICIENTES","ESTADO",JOptionPane.PLAIN_MESSAGE);
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
        tabla_ventas.getColumnModel().getColumn(9).setCellRenderer( new render_view());
        tabla_ventas.getColumnModel().getColumn(9).setCellEditor(new editor_venta_view(evento));
    }
    public void cargar_tabla()
    {
        try {
            DAOVenta dao = new DAOVentaImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_ventas.getModel();
            tabla_ventas.getTableHeader().setBackground(new Color(0xB1D4E0));
            model.setRowCount(0);
            
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getId(),u.getFecha_venta(),u.getCliente(),"S/."+u.getTotalVenta(),u.getMetodo(),u.getVendedor(),u.getHora(),"S/."+u.getMEfectivo(),"S/."+u.getMYape()}));
        } catch (Exception e) {
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        C = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setPreferredSize(new java.awt.Dimension(1050, 680));

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
            tabla_ventas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_ventas.getColumnModel().getColumn(1).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(1).setPreferredWidth(130);
            tabla_ventas.getColumnModel().getColumn(2).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla_ventas.getColumnModel().getColumn(3).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla_ventas.getColumnModel().getColumn(4).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabla_ventas.getColumnModel().getColumn(5).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla_ventas.getColumnModel().getColumn(6).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabla_ventas.getColumnModel().getColumn(7).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(8).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(9).setResizable(false);
            tabla_ventas.getColumnModel().getColumn(9).setPreferredWidth(90);
        }

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel C;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_ventas;
    // End of variables declaration//GEN-END:variables

    
}
