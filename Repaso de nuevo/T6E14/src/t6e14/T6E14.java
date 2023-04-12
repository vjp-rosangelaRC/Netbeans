/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6e14;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T6E14 {

    /**
     * @param args the command line arguments
     */
    public static int MAX = 28;
    
    public static float generarAleatorioTemperaturas() {
        float aleatorio;
        aleatorio = (float)(Math.random() * 50);
        return aleatorio;
    }

    public static int generarAleatorioDias() {
        int aleatorio;
        aleatorio = (int) Math.floor(Math.random() * 7);
        return aleatorio;
    }

    public static void rellenarArray(float[] temperaturasMes) {
        int n = generarAleatorioDias();

        for (int i = 0; i < temperaturasMes.length; i++) {
            temperaturasMes[i] = generarAleatorioTemperaturas();
        }
    }

    public static void mostrarArray(float[] temperaturasMes, String[] diasSemana) {
        int n = generarAleatorioDias();

        for (int i = 0; i < temperaturasMes.length; i++) {
            if (n > 6) {
                n = 0;
            }
            System.out.println(temperaturasMes[i] + "  -  " + diasSemana[n] + " " + (i+1));

            n++;
        }
    }
    
    public static void calcularMedias(float[] temperaturasMes){
        float total = 0; 
        
        for (int i = 0; i < temperaturasMes.length; i++) {
            total = total + temperaturasMes[i];
        }
        System.out.println("La media es " + (total/MAX));
    }
    
    public static void diasMasCaluroso(float[] temperaturasMes){
        float masCaluroso = temperaturasMes[0]; 
        
        for (int i = 0; i < temperaturasMes.length; i++) {
            if(temperaturasMes[i] > masCaluroso){
                masCaluroso = temperaturasMes[i];
            }
        }
        
        // Para mostrarlo
        for (int i = 0; i < 10; i++) {
            System.out.println("El día o días más calurosos fueron");
            
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        float[] temperaturasMes = new float[MAX];
        String[] diasSemana = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

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
                    rellenarArray(temperaturasMes);
                    break;
                }
                
                case 2:{
                    mostrarArray(temperaturasMes, diasSemana);
                    break;
                }
                
                case 3:{
                    calcularMedias(temperaturasMes);
                    break;
                }
                
                case 4:{
                    
                    break;
                }

                case 5: {
                    System.out.println("Saliendo... ");
                    break;
                }

                default: {
                    System.out.println("No es una opción válida");
                }

            }

        } while (opcion != 5);

    }

}
