/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e24;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numero, i, contador=0;
        
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = teclado.nextInt();
            if  (numero < 1){
                System.out.print("Error. El número debe ser ayor que 1. ");
            }
        }while(numero <= 1);
        //Mostramos todos los números comprendidos entre 1 y num
        for(i=1;i<=numero;i++){
            if ((i % 3)==0){
               System.out.println(i);
               contador++;
            }
            
            
        }
        
            System.out.println("Contador: " + contador);
    }
    
}
