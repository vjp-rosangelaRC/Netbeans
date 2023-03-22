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
   private ArrayList<Donacion> donaciones; 

    public Campania(String nombreCampania, ArrayList<Donacion> donaciones) {
        this.nombreCampania = nombreCampania;
        this.donaciones = donaciones;
    }
    
    public Campania() {
        this.nombreCampania = "";
        donaciones = new ArrayList<>();
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
