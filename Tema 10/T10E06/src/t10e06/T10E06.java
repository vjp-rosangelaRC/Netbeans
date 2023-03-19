/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Ross
 */
public class T10E06 {

    /**
     * @param args the command line arguments
     */
    public static int MAX = 12;
    
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt(); 
        return n;     
    }
    
    public static void introducirVentas(String[] mesesAnho, ArrayList lista) {
        int n; 
        for (int i=0; i < mesesAnho.length; i++){
            System.out.println("Introduzca las ventas para " + mesesAnho[i]);
            n = pedirN();
            lista.add(n);
        }
    }
    
    public static void mostrarVentas(String[] mesesAnho, ArrayList lista) {
        System.out.println("Las ventas ha sido:");
        
        for (int i=0; i < mesesAnho.length; i++){
            System.out.println("Para " + mesesAnho[i] + ": " + lista.get(i));
        }
    }
    
    public static void mostrarVentasAlReves(String[] mesesAnho, ArrayList lista) {
        System.out.println("Las ventas ha sido:");

        for (int i = 12; i > mesesAnho.length; i--){
            System.out.println("Para " + mesesAnho[i] + ": " + lista.get(i));
        }
    }
    
    public static void sumaTotal (ArrayList lista) {
        int suma = 0; 
        for (int i=0; i < MAX; i++){
            suma = suma + (int) lista.get(i);
        }
        System.out.println("El total de ventas del año ha sido: " + suma);
    }
    
    public static void sumaAnhosA (String[] mesesAnho, ArrayList lista) {
        ArrayList <String[]> meses = new ArrayList<>();
        meses.add(mesesAnho);
        
        int suma = 0; 
        String a = "a";
        
        for (int i=0; i < MAX; i++){
            if (meses.contains(a)){
                suma = suma + (int) lista.get(i);
            }
        }
        System.out.println("El total de ventas para los meses con a son: " + suma);
    }
    
    public static void main(String[] args) { //lo idea sería usar un vector porque estático
        // TODO code application logic here
        
        int opcion;
        int prueba;
        
        String[] mesesAnho = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        ArrayList lista = new ArrayList(); //Aquí falta declararlo como integer
        
        do {
            System.out.println("1. Introducir las ventas de coches de cada uno de los 12 meses del año.");
            System.out.println("2. Mostrar las ventas introducidas en el punto anterior,");
            System.out.println("3. Mostrar las ventas introducidas al revés.");
            System.out.println("4. Que muestre la suma total de ventas del año");
            System.out.println("5. Que mietre las ventas totales de los meses cuyo nombre contenga la letra a.");
            System.out.println("6. Que muestre el nombre del mes (o meses) con más ventas");
            System.out.println("7. Salir del programa");
            opcion = pedirN();
            
            switch(opcion){
                case 1: {
                    introducirVentas(mesesAnho, lista);
                    break;
                }
                
                case 2: {
                    mostrarVentas(mesesAnho, lista);
                    break;
                }
                
                case 3: {
                    mostrarVentasAlReves(mesesAnho, lista); //Este no va 
                    break;
                }
                
                case 4: {
                    sumaTotal(lista);
                    break;
                }
                
                case 5:{
                    sumaAnhosA(mesesAnho, lista); //No funciona
                    break;
                }
                
                case 7:{
                    System.out.println("Saliendo ...");
                    break;
                }
                default: {
                    System.out.println("No es una opción válida");
                }
            }
        }while (opcion != 7);
        
        
    }
    
}
