package Modelo;

public class InventarioSucursal {
    private int inventarioId;
    private int sucursalId;
    private int productoId;
    private int stock;

    public InventarioSucursal() {}

    public InventarioSucursal(int inventarioId, int sucursalId, int productoId, int stock) {
        this.inventarioId = inventarioId;
        this.sucursalId = sucursalId;
        this.productoId = productoId;
        this.stock = stock;
    }

    public int getInventarioId() { return inventarioId; }
    public void setInventarioId(int inventarioId) { this.inventarioId = inventarioId; }

    public int getSucursalId() { return sucursalId; }
    public void setSucursalId(int sucursalId) { this.sucursalId = sucursalId; }

    public int getProductoId() { return productoId; }
    public void setProductoId(int productoId) { this.productoId = productoId; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
