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
        Scanner entrada = new Scanner(System.in); 
        int n; 
        System.out.println("Introduzca un número");
        n = entrada.nextInt();
        while (n < 1000 || n > 9999){
            System.out.println("Número no válido. Debe tener 4 cifras");
            n = entrada.nextInt();
        }
        System.out.println("La primera cifra es " + (n/1000));
        n = n%1000;
        System.out.println("La segunda cifra es " + (n/100));
        n = n%100;
        System.out.println("La tercera cifra es " + (n/10));
        n = n%10;
        System.out.println("La cuarta cifra es " + n);
        
    }
    
}
