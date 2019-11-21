/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Funciones.Conexion;
import Funciones.Fnotas;
import Funciones.aNotas;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static ventanas.FrmInicio.Escritorio;

/**
 *
 * @author jalex
 */
public class FormOldnotas extends javax.swing.JInternalFrame {

    /**
     * Creates new form formulariorequerimiento
     */
    public FormOldnotas() {
        initComponents();
        String ciclo = JTciclo.getText();
        jLnombre1.setText(Formestu.nombre + " " + Formestu.apellido);
        jLIdEstudiante.setText("CODIGO: " + Formestu.idestudiante);
        inhabilitar();
        
        Fnotas dts = new Fnotas();
       
         if (Formmtric.cicl.equals("Basico")) {
             
            jLaMateria1.setText("Matematicas");
            jLaMateria2.setText("Ciencias Sociales");
            jLaMateria3.setText("Ciencias Naturales");
            jLaMateria4.setText("Español");
            jLaMateria5.setText("Ingles");
            jLaMateria6.setText("Artes");
            System.out.println("este " + Formmtric.cicl);
        } else {
           
            jLaMateria1.setText("Matematicas II");
            jLaMateria2.setText("Ciencias Sociales II");
            jLaMateria3.setText("Ciencias Naturales II");
            jLaMateria4.setText("Español II");
            jLaMateria5.setText("Ingles II");
            jLaMateria6.setText("Desarrollo Personal");
            System.out.println("este " + Formmtric.cicl);
        
         }
      
       //jButton1.doClick(1000);
    }

    public static String aprobar = "";
    public static int aprobo = 0;

    int contador = 1;

    void inhabilitar() {
        this.jCMaterias.removeAllItems();
        jCNotas.setSelectedIndex(-1);
        jCNotas.setEnabled(true);
        jCMaterias.setEnabled(false);
    }

    void habilitar() {
        jCNotas.setEnabled(true);
        jCMaterias.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNotas1 = new javax.swing.JLabel();
        jLabelnotas_estudiantes = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLIdEstudiante = new javax.swing.JLabel();
        jLCiclo = new javax.swing.JLabel();
        jLAnio = new javax.swing.JLabel();
        jLSemestre = new javax.swing.JLabel();
        jButtonAgregar2 = new javax.swing.JButton();
        jButtonEditar2 = new javax.swing.JButton();
        jchange = new javax.swing.JLabel();
        jCMaterias = new javax.swing.JComboBox<>();
        jLJornada = new javax.swing.JLabel();
        jCNotas = new javax.swing.JComboBox<>();
        jLabelNotas = new javax.swing.JLabel();
        jBNext = new javax.swing.JButton();
        jTNotas = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLnombre1 = new javax.swing.JLabel();
        jLaMateria1 = new javax.swing.JLabel();
        jLaMateria2 = new javax.swing.JLabel();
        jLaMateria3 = new javax.swing.JLabel();
        jLaMateria4 = new javax.swing.JLabel();
        jLaMateria5 = new javax.swing.JLabel();
        jLaMateria6 = new javax.swing.JLabel();
        jLabelFondoActualizar = new javax.swing.JLabel();
        JTciclo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNotas1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNotas1.setText("MATERIA:");
        getContentPane().add(jLabelNotas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabelnotas_estudiantes.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabelnotas_estudiantes.setForeground(new java.awt.Color(0, 102, 153));
        jLabelnotas_estudiantes.setText("REGISTRO DE NOTAS ");
        getContentPane().add(jLabelnotas_estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLnombre.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 20, 40));

        jLIdEstudiante.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLIdEstudiante.setText("CODIGO");
        getContentPane().add(jLIdEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 25));

