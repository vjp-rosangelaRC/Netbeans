/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e25;

/**
 *
 * @author Ross
 */
public class Ordenador {
    private int cantidadMemoria;
    private int ram; 
    private int capacidadHDD; 
    private String modeloProcesador;
    private String modeloGrafica;
    private int precio; 

    public Ordenador(int cantidadMemoria, int ram, int capacidadHDD, String modeloProcesador, String modeloGrafica, int precio) {
        this.cantidadMemoria = cantidadMemoria;
        this.ram = ram;
        this.capacidadHDD = capacidadHDD;
        this.modeloProcesador = modeloProcesador;
        this.modeloGrafica = modeloGrafica;
        this.precio = precio;
    }
    
    public Ordenador() {
        this.cantidadMemoria = 0;
        this.ram = 0;
        this.capacidadHDD = 0;
        this.modeloProcesador = "";
        this.modeloGrafica = "";
        this.precio = 0;
    }

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(int cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidadHDD() {
        return capacidadHDD;
    }

    public void setCapacidadHDD(int capacidadHDD) {
        this.capacidadHDD = capacidadHDD;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public String getModeloGrafica() {
        return modeloGrafica;
    }

    public void setModeloGrafica(String modeloGrafica) {
        this.modeloGrafica = modeloGrafica;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "cantidadMemoria=" + cantidadMemoria + ", ram=" + ram + ", capacidadHDD=" + capacidadHDD + ", modeloProcesador=" + modeloProcesador + ", modeloGrafica=" + modeloGrafica + ", precio=" + precio + '}';
    }
    
    
    
    
}
