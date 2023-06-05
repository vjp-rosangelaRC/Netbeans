/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e09;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E09 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n = entrada.nextInt(); 
        return n; 
    }
    
    public static int contarCifras(int num){
        int contador = 0; 
        while(num != 0){
            num = num/10; 
            contador++; 
        }
        return contador; 
    }
    
    public static void dividirCifras(int num){
        int contador = contarCifras(num);
        int[] vector = new int[contador];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = num%10; 
            num = num/10; 
        }
        System.out.println("Mostrar");
        mostrarCifrasAlReves(vector);
    }
    
    public static void mostrarCifrasAlReves(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("num?");
        int num = pedirN(); 
        contarCifras(num); 
        dividirCifras(num);
    }
    
}
