/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06EA01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = -1;
        do {
            try {
                n = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("No valido");
                n = entrada.nextInt();
            } finally {
                return n;
            }
        } while (n >= 1 || n <= 10);
    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = pedirN();
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];

    }

}
