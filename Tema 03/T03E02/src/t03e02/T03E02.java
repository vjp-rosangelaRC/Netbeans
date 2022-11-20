/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e02;

import java.util.Scanner;

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
        Scanner entrada;
        entrada = new Scanner(System.in);
        int num, num2, resultado, resultado2; 
        System.out.println("Por favor introduzca un número ");
        num = entrada.nextInt();
        
        System.out.println("Por favor introduzca un segundo número ");
        num2 = entrada.nextInt();
        if (num > 10) {
            resultado = num * num2; 
            System.out.println ("La operación que realizó es producto y el resultado es " + resultado);
        }
        else {
            resultado2 = num + num2;
            System.out.println ("La operación que realizó es suma y el resultado es " + resultado2);
        }
    }
}
    

