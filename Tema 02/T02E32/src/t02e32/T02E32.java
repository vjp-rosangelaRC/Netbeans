/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e32;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, indique una cantidad de dinero: ");
        int importeTotal, importe = teclado.nextInt();
        importeTotal = importe;
        int billetes50 = importe / 50;
        importe = importe % 50;
        int billetes20 = importe / 20;
        importe = importe % 20;
        int billetes10 = importe / 10;
        importe = importe % 10;
        int billetes5 = importe / 5;
        importe = importe % 5;
        int billetes2 = importe / 2;
        importe = importe %2; 
        int billetes1 = importe/1;
                      
        System.out.println(importeTotal + " euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + billetes2 + " monedas de 2 euros y " +billetes1 + " monedas de 1 euro.");
    }
    
}
