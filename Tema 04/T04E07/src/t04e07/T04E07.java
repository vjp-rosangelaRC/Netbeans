/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e07;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n1, n2, n3, n4, n = 0;
       //No funciona la burbuja
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Por favor, introduzca el primer número:");
       n1 = entrada.nextInt();
       System.out.println("Ahora, introduza un segundo número:");
       n2 = entrada.nextInt();
       System.out.println("Introduzca un tercer número");
       n3 = entrada.nextInt();
       System.out.println("Por favor, introduzca un cuarto número:");
       n4 = entrada.nextInt();
       t04e07.Orden.Orden(n1, n2, n3, n4, n);
       System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4);
    }
    
}
