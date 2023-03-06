/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e09;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4, aux;

        System.out.println("Introduzca el primer número");
        n1 = entrada.nextInt();

        System.out.println("Introduzca el segundo número");
        n2 = entrada.nextInt();

        System.out.println("Introduzca el tercer número");
        n3 = entrada.nextInt();

        System.out.println("Introduzca el cuarto número");
        n4 = entrada.nextInt();

        for (int i = 0; i < 3; i++) {
            if (n1 > n2) {
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 > n3) {
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n3 > n4) {
                aux = n3;
                n3 = n4;
                n4 = aux;
            }

        }

        System.out.println("El orden de los números es " + n1 + n2 + n3 + n4);

    }

}
