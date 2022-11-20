/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e26;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int numero; 
        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        numero = teclado.nextInt();
        System.out.println("La primera cifra es: "+(numero / 1000));
        numero = numero % 1000;
        System.out.println("La segunda cifra es: "+(numero / 100));
        numero = numero % 100;
        System.out.println("La tercera cifra es: "+(numero / 10));
        numero = numero % 10;
        System.out.println("La cuarta cifra es: "+numero);
    }
    
}
