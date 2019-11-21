/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Funciones.Conexion;
import Funciones.Encryp;
import Funciones.aCreacionUsuarios;
import Funciones.fCreacionUsuarios;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeiso
 */
public class Creauser extends javax.swing.JInternalFrame {

    int x;
    int y;

    public Creauser() {
        initComponents();
        
        this.setTitle("Creacion de usuarios");
        
         CMBNivel.setSelectedIndex(-1);
    }

   // @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/iconsuser.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTUsuario = new javax.swing.JTextField();
        jLuser = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jLpass = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jBuLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JlTipo = new javax.swing.JLabel();
        CMBNivel = new javax.swing.JComboBox();
        jLfondo2 = new javax.swing.JLabel();
        jLfondo1 = new javax.swing.JLabel();
        jLbarra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, 25));

        jLuser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLuser.setText("Usuario :");
        getContentPane().add(jLuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeblack.png"))); // NOI18N
        jBsalir.setBorder(null);
        jBsalir.setBorderPainted(false);
        jBsalir.setContentAreaFilled(false);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 20, 20));

        jLpass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLpass.setText("Password:");
        getContentPane().add(jLpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        getContentPane().add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 25));

        jBuLogin.setBackground(new java.awt.Color(153, 204, 255));
        jBuLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBuLogin.setText("CREAR");
        jBuLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBuLogin.setBorderPainted(false);
        jBuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBuLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 90, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JlTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JlTipo.setText("Tipo");

        CMBNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuario", "Consulta" }));
        CMBNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(JlTipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CMBNivel, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(JlTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CMBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 130, 65));

        jLfondo2.setBackground(new java.awt.Color(204, 204, 204));
        jLfondo2.setOpaque(true);
        getContentPane().add(jLfondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 8, 383, 162));

        jLfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/black.jpg"))); // NOI18N
        getContentPane().add(jLfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 180));

        jLbarra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbarra.setForeground(new java.awt.Color(255, 255, 255));
        jLbarra.setToolTipText("");
        jLbarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLbarraMouseDragged(evt);
            }
        });
        jLbarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLbarraMousePressed(evt);
            }
        });
        getContentPane().add(jLbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 17));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbarraMousePressed
        x = evt.getX();
        y = evt.getY();
        

    }//GEN-LAST:event_jLbarraMousePressed

    private void jLbarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbarraMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jLbarraMouseDragged

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jBuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuLoginActionPerformed
        try {
        
        if (CMBNivel.getSelectedItem() == "null" ) {
            JOptionPane.showMessageDialog(rootPane, " debe ingresar el tipo usuario");
           CMBNivel.requestFocus();
            return;
            }
        
        if (jTUsuario.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, " debe ingresar un nombre de usuario");
            jTUsuario.requestFocus();
            return;
         }
        
        if (jPass.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, " debe ingresar un password");
            jPass.requestFocus();
            return;
         }
        
              Encryp pass  = new Encryp();
            
        
            String password = pass.encrypt("92AE31A79FEEB2A3", "0123456789ABCDEF", jPass.getText());
        

            aCreacionUsuarios dts = new aCreacionUsuarios();
            fCreacionUsuarios func = new fCreacionUsuarios();

            dts.setNombre(jTUsuario.getText());
            dts.setPassword(password);
            dts.setTipo(CMBNivel.getSelectedIndex() + 1);
   
        if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "estudiante creado con exito");
        }
        
        } catch (Exception ex) {
            Logger.getLogger(Creauser.class.getName()).log(Level.SEVERE, null, ex);
        }  
         
      jTUsuario.setText("");
      jPass.setText("");
      CMBNivel.setSelectedIndex(-1);
      
    }//GEN-LAST:event_jBuLoginActionPerformed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void CMBNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMBNivelActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
         this.dispose();
         FrmInicio.dupl=0;
    }//GEN-LAST:event_jBsalirActionPerformed
   
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
            java.util.logging.Logger.getLogger(Creauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creauser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CMBNivel;
    private javax.swing.JLabel JlTipo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuLogin;
    private javax.swing.JLabel jLbarra;
    private javax.swing.JLabel jLfondo1;
    private javax.swing.JLabel jLfondo2;
    private javax.swing.JLabel jLpass;
    private javax.swing.JLabel jLuser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
