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

    public static int mostrarTemperatura(int[][] temperaturas){
        int suma  = 0; 
        
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.println(temperaturas[i][j]);
                suma = suma + temperaturas[i][j];
            }
        }
        //System.out.println("La suma es " + suma);
        return suma;
        
    }
    
    public static float temperaturaMedia(int suma, int[][] temperaturas){
        float media;
        media = suma / temperaturas.length;        
        return media; //Media está mal, el vector se tiene que multiplicar
    }
    
    public static void masCalurosos(int[][] temperaturas, String [] dia){
        int [][] mayor = new int [temperaturas.length][temperaturas.length] ; 
        mayor[0][0] = temperaturas[0][0];
        
        //Sacar el más caluroso
        for(int i = 0; i < temperaturas.length;i++){
            for (int j= 0; j < temperaturas[i].length; j++){
                if (mayor[i][j] < temperaturas[i][j]){
                    mayor[i][j] = temperaturas[i][j];
                }
            }
        }
        
        //Sacar el día de la semana
        //i es la semana 
        // j es el día
        
        
        System.out.println("El " + dia + " de la semana " + " con " + mayor + " grados.");
        
    }
    
    public static String [] diasSemana (){
        String [] dia= {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        return dia;
    }
    
    public static void menuSeleccionar(int opcionUsuario, int[][] temperaturas, int suma, String [] dia) {

        switch (opcionUsuario) {
            case 1: {
                rellenarTemperaturas(temperaturas);
                System.out.println("Se han añadido temperaturas");
                break;
            }
            case 2: { 
                System.out.println("Las temperaturas son: ");
                mostrarTemperatura(temperaturas);
                break;
            }            
            case 3: {
                float media = temperaturaMedia(suma, temperaturas);
                System.out.println("La media es " + media + " grados Celcius.");
                break;
            }
            case 4: {
                System.out.println("El día o días más calurosos fueron:");
                masCalurosos(temperaturas, dia);
                break;
            }
            case 5: {
                System.out.println("Saliendo...");
                break;
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

    public static void menu(int opcionUsuario, int[][] temperaturas, int suma, String [] dia) {

        do {
            menuSeleccionar(opcionUsuario, temperaturas, suma, dia);
        } while (opcionUsuario != 5);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int[][] temperaturas = new int[4][7];

        /*menuTexto();
        int opcionUsuario = entrada.nextInt();
        menu(opcionUsuario, temperaturas, suma);
        */
        
        
        rellenarTemperaturas(temperaturas);
        mostrarTemperatura(temperaturas);
        
        /*int suma = mostrarTemperatura(temperaturas);
                
        temperaturaMedia(suma, temperaturas);*/
        String [] dia = diasSemana();
        
        masCalurosos(temperaturas, dia);
    }

}
