/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e25;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E25 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static int comprobarHDD() {
        int capacidadHDD;

        capacidadHDD = pedirN();

        while ((capacidadHDD % 5) != 0) {
            System.out.println("No correcto");
            capacidadHDD = pedirN();
        }

        return capacidadHDD;
    }

    public static String escogerModelo() {
        int elegirModelo;
        String modelo;
        System.out.println("Modelo");
        System.out.println("1 modelo 1; 2 modelo 2");
        elegirModelo = pedirN();
        switch (elegirModelo) {
            case 1: {
                modelo = "1";
                break;
            }
            case 2: {
                modelo = "2";
                break;
            }

            case 3: {
                modelo = "3";
                break;
            }

            default: {
                System.out.println("No existe");
                modelo = "0";
            }
        }
        return modelo;
    }

    public static int comprobarPrecio() {
        int precio;
        System.out.println("Precio");
        precio = pedirN();
        while (precio < 0) {
            System.out.println("No válido");
            precio = pedirN();
        }
        return precio;
    }
    
    public static int comprobarMonitor(){
        int monitor; 
        monitor = pedirN(); 
        while (monitor < 14){
            monitor = pedirN();
        }
        
        return monitor;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int precio, capacidadHDD, monitor; 
        String modelo; 
        
        capacidadHDD = comprobarHDD();
        precio = comprobarPrecio(); 
        modelo = escogerModelo(); 
        monitor = comprobarMonitor();
        
        Ordenador serv = new Servidor(monitor, "teclado", "raton", 10, 15, capacidadHDD, modelo, "grafica", precio);
        Ordenador serv2 = new Servidor(monitor, "teclado", "raton", 12, 10, capacidadHDD, modelo, "grafica", precio);
        
        Ordenador port = new Portatil("marca", monitor, 15, 10, 10, capacidadHDD, modelo, modelo, precio);
        Ordenador port2 = new Portatil("marca", monitor, 15, 10, 10, capacidadHDD, modelo, modelo, precio);
        
        System.out.println(serv.toString());
        

    }

}
