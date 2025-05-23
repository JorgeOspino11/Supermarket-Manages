package DAO;

import java.sql.*;
import Modelo.Venta;

public class VentaDAO {

    public boolean registrarVenta(Venta venta) {
        String sql = "INSERT INTO ventas(cliente_id, empleado_id, total) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setInt(1, venta.getClienteId());
            stmt.setInt(2, venta.getEmpleadoId());
            stmt.setDouble(3, venta.getTotal());

            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    venta.setVentaId(rs.getInt(1)); // ID generado
                }
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al registrar venta: " + e.getMessage());
        }

        return false;
    }
}