/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e15;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, contador = 0; 
        
        System.out.println("Introduzca un número");
        n = entrada.nextInt(); 
        
        while (contador <= 10){
            System.out.println(n + " x " + contador + " = " + (n*contador));
            contador++; 
        }
    }
    
}
