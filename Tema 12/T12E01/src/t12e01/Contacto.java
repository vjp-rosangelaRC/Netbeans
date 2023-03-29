/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e01;

/**
 *
 * @author rdlrosac01
 */
public class Contacto {
    private String nombre; 
    private int edad; 
    private String numeroDeMovil; 

    public Contacto(String nombre, int edad, String numeroDeMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeMovil = numeroDeMovil;
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

    public String getNumeroDeMovil() {
        return numeroDeMovil;
    }

    public void setNumeroDeMovil(String numeroDeMovil) {
        this.numeroDeMovil = numeroDeMovil;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", edad=" + edad + ", numeroDeMovil=" + numeroDeMovil + '}';
    }
    
}
