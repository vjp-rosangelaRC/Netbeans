/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e21;

import java.io.Serializable;

/**
 *
 * @author Ross
 */
public class Asignatura implements Serializable {
    private int nota; 
    private String nombre; 

    public Asignatura(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public Asignatura() {
        this.nota = 0;
        this.nombre = "";
    }
    
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
