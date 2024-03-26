
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
        
        this.conex();
        PreparedStatement pstmt = this.conexion.prepareStatement(
                "UPDATE Pacientes SET DNI = ?, Nombre = ?, Genero = ?, FechaNacimiento = ?, NumeroTelefono = ?, Direccion = ?, CorreoElectronico = ?, DescripcionMedica = ? WHERE DNI = ?");
        
        pstmt.setString(1, p.getDNI());
        pstmt.setString(2, p.getNombre());
        pstmt.setString(3, p.getGenero());
        pstmt.setString(4, p.getFechanacimiento());
        pstmt.setString(5, p.getNumerotelefono());
        pstmt.setString(6, p.getDireccion());
        pstmt.setString(7, p.getCorreoelectronico());
        pstmt.setString(8, p.getDescripcionmedica());
        pstmt.setString(9, p.getDNI());
        pstmt.executeUpdate();

    }

    @Override
    public void eliminar(String p) throws Exception {
        this.conex();
        PreparedStatement pstmt = this.conexion.prepareStatement(
                "DELETE FROM Pacientes WHERE DNI = ?");
        pstmt.setString(1, p);
        pstmt.executeUpdate();
          
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

    @Override
    public List<cliente> buscar(String buscar) throws SQLException {
        List<cliente> lista = new ArrayList<>();
        try {
            conex();
            String query = "SELECT * FROM PACIENTES WHERE DNI LIKE ? OR Nombre LIKE ?";
            try (PreparedStatement st = conexion.prepareStatement(query)) {
                // Configuramos los parámetros de la consulta parametrizada
                st.setString(1, "%" + buscar + "%");
                st.setString(2, "%" + buscar + "%");
                try (ResultSet rs = st.executeQuery()) {
                    // Procesar el resultado
                    while (rs.next()) {
                        cliente cliente = new cliente(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8)
                        );
                        lista.add(cliente);
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
    public int validar(String usuario, String contraseña) throws Exception {
    int resultado = 0; 

    this.conex(); 
    PreparedStatement pstmt = this.conexion.prepareStatement(
            "SELECT CASE\n" +
            "    WHEN EXISTS (SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ? AND rol = 'administrador') THEN 1\n" +
            "    WHEN EXISTS (SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ? AND rol = 'trabajador') THEN 2\n" +
            "    ELSE 0\n" +
            "END AS resultado;");

    pstmt.setString(1, usuario); 
    pstmt.setString(2, contraseña); 
    pstmt.setString(3, usuario); 
    pstmt.setString(4, contraseña); 

    ResultSet rs = pstmt.executeQuery(); 

    if (rs.next()) { 
        resultado = rs.getInt("resultado"); 
    }

    rs.close(); 
    pstmt.close(); 
    return resultado; 
    }


    
}
