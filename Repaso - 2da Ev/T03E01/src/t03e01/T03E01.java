/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e01;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        int n; 
        System.out.println("Introduzca un numero");
        n = entrada.nextInt(); 
        
        if (n >0){
            System.out.println("El número es positivo");
        }else{
            if (n == 0){
                System.out.println("El número es cero");
            }else{
                System.out.println("El número es negativo");
            }
        }
    }
    
}
