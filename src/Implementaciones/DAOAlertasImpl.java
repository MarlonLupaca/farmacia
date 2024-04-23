
package Implementaciones;

import java.sql.*;
import db.conexion;
import interfaces.*;
import objetos.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marlon_Mendoza
 */
public class DAOAlertasImpl extends conexion implements DAOAlertas{

    @Override
    public void registrar(alerta p) throws Exception {

        System.out.println("entro");
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO alertas (dni_cliente, Nombre, descripcion_alerta, fecha_de_aviso, numero) VALUES (?,?,?,?,?)");
        st.setString(1,p.getDni());
        st.setString(2,p.getNombre());    
        st.setString(3,p.getDescripcion());    
        st.setString(4,p.getFecha());
        st.setString(5,p.getNumero());
        st.executeUpdate();
    }

    @Override
    public void modificar(alerta p, int o) throws Exception {
        this.conex();
        PreparedStatement pstmt = this.conexion.prepareStatement(
                "UPDATE alertas SET dni_cliente = ?, Nombre = ?, descripcion_alerta = ?, fecha_de_aviso = ?, numero = ? WHERE id = ?;");
        
        pstmt.setString(1, p.getDni());
        pstmt.setString(2, p.getNombre());
        pstmt.setString(3, p.getDescripcion());
        pstmt.setString(4, p.getFecha());
        pstmt.setString(5, p.getNumero());
        pstmt.setInt(6, o);
        pstmt.executeUpdate();
    }

    @Override
    public void eliminar(String p) throws Exception {
        this.conex();
        PreparedStatement pstmt = this.conexion.prepareStatement(
                "DELETE FROM ALERTAS WHERE id = ?");
        pstmt.setString(1, p);
        pstmt.executeUpdate();
    }

    @Override
    public Map<String, alerta> listar() throws Exception {
        this.conex();
        Map<String, alerta> mapaAlertas = new LinkedHashMap<>();

        PreparedStatement st = this.conexion.prepareStatement("SELECT *, \n" +
            "    DATEDIFF(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), CURDATE()) AS dias_hasta_fecha,\n" +
            "    STR_TO_DATE(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), '%Y-%m-%d') AS fecha_completa\n" +
            "FROM alertas\n" +
            "ORDER BY dias_hasta_fecha ASC, fecha_completa ASC;");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            alerta p = new alerta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
            String clave = resultSet.getString(1);
            mapaAlertas.put(clave, p);
        }
        
        st.close();
        return mapaAlertas;
    }

    @Override
    public Map<String, alerta> listar2() throws Exception {
        this.conex();
        Map<String, alerta> mapaAlertas = new LinkedHashMap<>();

        PreparedStatement st = this.conexion.prepareStatement("SELECT *, \n" +
"    DATEDIFF(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), CURDATE()) AS dias_hasta_fecha,\n" +
"    STR_TO_DATE(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), '%Y-%m-%d') AS fecha_completa\n" +
"FROM alertas\n" +
"WHERE DAY(STR_TO_DATE(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), '%Y-%m-%d')) = DAY(CURDATE());");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            alerta p = new alerta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
            String clave = resultSet.getString(1);
            mapaAlertas.put(clave, p);
        }
        
            st.close();
        return mapaAlertas;
    }

    @Override
    public Map<String, alerta> listar3() throws Exception {
        this.conex();
        Map<String, alerta> mapaAlertas = new LinkedHashMap<>();

        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM ALERTAS ORDER BY id DESC");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            alerta p = new alerta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
            String clave = resultSet.getString(1);
            mapaAlertas.put(clave, p);
        }
        
        st.close();
        return mapaAlertas;
    }

    @Override
    public Map<String, alerta> buscar(String buscar) throws Exception {
        Map<String, alerta> mapaAlertas = new LinkedHashMap<>();
        try {
            conex();
            String query = "SELECT * FROM ALERTAS WHERE dni_cliente LIKE ? OR Nombre LIKE ?";
            try (PreparedStatement st = conexion.prepareStatement(query)) {
                
                st.setString(1, "%" + buscar + "%");
                st.setString(2, "%" + buscar + "%");
                try (ResultSet rs = st.executeQuery()) {
                    // Procesar el resultado
                    while (rs.next()) {
                        String clave = rs.getString(1);
                        alerta p = new alerta(
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                        );
                        mapaAlertas.put(clave, p);
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
        return mapaAlertas;
    }

        
    }

    
