/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e23;

/**
 *
 * @author Ross
 */
public class Autobus extends Vehiculo{
    int numeroPlazas; 

    public Autobus(int numeroPlazas, String matricula, String modelo, int potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }
    
    public Autobus() {
        super();
        this.numeroPlazas = 0;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

  
    
}
