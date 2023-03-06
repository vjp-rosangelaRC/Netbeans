/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e05;

import java.util.Scanner;
import newpackage.parImpar;

/**
 *
 * @author Ross
 */
public class T04E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int n; 
        System.out.println("N");
        n = entrada.nextInt();
        
        parImpar.parImpar(n);
        
    }
    
}
