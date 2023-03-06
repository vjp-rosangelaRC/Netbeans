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
        Scanner entrada = new Scanner(System.in); 
        int billetesTotales, billetesAux, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        System.out.println("Introduzca cantidad");
        billetesTotales = entrada.nextInt();
        
        billetesAux = billetesTotales;
        billetes50 = billetesAux/50;
        billetesAux = billetesAux%50; 
        billetes20 = billetesAux/20;
        billetesAux = billetesAux%20; 
        billetes10 = billetesAux/10;
        billetesAux = billetesAux%10;
        monedas2 = billetesAux/2; 
        billetesAux = billetesAux%2; 
        monedas1 = billetesAux; 
        
        System.out.println(billetesTotales + " son " + billetes50 + " de cincuenta, de 20 " + billetes20 + " de 10 " + billetes10 + " y monedas de dos " + monedas2 + " y monedas de 1 " +monedas1);
        
        
        
        
        
    }
    
}
