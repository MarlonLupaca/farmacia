
package farmacia;

import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Marlon_Mendoza
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        xd.setLayout(new net.miginfocom.swing.MigLayout());
    }
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xd = new javax.swing.JPanel();
        panelxd = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        panelfill = new javax.swing.JPanel();
        botonxd = new javax.swing.JButton();
        azul = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelxd.setBackground(new java.awt.Color(153, 102, 0));
        panelxd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelxd.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 109, -1, -1));

        xd.add(panelxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 720));

        panelfill.setBackground(new java.awt.Color(255, 255, 255));
        panelfill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonxd.setText("jButton1");
        botonxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonxdActionPerformed(evt);
            }
        });
        panelfill.add(botonxd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        azul.setFont(new java.awt.Font("Segoe UI Semilight", 3, 100)); // NOI18N
        azul.setForeground(new java.awt.Color(0, 0, 0));
        azul.setText("azul");
        panelfill.add(azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 920, 90));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelfill.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 100, 100));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelfill.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        xd.add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1120, 720));

        getContentPane().add(xd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonxdActionPerformed
        int posicion = botonxd.getX();
        System.out.println(posicion);
        if(posicion > 10)
        {
            Animacion.Animacion.mover_izquierda(160, 0, 2, 6, botonxd);
            Animacion.Animacion.mover_izquierda(0, -160, 2, 6, panelxd);
            xd.setLayout(new MigLayout("fill"));
            
            
        }else
        {
            Animacion.Animacion.mover_derecha(0, 160, 2, 6, botonxd);
            Animacion.Animacion.mover_derecha(-160, 0, 2, 6, panelxd);
        }
        
    }//GEN-LAST:event_botonxdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("boton");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel azul;
    private javax.swing.JButton botonxd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelfill;
    private javax.swing.JPanel panelxd;
    private javax.swing.JPanel xd;
    // End of variables declaration//GEN-END:variables
}
