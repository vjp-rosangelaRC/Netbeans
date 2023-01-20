/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e01;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E01 {

    public static void pedirN(int vector[]) {
        Scanner entrada = new Scanner(System.in);
        
        int i;

        System.out.println("Introduzca diez números:");
        for (i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ":");
            vector[i] = entrada.nextInt();
        }
    }

    public static void mostrarPares(int vector[]) {
        int i;

        for (i = 0; i < 10; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println("Números pares: " + vector[i]);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];

        pedirN(vector);
        mostrarPares(vector);
    }

}
