package objetos;

public class cliente {
    private String DNI;
    private String nombre;
    private String genero;
    private String fechanacimiento;
    private String numerotelefono;
    private String direccion;
    private String correoelectronico;
    private String descripcionmedica;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getDescripcionmedica() {
        return descripcionmedica;
    }

    public void setDescripcionmedica(String descripcionmedica) {
        this.descripcionmedica = descripcionmedica;
    }

    public cliente(String DNI, String nombre, String genero, String fechanacimiento, String numerotelefono, String direccion, String correoelectronico, String descripcionmedica) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.genero = genero;
        this.fechanacimiento = fechanacimiento;
        this.numerotelefono = numerotelefono;
        this.direccion = direccion;
        this.correoelectronico = correoelectronico;
        this.descripcionmedica = descripcionmedica;
    }

    public cliente() {
    }
    
    
    
    
    
}
