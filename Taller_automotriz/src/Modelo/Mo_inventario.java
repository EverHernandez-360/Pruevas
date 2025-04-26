/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Mo_repuestos;


/**
 *
 * @author Ever Hernández
 */
public class Mo_inventario {
    private Mo_repuestos[] repuestos; // El vector guarda los repuestos ingresados
    private int contador; //Contador de cuantos repuestos se a ingresado
    private int idActual; // asignar un id automaticamente para cada repuesto

    public Mo_inventario(int capacidad) {
        repuestos = new Mo_repuestos[capacidad]; 
        contador = 0;
        idActual = 1;
    }

    public void agregarRepuesto(String nombre, String marca, String modelo, int existencias, double precio) {
        if (contador < repuestos.length) {
            repuestos[contador++] = new Mo_repuestos(idActual++, nombre, marca, modelo, existencias, precio); // Aumenta el contador para guardarlo en el siguiente vector
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public Mo_repuestos[] getRepuestos() { // devuelve los repuestos recolectados
        return repuestos;
    }

    public int getCantidad() { // Devuelve cuántos repuestos hay actualmente
        return contador;
    }
    
    public void vaciarInventario() { // Lipia el vector para ingresar los datos cuando se eliminan o se editan
    contador = 0;
    idActual = 1;
    }

}
