/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e15;

/**
 *
 * @author Ross
 */
public class Pelicula {

    private String titulo;
    private float coste;
    private Socio[] socios;

    public Pelicula(String titulo, float coste, Socio[] socios) {
        this.titulo = titulo;
        this.coste = coste;
        this.socios = new Socio[4];
        for (int i = 0; i < this.socios.length; i++) {
            this.socios[i] = new Socio(); 
        }

    }
    
    public Pelicula() {
        this.titulo = "";
        this.coste = 0;
        this.socios = new Socio[4];
        for (int i = 0; i < this.socios.length; i++) {
            this.socios[i] = new Socio(); 
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCoste() {
        return coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }
    
    public void rellenarSocios(){
        
        for (int i = 0; i < this.socios.length; i++) {
            this.socios[i] = new Socio("Pepe", 15);  
        }
        
    }
    
    public static void rentabilidad(){
        
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", coste=" + coste + ", socios=" + socios + '}';
    }
    

}
