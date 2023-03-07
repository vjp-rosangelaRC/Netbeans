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
public class Servidor extends Ordenador{
    private int tamanhoMonitor;
    private String modeloTeclado;
    private String modeloRaton; 

    public Servidor(int tamanhoMonitor, String modeloTeclado, String modeloRaton, int cantidadMemoria, int ram, int capacidadHDD, String modeloProcesador, String modeloGrafica, int precio) {
        super(cantidadMemoria, ram, capacidadHDD, modeloProcesador, modeloGrafica, precio);
        this.tamanhoMonitor = tamanhoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }
    
    public Servidor() {
        super();
        this.tamanhoMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }

    public int getTamanhoMonitor() {
        return tamanhoMonitor;
    }

    public void setTamanhoMonitor(int tamanhoMonitor) {
        this.tamanhoMonitor = tamanhoMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }
    
}
