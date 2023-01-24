/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ea01;

/**
 *
 * @author Ross
 */
public class Pistolas extends Armas {
    private int balasMaximas;
    
    //Constructor por defecto 
    public Pistolas() {
        super();
        this.balasMaximas = 0;
    }
    
    //Constructor parametrizado 
    public Pistolas(int balasMaximas) {
        this.balasMaximas = balasMaximas;
    }
    
    //Constructor parametrizado con Armas
    public Pistolas(int balasMaximas, boolean disponible, int numArmas, String tipo) {
        super(disponible, numArmas, tipo);
        this.balasMaximas = balasMaximas;
    }
    
    //Getters y setters

    public int getBalasMaximas() {
        return balasMaximas;
    }

    public void setBalasMaximas(int balasMaximas) {
        this.balasMaximas = balasMaximas;
    }
    
    //toString

    @Override
    public String toString() {
        return "Pistolas{" + "balasMaximas=" + balasMaximas + '}';
    }
    
}
