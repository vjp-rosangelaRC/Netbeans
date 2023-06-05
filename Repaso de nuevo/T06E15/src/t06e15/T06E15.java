/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e15;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E15 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 100 + 10);
        return n;
    }

    public static void llenarVector(int[] coches) {
        for (int i = 0; i < coches.length; i++) {
            coches[i] = generarAleatorio();
        }
    }

    public static void mostrarVector(int[] coches, String[] mesesDelAnio) {
        for (int i = 0; i < coches.length; i++) {
            System.out.println("Para el mes " + mesesDelAnio[i] + " hubo " + coches[i] + " ventas.");
        }
    }

    public static void mostrarVentasAlReves(int[] coches, String[] mesesDelAnio) {
        for (int i = coches.length - 1; i >= 0; i--) {
            System.out.println("Para el mes " + mesesDelAnio[i] + " hubo " + coches[i] + " ventas.");
        }
    }

    public static void mostrarSuma(int[] coches) {
        int suma = 0;
        for (int i = 0; i < coches.length; i++) {
            suma = suma + coches[i];
        }
        System.out.println("La suma es " + suma);
    }

    public static void ventasPares(int[] coches, String[] mesDelAnio) {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Las ventas para el mes " + mesDelAnio[i] + " fueron " + coches[i]);
                suma = suma + coches[i];
            }
        }
        System.out.println("Las ventas totales de los meses pares fueron " + suma);
    }

    public static void mesConMasVentas(int[] coches, String[] mesDelAnio) {
        int mayor = coches[0]; 
        for (int i = 0; i < coches.length; i++) {
            if(coches[i] > mayor){
                mayor = coches[i]; 
            }
        }
        
        for (int i = 0; i < coches.length; i++) {
            if(coches[i] == mayor){
                System.out.println("Los meses con más ventas son " + mesDelAnio[i] + " con " + coches[i]);
            }
        }
        
    }

    public static void menu(int[] coches, String[] mesesDelAnio) {
        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches\n"
                    + "mensuales. Estas ventas serán números aleatorios entre 10 y 100.\n"
                    + "2. Mostrar las ventas introducidas en el punto anterior.\n"
                    + "3. Mostrar las ventas introducidas al revés.\n"
                    + "4. Que muestre la suma total de ventas del año.\n"
                    + "5. Que muestre las ventas totales de los meses pares.\n"
                    + "6. Que muestre el nombre del mes con más ventas. (Necesitarás otro array con el\n"
                    + "nombre de los meses)\n"
                    + "7. Salir del programa.");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    llenarVector(coches);
                    break;
                }

                case 2: {
                    mostrarVector(coches, mesesDelAnio);
                    break;
                }

                case 3: {
                    mostrarVentasAlReves(coches, mesesDelAnio);
                    break;
                }

                case 4: {
                    mostrarSuma(coches);
                    break;
                }

                case 5: {
                    ventasPares(coches, mesesDelAnio);
                    break;
                }
                
                case 6:{
                    mesConMasVentas(coches, mesesDelAnio);
                    break;
                }

                case 7: {
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("No válido");
                }
            }

        } while (opcion != 7);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] coches = new int[12];
        String[] mesesDelAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        menu(coches, mesesDelAnio);
    }

}
