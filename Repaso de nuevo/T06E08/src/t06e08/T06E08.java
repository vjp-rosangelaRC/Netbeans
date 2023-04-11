/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e08;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E08 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt(); 
        return n;
    }
    
    public static void rellenarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = pedirN();
        }
    }
    
    public static void dividirNumero(int[] array){
        int[] arrayInverso = new int[5]; 
        
        array[1]%1000 = arrayInverso[5];
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[5]; 
        
        rellenarArray(array);
        
        
    }
    
}
