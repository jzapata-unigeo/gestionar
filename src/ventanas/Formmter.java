/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Usuario
 */
public class Formmter extends javax.swing.JInternalFrame {

    /**
     * Creates new form formulariocliente
     */
    public Formmter() {
        initComponents();
        //this.setLocationRelativeTo(null);
        inhabilitar();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelConsultoria = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelMateria = new javax.swing.JLabel();
        jTextMateria = new javax.swing.JTextField();
        jLabelNombre_Materia = new javax.swing.JLabel();
        jTextFieldNombre_Materia = new javax.swing.JTextField();
        jLabelNivel_Ciclos = new javax.swing.JLabel();
        jTextFieldNivel_ciclos = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalir2 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelConsultoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Triangulo200.png"))); // NOI18N
        getContentPane().add(jLabelConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 120));

        jLabelCliente.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(0, 102, 153));
        jLabelCliente.setText("MATERIAS");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 150, 40));

        jLabelMateria.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelMateria.setText("ID MATERIAS:");
        getContentPane().add(jLabelMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jTextMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 220, 20));

        jLabelNombre_Materia.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNombre_Materia.setText("NOMBRE MATERIA:");
        getContentPane().add(jLabelNombre_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(jTextFieldNombre_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, 20));

        jLabelNivel_Ciclos.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNivel_Ciclos.setText("NIVEL CICLOS:");
        getContentPane().add(jLabelNivel_Ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        getContentPane().add(jTextFieldNivel_ciclos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 220, 20));

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonSalir.setText("ELIMINAR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jButtonAgregar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAgregar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonAgregar.setText("AGREGAR");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, -1));

        jButtonEditar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEditar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, -1));

        jButtonSalir2.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalir2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonSalir2.setText("SALIR");
        jButtonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 70, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMateriaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalir2ActionPerformed

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
            java.util.logging.Logger.getLogger(Formmter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formmter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formmter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formmter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formmter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSalir2;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelConsultoria;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelNivel_Ciclos;
    private javax.swing.JLabel jLabelNombre_Materia;
    private javax.swing.JTextField jTextFieldNivel_ciclos;
    private javax.swing.JTextField jTextFieldNombre_Materia;
    private javax.swing.JTextField jTextMateria;
    // End of variables declaration//GEN-END:variables

    private void inhabilitar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
