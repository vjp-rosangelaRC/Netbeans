/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e22;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E22 {

    /**
     * @param args the command line arguments
     */
    
    public float carritoCompra(Productos producto1){
        Scanner entrada = new Scanner(System.in);
        int opcionMenu;
        do {
            System.out.println("M   E   N   Ú:");
            System.out.println("1.- Añadir objetos al carrito");
            System.out.println("2.- Eliminar objetos del carrito");
            System.out.println("3.- Salir");
            System.out.println("Seleccione una opción:");
            opcionMenu = entrada.nextInt();

            switch (opcionMenu) {
                // Añadir objetos al carrito
                case 1: {
                    System.out.println("¿Qué quiere comprar?");
                    System.out.println("\n" + producto1.getNombreProducto());
                }
                
                //Default
                default: {
                    System.out.println("Introduzca un número válido");
                }
            }
        }while (opcionMenu != 3);   
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Productos producto1 = new Productos("Pienso perro", 15.25, 150);
        Productos producto2 = new Productos("Pienso gato", 16.00, 100);
        Productos producto3 = new Productos("Cepillo", 10, 15);
        
        
        
        
    }
    
}
