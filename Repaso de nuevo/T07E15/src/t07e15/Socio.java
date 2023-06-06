/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e15;

/**
 *
 * @author Ross
 */
public class Socio {
    private String nombre;
    private float precio; 

    public Socio(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public Socio() {
        this.nombre = "";
        this.precio = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
}
