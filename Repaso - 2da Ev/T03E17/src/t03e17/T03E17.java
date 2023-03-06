/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e17;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, raiz;

        do {
            System.out.println("Introduzca un número");
            n = entrada.nextInt();
        } while (n < 0);
        raiz = (int) Math.sqrt(n);
        System.out.println(raiz);
        
    }

}
