/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ever Hernández
 */
public class Mo_Nuevosclientes {
    //Especificar que tipos de datos se requiere para utilizar
    private int dpi;
    private String nombrecliente;
    private String nombreusuario;
    private String contraseña;
    private String tipodecliente;
    
    //Los tipos de datos que tenemos que ingresar para que los reconosca los datos y los guarde
    //Se llama asi mismo cuando uno crea un objeto nuevo
    public Mo_Nuevosclientes(int dpi, String nombrecliente, String nombreusuario, String contraseña, String tipodecliente){
        this.dpi = dpi;
        this.nombrecliente = nombrecliente;
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.tipodecliente = tipodecliente;
    }
    
    
    
    public int getDpi() { return dpi; }
    public String getNombrecliente() { return nombrecliente; }
    public String getNombreusuario() { return nombreusuario; }
    public String getContraseña() { return contraseña; }
    public String getTipodecliente() { return tipodecliente; }
    
    @Override
    public String toString() {
        return dpi + " - " + nombrecliente + " - " + nombreusuario + " - " + contraseña + " - " + tipodecliente;
    }
    
    public class Nuevosvehiculos {
        
        private String placa;
        private String marca;
        private String modelo;
        private String imagen;

        public Nuevosvehiculos(String placa, String marca, String modelo, String imagen){
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            this.imagen = imagen;
        }

        public String getPlaca() { return placa; }
        public String getMarca() { return marca; }
        public String getModelo() { return modelo; }
        public String getImagen() { return imagen; }


        @Override
        public String toString() {
            return dpi + " - " + nombrecliente + " - " + nombreusuario + " - " + contraseña + " - " + tipodecliente + " - " + placa + " , " + marca + " , " + modelo + " , " + imagen;
        }
    }
}
