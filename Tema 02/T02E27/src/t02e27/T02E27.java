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
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, introduzca el número: ");
        int numero = teclado.nextInt();
        int doble = numero * numero;
        System.out.println("El doble de " + numero + " es: " +doble);
        int cubo = numero * numero * numero;
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
    
}
