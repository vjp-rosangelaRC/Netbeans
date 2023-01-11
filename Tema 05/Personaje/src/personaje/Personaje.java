/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author Ross
 */
public class Personaje {
    private String nombre;
    private int fuerza;
    private int nivel;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String _nombre){
        nombre = _nombre;
    }
    
    public int getFuerza(){
        return fuerza;
    }
    
    public void setFuerza(int _fuerza){
        fuerza = _fuerza;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void setNivel(int _nivel){
        nivel = _nivel;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Personaje personaje = new Personaje();
        
        String nombre = "pepe";
        int fuerza = 5, nivel = 3;
        
        personaje.setNombre(nombre);
        personaje.setFuerza(fuerza);
        personaje.setNivel(nivel);
        
        System.out.println("El nombre del personaje es " + personaje.getNombre() + ", su fuerza es " + personaje.getFuerza() + " y su nivel es " + personaje.getNivel() + ".");
        
    }
   
}
