
package interfaces;

import java.util.List;
import objetos.*;

public interface DAOClientes {
    public void registrar (cliente p)throws Exception; 
    public void modificar (cliente p)throws Exception; 
    public void eliminar (cliente p)throws Exception; 
    public List<cliente> listar()throws Exception; 
}
