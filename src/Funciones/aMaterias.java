/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funciones;

/**
 *
 * @author Jeison.Zapata
 */
public class aMaterias {

   private String NomMateria;
   private int IdNivelCiclos;

    public aMaterias(String NomMateria, int IdNivelCiclos) {
        this.NomMateria = NomMateria;
        this.IdNivelCiclos = IdNivelCiclos;
    }

    public aMaterias() {
    }

    public String getNomMateria() {
        return NomMateria;
    }

    public void setNomMateria(String NomMateria) {
        this.NomMateria = NomMateria;
    }

    public int getIdNivelCiclos() {
        return IdNivelCiclos;
    }

    public void setIdNivelCiclos(int IdNivelCiclos) {
        this.IdNivelCiclos = IdNivelCiclos;
    }
   
   
    
}
