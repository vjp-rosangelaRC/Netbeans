/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e22;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in); 
        double numero1, numero2, resultado;
        
        System.out.println("Introduzca el primero número:");
        numero1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número:");
        numero2 = teclado.nextInt();
        
        try{
            resultado = numero1 + numero2;
            
        }
        catch (ArithmeticException e){
            System.out.println("Error. No es un número");
            numero1 = 0;
            numero2 = 0;
        }
        System.out.println("Resultado: " + resultado);
    }
    
}
