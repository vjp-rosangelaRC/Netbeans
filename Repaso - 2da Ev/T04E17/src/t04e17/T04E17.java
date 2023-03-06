/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e17;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        char letra, aleatorio1;
        int aleatorio, contador=0;

        aleatorio = (char) ((Math.random() * 26) + 97);
        aleatorio1 = (char) aleatorio;

        do {
            System.out.println(aleatorio1);
            System.out.println("Adivine");
            letra = entrada.nextLine().charAt(0);
            
            if (aleatorio1 == letra) {
                System.out.println("Enhorabuena");
            }
            else {
                System.out.println("Pruebe de nuevo");
            }
            contador++;
        } while (aleatorio != letra);
        System.out.println(contador);
        

    }

}
