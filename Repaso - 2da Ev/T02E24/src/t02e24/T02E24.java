/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e24;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T02E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int notaP, notaL, notaB, notaE, notaS, notaF, media; 
        
        System.out.println("Programacion");
        notaP = entrada.nextInt();
        
        System.out.println("Lenguaje");
        notaL = entrada.nextInt();
        
        System.out.println("BAses");
        notaB = entrada.nextInt();
        
        System.out.println("Entornos");
        notaE = entrada.nextInt();
        
        System.out.println("Sistemas");
        notaS = entrada.nextInt();
        
        System.out.println("Fol");
        notaF = entrada.nextInt();
        
        media = (notaP + notaL + notaB + notaE + notaS + notaF) / 6; 
        System.out.println("" + media);
        
    }
    
}
