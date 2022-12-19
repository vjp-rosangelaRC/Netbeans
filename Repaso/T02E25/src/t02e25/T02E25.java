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
        Scanner entrada = new Scanner (System.in);
        int n1, n2, n3, suma, producto;
        
        System.out.println("Por favor, introduzca el primer número:");
        n1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo número:");
        n2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer número:");
        n3 = entrada.nextInt();
        
        suma = n1 + n2 + n3;
        System.out.println("La suma de los números introducidos es " + suma);
        producto = n1 * n2 * n3;
        System.out.println("El producot de los números introducidos es " + producto);
    }
    
}
