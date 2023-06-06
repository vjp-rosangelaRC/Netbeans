/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea10;

/**
 *
 * @author Ross
 */
public class T06EA10 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int n = (int) Math.floor(Math.random() * 50 + 1); 
        return n; 
    }
    
    public static void rellenar(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio(); 
        }
    }
    
    public static void inicializarNeg(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = -1; 
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10]; 
        int[] vector2 = new int[10]; 
        
        rellenar(vector);
        inicializarNeg(vector2);
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] > 25){
                if(vector[i] % 2 == 0){
                    vector2[i] = vector[i]; 
                }
            }
        }
        
        System.out.println("Mostrar");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(vector2[i]); 
        }
        
    }
    
}
