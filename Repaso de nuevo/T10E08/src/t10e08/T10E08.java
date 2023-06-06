/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e08;

import java.util.ArrayList;

/**
 *
 * @author Ross
 */
public class T10E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumno = new ArrayList<>();
        
        Alumno alumnoAux = new Alumno(); 
        alumnoAux.setCurso(1);
        alumnoAux.setNombre("Pepe");
        alumno.add(alumnoAux); 
        
        alumnoAux.setCurso(2);
        alumnoAux.setNombre("Juan");
        alumno.add(alumnoAux); 
        
        for(Alumno l:alumno){
            System.out.println(alumno.toString());
        }
        
    }
    
}
