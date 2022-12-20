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
        
        int numero, i=1;
        
        System.out.println("Introduzca un número:");
        numero = entrada.nextInt();
            
        do {
                        
            if (numero <= 1){
                System.out.println("Introduzca otro número");
                numero = entrada.nextInt();
            }     
            
            System.out.println(i);
            i++;
            
        }while (i <= numero);
        
    }
    
}
