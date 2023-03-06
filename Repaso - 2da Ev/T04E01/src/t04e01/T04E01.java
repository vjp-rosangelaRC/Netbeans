/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e01;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E01 {

    /**
     * @param args the command line arguments
     */
    public static void positivoONegativo(int n){
        if (n > 0 ){
            System.out.println("Es positivo");
        }
        else {
            if (n < 0 ){
                System.out.println("Es negativo");
            }
            else {
                System.out.println("Es cero");
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n; 
        System.out.println("Introduzca un n");
        n = entrada.nextInt();
        
        positivoONegativo(n);
        
        
    }
    
}
