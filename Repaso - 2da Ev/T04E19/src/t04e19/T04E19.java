/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e19;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E19 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String dia; 
        System.out.println("Dia");
        dia = entrada.nextLine(); 
        
        if (dia.equalsIgnoreCase("Lunes")){
            System.out.println("El " + dia + " es el primer día");
        } else {
            if (dia.equalsIgnoreCase("Martes")){
            System.out.println("El " + dia + " es el segundo día");
        }
        }
        
    }
    
}
