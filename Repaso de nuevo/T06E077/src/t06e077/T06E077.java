/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e077;

/**
 *
 * @author rdlrosac01
 */
public class T06E077 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int aleatorio; 
        aleatorio = (int) Math.floor(Math.random()*50);
        return aleatorio;
    }
    
    public static void rellenarVectorConAleatorios(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
        }
    }
    
    public static void mostrarMayores(int[] vector){
        
        
        for (int i = 0; i < vector.length; i++) {
            
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[15];
        
        rellenarVectorConAleatorios(vector);
        
    }
    
}
