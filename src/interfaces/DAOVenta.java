package interfaces;

import java.util.List;
import objetos.cabecera;
import objetos.cliente;
import objetos.detalle;
import objetos.producto;



public interface DAOVenta {
    public void registrarEncabezado (cabecera p)throws Exception; 
    public void reduccionStock (int p)throws Exception; 
    public void aumentoStock (int p)throws Exception; 
    public void registrarDetalle (List<detalle> p)throws Exception; 
    public int id ()throws Exception;
    public List<cabecera> listar() throws Exception; 
    public cabecera visualizarCabecera(String idProducto) throws Exception;
    public List<detalle> visualizardetalle(String idProducto) throws Exception;
    public void eliminar (String p)throws Exception; 
    public List<cabecera> filtrar_fecha(String fecha_de_inicio,String fecha_de_fin) throws Exception;
    public List<cabecera> filtrar_fecha_vendedore(String fecha_de_inicio,String fecha_de_fin,String Vendedora) throws Exception;

}
