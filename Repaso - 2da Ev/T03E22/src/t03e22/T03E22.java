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
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        boolean error;

        do {
            error = false;
            try {
                System.out.println("Introduzca un número");
                n1 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("No es un número valido");
                n1 = 0;
                error = true;
                entrada.next();
            }
        } while (error);

        do {
            try {
                System.out.println("Introduzca un segundo");
                n2 = entrada.nextInt();

            } catch (java.util.InputMismatchException e) {
                System.out.println("No es un número valido");
                entrada.next();

                System.out.println("Introduzca un segundo");
                n2 = entrada.nextInt();
            }
            error = false;
        } while (error);

        System.out.println(" " + (n1 + n2));
    }

}
