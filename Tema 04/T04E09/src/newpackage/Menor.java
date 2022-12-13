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
public class Menor {
    public static void menorQue (int n1, int n2, int n3){
        //No consigo que pida el número
        if (n1 < n2 && n1 < n3) { 
            System.out.println("El número menor de los introducidos es " + n1);
        }
        else {
            if (n2 < n1 && n2 < n3) {
                System.out.println("El número menor de los introducidos es " + n2);
            }
            else {
                if ( n3 < n1 && n3 < n2) {
                    System.out.println("El número menor de los introducidos es " + n3);
                }
                    
                }             
        }
    }
}
