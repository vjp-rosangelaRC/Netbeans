/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea04;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06EA04 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = -i+j; 
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]); 
            }
        }
    }
    
    public static int buscarNeg(int[][] vector){
        int contador = 0; 
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if(vector[i][j] < 0){
                    contador++;
                }
            }
        }
        return contador; 
    }
    
    public static void cuandobuscar(int[][] vector){
        int num; 
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Cuantos neg?");
        num = entrada.nextInt();
        
        if(buscarNeg(vector)== num){
            System.out.println("Sí hay esos neg");
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3]; 
        
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        cuandobuscar(matriz);
        
    }
    
}
