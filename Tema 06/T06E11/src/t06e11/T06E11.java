/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e11;

/**
 *
 * @author Ross
 */
public class T06E11 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9);
            // Falta lo de la repetición, no funciona nada
        }
    }
    
    /*Necesitaria en este caso un método de generar aleatorio y otro que compruebe que 
    el número no esta en el vector. Cuando no está repetido lo inserto en el vector, si 
    está repetido genero un aleatorio nuevamente. 
    Dentro del comrpobar aleatorio neceitaría un bucle do while para comrpobar que el 
    número no está repetido y si lo está vuelvo a iniciar el bucle. NEcesito un booleano
    para controlar el repetido; cuando el repetido false ya paso a almacenar el número 
    generado.  
    Para que no falle este ejercicio necesito que Java, que inicializa automáticamente al 
    0, por eso necesito meter un -1 a todas las celdas, así parto de -1 y no de cero y no 
    me da problemas*/
    
    public static void mostrarVector (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        
        System.out.println("Los números generados son:");
        rellenarVector(vector);
        
        mostrarVector(vector);
        
        
    }
    
}
