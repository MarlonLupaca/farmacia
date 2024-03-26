
package controladores_tabla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marlon_Mendoza
 */
public class botones_view extends javax.swing.JPanel {

    /**
     * Creates new form botones
     */
    public botones_view() {
        initComponents();
    }
    
    public void eventos(acciones_botones_inte evento, int row) {
    
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               evento.borrar(row);
            }
        });
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

        eliminar = new controladores_tabla.Acciones_botones();
        visualizar = new controladores_tabla.Acciones_botones();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminar.setBorder(null);
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons2.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        visualizar.setBorder(null);
        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons3.png"))); // NOI18N
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });
        add(visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 5, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controladores_tabla.Acciones_botones eliminar;
    private controladores_tabla.Acciones_botones visualizar;
    // End of variables declaration//GEN-END:variables
}
