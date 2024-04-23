
package farmacia;

import Implementaciones.DAOAlertasImpl;
import interfaces.DAOAlertas;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;



public class PANTALLA_CLIENTES extends javax.swing.JPanel {
    private DAOAlertas dao = new DAOAlertasImpl();
    
    public PANTALLA_CLIENTES() {
        initComponents();
        visualizador(new BIBLIOTECA_CLIENTES());
        
        
        
    }
    private void visualizador(JPanel p)
    {
        p.setSize(1050, 680);
        p.setLocation(0,0);
        tera.removeAll();
        tera.add(p,BorderLayout.CENTER);
        tera.revalidate();
        tera.repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        b4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        b5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        b6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        b7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(236, 255, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout teraLayout = new javax.swing.GroupLayout(tera);
        tera.setLayout(teraLayout);
        teraLayout.setHorizontalGroup(
            teraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        teraLayout.setVerticalGroup(
            teraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel1.add(tera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("AVISOS:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 40));

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

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CLIENTES");
        b3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

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
        jLabel9.setText("AGREGAR CLIENTE");
        b4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 170, 40));

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

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ALERTAS");
        b5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 110, 40));

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

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TODO");
        b6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 80, 40));

        b7.setBackground(new java.awt.Color(177, 212, 224));
        b7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b7MouseExited(evt);
            }
        });
        b7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DIARIOS");
        b7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        visualizador(new BIBLIOTECA_CLIENTES());
    }//GEN-LAST:event_b3MouseClicked

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        b3.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        b3.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        visualizador(new REGISTRO_CLIENTE());
    }//GEN-LAST:event_b4MouseClicked

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        b4.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        b4.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b4MouseExited

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        visualizador(new BIBLIOTECA_ALERTAS());
    }//GEN-LAST:event_b5MouseClicked

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        b5.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b5MouseEntered

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
        b5.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b5MouseExited

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        visualizador(new tera());
    }//GEN-LAST:event_b6MouseClicked

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
        b6.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b6MouseEntered

    private void b6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseExited
        b6.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b6MouseExited

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        visualizador(new teradiario());
    }//GEN-LAST:event_b7MouseClicked

    private void b7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseEntered
        b7.setBackground(new Color(0xECFFFE));
    }//GEN-LAST:event_b7MouseEntered

    private void b7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseExited
        b7.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_b7MouseExited

    
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b3;
    private javax.swing.JPanel b4;
    private javax.swing.JPanel b5;
    private javax.swing.JPanel b6;
    private javax.swing.JPanel b7;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel tera;
    // End of variables declaration//GEN-END:variables
}
