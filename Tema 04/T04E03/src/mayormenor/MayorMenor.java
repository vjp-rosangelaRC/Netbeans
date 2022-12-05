/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;

/**
 *
 * @author Ross
 */
public class MayorMenor {
    public static void MayorMenor (int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) { 
            System.out.println("El número mayor de los introducidos es " + num1);
        }
        else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("El número mayor de los introducidos es " + num2);
            }
            else {
                if ( num3 > num1 && num3 > num2) {
                    System.out.println("El número mayor de los introducidos es " + num3);
                }
                    
                }             
        }
    }
}
