/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e04;

/**
 *
 * @author Ross
 */
public class NumeroMenor {
    public static void NumeroMenor (int num1, int num2, int num3) {
    
    if (num1 < num2 && num1 < num3) { 
            System.out.println("El número menor de los introducidos es " + num1);
        }
        else {
            if (num2 < num1 && num2 < num3) {
                System.out.println("El número menor de los introducidos es " + num2);
            }
            else {
                if ( num3 < num1 && num3 < num2) {
                    System.out.println("El número menor de los introducidos es " + num3);
                }
                    
                }    
    }
        }
}
