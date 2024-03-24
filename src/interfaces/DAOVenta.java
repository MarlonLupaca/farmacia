package interfaces;

import java.util.List;
import objetos.cabecera;
import objetos.detalle;



public interface DAOVenta {
    public void registrarEncabezado (cabecera p)throws Exception; 
    public void reduccionStock (int p)throws Exception; 
    public void registrarDetalle (List<detalle> p)throws Exception; 
    public int id ()throws Exception; 

}
