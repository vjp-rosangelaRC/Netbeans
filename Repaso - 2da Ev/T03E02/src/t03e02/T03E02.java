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
        Scanner entrada = new Scanner(System.in);
        int n1, n2; 
        System.out.println("Introduzca el primer númeri");
        n1 = entrada.nextInt();
        System.out.println("Introduzca el segundo númeri");
        n2 = entrada.nextInt();
        
        if (n1 > 10){
            System.out.println(n1 * n2);
        } 
        else {
            System.out.println(n1+n2);
        }
        
        
    }
    
}
