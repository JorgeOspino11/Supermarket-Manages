package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.Producto;

public class ProductoDAO {

    // Lista todos los productos
    public List<Producto> listarProductos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";

        try (Connection conn = Conexion.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producto p = new Producto();
                p.productoId = rs.getInt("producto_id");
                p.nombre = rs.getString("nombre");
                p.descripcion = rs.getString("descripcion");
                p.precio = rs.getDouble("precio");
                p.stock = rs.getInt("stock");
                p.categoriaId = rs.getInt("categoria_id");
                p.proveedorId = rs.getInt("proveedor_id");
                p.fechaCreacion = rs.getString("fecha_creacion");

                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        }

        return lista;
    }

    // Busca producto por ID
    public Producto buscarPorId(int id) {
        String sql = "SELECT * FROM productos WHERE producto_id = ?";
        Producto p = null;

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                p = new Producto();
                p.productoId = rs.getInt("producto_id");
                p.nombre = rs.getString("nombre");
                p.descripcion = rs.getString("descripcion");
                p.precio = rs.getDouble("precio");
                p.stock = rs.getInt("stock");
                p.categoriaId = rs.getInt("categoria_id");
                p.proveedorId = rs.getInt("proveedor_id");
                p.fechaCreacion = rs.getString("fecha_creacion");
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }

        return p;
    }

    // Insertar producto
    public boolean insertarProducto(Producto p) {
        String sql = "INSERT INTO productos(nombre, descripcion, precio, stock, categoria_id, proveedor_id) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.nombre);
            stmt.setString(2, p.descripcion);
            stmt.setDouble(3, p.precio);
            stmt.setInt(4, p.stock);
            stmt.setInt(5, p.categoriaId);
            stmt.setInt(6, p.proveedorId);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
            return false;
        }
    }

    // Actualizar producto
    public boolean actualizarProducto(Producto p) {
        String sql = "UPDATE productos SET nombre = ?, descripcion = ?, precio = ?, stock = ?, categoria_id = ?, proveedor_id = ? WHERE producto_id = ?";

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.nombre);
            stmt.setString(2, p.descripcion);
            stmt.setDouble(3, p.precio);
            stmt.setInt(4, p.stock);
            stmt.setInt(5, p.categoriaId);
            stmt.setInt(6, p.proveedorId);
            stmt.setInt(7, p.productoId);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
            return false;
        }
    }

    // Eliminar producto
    public boolean eliminarProducto(int id) {
        String sql = "DELETE FROM productos WHERE producto_id = ?";

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
            return false;
        }
    }
}