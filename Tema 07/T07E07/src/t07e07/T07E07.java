/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e07;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E07 {

    /**
     * @param args the command line arguments
     */
    public static int MAX = 30;

    public static int generarTempAleatorio() {
        int aleatorio;
        aleatorio = (int) (Math.random() * 45);
        return aleatorio;
    }

    public static int generarDiaAleatorio() {
        int aleatorio;
        aleatorio = (int) (Math.random() * 7);
        return aleatorio;
    }

    public static void rellenarVector(Dia[] vector) {
        String[] vNombres = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int temperatura, n;

        for (int i = 0; i < vector.length; i++) {
            temperatura = generarTempAleatorio();
            n = generarDiaAleatorio();

            vector[i] = new Dia(vNombres[n], temperatura);
        }
    }

    public static void mostrarVector(Dia[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i].toString());
        }
    }
    
    public static float tempMedia(Dia[] vector){
        int suma = 0;
        float media;
        
        for (int i=0; i < vector.length; i++){
            suma = suma + vector[i].getTemperatura();
        }
        
        media = (float) suma/vector.length;
        return media;
    }
    
    public static void diasMasCalurosos(Dia[] vector){
        int i;
        Dia max = vector[0];
        
        for (i=0; i < vector.length; i++){
            if (vector[i]>max){
                max = vector[i];
            }
        }
        
        // Mostrar
        for (i = 0; i < vector.length; i++) {
            if (vector[i] == max) {
                System.out.println("    El " + vector[i].getNombreDia() + " de la semana " + (i + 1) + " con " + max + " grados.");
            }
        }     
    }
            
    public static void menu(Dia[] vector) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("M E N Ú");
            System.out.println("1. Rellenar de forma aleatoria las temperaturas");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes");
            System.out.println("4. Día o días más calurosos del mes");
            System.out.println("5. Salir del programa.");
            System.out.println("Introduzca su opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    rellenarVector(vector);
                    break;
                }

                case 2: {
                    mostrarVector(vector);
                    break;
                }

                case 3: {
                    System.out.println("Media: " + tempMedia(vector));
                    break;
                }
                
                case 4:{
                    diasMasCalurosos(vector);
                    break;
                }
                
                case 5: {
                    System.out.println("Saliendo...");
                    break;
                }

                default: {
                    System.out.println("No es una opción válida.");
                }
            }

        } while (opcion != 5);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Dia[] vector = new Dia[MAX];

        menu(vector);

    }

}
