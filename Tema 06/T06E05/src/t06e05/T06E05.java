/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e05;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E05 {

    /**
     * @param args the command line arguments
     */
    public static void introducirNumeros(int array[][]) {
        Scanner entrada = new Scanner(System.in);
        int i, j;

        System.out.println("Introduzca valores:");

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = entrada.nextInt();
            }
        }
    }
    
    public static void mostrarValores (int array[][]){
        int i, j;
        System.out.println("Los valores introducidos son:");
        for (i = 0; i < array.length; i ++){
            for (j = 0; j < array[i].length; j++){
                System.out.println( array[i][j]);
            }
        }
    }
    
    public static void mostrarValoresMayor (int array[][]){
        int i, j;
        System.out.println("Los valores ordenados de mayor a menor:");
        
        for (i = 0; i < array.length; i ++){
            for (j = 0; j < array[i].length; j++){
                if (array[i][j] > array[i][j]){
                    System.out.println( array[i][j]);
                }
            }
        }
    }
    
    public static void mostrarValoresMenor (int array[][]){
        
    }
    
    public static void mostrarValoresSuma (int array[][]){
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    int [][] array = new int[4][2];
    introducirNumeros(array);
    mostrarValores(array);
    mostrarValoresMayor(array);
    mostrarValoresMenor(array);
    mostrarValoresSuma(array);
    
    }
    
}
