/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e05;

/**
 *
 * @author Ross
 */
public class T06E05 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n;
        n = (int) Math.floor((Math.random() * 10) + 1);
        return n;
    }

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = generarAleatorio();
            }
        }
    }

    public static int mayor(int[][] array) {
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

    public static int menor(int[][] array) {
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

    public static int suma(int[][] array){
        int suma;
        suma = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma = suma + array[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int mayor, menor, suma;
        int[][] array = new int[4][2];
        
        rellenarArray(array);
        mayor = mayor(array); 
        menor = menor(array); 
        suma = suma(array);
        
        System.out.println("mayor " + mayor);
        System.out.println("menor " + menor);
        System.out.println("suma " + suma);
    }

}
