/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomail05;

/**
 *
 * @author Ross
 */
public class EjercicioMail05 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int aleatorio = (int) ((Math.random() * 50) + 1);
        return aleatorio;
    }

    public static void rellenarVector(int[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
            // System.out.println("El valor generado es: " + vector[i]);
        }
    }
    
    public static void todosAMenos1 (int[] vector ) {
        for (int i = 0; i < vector.length; i++) {
                vector[i] = -1;
                // System.out.println("El valor generado es: " + vector[i]);
        }
    }
    
    public static void 

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        rellenarVector(vector);
        int[] vector2 = new int[10];
        todosAMenos1(vector2);
        
        
    }

}
