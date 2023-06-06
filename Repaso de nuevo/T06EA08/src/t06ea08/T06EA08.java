/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06EA08 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int n = (int) Math.floor(Math.random() * 300 + 1); 
        return n; 
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio(); 
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Tamaño?");
        int num  = entrada.nextInt();
        
        int[] vector = new int[num]; 
        
        rellenarVector(vector);
        System.out.println("Dig?");
        num = entrada.nextInt(); 
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % 10 == num){
                System.out.println(vector[i]);
            }
        }
        
    }
    
}
