/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e14;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E14 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static int generarAleatorio() {
        int aleatorio;
        aleatorio = (int) Math.floor((Math.random() * 40));
        return aleatorio;
    }

    public static void rellenarTemp(int[][] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                temperaturas[i][j] = generarAleatorio();
            }

        }
    }

    public static void mostrarTemp(int[][] temperaturas, String[] semana) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.println(semana[i] + ": " + temperaturas[i][j]);
            }

        }
    }

    public static int mediaMes(int[][] temperaturas) {
        int media, suma = 0, contador = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma = suma + temperaturas[i][j];
                contador++;
            }
        }
        media = suma / contador;
        return media;
    }

    public static int diaMasCaluroso(int[][] temperaturas, String[] semana) {
        int mayor;
        mayor = temperaturas[0][0];
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] > mayor) {
                    mayor = temperaturas[i][j];
                }
            }
        }
        
        System.out.println("Más calor");
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] == mayor) {
                    System.out.println(temperaturas[i][j] + " - "+ semana[j]);
                }
            }
        }

        return mayor;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] temperaturas = new int[4][7];

        String[] semana = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", " Viernes", "Sábado", "Domingo"};

        int opcion;
        do {
            System.out.println(" Rellenar las temperaturas.\n"
                    + "2. Mostrar las temperaturas.\n"
                    + "3. Visualizar la temperatura media del mes.\n"
                    + "4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos fueron:\n"
                    + "• El Jueves de la Semana 3 con 40 grados.\n"
                    + "• El Sábado de la Semana 4 con 40 grados.\n"
                    + "5. Salir del programa.");
            opcion = pedirN();
            switch (opcion) {
                case 1: {
                    rellenarTemp(temperaturas);
                    break;
                }

                case 2: {
                    mostrarTemp(temperaturas, semana);
                    break;
                }

                case 3: {
                    System.out.println("media : " + mediaMes(temperaturas));
                    break;
                }

                case 4: {
                    diaMasCaluroso(temperaturas, semana);
                }

                case 5: {
                    System.out.println("Salir");
                    break;
                }

                default: {
                    System.out.println("No es opción válida");
                }
            }

        } while (opcion != 5);

    }

}
