/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea06;

/**
 *
 * @author Ross
 */
public class T06EA06 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1; 
        }
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void sumarVector(int[] vector){
        int suma = 0; 
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];  
        }
        System.out.println("Total " + suma);
        System.out.println("Media " + (suma/vector.length));
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100]; 
        rellenarVector(vector);
        sumarVector(vector);
    }
    
}
