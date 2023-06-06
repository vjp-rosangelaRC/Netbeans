/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06EA01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = -1;

        try {
            n = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No valido");
            n = -1;
        }
        return n;

    }

    public static void llenarVector(int[] vector) {
        int n; 
        for (int i = 0; i < vector.length; i++) {
            do{
                n = pedirN();
            }while (n < 1 || n > 10);
            
            vector[i] = n; 
        }

    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        System.out.println("Llenar");
        llenarVector(vector);
        mostrarVector(vector);
    }

}
