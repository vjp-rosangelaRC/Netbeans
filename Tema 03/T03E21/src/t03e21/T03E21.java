/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e21;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int numero, numero2, resultado;
        System.out.println("Número 1:");
        numero = entrada.nextInt();
        System.out.println("Número 2:");
        numero2 = entrada.nextInt();
        try {
           resultado = numero / numero2; 
        }
        catch (ArithmeticException e){
            resultado = 0;
            System.out.println("Error" + e.getMessage());
            
        }
            System.out.println("El resultado es " + resultado);
        
        
        
        
        
    }
    
}
