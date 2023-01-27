/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e11;

/**
 *
 * @author Ross
 */
public class T06E11 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9);
            // Falta lo de la repetición, no funciona nada
        }
    }
    
    
    public static void mostrarVector (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        
        System.out.println("Los números generados son:");
        rellenarVector(vector);
        
        mostrarVector(vector);
        
        
    }
    
}
