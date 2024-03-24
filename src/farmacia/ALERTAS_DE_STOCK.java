package farmacia;

import Implementaciones.*;
import interfaces.*;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import objetos.alerta;
import objetos.producto;

public class ALERTAS_DE_STOCK extends javax.swing.JPanel {
    private DAOProductos dao = new DAOProductoImpl();
    
    public ALERTAS_DE_STOCK() {
        initComponents();
        agregarCartasDesdeLista();
   
    }
    
    

    public void agregarCartasDesdeLista() {
        try {
            List <producto> listaAlertas = dao.listar_de_stock();
            removeAll();

            int x = 0;
            int y = 0;
            for (producto contenido : listaAlertas) {
                int codigo = contenido.getCodigo_unico();
                String nombre = contenido.getNombre_producto();
                String laboratorio = contenido.getLaboratorio();
                String pricipio = contenido.getPrincipo_activo();
                String ubicacion = contenido.getUbicacion();
                int stock = contenido.getStock();
                

                CARTAS_STOCK nuevaCarta = new CARTAS_STOCK(codigo, nombre, laboratorio, pricipio, ubicacion,stock);
                GridBagConstraints reglas = new GridBagConstraints();

                reglas.gridx = x;
                reglas.gridy = y;
                reglas.insets = new Insets(20, 0, 20, 0);
                reglas.weightx = 10.0;
                reglas.weighty = 10.0;

                azul.add(nuevaCarta, reglas);
                x++;
                if (x % 3 == 0) {
                    x = 0;
                    y++;
                }
            }

            azul.revalidate();
            azul.repaint();
        } catch (Exception ex) {
            Logger.getLogger(PANTALLA_CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tera = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        azul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 226, 235));
        setPreferredSize(new java.awt.Dimension(1050, 680));

        tera.setBackground(new java.awt.Color(177, 212, 224));
        tera.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255)));
        tera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1050, 720));

        azul.setBackground(new java.awt.Color(236, 255, 254));
        azul.setMaximumSize(new java.awt.Dimension(1048, 718));
        azul.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(azul);

        tera.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 44, 1050, 658));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALERTAS DE STOCK");
        tera.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1050, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tera, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tera, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tera;
    // End of variables declaration//GEN-END:variables
}
