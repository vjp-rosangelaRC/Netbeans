/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ea03;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class MenuPlatos {

    public static void menu(Platos plato1, Platos plato2, Platos plato3, Platos plato4) {
        Scanner entrada = new Scanner(System.in);
        int opcionMenu, raciones;
        double total;

        do {
            System.out.println("M E N Ú");
            System.out.println("Los platos disponibles son");
            System.out.println("1" + plato1.toString());
            System.out.println("2" + plato2.toString());
            System.out.println("3" + plato3.toString());
            System.out.println("4" + plato4.toString());
                   
            System.out.println("Escoja un plato");
            opcionMenu = entrada.nextInt();
            switch (opcionMenu) {
                case 1: { //Plato 1
                    System.out.println("¿Cuántas raciones quiere?");
                    raciones = entrada.nextInt();
                    plato1.setNumeroRaciones(opcionMenu - plato1.getNumeroRaciones());
                    if ( plato1.getNumeroRaciones() < raciones){
                        System.out.println("No hay raciones suficientes");
                    } // Aquí faltaría un else 
                    total = (plato1.getPrecio() * raciones);
                    System.out.println("Su total sería: " + total);
                    break;                        
                }
                
                case 2: { //Plato 2
                    System.out.println("¿Cuántas raciones quiere?");
                    raciones = entrada.nextInt();
                    plato1.setNumeroRaciones(opcionMenu - plato2.getNumeroRaciones());
                    if ( plato2.getNumeroRaciones() < raciones){
                        System.out.println("No hay raciones suficientes");
                    }
                    total = (plato2.getPrecio() * raciones);
                    System.out.println("Su total sería: " + total);
                    break;                        
                }
                
                case 3: { //Plato 3
                    System.out.println("¿Cuántas raciones quiere?");
                    raciones = entrada.nextInt();
                    plato1.setNumeroRaciones(opcionMenu - plato3.getNumeroRaciones());
                    if ( plato3.getNumeroRaciones() < raciones){
                        System.out.println("No hay raciones suficientes");
                    }
                    total = (plato3.getPrecio() * raciones);
                    System.out.println("Su total sería: " + total);
                    break;                        
                }
                
                case 4: { //Plato 4
                    System.out.println("¿Cuántas raciones quiere?");
                    raciones = entrada.nextInt();
                    plato1.setNumeroRaciones(opcionMenu - plato4.getNumeroRaciones());
                    if ( plato4.getNumeroRaciones() < raciones){
                        System.out.println("No hay raciones suficientes");
                    }
                    total = (plato4.getPrecio() * raciones);
                    System.out.println("Su total sería: " + total);
                    break;                        
                }
                
                case 5: {
                    System.out.println("Saliendo ...");
                }
                
                default: {
                    System.out.println("No es una opción válida");
                }
            }
        } while (opcionMenu != 5);
    }
}
