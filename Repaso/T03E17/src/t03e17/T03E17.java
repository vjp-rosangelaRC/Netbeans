/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e17;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T03E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero;
 
        do{
            System.out.println("Por favor, introduzca un número:");
            numero = entrada.nextInt();
            
            if (numero > 0){
                System.out.println("La raíz de " + numero + " es " +Math.sqrt(numero));
            }
            else {
                System.out.println("Error. Número negativo.");
            }
        }while (numero <= 0);
    }
    
}
