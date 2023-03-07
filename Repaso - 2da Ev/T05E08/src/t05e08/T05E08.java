/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E08 {

    /**
     * @param args the command line arguments
     */
    public static void parImpar (Numero num){
        int n; 
        n = num.getValor();
        if (n%2 == 0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impart");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada  = new Scanner(System.in); 
        int n; 
        
        System.out.println("Introduzca n");
        n = entrada.nextInt(); 
        
        Numero num = new Numero(n); 
        parImpar(num);
        
    }
    
}
