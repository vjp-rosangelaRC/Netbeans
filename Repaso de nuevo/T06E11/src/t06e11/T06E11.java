/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e11;

/**
 *
 * @author rdlrosac01
 */
public class T06E11 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                do {
                    array[i] = (int) Math.floor(Math.random() * 10);
                }while (esRepetido(array, j));
                
            }
        }
    }
    
    public static boolean esRepetido(int[] array, int numero){
        int i = 0; 
        boolean encontrado = false; 
        while (i < array.length  && !encontrado){
            if (array[i] == numero ){
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    
    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        
        rellenarArray(array);
        mostrarArray(array);
    }
    
}
