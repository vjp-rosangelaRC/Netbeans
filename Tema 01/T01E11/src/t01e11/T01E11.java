/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01e11;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T01E11 {

    /**
     * @param args the command line arguments
     */
     public static int pedirNPositivo (){
       Scanner entrada = new Scanner(System.in);
         int n;
       while (n <= 0){
           System.out.println("Introduzca un número:");
       
        n = entrada.nextInt();
       };
        
        return n;
     }
     
     public static void raizCuadrada (int numero){
         
        System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        raizCuadrada(pedirNPositivo());
    }
    
}
