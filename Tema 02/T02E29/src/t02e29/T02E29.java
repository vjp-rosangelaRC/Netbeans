/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e29;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, introduzca la longitud del primer cateto");
        float a = teclado.nextFloat();
        System.out.println("Por favor, introduzca la longitud del segundo cateto");
        float b = teclado.nextFloat();
        float resultado = ( a * a) + ( b * b);
        System.out.println("La longitud de la hipotenusa es " + resultado);
        
        
    }
    
}
