package Modelo;

public class Venta {
    private int ventaId;
    private int clienteId;
    private int empleadoId;
    private String fechaVenta;
    private double total;

    public Venta() {}

    public Venta(int ventaId, int clienteId, int empleadoId, String fechaVenta, double total) {
        this.ventaId = ventaId;
        this.clienteId = clienteId;
        this.empleadoId = empleadoId;
        this.fechaVenta = fechaVenta;
        this.total = total;
    }

    public int getVentaId() { return ventaId; }
    public void setVentaId(int ventaId) { this.ventaId = ventaId; }

    public int getClienteId() { return clienteId; }
    public void setClienteId(int clienteId) { this.clienteId = clienteId; }

    public int getEmpleadoId() { return empleadoId; }
    public void setEmpleadoId(int empleadoId) { this.empleadoId = empleadoId; }

    public String getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(String fechaVenta) { this.fechaVenta = fechaVenta; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}