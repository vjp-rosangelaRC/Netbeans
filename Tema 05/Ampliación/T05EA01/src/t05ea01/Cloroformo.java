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
public class Cloroformo extends Armas {
    private int tiempoEfectivo;
    
    // Constructor por defecto
    public Cloroformo() {
        super();
        this.tiempoEfectivo = 0;
    }
    
    // Constructor parametrizado solo Cloroformo
    public Cloroformo(int tiempoEfectivo) {
        this.tiempoEfectivo = tiempoEfectivo;
    }
    
    //Constructor parametrizado con Armas
    public Cloroformo(int tiempoEfectivo, boolean disponible, int numArmas, String tipo) {
        super(disponible, numArmas, tipo);
        this.tiempoEfectivo = tiempoEfectivo;
    }
    
    // Getters y setters

    public int getTiempoEfectivo() {
        return tiempoEfectivo;
    }

    public void setTiempoEfectivo(int tiempoEfectivo) {
        this.tiempoEfectivo = tiempoEfectivo;
    }
    
    //toString

    @Override
    public String toString() {
        return "Cloroformo{" + "tiempoEfectivo=" + tiempoEfectivo + '}';
    }
    
    
}
