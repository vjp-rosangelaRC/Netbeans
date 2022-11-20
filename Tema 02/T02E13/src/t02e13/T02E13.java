/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e13;

/**
 *
 * @author Ross
 */
public class T02E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1 = 1;
    int num2 = 2; 
   
    System.out.println("La variable num1 contiene el valor "+ num1 + " y la variable num2 contiene el valor "+ num2 + ".");
    
    int num3 = num1;
    num1 = num2; 
    num2 = num3; 
     
    System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
    }
    
}
