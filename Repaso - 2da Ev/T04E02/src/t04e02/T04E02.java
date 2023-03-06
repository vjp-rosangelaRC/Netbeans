/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e02;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Introduzca n1");
        n1 = entrada.nextInt();
        System.out.println("Introduzca n2");
        n2 = entrada.nextInt();
        
        if (n1 > 10){
            Operaciones.multiplicacion(n1, n2);
        }
        else {
            Operaciones.suma(n1, n2);
        }
        
        
    }
    
}
