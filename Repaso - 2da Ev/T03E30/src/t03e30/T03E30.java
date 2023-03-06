/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e30;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int aleatorio, nUsuario = 0, intentos = 0;

        aleatorio = (int) Math.floor((Math.random() * 100) + 1);

        System.out.println(aleatorio);
        do {
            try {
                System.out.println("Adivine");
                nUsuario = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("No es un número");

                entrada.nextLine();
            }
            finally{
                if (nUsuario > aleatorio) {
                System.out.println("Debe ser un número menor");
            } else {
                System.out.println("Debe ser un número mayor");
            }
            }

            
            intentos++;
        } while (nUsuario != aleatorio);

        System.out.println("Felicidades. Ha ganado");
        System.out.println("Has hecho " + intentos);
    }

}
