/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funciones;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison.Zapata
 */
public class fCiclos {
    
 private Conexion cn = new Conexion();
 private String sSQL = "";   
    public boolean insertar(aCiclos dts) { // dataset
           sSQL = "insert into NivelCiclos (NomCiclo) values (?)"; 
 try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, dts.getNomciclo());
          

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
}
