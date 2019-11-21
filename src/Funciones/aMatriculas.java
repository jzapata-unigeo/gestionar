/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Funciones;

/**
 *
 * @author Gestionar
 */
public class aMatriculas {
    
    private int Idmatricula;
    private int IdEstudiante;
    private String aniomatr;
    private String Jornada;
    private String Semestre;
    private String Ciclo;
    

    public aMatriculas(int Idmatricula, int IdEstudiante, String aniomatr, String Jornada, String Semestre, String Ciclo) {
        this.Idmatricula = Idmatricula;
        this.IdEstudiante = IdEstudiante;
        this.aniomatr = aniomatr;
        this.Jornada = Jornada;
        this.Semestre = Semestre;
    
        
        
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    public aMatriculas() {
    }

    public int getIdmatricula() {
        return Idmatricula;
    }

    public void setIdmatricula(int Idmatricula) {
        this.Idmatricula = Idmatricula;
    }

    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public String getAniomatr() {
        return aniomatr;
    }

    public void setAniomatr(String aniomatr) {
        this.aniomatr = aniomatr;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }
        
    
}

