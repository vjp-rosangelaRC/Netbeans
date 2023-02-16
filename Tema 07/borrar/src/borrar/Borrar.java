/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borrar;

/**
 *
 * @author Ross
 */
public class Borrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[7];
        int aux; 
        
        for(int i=0; i < vector.length; i++){
            for (int j=0; j< vector.length; j++){
                if (vector[j]< vector[i]){
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
        }
        
    }
    
}
