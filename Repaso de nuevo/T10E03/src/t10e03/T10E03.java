/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E03 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static String pedirS() {
        Scanner entrada = new Scanner(System.in);
        String n = entrada.nextLine();
        return n;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();
        int n;
        String salir;

        do {
            System.out.println("Introduzca num");
            n = pedirN();

            lista.add(n);
            System.out.println("Salir?");
            salir = pedirS();
        } while (salir.equalsIgnoreCase("no"));

        System.out.println("Lista");
        for (int l : lista) {
            System.out.println(l);
        }

        System.out.println("Intercambiado");
        int aux;
        if (lista.size() > 4) {
            aux = lista.get(1);
            lista.set(1, lista.get(3));
            lista.set(3, aux);
        }

        for (int l : lista) {
            System.out.println(l);
        }

    }

}
