/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e21;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int dividendo, divisor, resultado=0;
        
        System.out.println("Introduzca el número a dividir");
        dividendo = entrada.nextInt();
        System.out.println("Introduzca el número entre el que divide");
        divisor = entrada.nextInt(); 
        /*
        while(divisor == 0){
            System.out.println("Introduzca un número válido");
            divisor = entrada.nextInt(); 
        }
        
        System.out.println("Resultado " + (dividendo/divisor));*/
        
        try{
           resultado = (dividendo/divisor); 
           
        }
        catch(ArithmeticException e){
            System.out.println("No es válido. Pruebe de nuevo");
            divisor = entrada.nextInt(); 
        }
        finally{
            System.out.println("Resultado " + resultado);
        }
        
    }
    
}
