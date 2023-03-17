/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e05;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E05 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        int n;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        return n;
    }

    public static void pedirValores(int[][] vector) {
        System.out.println("Introduzca valores");
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = pedirN();
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

    public static void mostrarMayor(int[][] vector) {
        int mayor = vector[0][0];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[i][j] > mayor) {
                    mayor = vector[i][j];
                    System.out.println(mayor);
                }

            }
        }
    }

    public static void mostrarMenor(int[][] vector) {
        int menor = vector[0][0];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[i][j] < menor) {
                    menor = vector[i][j];
                    System.out.println(menor);
                }

            }
        }
    }

    public static int suma(int[][] vector) {
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                suma = suma + vector[i][j];
            }
        }
        return suma;
    }
    
    public static void mostrarTodo(int[][] vector){
        System.out.println("Los vectores son");
        mostrarVector(vector);
        System.out.println("Mayor");
        mostrarMayor(vector);
        System.out.println("Menor");
        mostrarMenor(vector);
        System.out.println("Suma" + suma(vector));
      
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[4][2];
        pedirValores(array);
        mostrarTodo(array);
    }

}
