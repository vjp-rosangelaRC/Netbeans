/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e01;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número");
            vector[i] = pedirN();
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < 10; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println(vector[i]);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];

        llenarVector(vector);
        mostrarVector(vector);
    }

}
