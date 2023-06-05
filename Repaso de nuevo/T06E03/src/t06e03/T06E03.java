/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e03;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E03 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 6 + 1);
        return n;
    }

    public static int elegirLongitud() {
        int n = 0;
        do {
            try {
                System.out.println("Introduzca longitud");
                n = pedirN();
            } catch (InputMismatchException e) {
                System.out.println("Introduca un número");
                n = -1;
            }
        } while (n < 0 || n > 10);
        return n;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n = elegirLongitud();

        int[] vector = new int[n];
        rellenarVector(vector);
        System.out.println("Mostrar");
        mostrarVector(vector);

    }

}
