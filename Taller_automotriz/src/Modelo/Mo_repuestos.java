/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ever Hernández
 */
public class Mo_repuestos {
    
    //Especificamos que tipo de datse requiere
    private int id;
    private String nombre;
    private String marca;
    private String modelo;
    private int existencias;
    private double precio;
    
    //Los tipos de datos que tenemos que ingresar para que los reconosca los datos y los guarde
    //Se llama asi mismo cuando uno crea un objeto nuevo
    public Mo_repuestos(int id, String nombre, String marca, String modelo, int existencias, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.existencias = existencias;
        this.precio = precio;
    }

    // Getters lee cada atributo desde fuera de la clase
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getExistencias() { return existencias; }
    public double getPrecio() { return precio; }
    
    //Sobreescribe los datos para mostrarlos luego
    @Override
    public String toString() {
        return id + " - " + nombre + " - " + marca + " - " + modelo + " - " + existencias + " - " + precio;
    }
}
