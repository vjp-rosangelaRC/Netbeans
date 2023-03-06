/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e07;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int diasemana;
        boolean laborable = true;

        System.out.println("Opcion");
        diasemana = entrada.nextInt();

        switch (diasemana) {
            case 1:
                laborable = true;
                break;
            case 2:
                laborable = true;
                break;
            case 3:
                laborable = true;
                break;
            case 4:
                laborable = true;
                break;
            case 5:
                laborable = true;
                break;
            case 6:
                laborable = false;
                break;
            case 7:
                laborable = false;
        }
        System.out.println("" + laborable);

    }

}
