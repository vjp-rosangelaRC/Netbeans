/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e26;

import java.io.Serializable;

/**
 *
 * @author rdlrosac01
 */
public class Bebida implements Serializable{
    private String nombreBebida;
    private float precio; 
    private int stock; 

    public Bebida(String nombreBebida, float precio, int stock) {
        this.nombreBebida = nombreBebida;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Bebida() {
        this.nombreBebida = "";
        this.precio = 0;
        this.stock = 0;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    

    @Override
    public String toString() {
        return "☆" + nombreBebida + "\n precio:" + precio + "€ \n Stock:" + stock;
    }   
    
}
