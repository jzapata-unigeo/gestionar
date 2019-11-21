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
public class aCreacionUsuarios {
private String Nombre;
private String Password;
private  int tipo;

    public aCreacionUsuarios(String Nombre, String Password, int tipo) {
        this.Nombre = Nombre;
        this.Password = Password;
        this.tipo = tipo;
    }

    public aCreacionUsuarios() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}
