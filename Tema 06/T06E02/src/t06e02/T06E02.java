/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e02;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E02 {

    /**
     * @param args the command line arguments
     */
    public static void pedirN(int vector[]) {
        Scanner entrada = new Scanner(System.in);

        int i;

        System.out.println("Introduzca un número entero");
        for (i = 0; i < vector.length; i++) {
            System.out.println("Introduzca el número " + (i + 1) + ":");
            vector[i] = entrada.nextInt();
        }
    }

    public static void mostrarDatos(int vector[]) {
        int i;

        System.out.println("Los números introducidos son: ");

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void intercambiarOrden(int vector[]) {
        int aux;
        aux = vector[1];
        vector[1] = vector[3];
        vector[3] = aux;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[7];

        pedirN(vector);
        mostrarDatos(vector);
        intercambiarOrden(vector);
        System.out.println("Ahora, con los datos cambiados,");
        mostrarDatos(vector);

    }

}
