package Controlador;

import DAO.ClienteDAO;
import Modelo.Cliente;
import java.util.List;

public class ClienteControlador {
    private final ClienteDAO clienteDAO;

    public ClienteControlador() {
        clienteDAO = new ClienteDAO();
    }

    public List<Cliente> obtenerClientes() {
        return clienteDAO.listarClientes();
    }

    public boolean agregarCliente(String nombre, String email, String telefono, String direccion) {
        if (nombre.isEmpty() || email.isEmpty()) {
            System.out.println("Nombre y email son obligatorios.");
            return false;
        }

        Cliente nuevo = new Cliente();
        nuevo.setNombre(nombre);
        nuevo.setEmail(email);
        nuevo.setTelefono(telefono);
        nuevo.setDireccion(direccion);

        return clienteDAO.insertarCliente(nuevo);
    }
}
