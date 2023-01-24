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
    private static int numArmas = 0;
    
    // Tendría que ser estático e inicializarlo aquí
    
    // Constructor por defecto
    // Como numArmas es estático aquí no tengo que meterlo, ya está inicializado pero
    // sí uso este constructor para incrementar el numArmas
    public Armas() {
        this.disponible = true;
        numArmas++;
    }
    
    // Constructor parametrizado
    public Armas(boolean disponible, int numArmas) {
        this.disponible = disponible;
        numArmas++;
       
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
    public static void usarArma(boolean disponible){
        if (disponible == true){
            quitarSeguro();
            System.out.println("Utilizando arma");
        }
    }
    
    /* Aquí me olvidé de quitar lo de tipo. Para lo del seguro de todos modos habría que 
    sobreescribirlo dentro de las clases hijas para editar el mensaje. Dentro de las clases
    hijas se usa el super además para poder hacerlo*/
    
    // Metodo para quitar el seguro
    public static void quitarSeguro(){
        System.out.println("Quitando el seguro");
    }
    
    //toString

    @Override
    public String toString() {
        return "Armas{" + "disponible=" + disponible + ", numArmas=" + numArmas;
    }
    
}
