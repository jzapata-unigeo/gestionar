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
public class fCreacionUsuarios {

    private Conexion cn = new Conexion();
    private String sSQL = "";

    
       
    
    public boolean insertar(aCreacionUsuarios dts) { // dataset
       
        sSQL = "insert into Usuarios (Nombre ,Password, tipo) values (?,?,?)";
        try {
            PreparedStatement pst = cn.obtener().prepareStatement(sSQL);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getPassword());
            pst.setInt(3, dts.getTipo());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;

            } else {
                return false;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario tiene mas de 20 caracteres o El usuario ya existe");
            return false;
                       
        }

    }

   
    
}
