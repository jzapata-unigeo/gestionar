/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Funciones.Conexion;
import Funciones.Encryp;
import Funciones.aEstudiante;
import Funciones.fEstudiante;
import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static ventanas.FrmInicio.Escritorio;
import static ventanas.FrmInicio.dupl;
import static ventanas.Consultas.numdoc;

/**
 *
 * @author jeison.zapata
 */
public final class Formestu extends javax.swing.JInternalFrame {

    /**
     * Creates new form formularioregistro
     */
    public Formestu() {
        
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setSize(772, 472);
        this.setResizable(false);
        inhabilitar();
        jBNext.setEnabled(false);
        usuarioedit();
        
        try {
            if (!numdoc.equals("")) {
                jTextFieldCodigo.setText(numdoc);
                jButtonBuscar.setEnabled(true);
                jButtonBuscar.doClick();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    private String accion = "guardar";
    public static String idestudiante = "";
    public static String nombre = "";
    public static String apellido = "";
    aEstudiante dts = new aEstudiante();
    fEstudiante func = new fEstudiante();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    
    void inhabilitar() {

        //inhabilitar botones 
        jButtonNuevo.setEnabled(true);
        jButtonEditar3.setEnabled(false);
        jBNext.setEnabled(false);
        JbBuscar.setEnabled(true);
        btnagregar.setEnabled(false);
        jButtonBuscar.setEnabled(false);

        // cajas de texto y otros componentes 
        jTextFieldApellidos.setEnabled(false);
        jTextFieldCiudad.setEnabled(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDireccion.setEnabled(false);
        jTextFieldMail.setEnabled(false);
        jTextFieldNombres.setEnabled(false);
        jTextFieldTelefono.setEnabled(false);
        Numero.setEnabled(false);
        
        hombre.setEnabled(false);
        mujer.setEnabled(false);
        
        dia.setEnabled(false);
        mes.setEnabled(false);
        anio.setEnabled(false);
        jCdoc.setEnabled(false);
    }
    
    void Limpiar() {
        // limpiar cajas de texto 
        jTextFieldApellidos.setText("");
        jTextFieldCiudad.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldMail.setText("");
        jTextFieldNombres.setText("");
        jTextFieldTelefono.setText("");
        Numero.setText("");
        dia.setValue(1);
        mes.setValue(1);
        anio.setValue(1950);
        jCdoc.setSelectedIndex(-1);
        Sexo.clearSelection();
        
    }
    
    void habilitar() {
        //inhabilitar botones 

        jButtonEditar3.setEnabled(false);
        jBNext.setEnabled(false);
        JbBuscar.setEnabled(true);
        btnagregar.setEnabled(true);
        jButtonNuevo.setEnabled(true);
        jButtonBuscar.setEnabled(false);
        Numero.setEnabled(true);

        // cajas de texto y otrs componentes 
        jTextFieldApellidos.setEnabled(true);
        jTextFieldCiudad.setEnabled(true);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDireccion.setEnabled(true);
        jTextFieldMail.setEnabled(true);
        jTextFieldNombres.setEnabled(true);
        jTextFieldTelefono.setEnabled(true);
        
        hombre.setEnabled(true);
        mujer.setEnabled(true);
        
        dia.setEnabled(true);
        mes.setEnabled(true);
        anio.setEnabled(true);
        jCdoc.setEnabled(true);

        // limpiar cajas de texto 
        jTextFieldApellidos.setText("");
        jTextFieldCiudad.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldMail.setText("");
        jTextFieldNombres.setText("");
        jTextFieldTelefono.setText("");
        Numero.setText("");
        
    }
    
    void habilitarb() {
        //inhabilitar botones 
        jButtonNuevo.setEnabled(true);
        jButtonEditar3.setEnabled(true);
        jBNext.setEnabled(true);
        JbBuscar.setEnabled(true);
        btnagregar.setEnabled(false);
        jButtonBuscar.setEnabled(true);
        Numero.setEnabled(true);

        // cajas de texto y otros componentes 
        jTextFieldApellidos.setEnabled(false);
        jTextFieldCiudad.setEnabled(true);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDireccion.setEnabled(true);
        jTextFieldMail.setEnabled(true);
        jTextFieldNombres.setEnabled(true);
        jTextFieldTelefono.setEnabled(true);
        hombre.setEnabled(false);
        mujer.setEnabled(false);
        dia.setEnabled(false);
        mes.setEnabled(false);
        anio.setEnabled(false);
        jCdoc.setEnabled(false);
        jTextFieldNombres.setEnabled(false);
        Numero.setEnabled(false);
        
    }
    
    void usuarioedit() {
        if (jTextFieldCodigo.getText().equals("")) {
            jButtonBuscar.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "ok");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        jLabelTriangulo = new javax.swing.JLabel();
        jLabelRegistro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelId_estudiante = new javax.swing.JLabel();
        jCdoc = new javax.swing.JComboBox<>();
        Numero = new javax.swing.JTextField();
        jLabelNombres = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelMail = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        JbBuscar = new javax.swing.JButton();
        jButtonEditar3 = new javax.swing.JButton();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLsexo = new javax.swing.JLabel();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        anio = new javax.swing.JSpinner();
        mes = new javax.swing.JSpinner();
        dia = new javax.swing.JSpinner();
        jLanio = new javax.swing.JLabel();
        jLmes = new javax.swing.JLabel();
        jLdia = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBNext = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 15, 15)));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/TrianTrans.png"));
        Image conversion = imagen.getImage();
        Image tamanio = conversion.getScaledInstance(210, 100, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(tamanio);
        jLabelTriangulo.setIcon(icon);
        jLabelTriangulo.setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().add(jLabelTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, 120));

        jLabelRegistro.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(0, 102, 153));
        jLabelRegistro.setText("DATOS DEL ESTUDIANTE");
        getContentPane().add(jLabelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 360, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/isearch.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jButtonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 22, 22));

