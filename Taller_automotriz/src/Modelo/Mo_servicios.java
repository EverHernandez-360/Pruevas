/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ever Hernández
 */
public class Mo_servicios {
    //Especificar que tipos de datos se requiere para utilizar
    private int id2;
    private String nombre2;
    private String marca2;
    private String modelo2;
    private String lista;
    private int pre_mano;
    private int totalprecio;
    
    //Los tipos de datos que tenemos que ingresar para que los reconosca los datos y los guarde
    //Se llama asi mismo cuando uno crea un objeto nuevo
    public Mo_servicios(int id2, String nombre2, String marca2, String modelo2, String lista, int pre_mano, int totalprecio){
        this.id2 = id2;
        this.nombre2 = nombre2;
        this.marca2 = marca2;
        this.modelo2 = modelo2;
        this.lista = lista;
        this.pre_mano = pre_mano;
        this.totalprecio = totalprecio;
    }
    
    public int getId2() { return id2; }
    public String getNombre2() { return nombre2; }
    public String getMarca2() { return marca2; }
    public String getModelo2() { return modelo2; }
    public String getLista() { return lista; }
    public int getPre_mano() { return pre_mano; }
    public int getTotalprecio() { return totalprecio; }
    
    @Override
    public String toString() {
        return id2 + " - " + nombre2 + " - " + marca2 + " - " + modelo2 + " - " + lista + " - " + pre_mano + " - " + totalprecio;
    }
}
