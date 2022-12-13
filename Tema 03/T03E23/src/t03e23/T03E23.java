/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e23;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero, i; 
        
        do{
            System.out.println("Introduzca número:");
            numero = entrada.nextInt();
            if (numero < 1){
                System.out.println("Error");
            }
  
        }while (numero <= 1);
        for (i=1; i<=numero; i++){
        System.out.println(i);
        }
        
    }
    
}
