/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e29;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int aleatorio, nUsuario;

        aleatorio = (int) Math.floor((Math.random() * 100) + 1);
        
        System.out.println(aleatorio);
        do {
            System.out.println("Adivine");
            nUsuario = entrada.nextInt();
            if (nUsuario > aleatorio) {
                System.out.println("Debe ser un número menor");
            } else {
                System.out.println("Debe ser un número mayor");
            }

        } while (nUsuario != aleatorio);

        System.out.println("Felicidades. Ha ganado");

    }

}
