/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e13;

/**
 *
 * @author Ross
 */
public class Venta {
    private String nombreMes; 
    private int ventasCochesMes; 

    public Venta(String nombreMes, int ventasCochesMes) {
        this.nombreMes = nombreMes;
        this.ventasCochesMes = ventasCochesMes;
    }
    
     public Venta() {
        this.nombreMes = "";
        this.ventasCochesMes = 0;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombreMes=" + nombreMes + ", ventasCochesMes=" + ventasCochesMes + '}';
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getVentasCochesMes() {
        return ventasCochesMes;
    }

    public void setVentasCochesMes(int ventasCochesMes) {
        this.ventasCochesMes = ventasCochesMes;
    }
    
    
}
