/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E02 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) (Math.random() * 6 + 1);
        return n;
    }

    public static int longitudArray() {
        int n;
        Scanner entrada = new Scanner(System.in);
        do {
            try {
                n = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Incorrecto");
                n = entrada.nextInt();
            }
        } while (n > 10 || n < 0);

        return n;
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio(); 
        }
    }
    
    public static void mostrar(int[] vector){
        System.out.println("Mostrar");
        for(int a:vector){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n = longitudArray();

        int[] vector = new int[n];
        rellenarVector(vector);
        mostrar(vector);
    }

}
