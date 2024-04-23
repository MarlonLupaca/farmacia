
package Implementaciones;


import db.conexion;
import interfaces.DAOProductos;
import java.util.List;
import objetos.producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objetos.cliente;

/**
 *
 * @author Marlon_Mendoza
 */
public class DAOProductoImpl extends conexion implements DAOProductos{

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
    try {
        this.conex(); // Establecer la conexión
        
        PreparedStatement st = this.conexion.prepareStatement("UPDATE productos SET nombre_producto = ?, laboratorio = ?, descripcion_producto = ?, principio_activo = ?, codigo_digemid = ?, lote = ?, ubicacion = ?, fecha_vencimiento = ?, stock = ?, minimo_para_aviso = ?, unidad_x_blister = ?, unidad_x_caja = ?, precio_unidad = ?, precio_blister = ?, precio_caja = ? WHERE codigo_unico = ?");
        
        st.setString(1, p.getNombre_producto());
        st.setString(2, p.getLaboratorio());
        st.setString(3, p.getDescripcion_produto());
        st.setString(4, p.getPrincipo_activo());
        st.setString(5, p.getCodigo_digemid());
        st.setString(6, p.getLote());
        st.setString(7, p.getUbicacion());
        st.setString(8, p.getFecha_vencimiento());
        st.setInt(9, p.getStock());
        st.setInt(10, p.getMinimo_para_aviso());
        st.setInt(11, p.getUnidad_x_blister());
        st.setInt(12, p.getUnidad_x_caja());
        st.setDouble(13, p.getPrecio_x_unidad());
        st.setDouble(14, p.getPrecio_x_blister());
        st.setDouble(15, p.getPrecio_x_caja());
        st.setInt(16, p.getCodigo_unico());
                
        st.executeUpdate();
        
        st.close();
    } catch (Exception e) {
        throw new Exception("Error al modificar el producto: " + e.getMessage());
    }
}


    @Override
    public void eliminar(String p) throws Exception {
        this.conex();
        PreparedStatement pstmt = this.conexion.prepareStatement(
                "DELETE FROM PRODUCTOS WHERE codigo_unico = ?");
        pstmt.setString(1, p);
        pstmt.executeUpdate();
    }

    @Override
    public List<producto> listar() throws Exception {
        List <producto> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("select * from productos ORDER BY codigo_unico DESC;");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {     
                producto p = new producto(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getDouble(14), rs.getDouble(15), rs.getDouble(16));
                
                
                lista.add(p);
            }
            rs.close();
            st.close();
        
            
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public producto visualizar(String idProducto) throws Exception {
        producto productoEncontrado = null;
        this.conex();

        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM productos WHERE codigo_unico = ?");
        st.setString(1, idProducto);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
           productoEncontrado = new producto(
               rs.getInt(1),
               rs.getString(2),
               rs.getString(3),
               rs.getString(4),
               rs.getString(5),
               rs.getString(6),
               rs.getString(7),
               rs.getString(8),
               rs.getString(9),
               rs.getInt(10),
               rs.getInt(11),
               rs.getInt(12),
               rs.getInt(13),
               rs.getDouble(14),
               rs.getDouble(15),
               rs.getDouble(16)
           );   
        }

        return productoEncontrado;
    }

    @Override
    public List<producto> buscar(String buscar) throws SQLException {
        List<producto> lista = new ArrayList<>();
        try {
            conex();
            String query = "SELECT * FROM PRODUCTOS WHERE nombre_producto LIKE ? OR laboratorio LIKE ? OR descripcion_producto LIKE ? OR principio_activo LIKE ? OR codigo_digemid LIKE ? ";
            try (PreparedStatement st = conexion.prepareStatement(query)) {
                // Configuramos los parámetros de la consulta parametrizada
                st.setString(1, "%" + buscar + "%");
                st.setString(2, "%" + buscar + "%");
                st.setString(3, "%" + buscar + "%");
                st.setString(4, "%" + buscar + "%");
                st.setString(5, "%" + buscar + "%");
                try (ResultSet rs = st.executeQuery()) {
                    // Procesar el resultado
                    while (rs.next()) {
                        producto pro = new producto(
                                rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5),
                                rs.getString(6),
                                rs.getString(7),
                                rs.getString(8),
                                rs.getString(9),
                                rs.getInt(10),
                                rs.getInt(11),
                                rs.getInt(12),
                                rs.getInt(13),
                                rs.getDouble(14),
                                rs.getDouble(15),
                                rs.getDouble(16)
                        );
                        lista.add(pro);
                    }
                }
            }
        } catch (SQLException e) {
            // Manejar la excepción adecuadamente, por ejemplo, registrándola o lanzándola nuevamente
            throw e;
        } finally {
            // Asegurarse de cerrar la conexión
            if (conexion != null) {
                conexion.close();
            }
        }
        return lista;
    }

    @Override
    public List<producto> listar_de_stock() throws Exception {
        List <producto> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM productos WHERE stock <= minimo_para_aviso");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) { 
                producto pro = new producto(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9),
                rs.getInt(10),
                rs.getInt(11),
                rs.getInt(12),
                rs.getInt(13),
                rs.getDouble(14),
                rs.getDouble(15),
                rs.getDouble(16)
            );
            lista.add(pro);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        return lista;
    }

    
}
