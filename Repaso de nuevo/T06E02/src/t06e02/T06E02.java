/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e02;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E02 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt();
        return n; 
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= pedirN();
        }
    }
    
    
    public static void mostrarNumeros(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }
    }
    
    public static void intercambiarNumeros(int[] vector){
        int aux; 
        aux = vector[1];
        vector[1] = vector[3];
        vector[3] = aux; 
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[7];
        System.out.println("Introduzca números");
        rellenarVector(vector);
        System.out.println("Los números introducidos son:");
        mostrarNumeros(vector);
        System.out.println("Los números a la inversa son:");
        intercambiarNumeros(vector);
        mostrarNumeros(vector);
    }
    
}
