/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jalex
 */
public class FrmInicio extends javax.swing.JFrame {

    public static int dupl = 0;
    public static String usuario = "";

    /**
     * Creates new form frmInicio
     */
    public FrmInicio() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(true);
        final JFrame frame = new JFrame("Gestionar");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int) d.getWidth();
        int alto = (int) d.getHeight();
        setSize(ancho, alto);
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Triangulo20.png")).getImage());
        jLfondo.setSize(ancho, alto);
        URL url = this.getClass().getResource("/imagenes/fondoa.jpg");
        ImageIcon icon = new ImageIcon(url);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLfondo.getWidth(), jLfondo.getHeight(), Image.SCALE_DEFAULT));
        jLfondo.setIcon(icono);
        jLabelLogo.setLocation(ancho - 400 , 100 );
        //setSize(ancho, alto);
        String usuario = rebusuario.getText();
        menuBar.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jLabelLogo = new javax.swing.JLabel();
        jLfondo = new javax.swing.JLabel();
        jlusuario = new javax.swing.JLabel();
        rebusuario = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        JmeRegEst = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMecrearU = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu5.setText("File");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar1.add(jMenu6);

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triangulo Del Saber");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 700));
        setResizable(false);

        Escritorio.setBackground(new java.awt.Color(102, 255, 255));
        Escritorio.setAlignmentX(0.0F);
        Escritorio.setAlignmentY(0.0F);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Triangulo300.png"))); // NOI18N
        Escritorio.add(jLabelLogo);
        jLabelLogo.setBounds(1060, 0, 410, 170);
        Escritorio.add(jLfondo);
        jLfondo.setBounds(0, 0, 1380, 670);

        jlusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Escritorio.add(jlusuario);
        jlusuario.setBounds(1300, 600, 0, 0);
        Escritorio.add(rebusuario);
        rebusuario.setBounds(1330, 160, 6, 20);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        menuBar.setToolTipText("");
        menuBar.setBorderPainted(false);
        menuBar.setPreferredSize(new java.awt.Dimension(305, 35));
        menuBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                menuBarKeyTyped(evt);
            }
        });

        jMenu2.setText("REGISTRO");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 10));

        JmeRegEst.setText("Registro de estudiante");
        JmeRegEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmeRegEstActionPerformed(evt);
            }
        });
        jMenu2.add(JmeRegEst);

        menuBar.add(jMenu2);

        jMenu4.setText("CONSULTA");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 10));

        jMenuItem3.setText("Consulta de datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        menuBar.add(jMenu4);

        jMenu1.setText("ADMINISTRAR");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 10));

        jMecrearU.setText("Crear Usuarios");
        jMecrearU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMecrearUActionPerformed(evt);
            }
        });
        jMenu1.add(jMecrearU);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (dupl == 0) {
            dupl = 1;

            String usuario = rebusuario.getText();
            System.out.println(usuario);
            Consultas form = new Consultas();
            Escritorio.add(form);
            Dimension desktopSize = Escritorio.getSize();
            Dimension FrameSize = form.getSize();
            form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            form.show();
            form.setVisible(rootPaneCheckingEnabled);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Solo se puede abrir un formulario a la vez");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void JmeRegEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmeRegEstActionPerformed
        if (dupl == 0) {

            System.out.println(usuario);
            Formestu form = new Formestu();
            Escritorio.add(form);
            Dimension desktopSize = Escritorio.getSize();
            Dimension FrameSize = form.getSize();
            form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            form.show();
            form.setVisible(rootPaneCheckingEnabled);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Solo se puede abrir un formulario a la vez");
        }
    }//GEN-LAST:event_JmeRegEstActionPerformed

    private void jMecrearUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMecrearUActionPerformed
        if (dupl == 0) {

            Creauser form = new Creauser();
            Escritorio.add(form);
            Dimension desktopSize = Escritorio.getSize();
            Dimension FrameSize = form.getSize();
            form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            form.show();
            form.setVisible(rootPaneCheckingEnabled);
            form.setVisible(true);
            form.setUI(null);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Solo se puede abrir un formulario a la vez");
        }
    }//GEN-LAST:event_jMecrearUActionPerformed

    private void menuBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuBarKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jMenu2.doClick();
        }
    }//GEN-LAST:event_menuBarKeyTyped

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem JmeRegEst;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLfondo;
    public static javax.swing.JMenuItem jMecrearU;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    public static javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    public static javax.swing.JLabel jlusuario;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JTextField rebusuario;
    // End of variables declaration//GEN-END:variables

    public static void datosUsuario(String dato1) {
        usuario = dato1;

    }

}
