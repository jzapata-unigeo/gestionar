/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import ventanas.Formestu;
import static ventanas.Formestu.lblCodigo;


/**
 *
 * @author Jeison.Zapata
 */
public class Fmatriculas {

    private Conexion cn = new Conexion();
    private String sSQL = "";
    String anio = "";
    String semes = "";
    String estudia = "";
    

    public boolean insertar(aMatriculas dts) { // dataset

        sSQL = "insert into Matricula (IdEstudiante , aniomatr , Jornada, Semestre, Ciclo) values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEstudiante());
            pst.setString(2, dts.getAniomatr());
            pst.setString(3, dts.getJornada());
            pst.setString(4, dts.getSemestre());
            pst.setString(5, dts.getCiclo());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El estudiante ya esta matriculado para este Año-Semestre");
            return false;
        }

    }

    public boolean Mostrar(aMatriculas dts) { // dataset
         estudia = Formestu.lblCodigo.getText();
         sSQL = "Select * from Matricula where IdEstudiante = " + "'"+ estudia+"'" + " order by aniomatr desc" ;
        
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            
           
            if (rs.next()) {
                dts.setIdmatricula(rs.getInt("IdMatricula"));
                dts.setIdEstudiante(rs.getInt("IdEstudiante"));
                dts.setAniomatr(rs.getString("aniomatr").trim());
                dts.setJornada(rs.getString("Jornada").trim());
                dts.setSemestre(rs.getString("Semestre").trim());
                dts.setCiclo(rs.getString("Ciclo").trim());
                   }
                           
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            System.out.println(e);
            return false;
        }
        return false;
    }

    
    public boolean consultamtr(aMatriculas dts, String anio , String semes) { // dataset
        
        estudia = Formestu.lblCodigo.getText();
                
        sSQL = "Select * from Matricula where IdEstudiante = " + "'"+ estudia+"'" + " and aniomatr = " + anio + " and Semestre = " + semes;
        
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            
           
            if (rs.next()) {
                dts.setIdmatricula(rs.getInt("IdMatricula"));
                dts.setIdEstudiante(rs.getInt("IdEstudiante"));
                dts.setAniomatr(rs.getString("aniomatr").trim());
                dts.setJornada(rs.getString("Jornada").trim());
                dts.setSemestre(rs.getString("Semestre").trim());
                dts.setCiclo(rs.getString("Ciclo").trim());
                   }
                           
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            System.out.println(e);
            return false;
        }
        return false;
    }

}
