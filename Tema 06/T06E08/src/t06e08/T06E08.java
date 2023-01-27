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
        System.out.println(array);
    }
    
    public static int [] arrayAlReves (int numeroUsuario, int array []){
        crearArrayconN(numeroUsuario, array);
        
        for (int j = array.length; j > array.length; j--){
            System.out.println("");
        }
        System.out.println(array);
        return array;
    }
    
    
    /* public static void mostrarN (int array[]){
        System.out.println("El número escrito al revés es : " + arrayAlReves(array));
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[5];
        int numeroUsuario = pedirN();
        
        crearArrayconN(numeroUsuario,array);
        arrayAlReves(numeroUsuario, array);       
       /* mostrarN(array);*/
    }
    
}
