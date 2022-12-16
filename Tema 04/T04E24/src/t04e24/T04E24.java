/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e24;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T04E24 {

    /**
     * @param args the command line arguments
     */
    public static String pedirNombre () {
       Scanner entrada = new Scanner (System.in);
       String nombre;
       System.out.println("Introduzca nombre:");
       nombre = entrada.nextLine();
       return nombre;
    }
    
    public static int edad(){
       Scanner entrada = new Scanner (System.in);
       int edad;
       System.out.println("Introduzca su edad:");
       edad = entrada.nextInt();
       return edad;
    }
    
    public static void  mayorDeEdad (String nombre, int edad){
        boolean mayor;

        if (edad >= 18){
            mayor = true;
            System.out.println("Es mayor de edad");
        }
        else{
             mayor = false;
             System.out.println(nombre + " es menor de edad");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = pedirNombre();
        int edad = edad();
        mayorDeEdad(nombre, edad);
    }
    
}
