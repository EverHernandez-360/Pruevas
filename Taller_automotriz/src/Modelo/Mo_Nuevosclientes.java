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

}
