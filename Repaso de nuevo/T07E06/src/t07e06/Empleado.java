/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e06;

/**
 *
 * @author Ross
 */
public class Empleado {
    private String nombre; 
    private int numHoras;
    private float tarifa; 

    public Empleado(String nombre, int numHoras, float tarifa) {
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.tarifa = tarifa;
    }
    
    public Empleado() {
        this.nombre = "";
        this.numHoras = 0;
        this.tarifa = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
    public float sueldo(){
        float sueldo = 0; 
        if(numHoras > 40){
            sueldo = (float) (numHoras * (tarifa + (tarifa * 0.5))); 
        } else {
            sueldo = numHoras * tarifa; 
        }
        
        return sueldo; 
    }
    
    
}
