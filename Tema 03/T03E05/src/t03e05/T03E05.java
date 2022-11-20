/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e05;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        int num2, num = entrada.nextInt();
        num2 = num % 2;
        
        if (num2 == 0) {
            System.out.println("El número introducido es par");
        }
        else {
            if (num2 == 1) {
                System.out.println("El número introducido es impar");
        
            }
        }
    }
}
