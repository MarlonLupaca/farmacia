
package farmacia;

import Implementaciones.DAOAlertasImpl;
import interfaces.DAOAlertas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.alerta;
import objetos.cliente;

/**
 *
 * @author Marlon_Mendoza
 */
public class REGISTRO_DE_ALERTAS extends javax.swing.JFrame {

   
    public REGISTRO_DE_ALERTAS(String dni, String nombre) {
        initComponents();
        dnit.setText(dni);
        nombret.setText(nombre);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombret = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fechadealerta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dnit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 226, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(73, 148, 174));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 46, 56));
        jLabel2.setText("AGREGAR ALERTA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, 50));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 46, 56));
        jLabel3.setText("Descripcion de la alerta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 160, 30));

        nombret.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombret.setForeground(new java.awt.Color(25, 46, 56));
        nombret.setText("Nombre:");
        jPanel1.add(nombret, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 230, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 46, 56));
        jLabel7.setText("Fecha de alerta:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 30));

        fechadealerta.setBackground(new java.awt.Color(255, 255, 255));
        fechadealerta.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        fechadealerta.setForeground(new java.awt.Color(0, 0, 0));
        fechadealerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechadealertaActionPerformed(evt);
            }
        });
        jPanel1.add(fechadealerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, 35));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 120, 30));

        dnit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dnit.setForeground(new java.awt.Color(25, 46, 56));
        dnit.setText("DNI del cliente:");
        jPanel1.add(dnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 30));

        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setColumns(20);
        descripcion.setForeground(new java.awt.Color(0, 0, 0));
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 250, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechadealertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechadealertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechadealertaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = JOptionPane.showConfirmDialog(null,"¿SEGURO QUE GUARDAR ESTA ALERTA?","AVISO",JOptionPane.CANCEL_OPTION );
                
        if (i == 0) {
            try {
                DAOAlertas dao = new DAOAlertasImpl();
                alerta p = new alerta(dnit.getText(),nombret.getText(),descripcion.getText(),fechadealerta.getText());
                dao.registrar(p);
                dispose();
                JOptionPane.showMessageDialog(null,"GUARDADO CORRECTAMENTE","ESTADO",JOptionPane.PLAIN_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(registrarProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(REGISTRO_DE_ALERTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_DE_ALERTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_DE_ALERTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO_DE_ALERTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel dnit;
    private javax.swing.JTextField fechadealerta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombret;
    // End of variables declaration//GEN-END:variables
}