        jLCiclo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLCiclo.setText("CICLO:");
        getContentPane().add(jLCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLAnio.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLAnio.setText("AÑO:");
        getContentPane().add(jLAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLSemestre.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLSemestre.setText("SEMESTRE");
        getContentPane().add(jLSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jButtonAgregar2.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAgregar2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar2.setText("AGREGAR");
        jButtonAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        jButtonEditar2.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEditar2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonEditar2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar2.setText("Volver");
        jButtonEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, -1));

        jchange.setToolTipText("El nombre de la materia cambiara automaticamente luego de seleccionar una nota");
        jchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jchangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jchangeMouseExited(evt);
            }
        });
        getContentPane().add(jchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 224, 100, 10));

        jCMaterias.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jCMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATERIAS" }));
        jCMaterias.setToolTipText("El nombre de la materia cambiara automaticamente luego de seleccionar una nota");
        jCMaterias.setAutoscrolls(true);
        jCMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCMateriasMousePressed(evt);
            }
        });
        jCMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(jCMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 180, 25));

        jLJornada.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLJornada.setText("JORNADA:");
        getContentPane().add(jLJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jCNotas.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jCNotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Basico", "Alto", "Superior" }));
        getContentPane().add(jCNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 110, 25));

        jLabelNotas.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNotas.setText("NOTA:");
        getContentPane().add(jLabelNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jBNext.setBackground(new java.awt.Color(0, 0, 0));
        jBNext.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jBNext.setForeground(new java.awt.Color(255, 255, 255));
        jBNext.setText("Continuar");
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        getContentPane().add(jBNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 88, 30));

        jTNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkbox-30.png"))); // NOI18N
        jTNotas.setBorderPainted(false);
        jTNotas.setContentAreaFilled(false);
        jTNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNotasActionPerformed(evt);
            }
        });
        getContentPane().add(jTNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 193, 40, 40));

        jButton1.setText("Materias");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton1MouseDragged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jLnombre1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLnombre1.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(jLnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 55, 290, 29));

        jLaMateria1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLaMateria1.setText("Materia 1");
        getContentPane().add(jLaMateria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        jLaMateria2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLaMateria2.setText("Materia 2");
        getContentPane().add(jLaMateria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 160, 30));

        jLaMateria3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLaMateria3.setText("Materia 3");
        getContentPane().add(jLaMateria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 160, 30));

        jLaMateria4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLaMateria4.setText("Materia 4");
        getContentPane().add(jLaMateria4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 30));

        jLaMateria5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLaMateria5.setText("Materia 5");
        getContentPane().add(jLaMateria5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 160, 30));

        jLaMateria6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLaMateria6.setText("Materia 6");
        getContentPane().add(jLaMateria6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 160, 30));

        jLabelFondoActualizar.setForeground(new java.awt.Color(0, 102, 0));
        jLabelFondoActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabelFondoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
        getContentPane().add(JTciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 10, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar2ActionPerformed

        habilitar();
        aNotas dts = new aNotas();
        Fnotas fun = new Fnotas();
        Conexion cn = new Conexion();
        String sSQL = "Select * from Materias where IdNivelCiclos = ?";
        try {

            String ciclo = JTciclo.getText();

            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);

            {
            }

            pst.setString(1, ciclo);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                this.jCMaterias.addItem(rs.getString("NomMateria"));

            }

        } catch (Exception er) {
            System.out.println("" + er);

        }

        jCMaterias.setSelectedItem(0);
    }//GEN-LAST:event_jButtonAgregar2ActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed

        aNotas dts = new aNotas();
        Fnotas func = new Fnotas();
        Conexion cn = new Conexion();

        String sSQL = "Select * from NotaEstudiantes where IdEstudiante = ?";
        try {

            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, Formestu.idestudiante);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                dts.setIdMaterias(rs.getInt("IdMateria"));
                dts.setMaterias(rs.getString("Materia"));
                dts.setNotaFinal(rs.getString("NotaFinal"));

                if (rs.getString("NotaFinal").trim().equals("Bajo")) {
                    aprobo = +1;
                }
            }

            if (aprobo == 0) {
                aprobar = "Aprobado";
            } else {
                aprobar = "No aprobado";
            }
        } catch (Exception er) {
            System.out.println("" + er);
        }

        Formcertifi form = null;
        try {
            form = new Formcertifi();
        } catch (Exception ex) {
            Logger.getLogger(FormOldnotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Escritorio.add(form);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = form.getSize();
        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form.show();
        this.setVisible(false);
        

    }//GEN-LAST:event_jBNextActionPerformed

    private void jTNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNotasActionPerformed

        aNotas dts = new aNotas();
        Fnotas fun = new Fnotas();
        Conexion cn = new Conexion();

        if (jCNotas.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "seleccione una nota para la materia");
            jCNotas.requestFocus();
            return;
        }
        jCMaterias.setEnabled(true);

        dts.setIdEstudiante(Integer.parseInt(Formestu.idestudiante));
        String ciclo = JTciclo.getText();

        if (ciclo.equals("1")) {
            dts.setIdMaterias(jCMaterias.getSelectedIndex() + 1);
        } else {
            dts.setIdMaterias(jCMaterias.getSelectedIndex() + 7);
        }

        dts.setMaterias(jCMaterias.getSelectedItem().toString());
        dts.setNotaFinal(jCNotas.getSelectedItem().toString());
        dts.setIdMatricula(Formmtric.IdMatricula);

        if (fun.insertar(dts)) {
            JOptionPane.showMessageDialog(null, "Nota de " + jCMaterias.getSelectedItem() + " registrada con exito");

            if (contador > 5) {
                JOptionPane.showMessageDialog(null, "Se han registrado las notas con exito");
                jCNotas.setSelectedIndex(-1);
                jCMaterias.setSelectedIndex(-1);
                jCNotas.setEnabled(false);
                return;

            }
            jCMaterias.setSelectedIndex(contador++);

            jCNotas.setSelectedIndex(-1);

        }
    }//GEN-LAST:event_jTNotasActionPerformed

    private void jCMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCMateriasActionPerformed

    private void jCMateriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCMateriasMousePressed
        jCMaterias.setEnabled(false);
    }//GEN-LAST:event_jCMateriasMousePressed

    private void jchangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jchangeMouseEntered
        jCMaterias.setEnabled(false);
    }//GEN-LAST:event_jchangeMouseEntered

    private void jchangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jchangeMouseExited
        jCMaterias.setEnabled(true);
    }//GEN-LAST:event_jchangeMouseExited

    private void jButtonEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar2ActionPerformed
        Formmtric form = new Formmtric();
        Escritorio.add(form);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = form.getSize();
        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form.show();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Fnotas dts = new Fnotas();
       
        if (Formmtric.cicl.equals("Basico")) {
            jLaMateria1.setText("Matematicas");
            jLaMateria2.setText("Ciencias Sociales");
            jLaMateria3.setText("Ciencias Naturales");
            jLaMateria4.setText("Español");
            jLaMateria5.setText("Ingles");
            jLaMateria6.setText("Artes");
            System.out.println("este " + Formmtric.cicl);
        } else {

            jLaMateria1.setText("Matematicas II");
            jLaMateria2.setText("Ciencias Sociales II");
            jLaMateria3.setText("Ciencias Naturales II");
            jLaMateria4.setText("Español II");
            jLaMateria5.setText("Ingles II");
            jLaMateria6.setText("Desarrollo Personal");
            System.out.println("este " + Formmtric.cicl);
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseDragged

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
            java.util.logging.Logger.getLogger(FormOldnotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOldnotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOldnotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOldnotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormOldnotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField JTciclo;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregar2;
    private javax.swing.JButton jButtonEditar2;
    public static javax.swing.JComboBox<String> jCMaterias;
    private javax.swing.JComboBox<String> jCNotas;
    public static javax.swing.JLabel jLAnio;
    public static javax.swing.JLabel jLCiclo;
    public static javax.swing.JLabel jLIdEstudiante;
    public static javax.swing.JLabel jLJornada;
    public static javax.swing.JLabel jLSemestre;
    public static javax.swing.JLabel jLaMateria1;
    public static javax.swing.JLabel jLaMateria2;
    public static javax.swing.JLabel jLaMateria3;
    public static javax.swing.JLabel jLaMateria4;
    public static javax.swing.JLabel jLaMateria5;
    public static javax.swing.JLabel jLaMateria6;
    private javax.swing.JLabel jLabelFondoActualizar;
    private javax.swing.JLabel jLabelNotas;
    private javax.swing.JLabel jLabelNotas1;
    private javax.swing.JLabel jLabelnotas_estudiantes;
    public static javax.swing.JLabel jLnombre;
    public static javax.swing.JLabel jLnombre1;
    private javax.swing.JToggleButton jTNotas;
    private javax.swing.JLabel jchange;
    // End of variables declaration//GEN-END:variables
}
