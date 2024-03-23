package interfaces;

import objetos.cabecera;
import objetos.detalle;



public interface DAOVenta {
    public void registrar (cabecera p)throws Exception; 
    public void registrar (detalle p)throws Exception; 

}
