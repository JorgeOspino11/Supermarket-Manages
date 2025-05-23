package Controlador;

import DAO.ProductoDAO;
import Modelo.Producto;
import java.util.List;

public class ProductoControlador {
    private final ProductoDAO productoDAO;

    public ProductoControlador() {
        productoDAO = new ProductoDAO();
    }

    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }

    public Producto buscarProductoPorId(int id) {
        return productoDAO.buscarPorId(id);
    }
}
