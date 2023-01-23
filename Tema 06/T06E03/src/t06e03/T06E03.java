/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e03;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E03 {

    /**
     * @param args the command line arguments
     */
    public static int rellenarVector(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 6 + 1);
            System.out.println(vector[i]);
        }
        return vector[i];
    }

    public static void mostrarVector(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);;
        }
    }

    public static int longitudUsuario() {
        Scanner entrada = new Scanner(System.in);

        int longitud = 0;

        do {
            System.out.println("Por favor, introduzca una longitud para el vector:");
            try {
                longitud = entrada.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Introduzca un número entero");
            } finally {
                entrada.nextLine();
            }
            if (longitud < 1 || longitud > 10) {
                System.out.println("Introduzca un número válido");
            }

        } while (longitud < 1 || longitud > 10);
        return longitud;
    }

    public static void main(String[] args) {
            // TODO code application logic here
            Scanner entrada = new Scanner(System.in);
            int[] vector = new int[7];
            
            
            int opcionMenu;

            do {
                System.out.println("M E N Ú :");
                System.out.println("1. Ver 6 números aleatorios");
                System.out.println("2. Escoger el número de números aleatorios");
                System.out.println("3. Salir");
                opcionMenu = entrada.nextInt();

                switch (opcionMenu) {
                    case 1: {
                        rellenarVector(vector);
                        mostrarVector(vector);
                    }
                    break;

                    case 2: {
                        int[] vector2 = new int[longitudUsuario()];
                        rellenarVector(vector2);
                        mostrarVector(vector2);
                    }
                    break;

                    case 3: {
                        System.out.println("Saliendo...");
                    }
                    break;

                    default: {
                        System.out.println("Introduzca un número válido.");
                    }
                }

            } while (opcionMenu != 3);
    }
}
