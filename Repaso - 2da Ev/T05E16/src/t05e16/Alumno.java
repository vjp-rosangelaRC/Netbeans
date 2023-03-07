/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;

/**
 *
 * @author Ross
 */
public class Alumno {
   private int nota;
   private String nombre; 

    public Alumno(int nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }
    
    public Alumno() {
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
