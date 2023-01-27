/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E08 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número de cinco cifras: ");
        int numeroUsuario = entrada.nextInt();        
        return numeroUsuario;
    }
    
    public static void crearArrayconN (int numeroUsuario, int array []) {             
                
        for (int i = 0; i < array.length; i++){
            array[i] = numeroUsuario;           
        }        
    }
    
    public static int [] arrayAlReves (int numeroUsuario, int array []){
        crearArrayconN(numeroUsuario, array);
        
        /*Otra opcion sería */
        int aux;
        aux = array[1];
        array[1] = array[5];
        array[5] = aux;
        
        aux = array [2];
        array [2] = array [4];
        array[4] = aux;
        
        /*Opción 2 (no funciona)*/
         /*
        for (int j = array.length; j > array.length; j--){
            System.out.println("");
        }*/         
        return array;      
    }
    
    
    public static void mostrarN (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[5];
        int numeroUsuario = pedirN();
        
        
        crearArrayconN(numeroUsuario, array);
        arrayAlReves(numeroUsuario, array);
        System.out.println("El array a la inversa es:");
        mostrarN(array);
    }

}
