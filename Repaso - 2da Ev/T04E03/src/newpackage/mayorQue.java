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
public class mayorQue {
    public static void mayor (int n1,int n2,int n3){
        
        if (n1 > n2 && n1 > n3){
            System.out.println("El mayor es " + n1);
        }
        else {
            if (n2 > n1 && n2 > n3){
                System.out.println("El mayor es " + n2);
            }
            else{
                System.out.println("El mayor es " + n3);
            }
        }
        
    }
}
