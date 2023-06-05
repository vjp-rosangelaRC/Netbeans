/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e17;

/**
 *
 * @author rdlrosac01
 */
public class T06E17 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 9);
        return n;        
    }
    
    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();            
        }
    }
    
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void ordenar(int[] vector) {
        int auxiliar;
        
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < vector.length-1; i++) {
                if (vector[i] < vector[i + 1]) {
                    auxiliar = vector[i];                    
                    vector[i] = vector[i + 1];                    
                    vector[i + 1] = auxiliar;                    
                }
                
            }
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];        
        
        rellenarVector(vector);
        mostrarVector(vector);
        ordenar(vector);
        mostrarVector(vector);
        
    }
    
}
