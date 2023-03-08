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
    
    public static int pedirN (){
        int n; 
        Scanner entrada = new Scanner(System.in); 
        n = entrada.nextInt(); 
        return n; 
    }
    
    public static int generarAleatorio(){
        int n;
        n = (int) Math.floor((Math.random()*100)+10);
        return n;
    }
    
    public static void rellenarVector(int[] coches){
        for (int i = 0; i < coches.length; i++){
            coches[i] = generarAleatorio();
        }
    }
    
    public static void mostrarVector(int[] coches){
        for (int i = 0; i < coches.length; i++){
            System.out.println(coches[i]);
        }
    }
    
    public static void alReves (int[] coches){
        for (int i = coches.length - 1; i >= 0; i--){
            System.out.println(coches[i]);
        }
    }
    
    public static int ventas (int[] coches){
        int suma = 0; 
        for (int i = coches.length - 1; i >= 0; i--){
            suma = suma + coches[i];
        }
        return suma;
    }
    
    public static void mostrarPares (int[] coches){
        for (int i = 0; i < coches.length; i++){
            if (i % 2 ==0){
               System.out.println(coches[i]); 
            }  
        }
    }
    
    public static void mesMasVentas (int[] coches){
        int mayor; 
        mayor = coches[0];
        String[] meses = new String[]{"Enero", "Febrero", "Marzo", "abril", "mayo", "junio", "julio", "agosto", "spetiembre", "octunre", "noviembre", "diciembre"};
        
        for (int i = 0; i < coches.length; i++){
            if (coches[i] > mayor){
               mayor = coches[i];
            }  
        }
        
        for (int i = 0; i < coches.length; i++){
            if (coches[i] == mayor){
                System.out.println(meses[i]);
            }  
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int[] coches = new int[12];
        
        do{
            System.out.println("1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches\n" +
                "mensuales. Estas ventas serán números aleatorios entre 10 y 100.\n" +
                "2. Mostrar las ventas introducidas en el punto anterior.\n" +
                "3. Mostrar las ventas introducidas al revés.\n" +
                "4. Que muestre la suma total de ventas del año.\n" +
                "5. Que muestre las ventas totales de los meses pares.\n" +
                "6. Que muestre el nombre del mes con más ventas. (Necesitarás otro array con el\n" +
                "nombre de los meses)\n" +
                "7. Salir del programa.");
            opcion = pedirN(); 
            
            switch(opcion){
                case 1:{
                    rellenarVector(coches);
                    break;
                }
                
                case 2:{
                    mostrarVector(coches);
                    break;
                }
                
                case 3:{
                    alReves(coches);
                    break;
                }
                
                case 4:{
                   
                    System.out.println("suma" +  ventas(coches));
                    break;
                    
                }
                
                case 5:{
                    mostrarPares(coches);
                    break;
                }
                
                case 6:{
                    mesMasVentas(coches);
                    break;
                }
                
                case 7:{
                    System.out.println("Saliendo");
                    break;
                }
                default:{
                    System.out.println("No");
                }
            }
        }while(opcion != 7);
        
    }
    
}
