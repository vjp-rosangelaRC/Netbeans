/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e26;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T04E26 {

    /**
     * @param args the command line arguments
     */
    
    public static int numero(){
       Scanner entrada = new Scanner (System.in);
       int numero;
       System.out.println("Introduzca un número:");
       numero = entrada.nextInt();
       return numero;
    }
    
    public static boolean esPrimo (int numero){
        int resultado=1, i=2;
        boolean primo = true; 
        
        while (i <= numero && primo == true){
            if (numero%1 == 0){
                primo =false;
            }
            i++;
        }
        return primo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = numero();
        boolean primo = esPrimo(numero);
        
        if (primo){
        System.out.println("El número " + numero + " es primo.");
        }
        else{
            System.out.println("El número " + numero + " no es primo.");
        }
        
    }
    
}
