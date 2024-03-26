
package interfaces;

import java.sql.SQLException;
import java.util.List;
import objetos.usuario;

public interface DAOUusuario {
    public void registrar (usuario p)throws Exception; 
    public void modificar (usuario p)throws Exception; 
    public void eliminar (String p)throws Exception; 
    public List<usuario> listar()throws Exception;
}
