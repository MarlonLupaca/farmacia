
package farmacia;
import Implementaciones.DAOClientesImpl;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import db.conexion;
import interfaces.DAOClientes;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class login extends javax.swing.JFrame {
    private static String login;
    private static String rola;
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public login() {
        initComponents();
        campo.setVisible(false);
        txt_contraseña.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "contraseña");
        txt_usuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "usuario");
        //
        txt_contraseña.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_contraseña.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        campo = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(236, 255, 254));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons2.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 5, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mini.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 80, 40));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo.setBackground(new java.awt.Color(102, 102, 102));
        campo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        campo.setForeground(new java.awt.Color(255, 0, 0));
        campo.setText("Usuario o contraseña incorrecto (*)");
        jPanel3.add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        b.setBackground(new java.awt.Color(204, 255, 255));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bMousePressed(evt);
            }
        });
        b.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Iniciar sesion");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, -1));

        jPanel3.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 390, 40));

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Contraseña");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(0, 0, 0));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 390, 40));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/farmacia.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 190, 140));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 100, 144));
        jLabel7.setText("¡Bienvenido!");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 140));

        txt_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        txt_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });
        jPanel3.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 390, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 480, 550));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("@2024 Elaborado y diseñado por Marlon Lupaca");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0xB1D4E0));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0xCCFFFF));
    }//GEN-LAST:event_bMouseExited

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked

    }//GEN-LAST:event_bMouseClicked

    private void bMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMousePressed
        DAOClientes dao = new DAOClientesImpl();
        
        String usuario = txt_usuario.getText().toString();
        String contraseña = txt_contraseña.getText().toString();
        try {
            int val = dao.validar(usuario, contraseña);
            
            if(val == 1)
            {   
                login = usuario;
                rola = "admin";
                Dashboard_admin newframe = new Dashboard_admin();
                newframe.setVisible(true);
                campo.setVisible(false);
                this.dispose();
                
            }else if(val == 2)    
            {
                login = usuario;
                rola = "noadmin";
                Dashboard newframe = new Dashboard();
                newframe.setVisible(true);
                campo.setVisible(false);
                this.dispose();
            }else if(val == 0)
            {
                System.out.println("hola");
                campo.setVisible(true);

            }
            
        } catch (Exception ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            
        } catch (Exception e) {
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b;
    private javax.swing.JLabel campo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
