/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class Pedirnumero {
    public static int pedirN1 (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int n = entrada.nextInt();
        return n;
        
    }
    public static int pedirN2 (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el segundo número:");
        int n = entrada.nextInt();
        return n;
    }
    
    public static int pedirN3 (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el tercer número:");
        int n = entrada.nextInt();
        return n;
    }
    
}
