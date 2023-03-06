/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e03;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int n1, n2, n3;
        System.out.println("Introduzca el primer número");
        n1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        n2 = entrada.nextInt();
        System.out.println("Introduzca el tercer número");
        n3 = entrada.nextInt();
        
        if (n1 > n2 && n1 > n3){
            System.out.println("El número mayor es " + n1);
        }
        else{
            if (n2 > n1 && n2 > n3){
                System.out.println("El número mayor es " + n2);
            }
            else {
                System.out.println("El número mayor es " + n3);
            }
        }
        
    }
    
}
