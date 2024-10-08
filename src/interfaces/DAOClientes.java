
package interfaces;

import java.util.List;
import objetos.*;

public interface DAOClientes {
    public void registrar (cliente p)throws Exception; 
    public void modificar (cliente p)throws Exception; 
    public void eliminar (String p)throws Exception; 
    public int validar(String usuario, String contraseña) throws Exception; 
    public List<cliente> listar()throws Exception; 
    public List<cliente> buscar(String buscar)throws Exception; 
}
