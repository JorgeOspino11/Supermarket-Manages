package Controlador;

import DAO.VentaDAO;
import Modelo.Venta;

public class VentaControlador {
    private final VentaDAO ventaDAO;

    public VentaControlador() {
        ventaDAO = new VentaDAO();
    }

    public boolean registrarVenta(int clienteId, int empleadoId, double total) {
        Venta venta = new Venta();
        venta.setClienteId(clienteId);
        venta.setEmpleadoId(empleadoId);
        venta.setTotal(total);

        return ventaDAO.registrarVenta(venta);
    }
}