        jLabelCodigo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCodigo.setText("NÚMERO DE DOCUMENTO:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextFieldCodigo.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldCodigo.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextFieldCodigo.setCaretColor(new java.awt.Color(0, 102, 153));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, 22));

        jLabelId_estudiante.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelId_estudiante.setForeground(new java.awt.Color(51, 51, 51));
        jLabelId_estudiante.setText("Documento:");
        getContentPane().add(jLabelId_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jCdoc.setBackground(new java.awt.Color(102, 204, 255));
        jCdoc.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        jCdoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "T.I" }));
        jCdoc.setAutoscrolls(true);
        jCdoc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)));
        jCdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCdocActionPerformed(evt);
            }
        });
        getContentPane().add(jCdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 50, 25));

        Numero.setBackground(new java.awt.Color(254, 252, 250));
        Numero.setToolTipText("");
        Numero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroActionPerformed(evt);
            }
        });
        Numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroKeyTyped(evt);
            }
        });
        getContentPane().add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 190, 25));

        jLabelNombres.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres.setText("Nombres:");
        getContentPane().add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jTextFieldNombres.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, 22));

        jLabelApellidos.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(51, 51, 51));
        jLabelApellidos.setText("Apellido:");
        getContentPane().add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jTextFieldApellidos.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 190, 22));

        jLabelDireccion.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDireccion.setText("Direccion:");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jTextFieldDireccion.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 190, 22));

        jLabelMail.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelMail.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMail.setText("Correo Electronico:");
        getContentPane().add(jLabelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jTextFieldMail.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldMail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextFieldMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMailKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 190, 22));

        jLabelCiudad.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelCiudad.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCiudad.setText("Ciudad:");
        getContentPane().add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jTextFieldCiudad.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldCiudad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 190, 22));

        btnagregar.setBackground(new java.awt.Color(0, 0, 0));
        btnagregar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 88, 30));

        JbBuscar.setBackground(new java.awt.Color(0, 0, 0));
        JbBuscar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        JbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JbBuscar.setText("Buscar");
        JbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(JbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 88, 30));

        jButtonEditar3.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEditar3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonEditar3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar3.setText("Editar");
        jButtonEditar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditar3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 88, 30));

        jLabelTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTelefono.setText("Telefono;");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 60, 20));

        jTextFieldTelefono.setBackground(new java.awt.Color(254, 252, 250));
        jTextFieldTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 190, 20));

        jPanel2.setBackground(new java.awt.Color(254, 252, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)));
        jPanel2.setLayout(null);

        jLsexo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLsexo.setText("SEXO:");
        jPanel2.add(jLsexo);
        jLsexo.setBounds(10, 10, 34, 22);

        Sexo.add(hombre);
        hombre.setText("Hombre");
        jPanel2.add(hombre);
        hombre.setBounds(70, 10, 80, 20);

        Sexo.add(mujer);
        mujer.setText("Mujer");
        mujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujerActionPerformed(evt);
            }
        });
        jPanel2.add(mujer);
        mujer.setBounds(150, 10, 73, 20);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 260, 40));

        jPanel3.setBackground(new java.awt.Color(254, 252, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anio.setModel(new javax.swing.SpinnerNumberModel());
        anio.setEditor(new javax.swing.JSpinner.NumberEditor(anio, ""));
        jPanel3.add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 67, 70, -1));

        mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        mes.setEditor(new javax.swing.JSpinner.NumberEditor(mes, ""));
        jPanel3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 67, -1, -1));

        dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        dia.setEditor(new javax.swing.JSpinner.NumberEditor(dia, ""));
        jPanel3.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 67, -1, -1));

        jLanio.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLanio.setText("Año");
        jPanel3.add(jLanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 30, -1));

        jLmes.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLmes.setText("Mes");
        jPanel3.add(jLmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, -1));

        jLdia.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLdia.setText("Dia");
        jPanel3.add(jLdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, -1));

        jLfecha.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLfecha.setText("FECHA DE NACIMIENTO:");
        jPanel3.add(jLfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 260, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GestionarT_D80.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 90, 50));

        jBNext.setBackground(new java.awt.Color(0, 0, 0));
        jBNext.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jBNext.setForeground(new java.awt.Color(255, 255, 255));
        jBNext.setText("Continuar");
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        getContentPane().add(jBNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 88, 30));

        jButtonNuevo.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNuevo.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 88, 30));

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closei.png"))); // NOI18N
        jBsalir.setBorder(null);
        jBsalir.setBorderPainted(false);
        jBsalir.setContentAreaFilled(false);
        jBsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 6, 30, 20));

        jLabelFondo.setBackground(new java.awt.Color(254, 252, 250));
        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abstracto-azul.jpg"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 10, 5, new javax.swing.ImageIcon(getClass().getResource("/imagenes/blakw.png")))); // NOI18N
        jLabelFondo.setDoubleBuffered(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbBuscarActionPerformed
        
        inhabilitar();
        jButtonBuscar.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        JbBuscar.setEnabled(false);
        jTextFieldCodigo.requestFocus();
        Limpiar();
    }//GEN-LAST:event_JbBuscarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        Encryp pass = new Encryp();//Instanciamos un obgeto para la encripcion de la clave
        //Validacion de campos
        if (jCdoc.getSelectedItem() == "null") {
            JOptionPane.showMessageDialog(rootPane, " Debe ingresar el tipo de documento del estudiante");
            jCdoc.requestFocus();
            return;
        }
        
        if (Numero.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, " Debe ingresar un numero de documento");
            Numero.requestFocus();
            return;
        }
        
        if (func.validastr(Numero.getText())) {
            JOptionPane.showMessageDialog(rootPane, " El  número de documento no puede contener letras");
            Numero.requestFocus();
            return;
        }
        
        if (jTextFieldNombres.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, " debe ingresar el nombre del estudiante");
            jTextFieldNombres.requestFocus();
            return;
        }
        
        if (func.validanum(jTextFieldNombres.getText())) {
            JOptionPane.showMessageDialog(rootPane, " El  Nombre del estudiante no debe contener números");
            jTextFieldNombres.requestFocus();
            return;
        }
        
        if (jTextFieldApellidos.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, " Debe ingresar el apellido del estudiante");
            jTextFieldApellidos.requestFocus();
            return;
        }
        if (func.validanum(jTextFieldApellidos.getText())) {
            JOptionPane.showMessageDialog(rootPane, " El Apellido del estudiante no debe contener números");
            jTextFieldApellidos.requestFocus();
            return;
        }
        
        if (func.validamail(jTextFieldMail.getText())) {
            JOptionPane.showMessageDialog(rootPane, " Se debe registrar un correo válido");
            jTextFieldMail.requestFocus();
            return;
        }
        
        if (!hombre.isSelected() && !mujer.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, " Debe ingresar el sexo del estudiante");
            hombre.requestFocus();
            return;
        }
        
        try {
// capturar los datos 
            dts.setNumDocumento(Numero.getText());
            dts.setNomEstudiante(jTextFieldNombres.getText());
            dts.setApllEstudiante(jTextFieldApellidos.getText());
            dts.setEmail(jTextFieldMail.getText());
            dts.setTelefono(jTextFieldTelefono.getText());
            dts.setDireccion(jTextFieldDireccion.getText());
            dts.setCiudad(jTextFieldCiudad.getText());
            dts.setPassword(pass.encrypt("92AE31A79FEEB2A3", "0123456789ABCDEF", dts.getNumDocumento()));
            dts.setPassven(formatter.format(func.fecven(func.fecha())));
        } catch (Exception ex) {
            Logger.getLogger(Formestu.class.getName()).log(Level.SEVERE, null, ex);
        }

        //combobox
        String doc = jCdoc.getSelectedItem().toString();
        
        if (doc.equals("C.C")) {
            dts.setIdDocumento("1");
            
        } else if (doc.equals("T.I")) {
            
            dts.setIdDocumento("2");
        }

        //Jspinner fecha
        dts.setFecNacimiento(dts.getfecha(dia.getValue().toString(), mes.getValue().toString(), anio.getValue().toString()));

        //radiobutton
        if (hombre.isSelected()) {
            dts.setSexo("hombre");
            
        } else if (mujer.isSelected()) {
            dts.setSexo("mujer");
        }
        
        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "estudiante creado con exito");
                inhabilitar();
                jBNext.setEnabled(true);
            }
            
        }
        Conexion cn = new Conexion();
        
        String sSQL = "Select IdEstudiante from Estudiantes where NumDocumento = ?";
        
        try {
            
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, Numero.getText());
            ResultSet rs = pst.executeQuery();
            
        } catch (Exception er) {
            System.out.println("" + er);
        }
    }//GEN-LAST:event_btnagregarActionPerformed
    

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        
        habilitar();
        Limpiar();
        btnagregar.setText("guardar");
        accion = "guardar";

    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEditar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditar3ActionPerformed
        
        aEstudiante dts = new aEstudiante();
        aEstudiante dtos = new aEstudiante();
        fEstudiante func = new fEstudiante();
        Conexion cn = new Conexion();
        
        String em = "";
        String t = "";
        String d = "";
        String c = "";
        
        String sSQL = "Select * from Estudiantes where IdEstudiante = ?";
        try {
            
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, jTextFieldCodigo.getText());
            ResultSet rs = pst.executeQuery();

            /*Leemos los campo de la tabla estudiantes en la base de datos lo agregamos a un obgeto de la clase aEstudiante
            leemos los datos del formulario y los comparamos para idendificar si se realizaron cambios*/
            if (rs.next()) {
                dtos.setIdEstudiante(rs.getInt("IdEstudiante"));
                dtos.setIdDocumento(rs.getString("IdDocumento").trim());
                dtos.setNumDocumento(rs.getString("NumDocumento").trim());
                dtos.setEmail(rs.getString("Email").trim());
                dtos.setTelefono(rs.getString("Telefono").trim());
                dtos.setDireccion(rs.getString("Direccion").trim());
                dtos.setCiudad(rs.getString("Ciudad").trim());
                
                dts.setNumDocumento(Numero.getText());
                dts.setEmail(jTextFieldMail.getText());
                dts.setTelefono(jTextFieldTelefono.getText());
                dts.setDireccion(jTextFieldDireccion.getText());
                dts.setCiudad(jTextFieldCiudad.getText());
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
            }
            
        } catch (Exception er) {
            System.out.println("" + er);
        }

        /*actualiza email*/
        if (!dts.getEmail().equals(dtos.getEmail())) {
            
            dts.setEmail(jTextFieldMail.getText());
            dts.setIdEstudiante(Integer.parseInt(jTextFieldCodigo.getText()));
            
            if (accion.equals("guardar")) {
                if (func.editarEmail(dts)) {
                    em = " . Correo";
                    boolean m = true;
                }
            }
        } else {
            em = "";
            
        }

        /*Actualiza telefono*/
        if (!dts.getTelefono().equals(dtos.getTelefono())) {
            
            dts.setTelefono(jTextFieldTelefono.getText());
            dts.setIdEstudiante(Integer.parseInt(jTextFieldCodigo.getText()));
            
            if (accion.equals("guardar")) {
                if (func.editartelefono(dts)) {
                    t = " . Telefono";
                    boolean n = true;
                }
            }
        } else {
            t = "";
            
        }

        /*Actualiza Direccion*/
        if (!dts.getDireccion().equals(dtos.getDireccion())) {
            
            dts.setDireccion(jTextFieldDireccion.getText());
            dts.setIdEstudiante(Integer.parseInt(jTextFieldCodigo.getText()));
            
            if (accion.equals("guardar")) {
                if (func.editarDireccion(dts)) {
                    d = " . Direccion";
                    boolean o = true;
                }
            }
        } else {
            d = "";
            
        }

        /*Actualiza Ciudad*/
        if (!dts.getCiudad().equals(dtos.getCiudad())) {
            
            dts.setDireccion(jTextFieldCiudad.getText());
            dts.setIdEstudiante(Integer.parseInt(jTextFieldCodigo.getText()));
            
            if (accion.equals("guardar")) {
                if (func.editarCiudad(dts)) {
                    c = " . Ciudad";
                    boolean p = true;
                }
            }
        } else {
            c = "";
            
        }
        
        if (em.isEmpty() && t.isEmpty() && d.isEmpty() && c.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se realizaron cambios");
            
        } else {
            JOptionPane.showMessageDialog(null, "Se realizaron cambios en:" + em + t + d + c + " correctamente");
        }
        

    }//GEN-LAST:event_jButtonEditar3ActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void mujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mujerActionPerformed

    private void jCdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCdocActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if (jTextFieldCodigo.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el codigo del estudiante para realizar la consulta");
            jTextFieldCodigo.requestFocus();
            return;
        }
        aEstudiante dts = new aEstudiante();
        Conexion cn = new Conexion();
        String sSQL = "Select * from Estudiantes where NumDocumento = ?";
        try {
            
            habilitarb();
            
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, jTextFieldCodigo.getText());
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                jTextFieldNombres.setText(rs.getString("NomEstudiante").trim());
                Numero.setText(rs.getString("NumDocumento").trim());
                jTextFieldApellidos.setText(rs.getString("ApllEstudiante").trim());
                
                if (rs.getString("Sexo").trim().equals("hombre")) {
                    hombre.setSelected(true);
                } else if (rs.getString("Sexo").trim().equals("mujer")) {
                    mujer.setSelected(true);
                }
                
                if (rs.getString("IdDocumento").trim().equals("1")) {
                    jCdoc.setSelectedIndex(0);
                } else if (rs.getString("IdDocumento").trim().equals("2")) {
                    jCdoc.setSelectedIndex(1);
                }
                
                jTextFieldMail.setText(rs.getString("Email").trim());
                jTextFieldTelefono.setText(rs.getString("Telefono").trim());
                jTextFieldDireccion.setText(rs.getString("Direccion").trim());
                jTextFieldCiudad.setText(rs.getString("Ciudad").trim());
                String fec = (rs.getString("FecNacimiento").trim());
                dts.setIdEstudiante(rs.getInt("IdEstudiante"));
                int a = (Integer.parseInt(fec.substring(0, 4)));
                int m = (Integer.parseInt(fec.substring(5, 7)));
                int d = (Integer.parseInt(fec.substring(8, 10)));
                
                dia.setValue(d);
                mes.setValue(m);
                anio.setValue(a);
                
                String guardar = Integer.toString(dts.getIdEstudiante());
                jTextFieldCodigo.setText("");
                lblCodigo.setText(guardar);
                aEstudiante objDatos = new aEstudiante();
                objDatos.setNomEstudiante(rs.getString("NomEstudiante").trim());
                objDatos.setApllEstudiante(rs.getString("ApllEstudiante").trim());
                objDatos.setEmail(rs.getString("Email").trim());
                jBNext.setEnabled(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el usuario");
                inhabilitar();
            }
            
        } catch (Exception er) {
            System.out.println("error en buscar " + er);
        }
        

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        
        Formmtric form = new Formmtric();
        Escritorio.add(form);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = form.getSize();
        form.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        form.show();
        this.setVisible(false);
        idestudiante = lblCodigo.getText();
        nombre = jTextFieldNombres.getText();
        apellido = jTextFieldApellidos.getText();
        Formmtric.jLnombre.setText(nombre + " " + apellido);
        Formmtric.jLIdEstudiant.setText("CODIGO: " + idestudiante);
        Formmtric.JIdestudiante.setText(idestudiante);

    }//GEN-LAST:event_jBNextActionPerformed

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jButtonBuscar.doClick();
        }
        

    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

    private void jButtonBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonBuscarKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jBNext.requestFocus();
            jBNext.doClick();
        }
    }//GEN-LAST:event_jButtonBuscarKeyTyped

    private void jTextFieldMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMailKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jBNext.doClick();
        }
    }//GEN-LAST:event_jTextFieldMailKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jBNext.doClick();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jBNext.doClick();
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jBNext.doClick();
        }
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    private void NumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroKeyTyped
        char x;
        x = evt.getKeyChar();
        if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != java.awt.event.KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_NumeroKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        dupl = 1;
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        dupl = 0;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        this.dispose();
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
            java.util.logging.Logger.getLogger(Formestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formestu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Formestu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbBuscar;
    private javax.swing.JTextField Numero;
    public static javax.swing.ButtonGroup Sexo;
    private javax.swing.JSpinner anio;
    private javax.swing.JButton btnagregar;
    private javax.swing.JSpinner dia;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar3;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox<String> jCdoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelId_estudiante;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTriangulo;
    private javax.swing.JLabel jLanio;
    private javax.swing.JLabel jLdia;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLmes;
    private javax.swing.JLabel jLsexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCiudad;
    public static javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldTelefono;
    public static javax.swing.JTextField lblCodigo;
    private javax.swing.JSpinner mes;
    private javax.swing.JRadioButton mujer;
    // End of variables declaration//GEN-END:variables

}
