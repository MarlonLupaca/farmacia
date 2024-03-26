
package farmacia;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Marlon_Mendoza
 */

public class PANTALLA_VENTAS extends javax.swing.JPanel {

    public JButton getVentana() {
        return ventana;
    }

    public void setVentana(JButton ventana) {
        this.ventana = ventana;
    }

    
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
        jButton1 = new javax.swing.JButton();
        ventana = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        panelfill.setBackground(new java.awt.Color(204, 226, 235));
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

        jButton1.setText("BIBLIOTECA VENTAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelfill.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 40));

        ventana.setText("VENTA");
        ventana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaActionPerformed(evt);
            }
        });
        panelfill.add(ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        jButton2.setText("BALANCE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelfill.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 180, 40));

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

    private void ventanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaActionPerformed
        visualizador(new REGISTRO_VENTA());
    }//GEN-LAST:event_ventanaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        visualizador(new BIBLIOTECA_VENTAS());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        visualizador(new BALANCE_VENTAS());
    }//GEN-LAST:event_jButton2ActionPerformed

    
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel menu_kardex;
    private javax.swing.JPanel panelfill;
    private javax.swing.JButton ventana;
    // End of variables declaration//GEN-END:variables
}
