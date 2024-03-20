
package Implementaciones;

import java.sql.*;
import db.conexion;
import interfaces.*;
import objetos.*;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO alertas (dni_cliente, Nombre, descripcion_alerta, fecha_de_aviso) VALUES (?,?,?,?)");
        st.setString(1,p.getDni());
        st.setString(2,p.getNombre());    
        st.setString(3,p.getDescripcion());    
        st.setString(4,p.getFecha());          
        st.executeUpdate();
    }

    @Override
    public void modificar(alerta p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(alerta p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Map<String, alerta> listar() throws Exception {
        this.conex();
        Map<String, alerta> mapaAlertas = new LinkedHashMap<>();

        PreparedStatement st = this.conexion.prepareStatement("SELECT *,\n" +
            "       DATEDIFF(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), CURDATE()) AS dias_hasta_fecha,\n" +
            "       STR_TO_DATE(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), '%Y-%m-%d') AS fecha_completa\n" +
            "FROM alertas\n" +
            "ORDER BY dias_hasta_fecha ASC, fecha_completa ASC;");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            alerta p = new alerta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
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

        PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM alertas WHERE DAY(STR_TO_DATE(CONCAT(YEAR(CURDATE()), '-', fecha_de_aviso), '%Y-%m-%d')) = DAY(CURDATE());");
        ResultSet resultSet = st.executeQuery();
        while (resultSet.next()) {
            alerta p = new alerta(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
            String clave = resultSet.getString(1);
            mapaAlertas.put(clave, p);
        }
        
            st.close();
        return mapaAlertas;
    }

        
    }

    
