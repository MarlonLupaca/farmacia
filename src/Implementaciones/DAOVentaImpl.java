package Implementaciones;

import db.conexion;
import interfaces.DAOVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import objetos.cabecera;
import objetos.detalle;
import objetos.producto;

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
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO detalle (NumeroVenta, id_producto, Producto, CantidadVendida, PrecioUnitario,Subtotal,unidad) VALUES(?,?,?,?,?,?,?)");
        
        for (detalle det : p) {
            st.setInt(1, det.getNumero_venta());
            st.setInt(2, det.getId_producto());    
            st.setString(3, det.getProducto());    
            st.setInt(4, det.getCantidad());    
            st.setDouble(5, det.getUnitario_precio());
            st.setDouble(6, det.getSubtotal());
            st.setString(7, det.getUnidad());
            st.executeUpdate();
        }
    }

    @Override
    public int id() throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement(
            "SET @@SESSION.information_schema_stats_expiry = 0;"
        );
        // Ejecutar la consulta para configurar information_schema_stats_expiry
        st.execute();

        // Consulta para obtener el valor AUTO_INCREMENT de la tabla "encabezado"
        st = this.conexion.prepareStatement(
            "SELECT Auto_increment " +
            "FROM information_schema.TABLES " +
            "WHERE TABLE_SCHEMA = 'farmacia' " +
            "AND TABLE_NAME = 'encabezado'"
        );
        ResultSet rs = st.executeQuery();

        int id = 0;
        if (rs.next()) {
            id = rs.getInt("Auto_increment");
        }
        System.out.println(id);
        return id;
    }


    @Override
    public void reduccionStock(int p) throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("UPDATE productos AS p\n" +
                                                            "JOIN (\n" +
                                                            "    SELECT id_producto, SUM(CantidadVendida) AS TotalCantidadVendida\n" +
                                                            "    FROM detalle\n" +
                                                            "    WHERE numeroVenta = ?\n" +
                                                            "    GROUP BY id_producto\n" +
                                                            ") AS dv ON p.codigo_unico = dv.id_producto\n" +
                                                            "SET p.stock = p.stock - dv.TotalCantidadVendida;");
        st.setInt(1,p);
        st.executeUpdate();
    }

    @Override
    public List<cabecera> listar() throws Exception {
        List <cabecera> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("select * from encabezado");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) { 
                cabecera pro = new cabecera(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6)
            );   
            lista.add(pro);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public cabecera visualizarCabecera(String idProducto) throws Exception {
        cabecera pro = null;
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM encabezado WHERE numeroVenta = ? ");
        st.setString(1,idProducto);
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            pro = new cabecera(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getString(5),
                rs.getString(6)
            );
        }
        return pro;
    }

    @Override
    public List<detalle> visualizardetalle(String idProducto) throws Exception {
        List <detalle> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM detalle WHERE numeroVenta = ?");
            lista = new ArrayList();
            st.setString(1, idProducto);
            ResultSet rs = st.executeQuery();

            while (rs.next()) { 
                detalle detalle = new detalle(
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getInt(5),
                    rs.getDouble(6),
                    rs.getDouble(7),
                    rs.getString(8)
                    ); 
                lista.add(detalle);
            }

            rs.close();
            st.close();
            this.conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public void eliminar(String numeroVenta) throws Exception {
        try {
            this.conex();

            // Eliminar detalle
            PreparedStatement pstmtDetalle = this.conexion.prepareStatement(
                    "DELETE FROM detalle WHERE NumeroVenta = ?");
            pstmtDetalle.setString(1, numeroVenta);
            pstmtDetalle.executeUpdate();

            // Eliminar encabezado
            PreparedStatement pstmtEncabezado = this.conexion.prepareStatement(
                    "DELETE FROM encabezado WHERE NumeroVenta = ?");
            pstmtEncabezado.setString(1, numeroVenta);
            pstmtEncabezado.executeUpdate();

            // Cerrar la conexión y liberar recursos
            pstmtDetalle.close();
            pstmtEncabezado.close();
            this.conexion.close();
        } catch (Exception e) {
            // Manejar cualquier excepción
            e.printStackTrace();
            throw e; // Lanzar la excepción para que sea manejada por el código que llama a este método
        }
    }


    @Override
    public List<cabecera> filtrar_fecha(String fecha_de_inicio, String fecha_de_fin) throws Exception {
        List<cabecera> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("SELECT *\n" +
                                                                "FROM encabezado\n" +
                                                                "WHERE FechaVenta BETWEEN ? AND ?;");
            st.setString(1, fecha_de_inicio);
            st.setString(2, fecha_de_fin);

            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cabecera pro = new cabecera(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4),
                    rs.getString(5),
                    rs.getString(6)
                        
                        
                );
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getDouble(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(5));
                lista.add(pro);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            // Manejar excepción aquí
        }
        return lista;
    }

    @Override
    public List<cabecera> filtrar_fecha_vendedore(String fecha_de_inicio, String fecha_de_fin, String vendedor) throws Exception {
        List<cabecera> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM encabezado WHERE FechaVenta BETWEEN ? AND ? AND Vendedor = ?");
            st.setString(1, fecha_de_inicio);
            st.setString(2, fecha_de_fin);
            st.setString(3, vendedor);

            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cabecera pro = new cabecera(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4),
                    rs.getString(5),
                    rs.getString(6)
                );
                lista.add(pro);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            // Manejar excepción aquí
        }
        return lista;
    }

    @Override
    public void aumentoStock(int p) throws Exception {
        try {
            this.conex();

            PreparedStatement st = this.conexion.prepareStatement(
                "UPDATE productos AS p " +
                "JOIN ( " +
                "    SELECT id_producto, SUM(CantidadVendida) AS TotalCantidadVendida " +
                "    FROM detalle " +
                "    WHERE numeroVenta = ? " +
                "    GROUP BY id_producto " +
                ") AS dv ON p.codigo_unico = dv.id_producto " +
                "SET p.stock = p.stock + dv.TotalCantidadVendida"
            );
            st.setInt(1, p);
            st.executeUpdate();

            // Cerrar la conexión y liberar recursos
            st.close();
            this.conexion.close();
        } catch (Exception e) {
            // Manejar cualquier excepción
            e.printStackTrace();
            throw e; // Lanzar la excepción para que sea manejada por el código que llama a este método
        }
    }

    
    
    
}
