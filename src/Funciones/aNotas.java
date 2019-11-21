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
public class aNotas {

    private int IdEstudiante;
    private int IdMateria;
    private int IdMatricula;
    private String materias;
    private String Semestre;
    private String Jornada;
    private String Materias;
    private String NotaFinal;
  

    public aNotas(int IdEstudiante, int IdMateria, String Semestre,  String IdJornada, String materias, String Materias, String NotaFinal, int IdMatricula) {
        this.IdEstudiante = IdEstudiante;
        this.IdMateria = IdMateria;
        this.Semestre = Semestre;
        this.materias=materias;
        this.Jornada = Jornada;
        this.NotaFinal = NotaFinal;

    }

   
    public aNotas() {
    }

     public String getNotaias() {
        return Materias;
    }

    public void setNotaias(String Materias) {
        this.Materias = Materias;
    }
   
    
    
    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public int getIdMateria() {
        return IdMateria;
    }
    
     public String getMaterias() {
        return Materias;
    }
    
 public void setMaterias(String Materia) {
        this.Materias = Materias;
    }
 
    public void setIdMaterias(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public String getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(String NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    
     public int getIdMatricula() {
        return IdMatricula;
    }

    public void setIdMatricula(int IdMatricula) {
        this.IdMatricula = IdMatricula;
    }
    
}
