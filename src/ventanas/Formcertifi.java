/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Funciones.tmodcert;
import Funciones.aCertificados;
import Funciones.fCertificados;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalex
 */
public class Formcertifi extends javax.swing.JInternalFrame {

    /**
     * Creates new form formularioempleado
     */
    public Formcertifi() throws Exception {
        initComponents();
        cargaNotas();
        jTIdestudiante.setText(Formestu.idestudiante);
        jTNombre.setText(Formestu.nombre);
        jTanio.setText(Formmtric.anio);
        jTCiclo.setText(Formmtric.cicl);
        jTJornada.setText(Formmtric.jornada);
        jTSemestre.setText(Formmtric.semes);
        jTaprobo.setText(Formnotas.aprobar);
         
         }
    public void cargaNotas() throws Exception{
        fCertificados dts = new fCertificados();
        List<aCertificados> listasCertificados = dts.buscarNotas(new aCertificados(),Formestu.idestudiante);
        tmodcert objModelo = new tmodcert(listasCertificados);
        jtblNotas.setModel(objModelo);
        
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
        jLbltil1 = new javax.swing.JLabel();
        jLbltil2 = new javax.swing.JLabel();
        jLbltil3 = new javax.swing.JLabel();
        jLbltil4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLlIdEstudiante = new javax.swing.JLabel();
        jTIdestudiante = new javax.swing.JLabel();
        jLCiclo = new javax.swing.JLabel();
        jTCiclo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLAnio = new javax.swing.JLabel();
        jLSemestre = new javax.swing.JLabel();
        jTsemestre = new javax.swing.JLabel();
        jTanio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTaprobo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JLabel();
        jLabelJornada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblNotas = new javax.swing.JTable();
        jButtonAgregar4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTJornada = new javax.swing.JLabel();
        jTSemestre = new javax.swing.JLabel();
        jLabelfondo1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelConsultoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Triangulo200.png"))); // NOI18N
        getContentPane().add(jLabelConsultoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 70));

        jLbltil1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLbltil1.setText("REPUBLICA DE COLOMBIA");
        getContentPane().add(jLbltil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 230, 20));

        jLbltil2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLbltil2.setText("INSTITUCION EDUCATIVA TRIANGULO DEL SABER");
        getContentPane().add(jLbltil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 410, 20));

        jLbltil3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLbltil3.setText("MINISTERIO DE EDUCACION NACIONAL");
        getContentPane().add(jLbltil3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 330, 20));

        jLbltil4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbltil4.setText("SEDE CENTRAL : Carrera 122 # 22 - 55  BOGOTA - COLOMBIA   TELEFONOS: 42454541 -  4344512  NIT: 845125694-4");
        getContentPane().add(jLbltil4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 700, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 104, 710, 20));

        jLlIdEstudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLlIdEstudiante.setText(", curso en esta institucion el ciclo");
        getContentPane().add(jLlIdEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 190, 20));

        jTIdestudiante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTIdestudiante.setForeground(new java.awt.Color(0, 0, 102));
        jTIdestudiante.setText("cod");
        getContentPane().add(jTIdestudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 30, 20));

        jLCiclo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLCiclo.setText("con el plan de estudios del PROYECTO EDUCATIVO INSTITUCIONAL, ");
        getContentPane().add(jLCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, 20));

        jTCiclo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTCiclo.setForeground(new java.awt.Color(0, 0, 102));
        jTCiclo.setText("Ciclo");
        getContentPane().add(jTCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Que,");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, 20));

        jLAnio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLAnio.setText("durante el año lectivo ");
        getContentPane().add(jLAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, 20));

        jLSemestre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLSemestre.setText("del semestre");
        getContentPane().add(jLSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, 20));

        jTsemestre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTsemestre.setText("de conformidad");
        getContentPane().add(jTsemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 120, 20));

        jTanio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTanio.setForeground(new java.awt.Color(0, 0, 102));
        jTanio.setText("0000");
        getContentPane().add(jTanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 40, 20));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        jLabel1.setText("CERTIFICA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, 40));

        jTaprobo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTaprobo.setForeground(new java.awt.Color(0, 0, 102));
        jTaprobo.setText("Aprobado");
        getContentPane().add(jTaprobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 130, 20));

        jLNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLNombre.setText(", Identificado(a) con ");
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 20));

        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(0, 0, 102));
        jTNombre.setText("Nombre");
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 140, 20));

        jLabelJornada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelJornada.setText("en la jornada");
        getContentPane().add(jLabelJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 20));

        jtblNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materia", "Calificacion"
            }
        ));
        jtblNotas.setRowHeight(20);
        jScrollPane1.setViewportView(jtblNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 510, 180));

        jButtonAgregar4.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAgregar4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonAgregar4.setText("AGREGAR");
        getContentPane().add(jButtonAgregar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, 90, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("EL RECTOR DE LA INSTITUCION EDUCATIVA TRIANGULO DEL SABER de la ciudad BOGOTA,con \nresolución integración N. 1211 de octubre de 2002  y resolución de aprobación N.03955 \ndel 17 de septiembre de 2012 y decreto 3011 del 19 de Diciembre de 1997\nemanada de la secretaria de educacion y  cultura de Bogota.");
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 740, 100));

        jTJornada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTJornada.setForeground(new java.awt.Color(0, 0, 102));
        jTJornada.setText("Jornada");
        getContentPane().add(jTJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 70, 20));

        jTSemestre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTSemestre.setForeground(new java.awt.Color(0, 0, 102));
        jTSemestre.setText("Semestre");
        getContentPane().add(jTSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 150, 20));

        jLabelfondo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelfondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maxresdefault.jpg"))); // NOI18N
        jLabelfondo1.setText("jLabel1");
        getContentPane().add(jLabelfondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
 FrmInicio.dupl = 0;
    }//GEN-LAST:event_formInternalFrameClosing

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
            java.util.logging.Logger.getLogger(Formcertifi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formcertifi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formcertifi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formcertifi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Formcertifi().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Formcertifi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar4;
    private javax.swing.JLabel jLAnio;
    private javax.swing.JLabel jLCiclo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelConsultoria;
    private javax.swing.JLabel jLabelJornada;
    private javax.swing.JLabel jLabelfondo1;
    private javax.swing.JLabel jLbltil1;
    private javax.swing.JLabel jLbltil2;
    private javax.swing.JLabel jLbltil3;
    private javax.swing.JLabel jLbltil4;
    private javax.swing.JLabel jLlIdEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTCiclo;
    private javax.swing.JLabel jTIdestudiante;
    private javax.swing.JLabel jTJornada;
    private javax.swing.JLabel jTNombre;
    private javax.swing.JLabel jTSemestre;
    private javax.swing.JLabel jTanio;
    private javax.swing.JLabel jTaprobo;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jTsemestre;
    private javax.swing.JTable jtblNotas;
    // End of variables declaration//GEN-END:variables

    private void inhabilitar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}