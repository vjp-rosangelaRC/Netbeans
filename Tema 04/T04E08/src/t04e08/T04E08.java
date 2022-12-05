/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, indique una cantidad de dinero:");
        int importeTotal = 0, importe = entrada.nextInt();
        t04e08.Billetes.Billetera(importeTotal, importe);
    }
    
}
