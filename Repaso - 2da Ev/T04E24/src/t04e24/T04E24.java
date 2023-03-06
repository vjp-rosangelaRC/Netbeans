/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e24;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E24 {

    /**
     * @param args the command line arguments
     */
    public static String nombre(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        nombre = entrada.nextLine();
        return nombre;
    }
    
    public static int edad(){
        Scanner entrada = new Scanner(System.in);
        int edad; 
        edad = entrada.nextInt();
        return edad;
    }
    
    public static void mayorDeEdad(int edad, String nombre){
        if (edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }
        else{
            System.out.println(nombre + " no es mayor de edad");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        mayorDeEdad(edad(), nombre());
        
        
        
    }
    
}
