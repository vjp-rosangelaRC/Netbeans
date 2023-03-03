/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E08 {

    /**
     * @param args the command line arguments
     */
    
    public static String pedirNombre(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        nombre = entrada.nextLine();
        return nombre;
    }
    
    public static int pedirCurso(){
        Scanner entrada = new Scanner(System.in);
        int curso;
        curso = entrada.nextInt();
        return curso;
    }
    
    public static void rellenarArray(ArrayList<Alumno> alumnos, String nombre, int curso){
            alumnos.add(new Alumno(nombre, curso));
    }
    
    public static void mostrarArray(ArrayList<Alumno> alumnos){
        for (int i=0; i < alumnos.size(); i++){
            System.out.println(alumnos.get(i).toString());
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String nombre; 
        int curso, opcion;
        
        do {
            System.out.println("Para salir pulse 2, para introducir alumno pulse 1");
            opcion = pedirCurso();
            System.out.println("Introduzca el nombre del alumno:");
            nombre = pedirNombre();
            System.out.println("Introduzca el curso del alumno");
            curso = pedirCurso();
            rellenarArray(alumnos, nombre, curso);
        } while (opcion != 2);
        
        mostrarArray(alumnos);
        System.out.println(alumnos);
        //No se rellena el vector
        
    }
    
}
