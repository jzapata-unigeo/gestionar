/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static ventanas.Formnotas.JTciclo;

/**
 *
 * @author Jeison.Zapata
 */
public class Fnotas {

    private final Conexion cn = new Conexion();
    private String sSQL = "";

    public boolean insertar(aNotas dts) { // dataset

        sSQL = "insert into NotaEstudiantes (IdEstudiante , IdMateria , Materia, NotaFinal, IdMatricula) values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setInt(1, dts.getIdEstudiante());
            pst.setInt(2, dts.getIdMateria());
            pst.setString(3, dts.getMaterias());
            pst.setString(4, dts.getNotaFinal());
            pst.setInt(5, dts.getIdMatricula());
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El estudiante ya tiene registradas las notas de este año-semestre");
            System.out.println(e);
            return false;
        }

    }

    public boolean consultnotas(aNotas dts, String ciclo) {

        sSQL = "Select * from Materias where IdNivelCiclos = " + ciclo;
        try {

            ciclo = JTciclo.getText();

            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);

            {
            }

            pst.setString(1, ciclo);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println();

            }

        } catch (Exception er) {
            System.out.println("" + er);

        }
        return false;

    }

    
   public boolean mostrar(aNotas dts, String sSQL) {
   String sql= "select * from notaEstudiantes where IdEstudiante = ";
       
   try {
            PreparedStatement pst = cn.obtener().prepareStatement(sql + sSQL);
            ResultSet rs = pst.executeQuery();
            
           
            if (rs.next()) {
                
                dts.setNotaFinal(rs.getString("NotaFinal").trim());
                               
                   }
                           
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            System.out.println(e);
            return false;
        }
        return false;
    }

   } 


