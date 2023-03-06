/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e26;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E26 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean esPrimo (int n){
        boolean primo; 
        primo = true;
        int i = 2; 
        
       while (i < (n/2) && primo == true){
           
            if (n%i == 0){
                primo = false;
            }
            i++;
        }
        
        
        return primo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int n; 
        boolean primo;
        
        System.out.println("Num");
        n = entrada.nextInt();
        primo = esPrimo(n);
        
        if (primo = false){
            System.out.println("Es primo");
        }
        else {
            System.out.println("No es primo");
        }
        
    }
    
}
