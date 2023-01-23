/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e04;

/**
 *
 * @author Ross
 */
public class T06E04 {

    /**
     * @param args the command line arguments
     */
    public static void numerosAleatorios(int array[][]) {
        int i, j;

        for (i = 0; i <= array.length; i++) {
            for (j = 0; j <= array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 + 1); //Da error
            }
        }
    }
    
    public static void mostrarPares(int array[][]) {
        int i, j;

        for (i = 0; i <= array.length; i++) {
            for (j = 0; j <= array[i].length; j++) {
                System.out.println("Los números pares son: " + array[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int [4][3]; 
        numerosAleatorios(array);
        mostrarPares(array);
    }
    
}
