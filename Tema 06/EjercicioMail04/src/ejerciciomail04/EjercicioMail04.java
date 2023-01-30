/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomail04;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class EjercicioMail04 {

    /**
     * @param args the command line arguments
     */
       
    public static boolean sonIguales(int [] vector, int [] vector2){
        boolean iguales = true;
        
        for (int i = 0; i < vector.length; i++){
            if (vector[i] != vector2[i]){
                iguales = false;
            }
        }
                
        return iguales;
    }
    
    public static void mostrarIguales (boolean iguales){
        if (iguales == true){
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        int [] vector = {1,2,3,4,5};        
        int [] vector2 = {1,2,3,4,5};
        
        boolean iguales = sonIguales(vector, vector2);
        mostrarIguales(iguales);
    }
    
}
