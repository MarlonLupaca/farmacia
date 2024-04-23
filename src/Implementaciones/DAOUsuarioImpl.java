
package Implementaciones;

import db.conexion;
import interfaces.DAOUusuario;
import java.util.List;
import objetos.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DAOUsuarioImpl extends conexion implements DAOUusuario{

    @Override
    public void registrar(usuario p) throws Exception {
        this.conex();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios (usuario, contraseña, rol) VALUES (?,?,?)");
        st.setString(1,p.getUsuario());
        st.setString(2,p.getContraseña());    
        st.setString(3,p.getRol());         
        st.executeUpdate();
        st.close();
    }

    @Override
    public void modificar(usuario p) throws Exception {
    try {
        this.conex();
        
        PreparedStatement st = this.conexion.prepareStatement("UPDATE usuarios SET usuario = ?, contraseña = ? WHERE id = ?");
        
        st.setString(1, p.getUsuario());
        st.setString(2, p.getContraseña());
        st.setString(3, p.getId());
                
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
                "DELETE FROM usuarios WHERE id = ?");
        pstmt.setString(1, p);
        pstmt.executeUpdate();
    }

    @Override
    public List<usuario> listar() throws Exception {
        List <usuario> lista = null;
        try {
            this.conex();
            PreparedStatement st = this.conexion.prepareStatement("select * from usuarios ORDER BY id DESC;");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {    
                usuario p = new usuario(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                lista.add(p);
            }
            rs.close();
            st.close();
        
            
        } catch (Exception e) {
        }
        return lista;
    }
    
}
