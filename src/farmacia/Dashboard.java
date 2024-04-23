
package farmacia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 *
 * @author Marlon_Mendoza
 */
public class Dashboard extends javax.swing.JFrame {
    
    public Dashboard() {
        initComponents();
        login g = new login();
        visualizador(new PANTALLA_VENTAS());
        usuario.setText(g.getLogin());
    }
    private void visualizador(JPanel p)
    {
        p.setSize(1050, 720);
        p.setLocation(0,0);
        panelfill.removeAll();
        panelfill.add(p,BorderLayout.CENTER);
        panelfill.revalidate();
        panelfill.repaint();
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xd = new javax.swing.JPanel();
        panelfill = new javax.swing.JPanel();
        panelxd = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        b2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 760));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 760));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(236, 255, 254));

        javax.swing.GroupLayout panelfillLayout = new javax.swing.GroupLayout(panelfill);
        panelfill.setLayout(panelfillLayout);
        panelfillLayout.setHorizontalGroup(
            panelfillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        panelfillLayout.setVerticalGroup(
            panelfillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        xd.add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1050, 720));

        panelxd.setBackground(new java.awt.Color(236, 255, 254));
        panelxd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(177, 212, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/def.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 170));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        usuario.setBackground(new java.awt.Color(0, 51, 153));
        usuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("usuario");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 40));

        panelxd.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 200));

        b3.setBackground(new java.awt.Color(177, 212, 224));
        b3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        b3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CLIENTES");
        b3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        panelxd.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 230, 50));

        b2.setBackground(new java.awt.Color(177, 212, 224));
        b2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VENTAS");
        b2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        panelxd.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 230, 50));

        b1.setBackground(new java.awt.Color(177, 212, 224));
        b1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRODUCTOS");
        b1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        panelxd.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        xd.add(panelxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 760));

        jPanel2.setBackground(new java.awt.Color(177, 212, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(236, 255, 254));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons2.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 5, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mini.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 80, 40));

        xd.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1050, 40));

        getContentPane().add(xd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        b2.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b2MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        b2.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        b3.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        b3.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b3MouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        visualizador(new PANTALLA_PRODUCTOS());
    }//GEN-LAST:event_b1MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        visualizador(new PANTALLA_CLIENTES());
    }//GEN-LAST:event_b3MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        visualizador(new PANTALLA_VENTAS());
    }//GEN-LAST:event_b2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelfill;
    private javax.swing.JPanel panelxd;
    private javax.swing.JLabel usuario;
    private javax.swing.JPanel xd;
    // End of variables declaration//GEN-END:variables
}
