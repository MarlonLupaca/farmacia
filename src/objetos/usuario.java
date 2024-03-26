
package objetos;

public class usuario {
    private String id;
    private String contraseña;
    private String usuario;
    private String rol;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public usuario(String id, String contraseña, String usuario, String rol) {
        this.id = id;
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.rol = rol;
    }

    public usuario(String usuario, String contraseña, String rol) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    } 
}
