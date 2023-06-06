/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e01;

/**
 *
 * @author Ross
 */
public class Asignaturas {
    private String nombre; 
    private int nota; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Asignaturas(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    
}
