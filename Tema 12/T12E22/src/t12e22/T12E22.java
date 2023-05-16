/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e22;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T12E22 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in); 
        return n = entrada.nextInt(); 
    }
    
    public static void pedirNotas(Asignatura[] asignaturas, String[] nombresAsignaturas){
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i].setNombre(nombresAsignaturas[i]);
            asignaturas[i].setNota(pedirN());
        }
    }
    
    public static void mostrarNotas(Asignatura[] asignaturas, String[] nombresAsignaturas){
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i].getNombre());
            System.out.println(asignaturas[i].getNota());
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura[] asignaturas = new Asignatura[6]; 
        
        /*El error está aquí arriba en lo de la creación de asignatura */
        //String[] nombresAsignaturas = new String[]{"Programación", "LMSGI", "BBDD", "ED", "SI", "FOL"};
        
        for (int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura(); 
            asignaturas[i].setNombre("a");
            asignaturas[i].setNota(10);
        }
        System.out.println(asignaturas[1].getNombre());
            
        }
        
       /* 
        asignaturas[1].setNombre("aa");
        asignaturas[1].setNota(1);
        System.out.println(asignaturas[1].getNombre());
        //pedirNotas(asignaturas, nombresAsignaturas);
        //mostrarNotas(asignaturas, nombresAsignaturas);*/
        
    
    
}
