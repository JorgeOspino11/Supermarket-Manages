package Modelo;

public class Promocion {
    private int promocionId;
    private int productoId;
    private double descuento;
    private String fechaInicio;
    private String fechaFin;

    public Promocion() {}

    public Promocion(int promocionId, int productoId, double descuento, String fechaInicio, String fechaFin) {
        this.promocionId = promocionId;
        this.productoId = productoId;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getPromocionId() { return promocionId; }
    public void setPromocionId(int promocionId) { this.promocionId = promocionId; }

    public int getProductoId() { return productoId; }
    public void setProductoId(int productoId) { this.productoId = productoId; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
}
