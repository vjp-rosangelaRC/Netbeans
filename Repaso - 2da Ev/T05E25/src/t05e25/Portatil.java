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
public class Portatil extends Ordenador{
    private String marca;
    private int tamanhoPantalla;
    private int peso; 

    public Portatil(String marca, int tamanhoPantalla, int peso, int cantidadMemoria, int ram, int capacidadHDD, String modeloProcesador, String modeloGrafica, int precio) {
        super(cantidadMemoria, ram, capacidadHDD, modeloProcesador, modeloGrafica, precio);
        this.marca = marca;
        this.tamanhoPantalla = tamanhoPantalla;
        this.peso = peso;
    }

    public Portatil() {
        super();
        this.marca = marca;
        this.tamanhoPantalla = tamanhoPantalla;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanhoPantalla() {
        return tamanhoPantalla;
    }

    public void setTamanhoPantalla(int tamanhoPantalla) {
        this.tamanhoPantalla = tamanhoPantalla;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
