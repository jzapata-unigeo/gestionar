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
public class aCertificados {
private  int IdNotas;
private  int IdEstudiante;
private  int IdMateria;
private  int IdMatricula;
private  String Materia;
private  String NotaFinal;

    public aCertificados(int IdNotas, int IdEstudiante, int IdMateria, int IdMatricula, String Materia, String NotaFinal) {
        this.IdNotas = IdNotas;
        this.IdEstudiante = IdEstudiante;
        this.IdMateria = IdMateria;
        this.IdMatricula = IdMatricula;
        this.Materia = Materia;
        this.NotaFinal = NotaFinal;
    }

    public aCertificados() {
    }

    public int getIdNotas() {
        return IdNotas;
    }

    public void setIdNotas(int IdNotas) {
        this.IdNotas = IdNotas;
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

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

    public int getIdMatricula() {
        return IdMatricula;
    }

    public void setIdMatricula(int IdMatricula) {
        this.IdMatricula = IdMatricula;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(String NotaFinal) {
        this.NotaFinal = NotaFinal;
    }


   
   
}
