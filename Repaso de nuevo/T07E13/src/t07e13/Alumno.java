/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e13;

/**
 *
 * @author Ross
 */
public class Alumno {

    private String nombre;
    private int edad;
    private float notaMedia;

    public Alumno(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void buscarMedia(int media) {
        if (notaMedia > media) {
            System.out.println(this.toString());
        } else {
            System.out.println("No hay");
        }

    }

    public boolean suspensos() {
        boolean suspenso = false;
        if (notaMedia < 5) {
            suspenso = true;
        }
        return suspenso;
    }
    
    public boolean matriculado(String nom){
        boolean matriculado = false; 
        if(this.nombre.equalsIgnoreCase(nom)){
            matriculado = true;
        }
        return matriculado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }

}
