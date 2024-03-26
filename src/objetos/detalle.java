package objetos;

public class detalle {
    private int Numero_venta;
    private int id_producto;
    private String Producto;
    private int cantidad;
    private double unitario_precio;
    private double subtotal;
    private String unidad;

    public int getNumero_venta() {
        return Numero_venta;
    }

    public void setNumero_venta(int Numero_venta) {
        this.Numero_venta = Numero_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getUnitario_precio() {
        return unitario_precio;
    }

    public void setUnitario_precio(double unitario_precio) {
        this.unitario_precio = unitario_precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    

    public detalle(int Numero_venta, int id_producto, String Producto, int cantidad, double unitario_precio, double subtotal, String unidad) {
        this.Numero_venta = Numero_venta;
        this.id_producto = id_producto;
        this.Producto = Producto;
        this.cantidad = cantidad;
        this.unitario_precio = unitario_precio;
        this.subtotal = subtotal;
        this.unidad = unidad;
    }

    public detalle(int id_producto, String Producto, int cantidad, double unitario_precio, double subtotal, String unidad) {
        this.id_producto = id_producto;
        this.Producto = Producto;
        this.cantidad = cantidad;
        this.unitario_precio = unitario_precio;
        this.subtotal = subtotal;
        this.unidad = unidad;

    }
    

    public detalle() {
    }
    

    
}
