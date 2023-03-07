/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e26;

/**
 *
 * @author rdlrosac01
 */
public class Producto {
    private double stock;

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Producto(int stock) {
        this.stock = stock;
    }
    
    public void actualizarStock(double cantidad){
        setStock(getStock() - cantidad); 
    }
}
