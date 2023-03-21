/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e08;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E08 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static void rellenarVectorAlReves(int[] vector, int n) {
        int resto; 

        for (int i = 0; i < vector.length; i++) {
            resto = n%10;
            vector[i] = resto;
            resto = resto/10;
        }
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n = -1;
        int[] vector = new int[5];

        while (n < 10000 || n > 99999) {
            System.out.println("Introduzca un número de cinco cifras");
            n = pedirN();
        }

        rellenarVectorAlReves(vector, n);
        mostrarVector(vector);

    }

}
