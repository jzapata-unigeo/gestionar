/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jalex
 */
public class fEstudiante {

    private Conexion cn = new Conexion();
    aEstudiante dts = new aEstudiante();
    
    private String sSQL = "";
    private String validanum = "";
    private String validastr = "";
    private String validamail = "";

    // metodo de insertar 
    public boolean insertar(aEstudiante dts) { // dataset

        sSQL = "insert into estudiantes (IdDocumento ,NumDocumento, NomEstudiante, ApllEstudiante, Sexo, FecNacimiento, Email, Telefono,"
                + "Direccion, Ciudad, password, passven, tipo) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, dts.getIdDocumento());
            pst.setString(2, dts.getNumDocumento());
            pst.setString(3, dts.getNomEstudiante());
            pst.setString(4, dts.getApllEstudiante());
            pst.setString(5, dts.getSexo());
            pst.setString(6, dts.getFecNacimiento());
            pst.setString(7, dts.getEmail());
            pst.setString(8, dts.getTelefono());
            pst.setString(9, dts.getDireccion());
            pst.setString(10, dts.getCiudad());
            pst.setString(11, dts.getPassword());
            pst.setString(12, dts.getPassven());
            pst.setInt(13, 3);

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean mostrar(aEstudiante dts) {

        return false;
    }

    public boolean editarEmail(aEstudiante dts) {

        sSQL = "UPDATE Estudiantes set Email = ? WHERE IdEstudiante = ?";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);

            pst.setString(1, dts.getEmail());
            pst.setInt(2, dts.getIdEstudiante());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editartelefono(aEstudiante dts) {

        sSQL = "UPDATE Estudiantes set Telefono = ? WHERE IdEstudiante = ?";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);

            pst.setString(1, dts.getTelefono());
            pst.setInt(2, dts.getIdEstudiante());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editarDireccion(aEstudiante dts) {

        sSQL = "UPDATE Estudiantes set Direccion = ? WHERE IdEstudiante = ?";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);

            pst.setString(1, dts.getDireccion());
            pst.setInt(2, dts.getIdEstudiante());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editarCiudad(aEstudiante dts) {

        sSQL = "UPDATE Estudiantes set Ciudad = ? WHERE IdEstudiante = ?";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);

            pst.setString(1, dts.getCiudad());
            pst.setInt(2, dts.getIdEstudiante());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean consultar(aEstudiante dts) {

        sSQL = "Select * from Estudiantes where IdEstudiante = ?";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEstudiante());
            ResultSet rs = pst.executeQuery();

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean validanum(String validanum) {
        this.validanum = validanum;
        Pattern pat = Pattern.compile("[0-9]");
        Matcher mat = pat.matcher(validanum);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validastr(String validastr) {
        this.validastr = validastr;
        Pattern pat = Pattern.compile("[A-Za-z]");
        Matcher mat = pat.matcher(validastr);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validamail(String validamail) {
        this.validamail = validamail;
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(validamail);
        if (!mat.find()) {
            return true;
        } else {
            return false;
        }

    }

    public Date fecha() throws ParseException {
        Calendar calendario = Calendar.getInstance();
        int day = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        String fec = anio + "-" + mes + "-" + day;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = (Date) formatter.parse(fec);
        return fecha;
    }

    public Date fecven(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        return (Date) calendar.getTime();
    }

    public void timer() {
        Timer timer;
        timer = new Timer();
        TimerTask task = new TimerTask() {
            int tic = 0;

            @Override
            public void run() {
                if (!dts.getNumDocumento().equals("")) {
                    timer.cancel();
                } else {
                    System.out.println(tic);
                }
                tic++;
            }
        };
        // Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
        timer.schedule(task, 10, 1000);
    }

}
