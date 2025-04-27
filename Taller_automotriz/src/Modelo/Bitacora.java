/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Ever Hernández
 */
public class Bitacora {
    public static void General(String usuario, String accion, String resultado, String detalles) {
        // Obtener la fecha y hora actual
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String marcaTemporal = fechaHora.format(formatter);
       
        System.out.println("[" + marcaTemporal + "] Usuario: " + usuario + " - Accion: " + accion + " - Resultado: " + resultado + " - Detalles: " + detalles);
    }
    
    public static class Sesion {
        private static String nombreUsuario;

        public static String getNombreUsuario() {
            return nombreUsuario;
        }

        public static void setNombreUsuario(String nombreUsuario) {
            Sesion.nombreUsuario = nombreUsuario;
        }
    }
}
