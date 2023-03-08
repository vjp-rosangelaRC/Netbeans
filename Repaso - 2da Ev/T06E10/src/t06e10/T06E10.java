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
        int n; 
        n = (int) Math.floor((Math.random()*8)+1);
        return n;
    }
    
    public static void rellenarVector(int[] vector){
        int i; 
        for (i = 0; i < vector.length; i++){
            vector[i]=generarAleatorio();
        }
    }
    
    public static void mostrar(int[] vector){
        int i; 
        for (i = 0; i < vector.length; i++){
            System.out.println("a" + vector[i]);
        }
    }
    
    public static boolean repetidos (int[] vector, int n, int num){
        int i=num; 
        boolean encontrado=false; 
        
        while (i < vector.length && !encontrado){
            if (vector[i] == n ){
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    
    public static void cambiarPorCeros(int[] vector){
        int num; 
        for (int i = 0; i < vector.length; i++){
            if (vector[i] != 0){
                num = vector[i];
                if (repetidos(vector, i, num)){
                    for (int j = i; j < vector.length; j++){
                        vector[j] =0;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       int[] vector = new int[10]; 
       
        rellenarVector(vector);
        mostrar(vector);
        cambiarPorCeros(vector);
        mostrar(vector);
        
    }
    
}
