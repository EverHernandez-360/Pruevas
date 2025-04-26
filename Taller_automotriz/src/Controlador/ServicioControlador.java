/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Mo_inventario;
import Modelo.Mo_servicioInventario;
import Modelo.Mo_servicios;
import Modelo.Mo_repuestos;
import java.io.*;
import javax.swing.JOptionPane;

public class ServicioControlador {
    private Mo_inventario inventario;
    private Mo_servicioInventario servicios;

    public ServicioControlador(Mo_inventario inventario, Mo_servicioInventario servicios) {
        this.inventario = inventario;
        this.servicios = servicios;
    }

    // ✅ Método público principal
    public void actualizarInventarioDesdeTexto(String texto) {
        ResultadoCarga resultado = procesarServiciosDesdeTexto(texto);

        if (resultado.totalGuardados == 0) {
            JOptionPane.showMessageDialog(null, "❌ No se guardó ningún servicio.\n\n" + resultado.mensajeErrores);
        } else {
            JOptionPane.showMessageDialog(null,
                "✅ Servicios guardados correctamente: " + resultado.totalGuardados +
                (resultado.mensajeErrores.isEmpty() ? "" : "\n\n⚠️ Algunos errores:\n" + resultado.mensajeErrores));
        }
        
    }

    // ✅ Guarda los servicios actuales en archivo .txt
    public void guardarEnArchivo(String rutaArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (int i = 0; i < servicios.getCantidad(); i++) {
                Mo_servicios s = servicios.getServicios()[i];
                writer.write(s.getNombre2() + "-" + s.getMarca2() + "-" + s.getModelo2() + "-" +
                        s.getLista() + "-" + s.getPre_mano());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "📁 Archivo guardado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al guardar archivo: " + e.getMessage());
        }
    }

    private Mo_repuestos buscarRepuestoPorNombreYMarcaModelo(String nombre, String marca, String modelo) {
    for (int i = 0; i < inventario.getCantidad(); i++) {
        Mo_repuestos r = inventario.getRepuestos()[i];
        boolean nombreCoincide = r.getNombre().trim().replaceAll("\\s+", "").equalsIgnoreCase(nombre.trim().replaceAll("\\s+", ""));
        boolean marcaCoincide = r.getMarca().trim().equalsIgnoreCase(marca.trim()) || marca.equalsIgnoreCase("cualquiera");
        boolean modeloCoincide = r.getModelo().trim().equalsIgnoreCase(modelo.trim()) || modelo.equalsIgnoreCase("cualquiera");

        if (nombreCoincide && marcaCoincide && modeloCoincide) {
            return r;
        }
    }
    return null;
}

    // ✅ Lógica unificada de carga
    private ResultadoCarga procesarServiciosDesdeTexto(String texto) {
        servicios.vaciarInventario(); // limpiar vector de servicios
        int cargados = 0;
        StringBuilder errores = new StringBuilder();

        BufferedReader reader = new BufferedReader(new StringReader(texto));
        String linea;

        try {
            while ((linea = reader.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] partes = linea.split("-");
                if (partes.length != 5) {
                    errores.append("❌ Línea inválida: ").append(linea).append("\n");
                    continue;
                }

                String nombre2 = partes[0].trim();
                String marca2 = partes[1].trim();
                String modelo2 = partes[2].trim();
                String repuestosStr = partes[3].trim();
                String[] repuestoNombres = repuestosStr.contains(";") ? repuestosStr.split(";") : new String[]{ repuestosStr };

                int pre_mano;
                try {
                    pre_mano = Integer.parseInt(partes[4].trim());
                } catch (NumberFormatException e) {
                    errores.append("❌ Mano de obra inválida en servicio: ").append(nombre2).append("\n");
                    continue;
                }

                double precioTotal = pre_mano;
                StringBuilder repuestosValidos = new StringBuilder();
                boolean todosCoinciden = true;

                for (String nombreRep : repuestoNombres) {
                    Mo_repuestos rep = buscarRepuestoPorNombreYMarcaModelo(nombreRep.trim(), marca2, modelo2);

                    if (rep == null) {
                        errores.append("❌ Repuesto no encontrado: ").append(nombreRep)
                               .append(" (en servicio: ").append(nombre2).append(")\n");
                        todosCoinciden = false;
                        break;
                    }

                    boolean marcaCoincide = rep.getMarca().equalsIgnoreCase(marca2) || marca2.equalsIgnoreCase("cualquiera");
                    boolean modeloCoincide = rep.getModelo().equalsIgnoreCase(modelo2) || modelo2.equalsIgnoreCase("cualquiera");

                    if (!marcaCoincide || !modeloCoincide) {
                        errores.append("❌ Marca/modelo no coinciden para ").append(nombreRep)
                               .append(" → Esperado: ").append(marca2).append("/").append(modelo2)
                               .append(", tiene: ").append(rep.getMarca()).append("/").append(rep.getModelo()).append("\n");
                        todosCoinciden = false;
                        break;
                    }

                    precioTotal += rep.getPrecio();
                    repuestosValidos.append(rep.getId()).append(";");
                }

                if (todosCoinciden) {
                    boolean guardado = servicios.agregarServicio(nombre2, marca2, modelo2,
                                                                 repuestosValidos.toString(), pre_mano, (int) precioTotal);
                    if (guardado) {
                        cargados++;
                    } else {
                        errores.append("⚠️ No se pudo guardar el servicio: ").append(nombre2)
                               .append(" (¿vector lleno?)\n");
                    }
                } else {
                    errores.append("⛔ Servicio NO guardado: ").append(nombre2).append("\n");
                }
            }

        } catch (IOException e) {
            errores.append("❌ Error al leer texto: ").append(e.getMessage()).append("\n");
        }

        return new ResultadoCarga(cargados, errores.toString());
    }

    // ✅ Clase interna auxiliar para devolver resultados
    private static class ResultadoCarga {
        int totalGuardados;
        String mensajeErrores;

        public ResultadoCarga(int totalGuardados, String mensajeErrores) {
            this.totalGuardados = totalGuardados;
            this.mensajeErrores = mensajeErrores;
        }
    }
}