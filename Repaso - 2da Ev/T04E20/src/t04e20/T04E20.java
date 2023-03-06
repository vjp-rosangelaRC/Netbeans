/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e20;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E20 {

    /**
     * @param args the command line arguments
     */
    final static String R1 = "Madrid";
    final static String R2 = "Colon";

    public static String input() {
        Scanner entrada = new Scanner(System.in);
        String n;
        n = entrada.nextLine();
        return n;
    }

    public static int p1(int nota) {
        String resp1;
        System.out.println("Capital");
        resp1 = input();

        if (resp1.equalsIgnoreCase(R1)) {
            System.out.println("Correcto");
            nota = nota + 5;
        } else {
            System.out.println("No es correcto");
        }

        return nota;
    }

    public static int p2(int nota) {
        String resp2;
        System.out.println("America");
        resp2 = input();

        if (resp2.equalsIgnoreCase(R2)) {
            System.out.println("Correcto");
            nota = nota + 5;
        } else {
            System.out.println("No es correcto");
        }

        return nota;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String resp1, resp2;
        int nota = 0;
        p1(nota);
        p2(nota);

        System.out.println(nota);

    }

}
