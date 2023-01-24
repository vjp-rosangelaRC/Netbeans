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

public class Armas {
    private boolean disponible;
    private int numArmas;
    
    // Constructor por defecto
    public Armas() {
        this.disponible = true;
        this.numArmas = 0;
        
    }
    
    // Constructor parametrizado
    public Armas(boolean disponible, int numArmas) {
        this.disponible = disponible;
        this.numArmas = numArmas++;
       
    }
    
    // Getters y setters

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumArmas() {
        return numArmas;
    }

    public void setNumArmas(int numArmas) {
        this.numArmas = numArmas;
    }
    
    // Método para usar el arma
    public static void usarArma(String tipo, boolean disponible){
        if (disponible == true){
            quitarSeguro(tipo);
            System.out.println("Quitando seguro de " + tipo);
        }
    }
    
    // Metodo para quitar el seguro
    public static void quitarSeguro(String tipo){
        System.out.println("Quitando el seguro de " + tipo);
    }
    
    //toString

    @Override
    public String toString() {
        return "Armas{" + "disponible=" + disponible + ", numArmas=" + numArmas;
    }
    
}
