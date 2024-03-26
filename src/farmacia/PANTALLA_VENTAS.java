
package farmacia;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PANTALLA_VENTAS extends javax.swing.JPanel {


    
    public PANTALLA_VENTAS() {
        initComponents();
        visualizador(new REGISTRO_VENTA());
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
        jLabel9 = new javax.swing.JLabel();
        b5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        b6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VENTA");
        b4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        panelfill.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

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

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BALANCE");
        b5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        panelfill.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 170, 40));

        b6.setBackground(new java.awt.Color(177, 212, 224));
        b6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6MouseExited(evt);
            }
        });
        b6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BLIBLIOTECA VENTAS");
        b6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        panelfill.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 180, 40));

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

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        visualizador(new REGISTRO_VENTA());
    }//GEN-LAST:event_b4MouseClicked

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        b4.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        b4.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b4MouseExited

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        visualizador(new BALANCE_VENTAS());
    }//GEN-LAST:event_b5MouseClicked

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        b5.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b5MouseEntered

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
        b5.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b5MouseExited

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        visualizador(new BIBLIOTECA_VENTAS());
    }//GEN-LAST:event_b6MouseClicked

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
        b6.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b6MouseEntered

    private void b6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseExited
        b6.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b6MouseExited

    
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b4;
    private javax.swing.JPanel b5;
    private javax.swing.JPanel b6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menu_kardex;
    private javax.swing.JPanel panelfill;
    // End of variables declaration//GEN-END:variables
}
