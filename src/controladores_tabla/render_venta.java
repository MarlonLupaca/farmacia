
package controladores_tabla;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class render_venta extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
        Component componente = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column); 
        botones_ventas accion = new botones_ventas();
        if(isSeleted == false && row % 2 == 0)
        {
            accion.setBackground(Color.white);
        } else 
        {
            accion.setBackground(componente.getBackground());
        }
        
        
        
        return accion;
        
    }
    
}