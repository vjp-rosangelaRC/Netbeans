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
public class Taxi extends Vehiculo{
    private int numeroLicencia; 

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    public Taxi() {
        super();
        this.numeroLicencia = 0;
    }
    
    public Taxi(int numeroLicencia, String matricula, String modelo, int potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

}
