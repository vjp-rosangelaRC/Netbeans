/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e06;

/**
 *
 * @author Ross
 */
public class Donacion {
    private String nombreDonante; 
    private double cantidadDonada; 

    public Donacion(String nombreDonante, double cantidadDonada) {
        this.nombreDonante = nombreDonante;
        this.cantidadDonada = cantidadDonada;
    }
    
    public Donacion() {
        this.nombreDonante = "";
        this.cantidadDonada = 0;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public double getCantidadDonada() {
        return cantidadDonada;
    }

    public void setCantidadDonada(double cantidadDonada) {
        this.cantidadDonada = cantidadDonada;
    }
    
    public void buscarNombre(String nombre){
        boolean existe;
        existe = false;
        
        if (this.nombreDonante.equalsIgnoreCase(nombre)){
            existe = true; 
            System.out.println(this.cantidadDonada);
        }
    }
    

    @Override
    public String toString() {
        return "Donacion{" + "nombreDonante=" + nombreDonante + ", cantidadDonada=" + cantidadDonada + '}';
    }
    
    
}
