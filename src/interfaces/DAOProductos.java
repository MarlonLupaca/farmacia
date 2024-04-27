
package interfaces;

import java.sql.SQLException;
import java.util.List;
import objetos.*;

public interface DAOProductos {
    public void registrar (producto p)throws Exception; 
    public void modificar (producto p)throws Exception; 
    public void eliminar (String p)throws Exception; 
    public producto visualizar(String idProducto) throws Exception; 
    public List<producto> listar()throws Exception;
    public List<producto> buscar(String buscar) throws SQLException;
    public List<producto> listar_de_stock()throws Exception;
    public List<producto> listar_de_vencimiento()throws Exception;
}
