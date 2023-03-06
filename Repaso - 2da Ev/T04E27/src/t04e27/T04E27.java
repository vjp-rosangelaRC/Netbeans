/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e27;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int aleatorio;
        String moneda="", input;
        boolean acierto;

        do {
            acierto = false;
            System.out.println("Cara o cruz");
            input = entrada.nextLine();
            aleatorio = (int) Math.random() * 10;
            System.out.println(aleatorio);
            
            if (aleatorio <= 5) {
                moneda = "cara";
            }
           if (aleatorio >= 5) {
                moneda = "cruz";
            }

            if (moneda.equalsIgnoreCase(input)) {
                acierto = true;
            }
            else {
                System.out.println("Prube a denuevo");
            }

        } while (acierto == false);
        System.out.println("Acertó");
    }

}
