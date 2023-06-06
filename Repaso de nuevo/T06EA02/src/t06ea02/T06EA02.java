/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea02;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06EA02 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int[] vector){
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[6]; 
        Scanner entrada = new Scanner(System.in);
        int pos; 
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = -1; 
        }
        
        System.out.println("En qué pos?");
        pos = entrada.nextInt();
        
        
        
        for (int i = 0; i < vector.length; i++) {
            if( vector[pos] == -1){
                vector[pos] = entrada.nextInt();
            } 
        }
        
    }
    
}
