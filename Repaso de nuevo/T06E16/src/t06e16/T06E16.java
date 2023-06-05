/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e16;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E16 {

    /**
     * @param args the command line arguments
     */
    public static void rellenarNotas(String[] nombres, String[] asignaturas, int[][] notas) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("¿Nota para el alumno " + nombres[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("Para la asignatura " + asignaturas[j]);
                notas[i][j] = entrada.nextInt();
            }
        }
    }

    public static void mostrarNotas(String[] nombres, String[] asignaturas, int[][] notas) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nota para el alumno " + nombres[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.print("Para la asignatura " + asignaturas[j]);
                System.out.println(notas[i][j]);
            }
        }
    }

    public static void notaMasAlta(String[] nombres, String[] asignaturas, int[][] notas) {
        int mayor = notas[0][0];
        int suma = 0;
        int pos = 0;

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                suma = suma + notas[i][j];
            }
            if (suma > mayor) {
                mayor = suma;
                pos = i;
            }
        }
        System.out.println("El alumno con la nota más alta es " + nombres[pos]);
    }

    public static void masSuspenso(String[] nombres, int[][] notas) {
        int mayor = notas[0][0];
        int contador = 0;
        int pos = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < 5) {
                    contador++;
                }

            }
            if (contador < mayor) {
                mayor = contador;
                pos = i;
            }
        }
        System.out.println("El alumno con la nota más baja es " + nombres[pos]);
    }

    public static void asignaturaMasDificil(String[] asignaturas, int[][] notas) {
        int mayor = notas[0][0];
        int suma = 0;
        int pos = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j]; 
                
                if ((suma/asignaturas.length) < mayor) {
                    mayor = (suma/asignaturas.length); 
                    pos = j; 
                }
            }
        }
        System.out.println("asignatura más dificl " + asignaturas[pos]);
    }

    public static void menu(String[] nombres, String[] asignaturas, int[][] notas) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Rellenar las notas de los alumnos.\n"
                    + "2. Mostrar las notas introducidas en el punto anterior.\n"
                    + "3. Que nos diga que alumno es el mejor de la clase. (nota media más alta) . (Necesitarás\n"
                    + "utilizar otro array unidimensional con los nombres de los alumos)\n"
                    + "4. Que nos diga el alumno con más suspensos.\n"
                    + "5. Que nos diga cual es la asignatura más difícil. (nota media más baja) . (Necesitarás utilizar\n"
                    + "otro array unidimensional con los nombres de las asignaturas)\n"
                    + "6. Salir del programa.");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1: {
                    rellenarNotas(nombres, asignaturas, notas);
                    break;
                }

                case 2: {
                    mostrarNotas(nombres, asignaturas, notas);
                    break;
                }

                case 3: {
                    notaMasAlta(nombres, asignaturas, notas);
                    break;
                }

                case 4: {
                    masSuspenso(nombres, notas);
                    break;
                }

                case 5: {
                    asignaturaMasDificil(asignaturas, notas);
                    break;
                }

                case 6: {
                    System.out.println("Salir");
                    break;
                }
                default: {
                    System.out.println("No válido");
                }
            }

        } while (opcion != 6);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombres = new String[]{"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"};
        String[] asignaturas = new String[]{"Lengua", "Mates", "Historia", "Física"};
        int[][] notas = new int[6][4];

        menu(nombres, asignaturas, notas);

    }

}
