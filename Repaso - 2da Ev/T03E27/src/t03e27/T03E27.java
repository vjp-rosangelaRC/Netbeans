/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e27;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1, n2, opcion, suma;

        System.out.println("Introduzca n1");
        n1 = entrada.nextInt();
        System.out.println("Introduzca n2");
        n2 = entrada.nextInt();

        do {
            System.out.println("1. Sumar los números");
            System.out.println("2. Restar los números");
            System.out.println("3. Multiplicar los números");
            System.out.println("4. Dividir los números");
            System.out.println("5. Salir");
            System.out.println("Opcion");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    suma = (n1 + n2);
                    System.out.println("suma " + suma);
                    break;
                }
                case 2: {
                    System.out.println("resta " + (n1 - n2));
                    break;
                }
                case 3: {
                    System.out.println("multiplicacion " + (n1 * n2));
                    break;
                }
                case 4: {
                    System.out.println("division " + (n1 / n2));
                    break;
                }
                case 5: {
                    System.out.println("saliendo...");
                    break;
                }
                default: {
                    System.out.println("Opcion no válida");
                }

            }

        } while (opcion != 5);

    }

}
