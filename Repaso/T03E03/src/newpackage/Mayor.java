/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Ross
 */
public class Mayor {
    public static void mayorQue (int numero1, int numero2, int numero3){
        
        if (numero1 > numero2 && numero1 > numero3) { 
            System.out.println("El número mayor de los introducidos es " + numero1);
        }
        else {
            if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("El número mayor de los introducidos es " + numero2);
            }
            else {
                if ( numero3 > numero1 && numero3 > numero2) {
                    System.out.println("El número mayor de los introducidos es " + numero3);
                }
                    
                }             
        }
        
    }
}
