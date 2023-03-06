/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e24;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, n2, contador = 0;
        boolean salir;

        do {
            salir = false;
            System.out.println("Introduzca número");
            n = entrada.nextInt();

            if (n <= 0) {
                System.out.println("No es un número válido");
                salir = false;
            }
            else{
                salir = true;
            }
        } while (salir == false);

        for (n2 = 1; n2 < n; n2++) {
            if (n2 % 3 == 0) {
                System.out.println("Multiplo:" + n2);
                contador++;
            }
        }
        System.out.println(contador);

    }

}
