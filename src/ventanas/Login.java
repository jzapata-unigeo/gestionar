/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Funciones.Conexion;
import Funciones.Encryp;
import Funciones.Flogin;
import Funciones.aLogin;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeiso
 */
public class Login extends javax.swing.JFrame {

    int x;
    int y;

    public Login() {
        initComponents();
        jTUsuario.requestFocus();
        this.setLocationRelativeTo(null);
        this.setSize(450, 280);
        this.setTitle("Login");
        this.setUndecorated(true);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/iconsuser.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalir = new javax.swing.JButton();
        jTUsuario = new javax.swing.JTextField();
        jLuser = new javax.swing.JLabel();
        jLpass = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jLIingr = new javax.swing.JLabel();
        jBuLogin = new javax.swing.JButton();
        jLIngresa = new javax.swing.JLabel();
        jLfondo2 = new javax.swing.JLabel();
        jLbarra = new javax.swing.JLabel();
        jLfondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-Close Window-32.png"))); // NOI18N
        jBsalir.setBorder(null);
        jBsalir.setBorderPainted(false);
        jBsalir.setContentAreaFilled(false);
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, 30, 20));

        jTUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)));
        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 25));

        jLuser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLuser.setText("Usuario :");
        getContentPane().add(jLuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLpass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLpass.setText("Password:");
        getContentPane().add(jLpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)));
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        getContentPane().add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, 25));

        jLIingr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconsuser.png"))); // NOI18N
        getContentPane().add(jLIingr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jBuLogin.setBackground(new java.awt.Color(42, 128, 180));
        jBuLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBuLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBuLogin.setText("INGRESAR");
        jBuLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBuLogin.setBorderPainted(false);
        jBuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBuLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, 30));

        jLIngresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLIngresa.setText("<html><body>Ingresa tu nombre de usuario <br> Y contraseña para comenzar.</body></html>");
        getContentPane().add(jLIngresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, 40));

        jLfondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLfondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 25, 440, 250));

        jLbarra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLbarra.setForeground(new java.awt.Color(255, 255, 255));
        jLbarra.setText(" INICIO DE SESION");
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
        getContentPane().add(jLbarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 30));

        jLfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/abstracto-azul.jpg"))); // NOI18N
        getContentPane().add(jLfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jBsalirActionPerformed

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
        ResultSet rs;//creamos una variable para realizar la consulta a la base de datos
        String clave;//Variable para capturar la clave y luego encriptarla
        //Instanciamos los objetos necesarios
        FrmInicio forminicio = new FrmInicio();//Obgeto para mostrar la ventana inicio
        Conexion cn = new Conexion();//obgeto para la conexion a la base de datos
        Encryp pass = new Encryp();//obgeto para encriptar la contraseña
        aLogin dts = new aLogin();//Getters y setters
        Flogin func = new Flogin();//funciones del login
        //se formate la fecha
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fecha = formatter.parse(func.dia());
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            //capturamos los valores digitados en el formulario
            clave = jPass.getText();
            dts.setPassword(pass.encrypt("92AE31A79FEEB2A3", "0123456789ABCDEF", jPass.getText()));
            dts.setNumDocumento(jTUsuario.getText());
            rs = func.validar(dts.getNumDocumento(), dts.getPassword());
            //ResultSet rs = st.executeQuery("Select tipo from Usuarios where nombre = '" + jTUsuario.getText() + "' and password  = '" + password + "'");
            if (rs.next()) {
                dts.setTipo(rs.getInt("Tipo"));
                dts.setPassven(formatter.parse(rs.getString("passven")));
                dts.setNomEstudiante(rs.getString("NomEstudiante"));
                dts.setApllEstudiante(rs.getString("ApllEstudiante"));
                dts.setNomApellido(dts.getNomEstudiante() + " " +dts.getApllEstudiante());

                int tipo = rs.getInt("Tipo");
                if (tipo == 1) {
                    dispose();
                    forminicio.datosUsuario(jTUsuario.getText());
                    forminicio.setVisible(true);

                }

                if (tipo == 2) {
                    dispose();
                    forminicio.datosUsuario(jTUsuario.getText());
                    forminicio.setVisible(true);
                }
                if (tipo == 3) {
                    dispose();
                    forminicio.datosUsuario(jTUsuario.getText());
                    forminicio.setVisible(true);
                }

            } else {

                JOptionPane.showMessageDialog(null, "No existe usuario, porfovor revise sus datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);

        }

        //capturar los datos 
        FrmInicio.rebusuario.setText(dts.getNomApellido());
        FrmInicio.jlusuario.setText("Bienvenido: " + dts.getNomApellido());
    }//GEN-LAST:event_jBuLoginActionPerformed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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

                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuLogin;
    private javax.swing.JLabel jLIingr;
    private javax.swing.JLabel jLIngresa;
    private javax.swing.JLabel jLbarra;
    private javax.swing.JLabel jLfondo1;
    private javax.swing.JLabel jLfondo2;
    private javax.swing.JLabel jLpass;
    private javax.swing.JLabel jLuser;
    private javax.swing.JPasswordField jPass;
    public static javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
