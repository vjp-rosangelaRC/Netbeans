/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e02;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada;
        entrada = new Scanner(System.in);
        int num, num2; 
        System.out.println("Por favor introduzca un número ");
        num = entrada.nextInt();
        
        System.out.println("Por favor introduzca un segundo número ");
        num2 = entrada.nextInt();
        t04e02.Suma.Suma(num, num2);
        t04e02.Producto.Producto(num, num2);
    }
    
}
