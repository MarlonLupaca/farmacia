
package controladores_tabla;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class editor_venta extends DefaultCellEditor{
    
    private acciones_botones_inte_venta evento;
    public editor_venta(acciones_botones_inte_venta evento) {
        super( new JCheckBox());
        this.evento = evento;
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        botones_ventas accion = new botones_ventas(); 
        accion.eventos( evento, row);
        accion.setBackground(table.getSelectionBackground());
        return accion;
    }
    
}
