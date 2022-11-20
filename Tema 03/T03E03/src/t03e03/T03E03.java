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
        Scanner entrada;
        entrada = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.println("Por favor introduzca el primer número ");
        num1 = entrada.nextInt();
        System.out.println("Por favor introduzca un segundo número ");
        num2 = entrada.nextInt();
        System.out.println("Por favor introduzca un tercer número ");
        num3 = entrada.nextInt();
        
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
