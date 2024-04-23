
package objetos;


public class alerta {
    private String dni;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public alerta(String dni, String nombre, String descripcion, String fecha,String numero) {
        this.dni = dni;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.numero = numero;
    }
    
    
    

    
    
    
    
}
