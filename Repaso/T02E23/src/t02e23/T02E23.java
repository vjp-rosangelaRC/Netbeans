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
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        double precio, resultado;
       
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar:");
        precio = entrada.nextDouble();
        System.out.println("¿Cuántas unidades quiere llevarse?");
        cantidad = entrada.nextInt();
        resultado = precio * cantidad;
        System.out.println("El precio total de su compra es de " + resultado + " euros.");
    }
    
}
