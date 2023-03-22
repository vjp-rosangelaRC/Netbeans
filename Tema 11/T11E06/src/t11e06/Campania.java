/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e06;

import java.util.ArrayList;

/**
 *
 * @author Ross
 */
public class Campania {
   private String nombreCampania; 
   private ArrayList<Donacion> donaciones;  //Esto es un set de donaciones, no un arraylist

    public Campania(String nombreCampania, ArrayList<Donacion> donaciones) {
        this.nombreCampania = nombreCampania;
        this.donaciones = donaciones;
        //this.donaciones = new HashSet<>();
    }
    
    public Campania() {
        this.nombreCampania = "";
        donaciones = new ArrayList<>();
        //this.donaciones = new HashSet<>();
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(ArrayList<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    
    public void rellenarDonaciones(Donacion donacion1){
        this.donaciones.add(donacion1);
    }
    
    
    
    
}
