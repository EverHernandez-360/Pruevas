/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Modelo.Bitacora;
import javax.swing.JOptionPane;
/**
 *
 * @author Ever Hernández
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tex_contra = new javax.swing.JTextField();
        Tex_usu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(205, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 120, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 110, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 20));

        Tex_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex_contraActionPerformed(evt);
            }
        });
        jPanel1.add(Tex_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 220, -1));

        Tex_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex_usuActionPerformed(evt);
            }
        });
        jPanel1.add(Tex_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 150));

        Regresar.setBackground(new java.awt.Color(205, 51, 51));
        Regresar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String usuario = Tex_usu.getText();
          String contraseña = new String(Tex_contra.getText());
                               
        if (usuario.equals("1") && contraseña.equals("2")){
                        Bitacora.General(usuario, "Inicio de sesion", "Exito", "Sesion iniciada correctamente.");
                        
                        Administrador panta1 = new Administrador();
                        panta1.setVisible(true);
                        this.setVisible(false);
                        
                    }else{
                        Bitacora.General(usuario, "Inicio de sesion", "Fallido", "Sesion no iniciada contrasena o usuario incorrecto intende de nuevo.");
                        JOptionPane.showMessageDialog(this, "Error, a ingresado incorrectamente la contraseña o usuario");
                        Tex_usu.setText("");
                        Tex_contra.setText("");
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tex_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_contraActionPerformed

    private void Tex_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tex_usuActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Inicio panta1 = new Inicio();
        panta1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Tex_contra;
    private javax.swing.JTextField Tex_usu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
