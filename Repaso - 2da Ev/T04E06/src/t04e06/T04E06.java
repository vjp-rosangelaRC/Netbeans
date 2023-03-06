/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e06;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E06 {

    /**
     * @param args the command line arguments
     */
    public static void nota(int nota){
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Introduzca nota");
            nota = entrada.nextInt();
        } while (nota < 0 || nota > 10);
        
        if (nota < 4){
            System.out.println("Suspenso");
        }
        if (nota == 5 || nota == 6){
            System.out.println("bien");
        }
        if (nota == 7 || nota ==8){
            System.out.println("Notable");
        }
        if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota = 0;

        nota(nota);

    }

}
