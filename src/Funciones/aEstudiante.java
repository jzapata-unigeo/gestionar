/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.math.BigInteger;
import java.sql.Date;

/**
 *
 * @author jalex
 */
public class aEstudiante {

    private int IdEstudiante;
    private String IdDocumento;
    private String NumDocumento;
    private String NomEstudiante;
    private String ApllEstudiante;
    private String Sexo;
    private String FecNacimiento;
    private String Email;
    private String Telefono;
    private String Direccion;
    private String Ciudad;
    private String password;
    private String Passven;

    //contructores 

    public aEstudiante(int IdEstudiante, String IdDocumento, String NumDocumento, String NomEstudiante, String ApllEstudiante, String Sexo, String FecNacimiento, String Email, String Telefono, String Direccion, String Ciudad, String password, String Passven) {
        this.IdEstudiante = IdEstudiante;
        this.IdDocumento = IdDocumento;
        this.NumDocumento = NumDocumento;
        this.NomEstudiante = NomEstudiante;
        this.ApllEstudiante = ApllEstudiante;
        this.Sexo = Sexo;
        this.FecNacimiento = FecNacimiento;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.password = password;
        this.Passven = Passven;
    }

    public String getPassven() {
        return Passven;
    }

    public void setPassven(String Passven) {
        this.Passven = Passven;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public aEstudiante() {
    }

    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public String getIdDocumento() {
        return IdDocumento;
    }

    public void setIdDocumento(String IdDocumento) {
        this.IdDocumento = IdDocumento;
    }

    public String getNumDocumento() {
        return NumDocumento;
    }

    public void setNumDocumento( String NumDocumento) {
        this.NumDocumento = NumDocumento;
    }

    public String getNomEstudiante() {
        return NomEstudiante;
    }

    public void setNomEstudiante(String NomEstudiante) {
        this.NomEstudiante = NomEstudiante;
    }

    public String getApllEstudiante() {
        return ApllEstudiante;
    }

    public void setApllEstudiante(String ApllEstudiante) {
        this.ApllEstudiante = ApllEstudiante;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getFecNacimiento() {
        return FecNacimiento;
    }

    public void setFecNacimiento(String FecNacimiento) {
        this.FecNacimiento = FecNacimiento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
public String getfecha(String anio, String mes, String dia) {
        return dia + "-" + mes + "-" + anio;
    }

}
