/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e21;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T02E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int dias, horas, minutos, segundos, input;
        
        System.out.println("Input:");
        input = entrada.nextInt();
        
        segundos = input%60;
        input = input/60;
        
        minutos=input%60;
        input=input/60;
        
        dias=input/24;
        horas=input%24;
        
        System.out.println("input" + input + "dias" + dias  + "horas" + horas + "minutos" + minutos + "segundos" + segundos);
    }
    
}
