
package controladores_tabla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marlon_Mendoza
 */
public class botones_ventas extends javax.swing.JPanel {

    /**
     * Creates new form botones
     */
    public botones_ventas() {
        initComponents();
    }
    
    public void eventos(acciones_botones_inte_venta evento, int row) {
    
        visualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               evento.vizualisar(row);
            }
        });
        añadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               evento.anadir(row);
            }
        });
    
}

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizar = new controladores_tabla.Acciones_botones();
        añadir = new controladores_tabla.Acciones_botones();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visualizar.setBorder(null);
        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons3.png"))); // NOI18N
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });
        add(visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 5, 30, -1));
        visualizar.getAccessibleContext().setAccessibleDescription("");

        añadir.setBorder(null);
        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 30, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private controladores_tabla.Acciones_botones añadir;
    private controladores_tabla.Acciones_botones visualizar;
    // End of variables declaration//GEN-END:variables
}
