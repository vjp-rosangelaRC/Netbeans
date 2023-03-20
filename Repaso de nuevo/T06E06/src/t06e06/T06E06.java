/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e06;

/**
 *
 * @author rdlrosac01
 */
public class T06E06 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
           
                System.out.println(vector[i]);
            
        }
    }
    
    public static void rellenarVector(int[] vector) {
       int contador = 0, i = 1; 
       while (contador < 80){
           if(esPrimo(i)){
               vector[contador] = i; 
               contador++;
           }
           i++;
       }
    }

    public static boolean esPrimo(int numero) {
        boolean esPrimo;
        esPrimo = true;
        int i = 2; 
        
        while (esPrimo && (i < (numero / 2))) {
            if (numero % i == 0) {
                esPrimo = false;
            }
            i++;
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[80];
        
        rellenarVector(vector);
        mostrarVector(vector);

    }

}
