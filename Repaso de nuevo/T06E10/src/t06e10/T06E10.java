/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e10;

/**
 *
 * @author Ross
 */
public class T06E10 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int n = (int) Math.floor(Math.random() * 8 + 1);
        return n;
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio(); 
        }
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static boolean buscarRepetidos(int[] vector, int num){
        boolean encontrado = false; 
        int posicion, i = 0; 
        
        while(!encontrado && i < vector.length ){
            if(vector[i] == num){
                encontrado = true; 
            }
            i++;
        }
        return encontrado; 
    }
    
    
    public static void sustituirPorCero(int[] vector){
        int n; 
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] != 0){
                n = vector[i]; 

                if(buscarRepetidos(vector, n)){
                    for (int j = i+1; j < vector.length; j++) {
                        if(vector[j] == n){
                            vector[j] = 0; 
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10]; 
        rellenarVector(vector);
        System.out.println("Mostrar");
        mostrarVector(vector);
        System.out.println("Sustituir");
        sustituirPorCero(vector);
        mostrarVector(vector);
    }
    
}
