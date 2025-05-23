package Modelo;

public class Empleado {
    private int empleadoId;
    private String nombre;
    private String cargo;
    private double salario;
    private String fechaContratacion;

    public Empleado() {}

    public Empleado(int empleadoId, String nombre, String cargo, double salario, String fechaContratacion) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public int getEmpleadoId() { return empleadoId; }
    public void setEmpleadoId(int empleadoId) { this.empleadoId = empleadoId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public String getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(String fechaContratacion) { this.fechaContratacion = fechaContratacion; }
}