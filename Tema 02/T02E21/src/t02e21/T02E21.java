/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e21;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T02E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca un número en segundos: ");
        int segundos; 
        segundos = entrada.nextInt();
        int minutos = segundos/60; 
        int horas = minutos/60;
        int dias = horas/24;
        
        System.out.println(segundos + " segundos hacen un total de: " + dias + " días, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
