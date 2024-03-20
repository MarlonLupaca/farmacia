
package interfaces;

import java.util.List;
import java.util.Map;
import objetos.*;

public interface DAOAlertas {
    public void registrar (alerta p)throws Exception; 
    public void modificar (alerta p)throws Exception; 
    public void eliminar (alerta p)throws Exception; 
    public Map<String, alerta> listar()throws Exception;
    public Map<String, alerta> listar2()throws Exception; 
}
