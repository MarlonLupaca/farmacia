
package objetos;


public class alerta {
    private String dni;
    private String descripcion;
    private String fechadeinicio;
    private String fechadefin;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(String fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public String getFechadefin() {
        return fechadefin;
    }

    public void setFechadefin(String fechadefin) {
        this.fechadefin = fechadefin;
    }

    public alerta(String dni, String descripcion, String fechadeinicio, String fechadefin) {
        this.dni = dni;
        this.descripcion = descripcion;
        this.fechadeinicio = fechadeinicio;
        this.fechadefin = fechadefin;
    }
    
    
    
}
