
package farmacia;

import Implementaciones.DAOClientesImpl;
import interfaces.DAOClientes;
import objetos.cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marlon_Mendoza
 */
public class registrocliente extends javax.swing.JPanel {

    /**
     * Creates new form registrocliente
     */
    public registrocliente() {
        initComponents();
    }
    public static boolean validarNumeros(String datos) {
        return datos.matches("[0-9]+");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correo_electronico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        año_v = new javax.swing.JComboBox<>();
        mes_v = new javax.swing.JComboBox<>();
        dia_V = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion_medica = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        mas = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(236, 255, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(177, 212, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 46, 56));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AGREGAR CLIENTES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 980, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 46, 56));
        jLabel3.setText("Genero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 46, 56));
        jLabel4.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, 30));

        direccion.setBackground(new java.awt.Color(255, 255, 255));
        direccion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 250, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 46, 56));
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 46, 56));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 140, 30));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 250, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 46, 56));
        jLabel6.setText("Número de teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 150, 30));

        numero.setBackground(new java.awt.Color(255, 255, 255));
        numero.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        numero.setForeground(new java.awt.Color(0, 0, 0));
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 250, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 46, 56));
        jLabel8.setText("Correo electrónico:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 120, 30));

        correo_electronico.setBackground(new java.awt.Color(255, 255, 255));
        correo_electronico.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        correo_electronico.setForeground(new java.awt.Color(0, 0, 0));
        correo_electronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_electronicoActionPerformed(evt);
            }
        });
        jPanel1.add(correo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 250, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 46, 56));
        jLabel9.setText("Descripcion medica:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 120, 30));

        dni.setBackground(new java.awt.Color(255, 255, 255));
        dni.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 250, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(25, 46, 56));
        jLabel10.setText("DNI:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 140, 30));

        año_v.setBackground(new java.awt.Color(255, 255, 255));
        año_v.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        año_v.setForeground(new java.awt.Color(0, 0, 0));
        año_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050" }));
        jPanel1.add(año_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 80, 35));

        mes_v.setBackground(new java.awt.Color(255, 255, 255));
        mes_v.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mes_v.setForeground(new java.awt.Color(0, 0, 0));
        mes_v.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" }));
        jPanel1.add(mes_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 35));

        dia_V.setBackground(new java.awt.Color(255, 255, 255));
        dia_V.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        dia_V.setForeground(new java.awt.Color(0, 0, 0));
        dia_V.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dia_V, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 60, 35));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descripcion_medica.setLineWrap(true);
        descripcion_medica.setBackground(new java.awt.Color(255, 255, 255));
        descripcion_medica.setColumns(20);
        descripcion_medica.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        descripcion_medica.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_medica.setRows(5);
        jScrollPane1.setViewportView(descripcion_medica);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 250, 130));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 40, 600));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 40, 600));

        buttonGroup1.add(mas);
        mas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        mas.setForeground(new java.awt.Color(0, 0, 0));
        mas.setText("Masculino");
        jPanel1.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, 40));

        buttonGroup1.add(fem);
        fem.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        fem.setForeground(new java.awt.Color(0, 0, 0));
        fem.setText("Femenino");
        jPanel1.add(fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_editar_1.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 90, 105));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void correo_electronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_electronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_electronicoActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int A = JOptionPane.showConfirmDialog(null, "¿REGISTRAR CLIENTE?", "AVISO", JOptionPane.CANCEL_OPTION);

        if (A == 0) {
            try {
                if (!validarNumeros(numero.getText())) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo 'Número'.");
                    return;
                }

                if (!validarNumeros(dni.getText())) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un DNI válido.");
                    return;
                }

                String nombreMes = (String) mes_v.getSelectedItem();
                int numeroMes;
                switch (nombreMes) {
                    case "enero":
                        numeroMes = 1;
                        break;
                    case "febrero":
                        numeroMes = 2;
                        break;
                    case "marzo":
                        numeroMes = 3;
                        break;
                    case "abril":
                        numeroMes = 4;
                        break;
                    case "mayo":
                        numeroMes = 5;
                        break;
                    case "junio":
                        numeroMes = 6;
                        break;
                    case "julio":
                        numeroMes = 7;
                        break;
                    case "agosto":
                        numeroMes = 8;
                        break;
                    case "septiembre":
                        numeroMes = 9;
                        break;
                    case "octubre":
                        numeroMes = 10;
                        break;
                    case "noviembre":
                        numeroMes = 11;
                        break;
                    case "diciembre":
                        numeroMes = 12;
                        break;
                    default:
                        numeroMes = 0;
                        break;
                }
                String genero = "";
                if(mas.isSelected())
                    genero = mas.getText().toString();
                if(fem.isSelected())
                    genero = fem.getText().toString();

                String fecha = año_v.getSelectedItem() + "-" + numeroMes + "-" + dia_V.getSelectedItem();

                cliente p = new cliente(dni.getText(), nombre.getText(), genero, fecha, numero.getText(), direccion.getText(), correo_electronico.getText(), descripcion_medica.getText());
                DAOClientes dao = new DAOClientesImpl();
                dao.registrar(p);
                dni.setText("");
                nombre.setText("");
                numero.setText("");
                direccion.setText("");
                correo_electronico.setText("");
                descripcion_medica.setText("");
                buttonGroup1.clearSelection();
                JOptionPane.showMessageDialog(null, "Registrado correctamente");
            } catch (Exception ex) {
                Logger.getLogger(REGISTRO_PRODUCTO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jLabel18MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año_v;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField correo_electronico;
    private javax.swing.JTextArea descripcion_medica;
    private javax.swing.JComboBox<String> dia_V;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JRadioButton fem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton mas;
    private javax.swing.JComboBox<String> mes_v;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    // End of variables declaration//GEN-END:variables
}
