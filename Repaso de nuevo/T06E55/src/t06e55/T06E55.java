/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e55;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E55 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarArray(int[][] array){
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = entrada.nextInt();
            }
            
        }
    }
    
    public static int calcularMayor(int[][] array) {
        int mayor;
        mayor = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > mayor) {
                    mayor = array[i][j];
                }
            }

        }
        return mayor;
    }

    public static int calcularMenor(int[][] array) {
        int menor;
        menor = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < menor) {
                    menor = array[i][j];
                }
            }

        }
        return menor;
    }

    public static int suma(int[][] array) {
        int suma;
        suma = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma = suma + array[i][j];
            }

        }
        return suma;
    }
    
    public static void mostrarCosas (int[][] array){
        System.out.println("Mayor" + calcularMayor(array));
        System.out.println("Menor" + calcularMenor(array));
        System.out.println("Suma " + suma(array));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[4][2];
        
        System.out.println("Rellenar vector");
        rellenarArray(array);
        mostrarCosas(array);
    }

}
