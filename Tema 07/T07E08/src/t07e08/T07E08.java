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
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;

        n = entrada.nextInt();
        return n;
    }

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        String n;

        n = entrada.nextLine();
        return n; //aaa
    }

    public static void menuGeneral(Objetos[] vector) {
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
                    menuComprador(vector);
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

    public static void menuAdministrador() {
        int opcion, n;
        
         
        do {
            System.out.println("M E N Ú     A D M I N I S T R A D O R");
            System.out.println("1. Dar de alta un producto");
            System.out.println("2. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    
                    System.out.println("¿Cuántos objetos quiere crear?");
                    //Objetos[] nVector = crearVectorNuevo();
                    nuevoProducto(crearVectorNuevo());
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

    public static Objetos[] crearVectorNuevo() {
        System.out.println("Vector nuevo");
        int n = pedirN();
        Objetos[] vector = new Objetos[n];
        return vector;
    }

    public static void nuevoProducto(Objetos[] vector) {
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

    public static void menuComprador(Objetos[] vector) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("M E N Ú     C O M P R A D O R");
            System.out.println("1. Comprar un producto");
            System.out.println("2. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    menuVenta(vector);
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
    }
    
    public static void menuVenta(Objetos[] vector){
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("M E N Ú     C O M P R A D O R");
            System.out.println("1. Ver los productos disponibles");
            System.out.println("2. Comprar un producto");
            System.out.println("3. Salir del programa");
            System.out.println("Introduzca su opción:");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    mostrarVector(vector);
                    break;
                }
                
                case 2: {
                    comprarProducto(vector);
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
    
    public static void mostrarVector(Objetos[] vector){
       for (Objetos n:vector){
              System.out.println(n);
          }
    }
    
    public static void comprarProducto(Objetos[] vector) {
        String usuario;
        boolean seguir = true;
        
        do {
            totalProducto(vector);

            System.out.println("¿Quiere seguir comprando?");
            usuario = pedirString();

            if (usuario == "si") {
                seguir = true;
            }
        } while (seguir = true);

    }
        
    public static int escogerProducto(Objetos[] vector){
        int n;      
        System.out.println("Productos:");
        mostrarVector(vector);
        System.out.println("¿Qué producto quiere comprar?");
        n = pedirN();
        
        return n;
    }
    
    public static int escogerUnidades(Objetos[] vector){
        int unidades;      
               
        System.out.println("¿Cuántas unidades quiere comprar?");
        unidades = pedirN();
        comprobarStock(vector);
        return unidades;
    }
    
    public static float totalProducto(Objetos[] vector){
        int n, unidades;
        float total = 0;
        
        n = escogerProducto(vector);
        unidades = escogerUnidades(vector);
                  
        total = total + (vector[n].getPrecio() * unidades);
        
        System.out.println("Su total es " + total);
        return total;
    }
    
    public static int comprobarStock (Objetos[] vector){
        int stock = 0, unidades;
        unidades = escogerUnidades(vector);
        
         for (int i = 0; i < vector.length; i++) {
            stock = vector[i].getStock();
            
            if (stock >= unidades){
                vector[i].setStock(stock - unidades);
            } else {
                System.out.println("No hay suficiente stock");
            }
         }
              
        return stock;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Objetos[] vector = new Objetos[1]; //temporal
        menuGeneral(vector);
        
        /*Para crear el objeto primero pedimos la información y luego la 
        metemos en el vector, posición 0, etc. Uso el constructor parametrizado
        para ir añadiendo la información dentro del vector. También se puede usar
        el constructor por defecto creando un objeto vacío al que luego le añadimos
        la información*/
        /*tengo que crear le vector antes, ya luego vamos haciendo las operaciones
        */
        /*para comprar sería un bucle for con el contenido de los objetos y luego 
        vamos mostrando tipo "pulse 1 para comprar + v.getNombre" y etc*/

    }

}
