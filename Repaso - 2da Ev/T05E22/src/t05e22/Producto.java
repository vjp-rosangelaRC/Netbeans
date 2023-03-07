/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e22;

/**
 *
 * @author Ross
 */
public class Producto {
    private String nombre;
    private int precio;
    private int stock;

    public Producto(String nombre, int precio, int scock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = scock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int actualizarStock (int n){
        this.stock = stock - n;
        return stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
}
