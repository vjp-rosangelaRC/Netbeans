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
    private static int numeroDeCursos = 0;
    
    public void establecerNombreyHoras(String _nombre, int _numeroHoras){
        nombre = _nombre;
        numeroHoras = _numeroHoras; 
        sumarCursos();
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras(){
        return numeroHoras;        
    }
    
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    public static int verNumeroCursos(){
        return numeroDeCursos;
    }

   
    
    
}
