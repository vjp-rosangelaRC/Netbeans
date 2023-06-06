/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea05;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06EA05 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int[][] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = i + j;
            }
        }
    }

    public static void mostrarVector(int[][] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.println(vector[i][j]);
            }
        }
    }

    public static void buscar(int[][] vector, int num) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[i][j] == num) {
                    System.out.println("Encon");
                    System.out.println(vector[i][j]);
                }

            }
        }
    }

    public static void buscarNum(int[][] vector) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String resp;
        boolean salir = false;

        System.out.println("num a buscar");
        num = entrada.nextInt();
        buscar(vector, num);

        do {
            System.out.println("Buscar más");
            resp = entrada.nextLine();

            if (resp.equalsIgnoreCase("si")) {
                salir = false;
                buscar(vector, num);
            } else {
                salir = true;
            }
        } while (salir = false);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];

        rellenarVector(matriz);
        System.out.println("Mostrar");
        mostrarVector(matriz);
        buscarNum(matriz);

    }

}
