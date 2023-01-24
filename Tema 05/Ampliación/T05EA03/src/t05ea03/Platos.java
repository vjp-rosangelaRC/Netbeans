/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ea03;

/**
 *
 * @author rdlrosac01
 */
public class Platos {
    private String nombre;
    private double precio;
    private int numeroRaciones; 
    
    // Constructores
    // COnstructor por defecto
    public Platos() {
        nombre = "";
        precio = 0;
        numeroRaciones = 0;
    }
    
    // Constructor parametrizado
    public Platos(String nombre, double precio, int numeroRaciones) {
        this.nombre = nombre;
        this.precio = precio;
        this.numeroRaciones = numeroRaciones;
    }
    
    
    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroRaciones() {
        return numeroRaciones;
    }

    public void setNumeroRaciones(int numeroRaciones) {
        this.numeroRaciones = numeroRaciones;
    }

    @Override
    public String toString() {
        return "Platos:" + nombre + ", precio: " + precio + ", numero de raciones disponibles: " + numeroRaciones;
    }
    
    
    
    
}
