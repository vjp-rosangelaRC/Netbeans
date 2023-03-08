/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e07;

/**
 *
 * @author Ross
 */
public class T06E07 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio (){
        int aleatorio; 
        aleatorio = (int) Math.floor(Math.random()*50);
        return aleatorio;
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            vector[i] = generarAleatorio();
        }
    }
    
    public static void mostrarMayores(int[] vector, int[] mayores){
        
    } 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numero = new int[15];
        int[] mayores = new int[10];
        mayores[0] = -1;
        
        rellenarVector(numero);
    }
    
}
