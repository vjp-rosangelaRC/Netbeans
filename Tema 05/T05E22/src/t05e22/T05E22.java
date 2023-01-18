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
    public boolean salir(){ //Para salir o no del menú
        Scanner entrada = new Scanner(System.in);
        
        String salir="si", salirUsuario = entrada.nextLine();
        boolean salirCase1;
        
        // Igualo salir si al input del usuario
        salirCase1 = salir.equalsIgnoreCase(salirUsuario);
        
        //Muestro mensaje de salida si el usiario quiere salir
        if (salirCase1 == true){
            System.out.println("Objetos añadidos al carito con éxito");
        }
        return true;
    }
    
    //Método para calcular el stock
    public int actualizarStock (){
        int total;
        
        total = producto1.setStockProducto(producto1.getStockProducto() - unidadesCompra);
        return total;
    }
    
    public boolean comprobarStock(){
        
    }
    
    public float carritoCompra(Productos producto1, Productos producto2, Productos producto3){
        Scanner entrada = new Scanner(System.in);
        int opcionMenu, unidadesCompra, selectorProducto;
        double total;
        
        // Falta añadir una manera de calcular el total
        // Aquí hago el menú de compra
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
                    System.out.println("\n 1." + producto1.getNombreProducto() + ": " + producto1.getPrecioProducto() + " €"+ "\n 2." + producto2.getNombreProducto() + ": " + producto2.getPrecioProducto() + " €" + "\n 3." + producto3.getNombreProducto() + ": " + producto3.getPrecioProducto() + " €" );
                    selectorProducto = entrada.nextInt();
                    System.out.println("¿Cuántas unidades quiere?");
                    unidadesCompra = entrada.nextInt();
                    do{
                        System.out.println("¿Quiere comprar otro producto");
                        salir();
                    }while(salir() != true);
                    
                    // Añado al total, necesito sacarlo de aquí para que me sirva pero no funciona
                    if (selectorProducto == 1){
                        total = producto1.getPrecioProducto() * unidadesCompra; 
                        stock();
                        // Buble do while?
                        if (comprobarStock() != true) {
                            System.out.println("No hay stock suficiente. Solo quedan " + producto1.getStockProducto());
                        }
                    }
                    else {
                        if (selectorProducto == 2){
                        total = producto2.getPrecioProducto() * unidadesCompra; 
                    }
                        else {
                            if (selectorProducto == 3){
                                total = producto3.getPrecioProducto() * unidadesCompra; 
                            }
                            else {
                                System.out.println("No se ha seleccionado una opción válida");
                            }
                        }
                    }
                    
                break;
                }
                
                // Eliminar productos del carrito 
                case 2: {
                    
                }
                
                // Salir
                case 3: {
                    System.out.println("Saliendo. Su total es " + total);
                break;
                }
                
                //Default
                default: {
                    System.out.println("Introduzca un número válido");
                }
            }
        }while (opcionMenu != 3); 
        return 0;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Productos producto1 = new Productos("Pienso perro", 15.25, 5);
        Productos producto2 = new Productos("Pienso gato", 16.00, 10);
        Productos producto3 = new Productos("Cepillo", 10, 1);
        
        // Llamo al método carritoCompra
        //carritoCompra(Productos producto1, Productos producto2, Productos producto3);
        
        
        
    }
    
}
