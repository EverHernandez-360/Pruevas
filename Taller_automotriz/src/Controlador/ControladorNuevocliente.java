/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Bitacora;
import Modelo.Mo_Nuevosclientes;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Ever Hernández
 */
public class ControladorNuevocliente {
    // Método para registrar un nuevo cliente
    public void registrarCliente(int dpi, String nombreCliente, String nombreUsuario, String contraseña) {
        // Campo automático
        String tipoCliente = "Normal";

        // Validar los datos de entrada
        if (nombreCliente == null || nombreCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del cliente no puede estar vacío.");
            Bitacora.General("Desconocido", "Preciono boton Registrar", "Error", "No completo campos");
            return;
        }
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacío.");
            Bitacora.General("Desconocido", "Preciono boton Registrar", "Error", "No completo campos");
            return;
        }
        if (contraseña == null || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.");
            Bitacora.General("Desconocido", "Preciono boton Registrar", "Error", "No completo campos");
            return;
        }

        // Crear un nuevo cliente y guardar sus datos
        Mo_Nuevosclientes nuevoCliente = new Mo_Nuevosclientes(dpi, nombreCliente, nombreUsuario, contraseña, tipoCliente);
        listaClientes.add(nuevoCliente);
        
        // Aquí puedes implementar la lógica para guardar el cliente en una base de datos o estructura de datos
        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente:\n" + nuevoCliente.toString());
        Bitacora.General("Desconocido", "Preciono boton Registrar", "Exito", "Creo con exito su cuenta de cliente");
        // Debug: Imprimir los valores capturados en la consola
        System.out.println("DPI: " + dpi);
        System.out.println("Nombre Cliente: " + nombreCliente);
        System.out.println("Nombre Usuario: " + nombreUsuario);
        System.out.println("Contraseña: " + contraseña);
    }
    
    private static Vector<Mo_Nuevosclientes> listaClientes = new Vector<>();
    
    public boolean validarLogin(String nombreUsuario, String contraseña) {
        for (Mo_Nuevosclientes cliente : listaClientes) {
            // Verificar si el nombreUsuario y la contraseña coinciden en el mismo cliente
            if (cliente.getNombreusuario().equals(nombreUsuario) && cliente.getContraseña().equals(contraseña)) {
                return true; // Credenciales válidas
            }
        }
        return false; // Credenciales inválidas
    }
}
