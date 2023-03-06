/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e06;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.println("Introduzca una nota");
        nota = entrada.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("No es un número válido. Introduzca un número");
            nota = entrada.nextInt();
        }

        if (nota <= 4) {
            System.out.println("Suspenso");
        } else {
            if (nota > 4 && nota < 7) {
                System.out.println("Bien");
            } else {
                if (nota >= 7 || nota <= 8) {
                    System.out.println("Notable");
                }
                else{
                    System.out.println("Sobresaliente");
                }
            }
        }

    }

}
