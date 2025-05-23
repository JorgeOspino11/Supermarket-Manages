package Modelo;

public class Producto {
    public int productoId;
    public String nombre;
    public String descripcion;
    public double precio;
    public int stock;
    public int categoriaId;
    public int proveedorId;
    public String fechaCreacion;

    public Producto() {}

    public Producto(int productoId, String nombre, String descripcion, double precio, int stock, int categoriaId, int proveedorId, String fechaCreacion) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoriaId = categoriaId;
        this.proveedorId = proveedorId;
        this.fechaCreacion = fechaCreacion;
    }
}