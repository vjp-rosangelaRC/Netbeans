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
    private String nom; 
    private int temp; 

    public Dia(String nom, int temp) {
        this.nom = nom;
        this.temp = temp;
    }
    
    public Dia() {
        this.nom = "";
        this.temp = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    
}
