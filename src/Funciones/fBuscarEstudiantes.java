/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison.Zapata
 */
public class fBuscarEstudiantes {

    public List<aEstudiante> buscarEstudiantes(aEstudiante pEstudiantes, int cont,String ent) throws Exception {
        List<aEstudiante> lstEstudiantes = new ArrayList<aEstudiante>();
        Conexion objetoCon = new Conexion();
        Connection con = objetoCon.obtener();
        PreparedStatement stmt = null;
        try {
            String sSentencia="";
            switch (cont) {
                
                case 0:
                    sSentencia="SELECT * FROM Estudiantes where IdEstudiante = '"+ent+"'";
            break;
                case 1:
                    sSentencia="SELECT * FROM Estudiantes where NumDocumento LIKE '%"+ent+"%'";
                    break;
                    case 2:
                        sSentencia="SELECT * FROM Estudiantes where NomEstudiante LIKE '%"+ent+"%'";
                    break;
                    case 3:
                        sSentencia="SELECT * FROM Estudiantes";
                    break;
                  }
            stmt = con.prepareStatement(sSentencia);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                aEstudiante oTmp = new aEstudiante();
                oTmp.setIdEstudiante(rs.getInt("IdEstudiante"));
                oTmp.setNumDocumento(rs.getString("NumDocumento"));
                oTmp.setNomEstudiante(rs.getString("NomEstudiante"));
                oTmp.setApllEstudiante(rs.getString("ApllEstudiante"));
                lstEstudiantes.add(oTmp);
            }
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception("No se encontro el listado de Estudiantes. Causa:" + ex.getMessage());
        }

        return lstEstudiantes;

    }
}
