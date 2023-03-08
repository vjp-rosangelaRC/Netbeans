/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e16;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E16 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n; 
        n = entrada.nextInt(); 
        return n;
    }
    final static int MAX_ALUM = 6;
    final static int MAX_ASIG = 4;
    public static int generarAleatorio(){
        int aleatorio; 
        aleatorio = (int) Math.floor(Math.random()*10);
        return aleatorio;
    }
    
    public static void rellenarNotas(int[][] notas){
        for (int i = 0; i < MAX_ALUM; i++){
            for (int j = 0; j < MAX_ASIG; j++){
                notas[i][j] = generarAleatorio();
            }
        }
    }
    
    public static void mostrarNotas(int[][] notas, String[] nAlumnos, String[] nAsignaturas){
        for (int i = 0; i < MAX_ALUM; i++){
            
            System.out.println("alumn " + nAlumnos[i]);
           
            for (int j = 0; j < MAX_ASIG; j++){
               
                System.out.println(nAsignaturas[j] + " notas : " + notas[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int[][] notas = new int[MAX_ALUM][MAX_ASIG];
        String[] nAlumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] nAsignaturas = {"Lengua", "Mates","Historia", "Física"};
        do{
            System.out.println("Rellenar las notas de los alumnos.\n" +
            "2. Mostrar las notas introducidas en el punto anterior.\n" +
            "3. Que nos diga que alumno es el mejor de la clase. (nota media más alta) . (Necesitarás\n" +
            "utilizar otro array unidimensional con los nombres de los alumos)\n" +
            "4. Que nos diga el alumno con más suspensos.\n" +
            "5. Que nos diga cual es la asignatura más difícil. (nota media más baja) . (Necesitarás utilizar\n" +
            "otro array unidimensional con los nombres de las asignaturas)\n" +
            "6. Salir del programa");
            opcion = pedirN(); 
            
            switch(opcion){
                case 1:{
                    rellenarNotas(notas);
                    break;
                }
                
                case 2 :{
                    mostrarNotas(notas, nAlumnos, nAsignaturas);
                    break;
                }
                
                case 6 :{
                    System.out.println("Saliendo");
                    break;
                }
                default:{
                    System.out.println("No");
                }
            }
            
        }while(opcion != 6);
        
        
    }
    
}
