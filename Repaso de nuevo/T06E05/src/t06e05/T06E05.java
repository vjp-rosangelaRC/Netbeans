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
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n = entrada.nextInt(); 
        return n; 
    }
    
    public static void rellenarArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = pedirN();
            }
        }
    }
    
    public static void mostrarMayor(int[][] array){
        int mayor = array[0][0]; 
                
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(mayor < array[i][j]){
                    mayor = array[i][j]; 
                }
            }
        }
        
        System.out.println("Mayor " + mayor);
    }
    
    public static void mostrarMenor(int[][] array){
        int menor = array[0][0]; 
                
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(menor > array[i][j]){
                    menor = array[i][j]; 
                }
            }
        }
        
        System.out.println("Menor " + menor);
    }
    
    public static void suma (int[][] array){
        int suma = 0; 
                
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma = suma + array[i][j]; 
            }
        }
        
        System.out.println("Suma " + suma );
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[4][2];
        System.out.println("Rellenar array");
        rellenarArray(array);
        mostrarMayor(array);
        mostrarMenor(array);
        suma(array);
    }
    
}
