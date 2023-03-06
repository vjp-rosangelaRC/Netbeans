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
        Scanner entrada = new Scanner(System.in); 
        int tamanho, velocidadADSL;
        System.out.println("Introduzca el tamaño del archivo");
        tamanho = entrada.nextInt();
        System.out.println("Introduzca su velocidad");
        velocidadADSL = entrada.nextInt(); 
        System.out.println("Tardaría " + (tamanho/velocidadADSL));
    }
    
}
