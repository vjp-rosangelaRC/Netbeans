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
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.println("Por favor, introduzca un numero");
        n = entrada.nextInt();
        System.out.println("El doble del número es " + (n*n));
        System.out.println("El cubo del número es " + (n*n*n));
    }
    
}