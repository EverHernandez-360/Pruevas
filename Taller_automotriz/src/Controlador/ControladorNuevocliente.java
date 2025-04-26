/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mo_Nuevosclientes;
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
            return;
        }
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacío.");
            return;
        }
        if (contraseña == null || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.");
            return;
        }

        // Crear un nuevo cliente y guardar sus datos
        Mo_Nuevosclientes nuevoCliente = new Mo_Nuevosclientes(dpi, nombreCliente, nombreUsuario, contraseña, tipoCliente);
        
        // Aquí puedes implementar la lógica para guardar el cliente en una base de datos o estructura de datos
        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente:\n" + nuevoCliente.toString());
    }
}
