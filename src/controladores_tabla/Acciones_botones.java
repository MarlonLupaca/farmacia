
package controladores_tabla;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Acciones_botones extends JButton{
    
    private static boolean presionar;
    
    public Acciones_botones() {
        
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                presionar = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                presionar = false;
                repaint();
            }
            
        });
        
    }      
}
