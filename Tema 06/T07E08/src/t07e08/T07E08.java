/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e08;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T07E08 {

    /**
     * @param args the command line arguments
     */
    
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n;
        
        n = entrada.nextInt();
        return n;
    }
    
    public static String pedirString(){
       Scanner entrada = new Scanner(System.in);
        String n;
        
        n = entrada.nextLine();
        return n; //aaa
    }
    
    public static void menuGeneral(){
        int opcion;

        do {
            System.out.println("M E N Ú");
            System.out.println("1. Menú de administrador");
            System.out.println("2. Menú de comprador");
            System.out.println("3. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    menuAdministrador();
                    break;
                }

                case 2: {
                    //menuComprador();
                    System.out.println("Menú 2");
                    break;
                }

                case 3: {
                    System.out.println("Saliendo...");
                    break;
                }

                default: {
                    System.out.println("No es una opción válida.");
                }
            }

        } while (opcion != 3);
    }
    
    public static void menuAdministrador(){
        int opcion;

        do {
            System.out.println("M E N Ú     A D M I N I S T R A D O R");
            System.out.println("1. Dar de alta un producto");
            System.out.println("2. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    nuevoProducto();
                    break;
                }

                case 2: {
                    System.out.println("Saliendo...");
                    break;
                }

                default: {
                    System.out.println("No es una opción válida.");
                }
            }

        } while (opcion != 2);
    }
    
    public static void crearVectorNuevo(){
        int n = pedirN(); 
        Objetos[] vector = new Objetos[n];
    }
    
    public static void nuevoProducto(Objetos[] vector){
        System.out.println("¿Cuántos objetos quiere crear?");
        crearVectorNuevo();
        rellenarNombreVector(vector);
        rellenarPrecioVector(vector);
        rellenarStockVector(vector);
    }
    
    public static void rellenarNombreVector(Objetos[] vector) {
        String nombreProducto;
        
        for (int i = 0; i < vector.length; i++) {
          System.out.println("¿Nombre del producto?");
          nombreProducto = pedirString();
          vector[i].setNombre(nombreProducto);
        }
    }
    
    public static void rellenarPrecioVector(Objetos[] vector) {
        int precio;
        
        for (int i = 0; i < vector.length; i++) {
          System.out.println("¿Precio del producto?");
          precio = pedirN();
          vector[i].setPrecio(precio);
        }
    }
    
    public static void rellenarStockVector(Objetos[] vector) {
        int stock;
        
        for (int i = 0; i < vector.length; i++) {
          System.out.println("¿Stock del producto?");
          stock = pedirN();
          vector[i].setStock(stock);
        }
    }
    
   /* public static void menuComprador() {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("M E N Ú     C O M P R A D O R");
            System.out.println("1. Dar de alta un producto");
            System.out.println("2. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    rellenarVector(vector);
                    break;
                }

                case 2: {
                    System.out.println("Saliendo...");
                    break;
                }

                default: {
                    System.out.println("No es una opción válida.");
                }
            }

        } while (opcion != 3);
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        menuGeneral();
                
        

        
    
    }
    
}
