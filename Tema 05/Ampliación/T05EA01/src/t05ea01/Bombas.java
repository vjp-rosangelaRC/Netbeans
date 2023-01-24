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
public class Bombas extends Armas {
    private int alcance;
    private boolean distancia;

    //Constructor por defecto
    public Bombas() {
        super();
        this.alcance = 0;
        this.distancia = true;
    }
    
    // Constructor parametrizado solo Bombas
    public Bombas(int alcance, boolean distancia) {
        this.alcance = alcance;
        this.distancia = distancia;
    }
    
    // Constructor parametrizado con clase principals
    public Bombas(int alcance, boolean distancia, boolean disponible, int numArmas) {
        super(disponible, numArmas);
        this.alcance = alcance;
        this.distancia = distancia;
    }
    
    // Setters y getters

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public boolean isDistancia() {
        return distancia;
    }

    public void setDistancia(boolean distancia) {
        this.distancia = distancia;
    }
    
    //toString

    @Override
    public String toString() {
        return "Bombas{" + "alcance=" + alcance + ", distancia=" + distancia + '}';
    }
    
    
    
}
