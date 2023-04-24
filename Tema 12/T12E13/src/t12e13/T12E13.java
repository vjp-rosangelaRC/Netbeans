/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e13;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T12E13 {

    /**
     * @param args the command line arguments
     */
    public static String pedirString(){
        String s; 
        Scanner entrada = new Scanner(System.in);
        s = entrada.nextLine();
        return s; 
    }
    
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        return n; 
    }
    
    public static void pedirDatos(){
        int edad; 
        
        System.out.println("¿Nombre del becario?");
        
        System.out.println("Apellido?");
        
        System.out.println("Edad?");
        edad = pedirN();
        
        while (edad < 20 || edad > 60){
            System.out.println("No es un rango válido, introduzca una edad válida");
            edad = pedirN(); 
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
