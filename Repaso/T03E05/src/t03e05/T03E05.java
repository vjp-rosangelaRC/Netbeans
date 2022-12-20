/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e05;

import java.util.Scanner;
import newpackage.ParImpar;

/**
 *
 * @author Ross
 */
public class T03E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Introduzca un número:");
        numero = entrada.nextInt();  
        
        ParImpar.partImpar(numero);
    }
    
}
