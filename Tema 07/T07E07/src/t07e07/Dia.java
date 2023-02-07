/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e07;

/**
 *
 * @author Ross
 */
public class Dia {
    private String nombreDia;
    private int temperatura;

    public Dia() {
        nombreDia = "";
        temperatura = 0;
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
    
    

    @Override
    public String toString() {
        return "Dia: " + nombreDia + ", temperatura:" + temperatura;
    }
    
    
    
}
