/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e13;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T04E13 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int n = entrada.nextInt();
        return n;
    }
    
    public static boolean mayorQueUno(int numero, boolean menor){
    Scanner teclado = new Scanner(System.in);
    numero = pedirN();
    while (numero <= 1){
            System.out.print("Introduce numero mayor que 1: ");
            numero = teclado.nextInt();
            if  (numero < 1){
                menor = false;
                System.out.print("Error. El número debe ser ayor que 1. ");
            }
        };
    return menor;
    }
    
    public static int output (){
        int i, numero;
        numero = mayorQueUno();
        for(i=1;i<=numero;i++){
            if ((i % 3)==0){
               System.out.println(i);
            }
        }
        return numero;
    }
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, i; 
        numero = output();
        System.out.println("Los números son " + numero);
        
        
    }
    
}
