/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeison.Zapata
 */
public class fCertificados {

    public List<aCertificados> buscarNotas(aCertificados pEstudiantes, String idest) throws Exception {
        List<aCertificados> lista = new ArrayList<aCertificados>();
        Conexion objetoCon = new Conexion();
        Connection con = objetoCon.obtener();
        PreparedStatement pst = null;
        try {

            String sSQL = "SELECT * from notaEstudiantes where IdEstudiante = 1002 AND IdMatricula = 9";

            pst = con.prepareStatement(sSQL);
            ResultSet rs = pst.executeQuery();
            aCertificados dts = new aCertificados();
            while (rs.next()) {
               
                dts.setMateria(rs.getString("Materia"));
                dts.setNotaFinal(rs.getString("NotaFinal"));

                lista.add(dts);

            }
        } catch (Exception ex) {
            throw new Exception("No se encontro el listado de Notas. Causa:" + ex.getMessage());
        }
        return lista;

    }

    /*public List<aCertificados> buscarNotas(aCertificados aCertificados, String idestudiante) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
}
