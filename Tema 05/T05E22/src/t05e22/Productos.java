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
public class Productos {
    private String nombreProducto;
    private double precioProducto;
    private int stockProducto;
    
    //Constructor por defecto 
    public Productos (){
        this.nombreProducto = "";
        this.precioProducto = 0.00;
        this.stockProducto = 0;
    }
    
    // Constructor parametrizado
    public Productos(String nombreProducto, double precioProducto, int stockProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto; 
    }
    
    // Getters y setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }
    
    
}
