/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e23;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T03E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Introduzca un número:");
        numero = entrada.nextInt();
            
        while (1 >= numero) {
            System.out.println("Introduzca otro número");
            numero = entrada.nextInt();                   
        }
        
        for (int i=1; i <= numero; i++){
            System.out.println(i);
        }
        
        
    }
    
}
