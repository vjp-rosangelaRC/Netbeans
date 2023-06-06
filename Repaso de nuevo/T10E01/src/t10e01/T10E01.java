/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E01 {

    /**
     * @param args the command line arguments
     */
    public static String pedirS() {
        Scanner entrada = new Scanner(System.in);
        String s = entrada.nextLine();
        return s;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduzca un nombre");
        nombres.add(pedirS());
        System.out.println("Quiere introducir mas?");
        while (pedirS().equalsIgnoreCase("si")) {
            System.out.println("Nombre");
            nombres.add(pedirS());
            System.out.println("Quiere introducir mas?");
        }
        
        for(String a:nombres){
            System.out.println(a.toString());
        }

    }

}
