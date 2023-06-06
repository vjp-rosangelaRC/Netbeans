/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea09;

/**
 *
 * @author Ross
 */
public class T06EA09 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1; 
        }
    }
    
    public static void rellenarVector2(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i; 
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        int[] vector2 = new int[10];

        rellenarVector(vector);
        rellenarVector(vector2);
        int cont = 0; 
        boolean dif = false; 
        
        int i = 0; 
        while(i < vector.length && dif==false){
            if(vector[i] != vector2[i]){
                System.out.println("Dif");
                dif = true; 
            } else {
                 i++;
            }
        }
        
    }

}
