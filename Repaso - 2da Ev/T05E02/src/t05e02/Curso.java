/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e02;

/**
 *
 * @author Ross
 */
public class Curso {
    private String nombre;
    private int numeroHoras; 
    private static int numeroDeCursos;
    
    public void establecerNombreYHoras(String nombre, int horas){
       this.nombre = nombre;
       this.numeroHoras = horas;
        sumarCursos();
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
    
    public void sumarCursos(){
      
        numeroDeCursos++;
    }
    
    public void verNumeroDeCursos(){
        System.out.println(numeroDeCursos);
    }
    
    
    
}
