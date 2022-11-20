/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e28;

import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T02E28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, indique el tamaño del archivo en MB ");
        int mb = teclado.nextInt();
        System.out.println("Por favor, indique la velocidad de su ADSL (en megabits)");
        int adsl = teclado.nextInt();
        int minutos = mb / adsl;
        System.out.println("Su descarga tardará " + minutos + " minutos.");
    }
    
}
