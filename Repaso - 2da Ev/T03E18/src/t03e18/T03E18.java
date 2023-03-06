/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e18;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E18 {

    /**
     * @param args the command line arguments
     */
    public static int CONTRA = 1234;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n, contador = 0;
        boolean salir;

        do {
            salir = false;
            System.out.println("Introduzca la contraseña");
            n = entrada.nextInt();

            if (n == CONTRA) {
                System.out.println("Enhorabuena");
                salir = true;
            } else {
                System.out.println("No es correcto.");
                contador++;
            }

            if (contador == 3) {
                salir = true;
            }

        } while (salir == false);

    }

}
