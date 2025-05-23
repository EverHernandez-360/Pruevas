/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorGeneral;
import Modelo.Bitacora;

/**
 *
 * @author Ever Hernández
 */
public class Administrador extends javax.swing.JFrame {
private final ControladorGeneral controladorGeneral = new ControladorGeneral();
    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Repuestos = new javax.swing.JButton();
        Servicios = new javax.swing.JButton();
        ClienteYAutomovil = new javax.swing.JButton();
        ProgresoDeAuto = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Repuestos.setBackground(new java.awt.Color(205, 51, 51));
        Repuestos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Repuestos.setForeground(new java.awt.Color(255, 255, 255));
        Repuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconore.png"))); // NOI18N
        Repuestos.setText("Repuestos");
        Repuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepuestosActionPerformed(evt);
            }
        });
        jPanel1.add(Repuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 40));

        Servicios.setBackground(new java.awt.Color(205, 51, 51));
        Servicios.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Servicios.setForeground(new java.awt.Color(255, 255, 255));
        Servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconose.png"))); // NOI18N
        Servicios.setText("Servicios");
        Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 40));

        ClienteYAutomovil.setBackground(new java.awt.Color(205, 51, 51));
        ClienteYAutomovil.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ClienteYAutomovil.setForeground(new java.awt.Color(255, 255, 255));
        ClienteYAutomovil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconocliyau.png"))); // NOI18N
        ClienteYAutomovil.setText("Cliente y automoviles");
        ClienteYAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteYAutomovilActionPerformed(evt);
            }
        });
        jPanel1.add(ClienteYAutomovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 240, 30));

        ProgresoDeAuto.setBackground(new java.awt.Color(205, 51, 51));
        ProgresoDeAuto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ProgresoDeAuto.setForeground(new java.awt.Color(255, 255, 255));
        ProgresoDeAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoprogreso.png"))); // NOI18N
        ProgresoDeAuto.setText("Progreso de autos");
        ProgresoDeAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgresoDeAutoActionPerformed(evt);
            }
        });
        jPanel1.add(ProgresoDeAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 30));

        Reporte.setBackground(new java.awt.Color(205, 51, 51));
        Reporte.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Reporte.setForeground(new java.awt.Color(255, 255, 255));
        Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoreporte.png"))); // NOI18N
        Reporte.setText("Reportes");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        jPanel1.add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, 40));

        cerrar.setBackground(new java.awt.Color(205, 51, 51));
        cerrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setText("Cerrar sesion");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepuestosActionPerformed
        Repuestos rep = new Repuestos(controladorGeneral);
        rep.setVisible(true);
        Bitacora.General("Administrador", "Preciono boton Repuestos", "Exito", "ingresar datos");
    }//GEN-LAST:event_RepuestosActionPerformed

    private void ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiciosActionPerformed
        Servicios serv = new Servicios(controladorGeneral);
        serv.setVisible(true);
        Bitacora.General("Administrador", "Preciono boton Servicios", "Exito", "ingresar datos");
    }//GEN-LAST:event_ServiciosActionPerformed

    private void ClienteYAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteYAutomovilActionPerformed
        Bitacora.General("Administrador", "Preciono boton Cliente y servicio", "Exito", "ver");
    }//GEN-LAST:event_ClienteYAutomovilActionPerformed

    private void ProgresoDeAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgresoDeAutoActionPerformed
        Bitacora.General("Administrador", "Preciono boton progreso de auto", "Exito", "ver");
    }//GEN-LAST:event_ProgresoDeAutoActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        Bitacora.General("Administrador", "Preciono boton Reportes", "Exito", "ver");
    }//GEN-LAST:event_ReporteActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        Inicio panta1 = new Inicio();
        panta1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClienteYAutomovil;
    private javax.swing.JButton ProgresoDeAuto;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton Repuestos;
    private javax.swing.JButton Servicios;
    private javax.swing.JButton cerrar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
