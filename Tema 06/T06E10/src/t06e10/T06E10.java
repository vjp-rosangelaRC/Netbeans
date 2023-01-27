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
    public static void rellenarVector(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
    }
    
    public static void mostrarVector (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void repetidosACero(int[] vector) { //No funciona, salen todos a cero de ambos modos
        //Forma 1
        /* for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[i] == vector[j]) {
                    vector[i] = 0;
                }
            }
        }*/

        //Forma 2
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == vector[i]) {
                vector[i] = 0;
            }
        }
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        
        System.out.println("Los números generados son:");
        rellenarVector(vector); 
        mostrarVector(vector);
        System.out.println("Poniendo repetidos a cero:");
        repetidosACero(vector);
        mostrarVector(vector);

    }
}
