
package Implementaciones;


import db.conexion;
import interfaces.*;
import java.util.List;
import objetos.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Marlon_Mendoza
 */
public class DAOClientesImpl extends conexion implements DAOClientes{

    @Override
    public void registrar(cliente p) throws Exception {

        System.out.println("entro");
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO  Pacientes (DNI, Nombre, Genero, FechaNacimiento, NumeroTelefono, Direccion, CorreoElectronico, DescripcionMedica) VALUES (?,?,?,?,?,?,?,?)");
        st.setString(1,p.getDNI());
        st.setString(2,p.getNombre());    
        st.setString(3,p.getGenero());    
        st.setString(4,p.getFechanacimiento());    
        st.setString(5,p.getNumerotelefono());    
        st.setString(6,p.getDireccion());    
        st.setString(7,p.getCorreoelectronico());    
        st.setString(8,p.getDescripcionmedica());       
        st.executeUpdate();
        
        st.close();
    }

    @Override
    public void modificar(cliente p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(cliente p) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<cliente> listar() throws Exception {
        List <cliente> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("select * from PACIENTES;");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {     
                cliente p = new cliente(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                lista.add(p);
            }
            rs.close();
            st.close();
        
            
        } catch (Exception e) {
        }
        return lista;
    }
    
}
