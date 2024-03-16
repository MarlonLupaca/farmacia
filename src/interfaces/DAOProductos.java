
package interfaces;

import java.util.List;
import objetos.*;

public interface DAOProductos {
    public void registrar (producto p)throws Exception; 
    public void modificar (producto p)throws Exception; 
    public void eliminar (producto p)throws Exception; 
    public List<producto> listar()throws Exception; 
}
