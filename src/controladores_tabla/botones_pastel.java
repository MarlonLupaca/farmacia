
package controladores_tabla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marlon_Mendoza
 */
public class botones_pastel extends javax.swing.JPanel {

    /**
     * Creates new form botones
     */
    public botones_pastel() {
        initComponents();
    }
    
    public void eventos(acciones_botones_inte evento, int row) {

        visualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               evento.vizualisar(row);
            }
        });
    
}

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizar = new controladores_tabla.Acciones_botones();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visualizar.setBorder(null);
        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons3.png"))); // NOI18N
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });
        add(visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controladores_tabla.Acciones_botones visualizar;
    // End of variables declaration//GEN-END:variables
}
