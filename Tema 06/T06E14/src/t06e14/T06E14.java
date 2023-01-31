/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e14;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E14 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int aleatorio = (int) ((Math.random() * 60) + 1);
        return aleatorio;
    }

    public static void rellenarTemperaturas(int[][] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                temperaturas[i][j] = generarAleatorio();
            }
        }
    }

    public static void mostrarTemperatura(int[][] temperaturas){
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.println(temperaturas[i][j]);
            }
        }
    }
    
    public static void menuSeleccionar(int opcionUsuario, int[][] temperaturas) {

        switch (opcionUsuario) {
            case 1: {
                rellenarTemperaturas(temperaturas);
            }
            case 2: { //Mostrar
                mostrarTemperatura(temperaturas);
            }
            default: {
                System.out.println("No es una opción correcta");
            }
        }

    }

    public static void menuTexto() {
        System.out.println("M E N Ú");
        System.out.println("1. Rellenar las temperaturas.");
        System.out.println("2. Mostrar las temperaturas.");
        System.out.println("3. Visualizar la temperatura media del mes");
        System.out.println("4. Día o días más calurosos del mes.");
        System.out.println("5. Salir del programa.");
    }

    public static void menu(int opcionUsuario, int[][] temperaturas) {

        do {
            menuSeleccionar(opcionUsuario, temperaturas);
        } while (opcionUsuario != 5);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int[][] temperaturas = new int[4][7];

        menuTexto();
        int opcionUsuario = entrada.nextInt();
        menu(opcionUsuario, temperaturas);
        //Se crea un bucle infinito con la opción 1

    }

}
