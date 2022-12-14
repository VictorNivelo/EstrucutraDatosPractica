/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class InterfazRegistro extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistro
     */
    public InterfazRegistro() {
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

        panelRegistro = new javax.swing.JPanel();
        lblUsuarioRegistro = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAceptarRegistro = new javax.swing.JButton();
        btnSalirRegistro = new javax.swing.JButton();
        btnRegresarRegistro = new javax.swing.JButton();
        lblNombreUsuarioMostrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarNombre = new javax.swing.JButton();
        FondoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INTERFAZ REGISTRO");

        panelRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuarioRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuarioRegistro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblUsuarioRegistro.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuarioRegistro.setText("Nombres");
        panelRegistro.add(lblUsuarioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRegistro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, -1));

        btnAceptarRegistro.setText("ACEPTAR");
        btnAceptarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarRegistroActionPerformed(evt);
            }
        });
        panelRegistro.add(btnAceptarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 110, -1));

        btnSalirRegistro.setText("SALIR");
        btnSalirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRegistroActionPerformed(evt);
            }
        });
        panelRegistro.add(btnSalirRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 125, -1));

        btnRegresarRegistro.setText("REGRESAR");
        btnRegresarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarRegistroActionPerformed(evt);
            }
        });
        panelRegistro.add(btnRegresarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 125, -1));

        lblNombreUsuarioMostrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreUsuarioMostrar.setForeground(new java.awt.Color(0, 0, 255));
        lblNombreUsuarioMostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRegistro.add(lblNombreUsuarioMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 350, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("El nombre ingresado es");
        panelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 330, -1));

        btnRegistrarNombre.setText("REGISTRAR NOMBRE");
        btnRegistrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNombreActionPerformed(evt);
            }
        });
        panelRegistro.add(btnRegistrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 210, -1));

        FondoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/283-personalizar-imagen-wp-login.png"))); // NOI18N
        panelRegistro.add(FondoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarRegistroActionPerformed
        if (lblNombreUsuarioMostrar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PORFAVOR INGRESE EL NOMBRE EN EL CAMPO CORRESPONDIENTE", "EROOR", JOptionPane.INFORMATION_MESSAGE);
        } else {
//           InterfazPresentacion presentacionInterfaz = new InterfazPresentacion();
//           presentacionInterfaz.setDatoNombre(lblNombreUsuarioMostrar.getText());
//           presentacionInterfaz.setVisible(true);
//           this.setVisible(false);

            InterfazPresentacion.lblUsuario.setText(lblNombreUsuarioMostrar.getText());
            this.dispose();
        }

//        InterfazFecha abrir = new InterfazFecha();
//        abrir.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarRegistroActionPerformed

    private void btnRegresarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarRegistroActionPerformed
//        InterfazPrincipal abrir = new InterfazPrincipal();
//        abrir.setVisible(true);
//        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnRegresarRegistroActionPerformed

    private void btnSalirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirRegistroActionPerformed

    private void btnRegistrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNombreActionPerformed
        // TODO add your handling code here:
        if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO SE HA INGRESADO EL NOMBRE", "EROOR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lblNombreUsuarioMostrar.setText(txtUsuario.getText());
        }
    }//GEN-LAST:event_btnRegistrarNombreActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoRegistro;
    private javax.swing.JButton btnAceptarRegistro;
    private javax.swing.JButton btnRegistrarNombre;
    private javax.swing.JButton btnRegresarRegistro;
    private javax.swing.JButton btnSalirRegistro;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel lblNombreUsuarioMostrar;
    private javax.swing.JLabel lblUsuarioRegistro;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
