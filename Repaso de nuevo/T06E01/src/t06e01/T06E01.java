/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e01;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt();
        return n;
    }
    
    public static void pedirNumeros(int[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.println("Introduzca un número");
            vector[i] = pedirN();
        }
    }   
    
    public static void mostrarNumerosPares(int[] vector){
        System.out.println("Los números pares son: ");
        for(int i = 0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                System.out.println(vector[i]);
            }
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        pedirNumeros(vector); 
        mostrarNumerosPares(vector);
        
        
        
        
        
    }
    
}
