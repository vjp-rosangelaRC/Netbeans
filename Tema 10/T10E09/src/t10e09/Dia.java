/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e09;

/**
 *
 * @author rdlrosac01
 */
public class Dia {
    private String nombreDia; 
    private int temperatura; 

    public Dia() {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
}
