/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mo_inventario;
import Modelo.Mo_repuestos;
import Modelo.Mo_servicioInventario;

public class ControladorGeneral {

    private Mo_inventario inventario = new Mo_inventario(100);
private Mo_servicioInventario servicioInventario = new Mo_servicioInventario(100);

private ServicioControlador servicioControlador = new ServicioControlador(inventario, servicioInventario);
private RepuestoControlador repuestoControlador = new RepuestoControlador(inventario);

public Mo_inventario getInventario() { return inventario; }
public Mo_servicioInventario getServicios() { return servicioInventario; }
public ServicioControlador getServicioControlador() { return servicioControlador; }
public RepuestoControlador getRepuestoControlador() { return repuestoControlador; }
}
