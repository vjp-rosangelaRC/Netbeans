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
            //System.out.println("El valor generado es: " + vector[i]);
        }
    }
    
    public static void todosAMenos1 (int[] vector ) {
        for (int i = 0; i < vector.length; i++) {
                vector[i] = -1;
                //System.out.println("El valor generado es: " + vector[i]);
        }
    }
    
    // Habría que ir insertando el vector en la posición 0 y así, no en la misma
    // Habría que crear int j y hacer j++ 
    public static void paresMayores (int [] vector, int [] vector2){
        for (int i = 0; i < vector.length; i++){
            if ((vector[i] % 2 == 0) && vector[i]>25){
                vector2[i] = vector[i];
                System.out.println(vector2[i]);
            }
        }
    }
    //Tendría que mostrar también el bucle inicial: como inicializo todos a -1 
    //Hago un while que hasta que llegue a -1 muestre el vector2
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        rellenarVector(vector);
        int[] vector2 = new int[10]; //Aqui habría que poner v.lenght 
        todosAMenos1(vector2);
        System.out.println("Los pares mayores de 25 son:");
        paresMayores(vector, vector2);
        
        
        
    }

}
