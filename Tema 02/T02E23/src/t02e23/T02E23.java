/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02e23;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T02E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea compar: ");
        float precio = entrada.nextFloat();
        System.out.println("¿Cuántas unidades quiere llevarse?");
        int unidades = entrada.nextInt();
        float total = precio * unidades;
        System.out.println("El precio total de su compra es de: " + total + " Euros.");
    }
    
}
