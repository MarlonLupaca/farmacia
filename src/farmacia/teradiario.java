package farmacia;

import Implementaciones.DAOAlertasImpl;
import interfaces.DAOAlertas;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import objetos.alerta;

public class teradiario extends javax.swing.JPanel {
    private DAOAlertas dao = new DAOAlertasImpl();
    
    public teradiario() {
        initComponents();
        agregarCartasDesdeMapa();
   
    }
    
    

public void agregarCartasDesdeMapa() {
        try {
            Map<String, alerta> mapa = dao.listar2();
            removeAll();

            int x = 0;
            int y = 0;
            for (Map.Entry<String, alerta> entry : mapa.entrySet()) {
                String id = entry.getKey();
                alerta contenido = entry.getValue();
                String dni = contenido.getDni();
                String nombre = contenido.getNombre();
                String descripcion = contenido.getDescripcion();
                String fecha = contenido.getFecha();

                Carta nuevaCarta = new Carta(id, dni,nombre,descripcion,fecha);
                GridBagConstraints reglas = new GridBagConstraints();
                
                reglas.gridx = x;
                reglas.gridy = y;
                reglas.insets = new Insets(20, 0, 20, 0);
                reglas.weightx = 10.0;
                reglas.weighty = 10.0;
                
                azul.add(nuevaCarta,reglas);
                x ++;
                if(x%3 == 0)
                {
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

        tera.setBackground(new java.awt.Color(73, 148, 174));

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1050, 720));

        azul.setBackground(new java.awt.Color(204, 226, 235));
        azul.setMaximumSize(new java.awt.Dimension(1048, 718));
        azul.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(azul);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALERTAS  DIARIAS");

        javax.swing.GroupLayout teraLayout = new javax.swing.GroupLayout(tera);
        tera.setLayout(teraLayout);
        teraLayout.setHorizontalGroup(
            teraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(teraLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        teraLayout.setVerticalGroup(
            teraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teraLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tera;
    // End of variables declaration//GEN-END:variables
}
