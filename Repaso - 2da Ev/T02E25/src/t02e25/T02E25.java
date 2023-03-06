/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e25;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, n1, n2, suma, producto;
        
        System.out.println("Introduzca el 1er num");
        n = entrada.nextInt();
        
        System.out.println("Introduzca el 2do num");
        n1 = entrada.nextInt();
        
        System.out.println("Introduzca el 3er num");
        n2 = entrada.nextInt(); 
        
        suma = n + n1 + n2;
        System.out.println("La suma de los números es " + suma);
        producto = n * n1 * n2; 
        System.out.println("El producto es " + producto);
    }
    
}
