/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e15;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E15 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int n = entrada.nextInt();
        return n;
    }
    
    public static int suma (int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        System.out.println(resultado);
        return resultado;
    }
    
    public static int resta (int numero1, int numero2){
        int resultado;
        resultado = numero1 - numero2;
        System.out.println(resultado);
        return resultado;
    }
    
    public static int multiplicacion (int numero1, int numero2){
        int resultado;
        resultado = numero1 * numero2;
        System.out.println(resultado);
        return resultado;
    }
    
    public static boolean divisionCero (int numero1, int numero2){
        int resultado;
        boolean divisible = true;
        try{
        resultado = numero1 / numero2;
        }
        catch (ArithmeticException e){
            divisible = false;
            resultado = 0;
        }
        return divisible;
    }
    
    public static int division (int numero1, int numero2){
        int resultado;
        boolean divisible;
        divisible = divisionCero(numero1, numero2);
        if ( divisible = true){
            resultado = numero1 / numero2;
            System.out.println(resultado);
        }
        else {
            resultado=0;
        }
        
        return resultado;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2, opcion, resultado;
        
        do{
        numero1 = pedirN();
        numero2 = pedirN();
        
        System.out.println("Menú: ");
        System.out.println("Pulse 1");
        System.out.println("Pulse 2");
        System.out.println("Pulse 3");
        System.out.println("Pulse 4");
        System.out.println("Pulse 5");
        
        opcion = pedirN();
            switch (opcion){
                case 1:{
                    suma(numero1, numero2);
                    break;
                }
                case 2:{
                    resta (numero1, numero2);
                    break;
                }
                case 3:{
                    multiplicacion (numero1, numero2);
                    break;
                }
                case 4:{ //esto a método
                    division (numero1, numero2);
                    break;
                }
                case 5:{
                    System.out.println("Salir");
                    break;
                }
                default:{
                    System.out.println("Incorrecto");
                }
            }
            }while (opcion != 5);
                  
    }
    
}
