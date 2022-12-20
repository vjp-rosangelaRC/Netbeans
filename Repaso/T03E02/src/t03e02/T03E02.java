/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e02;

import java.util.Scanner;
import paquete.Multiplicacion;
import paquete.Suma;

/**
 *
 * @author Ross
 */
public class T03E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero1, numero2;
        
        System.out.println("Introduzca el primer número:");
        numero1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo número:");
        numero2 = entrada.nextInt();
        
        if (numero1 > 10){
            System.out.println("La operación que realizó es producto y el resultado es " +Multiplicacion.producto(numero1, numero2) );
        }
        else {
             System.out.println("La operación que realizó es producto y el resultado es " + Suma.suma(numero1, numero2));
        }
        
    }
    
}
