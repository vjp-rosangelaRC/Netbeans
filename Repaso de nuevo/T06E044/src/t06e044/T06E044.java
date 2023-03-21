/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e044;

/**
 *
 * @author rdlrosac01
 */
public class T06E044 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n;        
        n = (int) Math.floor(Math.random() * 200 + 100);
        return n;
    }
    
    public static void rellenarVector(int[][] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = generarAleatorio();
            }
            
        }
    }
    
    public static void mostrarPares(int[][] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[1][j] % 2 == 0) {
                    System.out.println(vector[i][j]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[4][3];        
        
        rellenarVector(array);
        mostrarPares(array);
    }
    
}
