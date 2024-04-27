package objetos;


public class cabecera {
    private int id;
    private String fecha_venta;
    private String cliente;
    private double totalVenta;
    private String metodo;
    private String vendedor;
    private String hora;
    private double MEfectivo;
    private double MYape;

    public double getMEfectivo() {
        return MEfectivo;
    }

    public void setMEfectivo(double MEfectivo) {
        this.MEfectivo = MEfectivo;
    }

    public double getMYape() {
        return MYape;
    }

    public void setMYape(double MYape) {
        this.MYape = MYape;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public cabecera(String fecha_venta, String cliente, double totalVenta, String metodo, String vendedor, String hora, double MEfectivo, double MYape) {
        this.fecha_venta = fecha_venta;
        this.cliente = cliente;
        this.totalVenta = totalVenta;
        this.metodo = metodo;
        this.vendedor = vendedor;
        this.hora = hora;
        this.MEfectivo = MEfectivo;
        this.MYape = MYape;
    }

    public cabecera(int id, String fecha_venta, String cliente, double totalVenta, String metodo, String vendedor, String hora, double MEfectivo, double MYape ) {
        this.id = id;
        this.fecha_venta = fecha_venta;
        this.cliente = cliente;
        this.totalVenta = totalVenta;
        this.metodo = metodo;
        this.vendedor = vendedor;
        this.hora = hora;
        this.MEfectivo = MEfectivo;
        this.MYape = MYape;
    }
    
    
    
    
    
    
    
}
