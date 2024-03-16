
package objetos;


public class producto {
    private int codigo_unico;
    private String nombre_producto;
    private String laboratorio;
    private String descripcion_produto;
    private String principo_activo;
    private String codigo_digemid;
    private String lote;
    private String ubicacion;
    private String fecha_vencimiento;
    private int stock;
    private int minimo_para_aviso;
    private int unidad_x_blister;
    private int unidad_x_caja;
    private double precio_x_unidad;
    private double precio_x_blister;
    private double precio_x_caja;


    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getDescripcion_produto() {
        return descripcion_produto;
    }

    public void setDescripcion_produto(String descripcion_produto) {
        this.descripcion_produto = descripcion_produto;
    }

    public String getPrincipo_activo() {
        return principo_activo;
    }

    public void setPrincipo_activo(String principo_activo) {
        this.principo_activo = principo_activo;
    }

    public String getCodigo_digemid() {
        return codigo_digemid;
    }

    public void setCodigo_digemid(String codigo_digemid) {
        this.codigo_digemid = codigo_digemid;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMinimo_para_aviso() {
        return minimo_para_aviso;
    }

    public void setMinimo_para_aviso(int minimo_para_aviso) {
        this.minimo_para_aviso = minimo_para_aviso;
    }

    public int getUnidad_x_blister() {
        return unidad_x_blister;
    }

    public void setUnidad_x_blister(int unidad_x_blister) {
        this.unidad_x_blister = unidad_x_blister;
    }

    public int getUnidad_x_caja() {
        return unidad_x_caja;
    }

    public void setUnidad_x_caja(int unidad_x_caja) {
        this.unidad_x_caja = unidad_x_caja;
    }

    public double getPrecio_x_unidad() {
        return precio_x_unidad;
    }

    public void setPrecio_x_unidad(double precio_x_unidad) {
        this.precio_x_unidad = precio_x_unidad;
    }

    public double getPrecio_x_blister() {
        return precio_x_blister;
    }

    public void setPrecio_x_blister(double precio_x_blister) {
        this.precio_x_blister = precio_x_blister;
    }

    public double getPrecio_x_caja() {
        return precio_x_caja;
    }

    public void setPrecio_x_caja(double precio_x_caja) {
        this.precio_x_caja = precio_x_caja;
    }

    public producto(String nombre_producto, String laboratorio, String descripcion_produto, String principo_activo, String codigo_digemid, String lote, String ubicacion, String fecha_vencimiento, int stock, int minimo_para_aviso, int unidad_x_blister, int unidad_x_caja, double precio_x_unidad, double precio_x_blister, double precio_x_caja) {
        this.nombre_producto = nombre_producto;
        this.laboratorio = laboratorio;
        this.descripcion_produto = descripcion_produto;
        this.principo_activo = principo_activo;
        this.codigo_digemid = codigo_digemid;
        this.lote = lote;
        this.ubicacion = ubicacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.stock = stock;
        this.minimo_para_aviso = minimo_para_aviso;
        this.unidad_x_blister = unidad_x_blister;
        this.unidad_x_caja = unidad_x_caja;
        this.precio_x_unidad = precio_x_unidad;
        this.precio_x_blister = precio_x_blister;
        this.precio_x_caja = precio_x_caja;
    }

    public producto() {
    }
    
    
    
    
    
    
}
