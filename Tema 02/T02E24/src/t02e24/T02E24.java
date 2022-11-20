/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e24;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca la nota de Programación:");
        float notaPGRMC = entrada.nextFloat();
        System.out.println("Por favor, introduzca la nota de Lenguajes de Marcas:");
        float notaLMSGI = entrada.nextFloat();
        System.out.println("Por favor, introduzca la nota de Bases de Datos:");
        float notaBBDD = entrada.nextFloat();
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo:"); 
        float notaENTDL = entrada.nextFloat();
        System.out.println("Por favor, introduzca la nota de Sistemas Informáticos:");
        float notaSSINF = entrada.nextFloat();     
        System.out.println("Por favor, introduzca la nota de Formación y Orientación Laboral:");
        float notaFOL = entrada.nextFloat();
        
        float notaMedia = (notaPGRMC + notaLMSGI + notaBBDD + notaENTDL + notaSSINF + notaFOL)/6;
        System.out.println("Su nota media del curso es: " + notaMedia);
       
    }
    
}
