/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e23;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n = 0, contador=1;

        try {
            System.out.println("Introduzca el número final");
            n = entrada.nextInt();
        } catch (ArithmeticException e) {
            if (n <= 1) {
                System.out.println("debe ser mayor que uno");
                entrada.next();
                System.out.println("Introduzca el número final");
                n = entrada.nextInt();
            }

        }

        while (contador <= n) {
            System.out.println(contador);
            contador++;
        }

    }

}
