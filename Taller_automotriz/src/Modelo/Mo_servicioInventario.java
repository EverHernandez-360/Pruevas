/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ever Hernández
 */
public class Mo_servicioInventario {
    private Mo_servicios[] servicios;
    private int contador;
    private int idActual;

    public Mo_servicioInventario(int capacidad) {
        servicios = new Mo_servicios[capacidad];
        contador = 0;
        idActual = 1;
    }

    public boolean agregarServicio(String nombre2, String marca2, String modelo2, String listaRepuestos, int pre_mano, double total) {
        if (contador < servicios.length) {
            servicios[contador++] = new Mo_servicios(idActual++, nombre2, marca2, modelo2, listaRepuestos, pre_mano, (int) total);
            return true;
        }
        return false;
    }

    public Mo_servicios[] getServicios() {
        return servicios;
    }

    public int getCantidad() {
        return contador;
    }
    
    public void vaciarInventario() { // Lipia el vector para ingresar los datos cuando se eliminan o se editan
    contador = 0;
    idActual = 1;
    }
}
