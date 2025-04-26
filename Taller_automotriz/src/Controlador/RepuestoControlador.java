/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Mo_inventario;
import Modelo.Mo_repuestos;
import java.io.*; //Entrada y salida de datos
/**
 *
 * @author Ever Hernández
 */
public class RepuestoControlador {
    private Mo_inventario inventario;

    public RepuestoControlador(Mo_inventario inventario) {
        this.inventario = inventario;
    }

    public void cargarDesdeArchivo(String rutaArchivo) {
        try (BufferedReader b = new BufferedReader(new FileReader(rutaArchivo))) { //BufferredReader:Leer archivos más eficientemente, línea por línea.
            String linea;
            while ((linea = b.readLine()) != null) {
                String[] partes = linea.split("-");//Divide la linea usando split
                if (partes.length == 5) { // si tiene 5 partes validas convierte los datos y los guarda en el inventario
                    String nombre = partes[0];
                    String marca = partes[1];
                    String modelo = partes[2];
                    int existencias = Integer.parseInt( partes[3]);
                    double precio = Double.parseDouble(partes[4]);
                    inventario.agregarRepuesto(nombre, marca, modelo, existencias, precio); // despues de verificar que tiene los 5 elementos los agrega al vector
                }
            }
        } catch (IOException e) { //IOException: Manejar errores cuando trabajas con archivos.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public void guardarEnArchivo(String rutaArchivo) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
        for (int i = 0; i < inventario.getCantidad(); i++) {
            Mo_repuestos rep = inventario.getRepuestos()[i];
            if (rep != null) { // el formato deve de ser el mismo que el de la lectura
                bw.write(rep.getNombre() + "-" + rep.getMarca() + "-" + rep.getModelo() + "-" +
                         rep.getExistencias() + "-" + rep.getPrecio());
                bw.newLine();
            }
        }
    } catch (IOException e) {
        System.out.println("Error al guardar el archivo: " + e.getMessage());
    }
    }
    
    public void actualizarInventarioDesdeTexto(String texto) {
    inventario.vaciarInventario(); // Limpia el vector actual

    String[] lineas = texto.split("\n");
    for (String linea : lineas) {
        String[] partes = linea.split("-");

        if (partes.length == 5) {
            try {
                String nombre = partes[0].trim();
                String marca = partes[1].trim();
                String modelo = partes[2].trim();
                int existencias = Integer.parseInt(partes[3].trim());
                double precio = Double.parseDouble(partes[4].trim());

                inventario.agregarRepuesto(nombre, marca, modelo, existencias, precio);
            } catch (NumberFormatException e) {
                System.out.println("Error en formato de línea: " + linea);
            }
        } else {
            System.out.println("Línea inválida: " + linea);
        }
    }
}
}
