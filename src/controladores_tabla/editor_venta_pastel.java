
package controladores_tabla;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class editor_venta_pastel extends DefaultCellEditor{
    
    private acciones_botones_inte evento;
    public editor_venta_pastel(acciones_botones_inte evento) {
        super( new JCheckBox());
        this.evento = evento;
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        botones_pastel accion = new botones_pastel(); 
        accion.eventos( evento, row);
        accion.setBackground(table.getSelectionBackground());
        return accion;
    }
    
}
