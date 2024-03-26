
package farmacia;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Marlon_Mendoza
 */

public class PANTALLA_PRODUCTOS extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PANTALLA_PRODUCTOS() {
        initComponents();
        visualizador(new BIBLIOTECA_PRODUCTOS());
    }
    
    public void visualizador (JPanel p)
    {
        p.setSize(1050, 680);
        p.setLocation(0,0);
        menu_kardex.removeAll();
        menu_kardex.add(p,BorderLayout.CENTER);
        menu_kardex.revalidate();
        menu_kardex.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        menu_kardex = new javax.swing.JPanel();
        b4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        b5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        panelfill.setBackground(new java.awt.Color(236, 255, 254));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout menu_kardexLayout = new javax.swing.GroupLayout(menu_kardex);
        menu_kardex.setLayout(menu_kardexLayout);
        menu_kardexLayout.setHorizontalGroup(
            menu_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        menu_kardexLayout.setVerticalGroup(
            menu_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        panelfill.add(menu_kardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1050, 680));

        b4.setBackground(new java.awt.Color(177, 212, 224));
        b4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRAR PRODUCTO");
        b4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        panelfill.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 240, 40));

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

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRODUCTOS");
        b3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        panelfill.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        b5.setBackground(new java.awt.Color(177, 212, 224));
        b5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });
        b5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ALERTAS DE STOCK");
        b5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 40));

        panelfill.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelfill, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelfill, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        visualizador(new BIBLIOTECA_PRODUCTOS());
    }//GEN-LAST:event_b3MouseClicked

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        b3.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        b3.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        visualizador(new REGISTRO_PRODUCTO());
    }//GEN-LAST:event_b4MouseClicked

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        b4.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        b4.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b4MouseExited

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        visualizador(new ALERTAS_DE_STOCK());
    }//GEN-LAST:event_b5MouseClicked

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        b5.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b5MouseEntered

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
        b5.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b5MouseExited

    
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b3;
    private javax.swing.JPanel b4;
    private javax.swing.JPanel b5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menu_kardex;
    private javax.swing.JPanel panelfill;
    // End of variables declaration//GEN-END:variables
}
