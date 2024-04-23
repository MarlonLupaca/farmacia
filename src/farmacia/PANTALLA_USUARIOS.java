
package farmacia;

import Implementaciones.DAOAlertasImpl;
import Implementaciones.DAOClientesImpl;
import Implementaciones.DAOUsuarioImpl;
import controladores_tabla.acciones_botones_inte;
import controladores_tabla.editor;
import controladores_tabla.render;
import interfaces.DAOAlertas;
import interfaces.DAOClientes;
import interfaces.DAOUusuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import objetos.alerta;
import objetos.usuario;


public class PANTALLA_USUARIOS extends javax.swing.JPanel {





    
    public PANTALLA_USUARIOS() {
        initComponents();
        cargar_tabla();
        xxx();
        
    }
    
    
    private void visualizador(JPanel p)
    {
        p.setSize(1050, 720);
        p.setLocation(0,0);
        C.removeAll();
        C.add(p,BorderLayout.CENTER);
        C.revalidate();
        C.repaint();
    }
    
    public void cargar_tabla()
    {
        try {
            DAOUusuario dao = new DAOUsuarioImpl();
            DefaultTableModel model = (DefaultTableModel) tabla_usuarios.getModel();
            tabla_usuarios.getTableHeader().setBackground(new Color(0xB1D4E0));
            model.setRowCount(0);
            
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getId(),u.getUsuario(),u.getContraseña(),u.getRol()}));
        } catch (Exception e) {
        }
    }
    
    public void xxx()
    {
        acciones_botones_inte evento = new acciones_botones_inte() {
            @Override
            public void editar(int row) {
                
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE QUIERES MODIFICAR ESTE USUARIO","AVISO",JOptionPane.CANCEL_OPTION);
                
                if (i == 0) {
                    int fila = tabla_usuarios.getSelectedRow();
                    String id = tabla_usuarios.getValueAt(fila, 0).toString();
                    String usuario = tabla_usuarios.getValueAt(fila, 1).toString();
                    String contraseña = tabla_usuarios.getValueAt(fila, 2).toString();
                    String rol = tabla_usuarios.getValueAt(fila, 3).toString();
                    
                    
                    usuario p = new usuario(id, usuario, contraseña,rol);

                    DAOUusuario dao = new DAOUsuarioImpl();
                    try {
                        dao.modificar(p);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_ALERTAS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"MODIFICADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new PANTALLA_USUARIOS());
                }
                
   
            }

            @Override
            public void borrar(int row) {
                int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE ELIMINAR ESTA ALERTA?","AVISO",JOptionPane.CANCEL_OPTION );
                
                if (i == 0) {
                    int fila = tabla_usuarios.getSelectedRow();
                    String id = tabla_usuarios.getValueAt(fila, 0).toString();
                    
                    DAOUusuario dao = new DAOUsuarioImpl();

                    try {
                        dao.eliminar(id);
                    } catch (Exception ex) {
                        Logger.getLogger(BIBLIOTECA_ALERTAS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null,"ELIMINADO","ESTADO",JOptionPane.PLAIN_MESSAGE);
                    visualizador(new PANTALLA_USUARIOS());
                }
            }

            @Override
            public void vizualisar(int row) {  
            }
        };
        tabla_usuarios.getColumnModel().getColumn(4).setCellRenderer( new render());
        tabla_usuarios.getColumnModel().getColumn(4).setCellEditor(new editor(evento));
    }
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelfill = new javax.swing.JPanel();
        C = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lbusuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbcontraseña = new javax.swing.JTextField();
        bAdministrador = new javax.swing.JRadioButton();
        bTrabajador = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        panelfill.setBackground(new java.awt.Color(204, 226, 235));
        panelfill.setMinimumSize(new java.awt.Dimension(1050, 720));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        C.setBackground(new java.awt.Color(236, 255, 254));
        C.setMinimumSize(new java.awt.Dimension(1010, 720));
        C.setPreferredSize(new java.awt.Dimension(1050, 720));

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

        tabla_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        tabla_usuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "CONTRASEÑA", "ROL", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_usuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_usuarios.setRowHeight(40);
        tabla_usuarios.setSelectionBackground(new java.awt.Color(109, 175, 195));
        tabla_usuarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_usuarios);
        if (tabla_usuarios.getColumnModel().getColumnCount() > 0) {
            tabla_usuarios.getColumnModel().getColumn(0).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_usuarios.getColumnModel().getColumn(1).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(2).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(3).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(4).setResizable(false);
            tabla_usuarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbusuario.setBackground(new java.awt.Color(255, 255, 255));
        lbusuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lbusuario.setForeground(new java.awt.Color(0, 0, 0));
        lbusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbusuarioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rol:");

        lbcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        lbcontraseña.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lbcontraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbcontraseñaActionPerformed(evt);
            }
        });

        buttonGroup1.add(bAdministrador);
        bAdministrador.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bAdministrador.setForeground(new java.awt.Color(0, 0, 0));
        bAdministrador.setText("Administrador");

        buttonGroup1.add(bTrabajador);
        bTrabajador.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        bTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        bTrabajador.setText("Trabajador");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña:");

        jPanel1.setBackground(new java.awt.Color(177, 212, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(236, 255, 254), new java.awt.Color(236, 255, 254)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USUARIOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario:");

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addGroup(CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(bAdministrador))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(bTrabajador))
                    .addGroup(CLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(CLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelfill.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelfill, javax.swing.GroupLayout.PREFERRED_SIZE, 1578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelfill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbusuarioActionPerformed

    private void lbcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbcontraseñaActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE QUIERES AGREGAR ESTE USUARIO","AVISO",JOptionPane.CANCEL_OPTION );
            
            if (i == 0) {
                try {
                    String rol = "";
                    if (bAdministrador.isSelected()) {
                        rol = "Administrador";
                    } else if (bTrabajador.isSelected()) {
                        rol = "Trabajador";
                    }
                    System.out.println(rol);
                    usuario p = new usuario(lbusuario.getText(),lbcontraseña.getText(),rol); 

                    DAOUusuario dao = new DAOUsuarioImpl();
                    dao.registrar(p);
                    visualizador(new PANTALLA_USUARIOS());
                } catch (Exception ex) {
                    Logger.getLogger(PANTALLA_USUARIOS.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JPanel C;
    private javax.swing.JRadioButton bAdministrador;
    private javax.swing.JRadioButton bTrabajador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lbcontraseña;
    private javax.swing.JTextField lbusuario;
    private javax.swing.JPanel panelfill;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
