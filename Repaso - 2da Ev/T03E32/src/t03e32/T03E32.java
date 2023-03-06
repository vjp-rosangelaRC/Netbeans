/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e32;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int anhoActual, anhoNac, mesAct, mesNac, diaAct, diaNac;
        
        System.out.println("Año actual");
        anhoActual = entrada.nextInt();
        System.out.println("Mes actual");
        mesAct = entrada.nextInt();
        System.out.println("Dia actual");
        diaAct = entrada.nextInt();
        
        System.out.println("Año nacimiento");
        anhoNac = entrada.nextInt();
        System.out.println("Mes nac");
        mesNac = entrada.nextInt();
        System.out.println("Dia nac");
        diaNac = entrada.nextInt();
        
        System.out.println("Su edad es " + (anhoActual - anhoNac));
        
        
        
    }
    
}
