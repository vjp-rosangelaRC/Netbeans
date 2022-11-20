/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e25;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer múmero: ");
        float num1 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el segundo múmero: ");
        float num2 = entrada.nextFloat();
        System.out.println("Por favor, introduzca el tercer múmero: ");
        float num3 = entrada.nextFloat();
        float suma = num1 + num2 + num3;
        System.out.println("La suma de los números introducidos es: " + suma);
        float producto = num1 * num2 * num3;
        System.out.println("El producto de los números introducidos es: " + producto);
    }
    
}
