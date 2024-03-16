
package Implementaciones;


import db.conexion;
import interfaces.DAOProductos;
import java.util.List;
import objetos.producto;
import java.sql.PreparedStatement;

/**
 *
 * @author Marlon_Mendoza
 */
public class DAOUserImpl extends conexion implements DAOProductos{

    @Override
    public void registrar(producto p) throws Exception {

        System.out.println("entro");
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO productos (nombre_producto, laboratorio, descripcion_producto, principio_activo, codigo_digemid, lote, ubicacion, fecha_vencimiento, stock, minimo_para_aviso, unidad_x_blister, unidad_x_caja, precio_unidad, precio_blister, precio_caja) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        st.setString(1,p.getNombre_producto());
        st.setString(2,p.getLaboratorio());    
        st.setString(3,p.getDescripcion_produto());    
        st.setString(4,p.getPrincipo_activo());    
        st.setString(5,p.getCodigo_digemid());    
        st.setString(6,p.getLote());    
        st.setString(7,p.getUbicacion());    
        st.setString(8,p.getFecha_vencimiento());    
        st.setInt(9,p.getStock());    
        st.setInt(10,p.getMinimo_para_aviso());    
        st.setInt(11,p.getUnidad_x_blister());    
        st.setInt(12,p.getUnidad_x_caja());
        st.setDouble(13,p.getPrecio_x_unidad());    
        st.setDouble(14,p.getPrecio_x_blister());    
        st.setDouble(15,p.getPrecio_x_caja()); 
        st.executeUpdate();

    }

    @Override
    public void modificar(producto p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(producto p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<producto> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
