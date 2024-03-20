
package farmacia;
import java.awt.*;

public class Carta extends javax.swing.JPanel {

    /**
     * Creates new form Carta
     */
    
    public Carta(String id, String dni, String nombre, String descripcion, String fecha) {
        initComponents();
        this.id.setText("ID: "+id);
        this.dni.setText("DNI: "+dni);
        this.nombre.setText("NOMBRE: "+nombre);
        this.fecha.setText("FECHA: "+ fecha);
        this.descripcion.setText("DESCRIPCION: "+ descripcion);
       setPreferredSize(new Dimension(300, 270));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(73, 177, 247), new java.awt.Color(73, 177, 247), new java.awt.Color(73, 177, 247), new java.awt.Color(73, 177, 247)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alerta_de_usuario.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 70, 70));

        id.setBackground(new java.awt.Color(0, 0, 0));
        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setText("jLabel1");
        id.setToolTipText("");
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, -1));

        dni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        dni.setText("jLabel2");
        add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("jLabel2");
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 270, -1));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("jLabel2");
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setBorder(null);
        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcion.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(descripcion);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 270, 90));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(73, 177, 247), new java.awt.Color(73, 177, 247), new java.awt.Color(73, 177, 247), new java.awt.Color(73, 177, 247)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane descripcion;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}