/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e10;

/**
 *
 * @author rdlrosac01
 */
public class T06E10 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarVector(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random()*8+1);
        }
    }
    
    public static void mostrarVector(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static boolean buscarRepetido(int[] array, int numero, int posicion){
        boolean encontrado; 
        encontrado = false;
        int i = posicion; 
        
        while ((i < array.length) && !encontrado){
            if(array[i] == numero){
                encontrado = true; 
            }
            i++;
        }
        
        return encontrado;
    }
    
    public static void sustituirPorCero (int[] array){
        int numero; 
        boolean repetido;
       
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                numero = array[i];
                repetido = buscarRepetido(array, numero, i+1);
                if (repetido){
                    for (int j = i; j < array.length; j++) {
                        if (array[j] == numero){
                            array[j] = 0;
                           
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        
        rellenarVector(array);
        System.out.println("Vector rellenado");
        mostrarVector(array);
        
        System.out.println("Sustituyendo...");
        sustituirPorCero(array);
        mostrarVector(array);
        
    }
    
}
