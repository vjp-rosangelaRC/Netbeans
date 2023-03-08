/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e02;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E02 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void cambiarPos(int[] vector) {
        int aux;        
        
        aux = vector[1];        
        vector[1] = vector[3];
        vector[3] = aux;        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[7];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = pedirN();
        }
        
        mostrar(vector);
        cambiarPos(vector);
        mostrar(vector);
    }
    
}
