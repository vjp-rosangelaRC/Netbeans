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
    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 50 + 15);
        return n;
    }

    public static void rellenarVector(int[] mes) {
        for (int i = 0; i < mes.length; i++) {
            mes[i] = generarAleatorio();
        }
    }

    public static void mostrarTemperaturas(int[] mes, String[] nomDias) {
        
        int j = 0;
        for (int i = 0; i < mes.length; i++) {

            System.out.println("El día " + nomDias[j] + " hubo temp " + mes[i]);
            j++;
            if (j > 6) {
                j = 0;
            }
        }
    }
    
    public static void mediaMes(int[] mes){
        int suma = 0; 
        for (int i = 0; i < mes.length; i++) {
            suma = suma + mes[i];
        }
        System.out.println("La media es " + (suma/mes.length));
    }
    
    public static void diaMasCaluroso(int[] mes, String[] nomDias){
        int mayor = mes[0], j = 0, semana = 1; 
        
        for (int i = 0; i < mes.length; i++) {
            if(mes[i] > mayor){
                mayor = mes[i]; 
            }
        }
        
        
        System.out.println("Dias más calurosos");
        for (int i = 0; i < mes.length; i++) {
            if (mes[i] == mayor){
                System.out.println("El " + nomDias[j] + "de la semana" + semana +  " con " + mes[i] + " grados");
            }
            j++;
            if(j > 6){
                j = 0; 
                semana++;
            }
        }
        
    }

    public static void menu(int[] mes, String[] nomDias) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Rellenar las temperaturas.\n"
                    + "2. Mostrar las temperaturas.\n"
                    + "3. Visualizar la temperatura media del mes.\n"
                    + "4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos fueron:\n"
                    + "• El Jueves de la Semana 3 con 40 grados.\n"
                    + "• El Sábado de la Semana 4 con 40 grados.\n"
                    + "5. Salir del programa.");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {
                    rellenarVector(mes);
                    break;
                }

                case 2: {
                    if (mes[0] != 0) {
                        mostrarTemperaturas(mes, nomDias);
                    } else {
                        System.out.println("Rellene primero las temps");
                    }
                    break;
                }
                
                case 3:{
                    mediaMes(mes);
                    break;
                }
                
                case 4:{
                    diaMasCaluroso(mes, nomDias);
                    break;
                }

                case 5: {
                    System.out.println("saliendo... ");
                    break;
                }
                default: {
                    System.out.println("No es una opción válida");
                }
            }

        } while (opcion != 5);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] mes = new int[28];
        String[] nomDias = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        menu(mes, nomDias);

    }

}
