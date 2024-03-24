package Implementaciones;

import db.conexion;
import interfaces.DAOVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import objetos.cabecera;
import objetos.detalle;

public class DAOVentaImpl extends conexion implements DAOVenta{

    @Override
    public void registrarEncabezado (cabecera p) throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO encabezado (FechaVenta, Cliente, TotalVenta, MetodoPago, Vendedor) VALUES(?,?,?,?,?)");
        st.setString(1,p.getFecha_venta());
        st.setString(2,p.getCliente());    
        st.setDouble(3,p.getTotalVenta());    
        st.setString(4,p.getMetodo());    
        st.setString(5,p.getVendedor());
        st.executeUpdate();
    }

    @Override
    public void registrarDetalle(List<detalle> p) throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO detalle (NumeroVenta, id_producto, Producto, CantidadVendida, PrecioUnitario,Subtotal) VALUES(?,?,?,?,?,?)");
        
        for (detalle det : p) {
            st.setInt(1, det.getNumero_venta());
            st.setInt(2, det.getId_producto());    
            st.setString(3, det.getProducto());    
            st.setInt(4, det.getCantidad());    
            st.setDouble(5, det.getUnitario_precio());
            st.setDouble(6, det.getSubtotal());
            st.executeUpdate();
        }
    }

    @Override
    public int id() throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("SELECT NumeroVenta\n" +
                                                                "FROM encabezado\n" +
                                                                "ORDER BY NumeroVenta DESC\n" +
                                                                "LIMIT 1;");
        ResultSet rs = st.executeQuery();
        int id = 0;
        if (rs.next()) {
             id = rs.getInt(1); 
        }
        return id;
    }

    @Override
    public void reduccionStock(int p) throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("UPDATE productos AS p\n" +
                                                            "JOIN detalle AS dv ON p.codigo_unico = dv.id_producto\n" +
                                                            "SET p.stock = p.stock - dv.CantidadVendida\n" +
                                                            "WHERE dv.numeroVenta = ?;");
        st.setInt(1,p);
        st.executeUpdate();
    }
    
}
