/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e22;

/**
 *
 * @author rdlrosac01
 */
public class Asignatura {
    private float nota; 
    private String nombre; 

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura(float nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }
    
    public Asignatura() {
        this.nota = 0;
        this.nombre = "";
    }
    
    
}
