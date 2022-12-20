/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e03;

import java.util.Scanner;
import newpackage.Mayor;

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
        Scanner entrada = new Scanner (System.in);
        
        int numero1, numero2, numero3;
        
        System.out.println("Por favor, introduzca el primer número;");
        numero1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo número;");
        numero2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer número;");
        numero3 = entrada.nextInt();
        
        Mayor.mayorQue(numero1, numero2, numero3);
               
    }
    
}
