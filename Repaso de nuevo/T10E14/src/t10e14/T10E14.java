/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E14 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumnos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        String nom;
        float nota;

        for (int i = 0; i < 3; i++) {
            
            Alumno aux = new Alumno();
            aux.setNomAlumno(("A" + i));
            aux.rellenarasignaturas();
            System.out.println(aux.toString());
            
            alumnos.add(aux); 
        }
        
        for(Alumno a: alumnos){
            System.out.println(a.toString());
        }

    }

}
