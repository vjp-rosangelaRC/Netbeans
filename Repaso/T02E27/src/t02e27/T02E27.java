/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e27;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int n1, doble;
        
        System.out.println("Por favor, introduzca un número:");
        n1 = entrada.nextInt(); 
        
        doble = n1 * 2;
        System.out.println("El doble de " + n1 + " es: " + doble);
        
        System.out.println("El cubo de " +n1 + " es " + (n1 * 3));
        
    }
    
}
