/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E08 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static void separarCifras(int[] vector, int n) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = n % 10;
            n = n / 10;
        }
    }

    public static void mostrarArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[5];
        int n;
        System.out.println("Introduzca un número de 5 cifras");
        n = pedirN();
        while (n > 99999 && n < 100000) {
            System.out.println("Introduzca cinco");
            n = pedirN();
        }

        separarCifras(num, n);
        mostrarArray(num);

    }

}
