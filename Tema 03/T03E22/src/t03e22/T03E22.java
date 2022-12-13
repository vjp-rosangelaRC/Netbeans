/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int numero, numero2, resultado;
        boolean error;
        do{
            error = false;
            try{
            System.out.println("Número 1:");
            numero = entrada.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Error");
                numero = 0;
                error = true;
                entrada.next();
            }
        }while(error);
        do{
            error = false;
            try{
            System.out.println("Número 2:");
            numero2 = entrada.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Error");
                numero2 = 0;
                error = true;
                entrada.next();
            }
        }while(error);
        resultado = numero + numero2;
        System.out.println("El resultado es " +resultado);
            
            
           
        
    }
    
}
    

