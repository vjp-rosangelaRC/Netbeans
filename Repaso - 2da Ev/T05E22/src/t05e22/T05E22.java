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
    public static void comprar(Producto producto, int opcion) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Cuantas unidades");
        n = entrada.nextInt();
        producto.actualizarStock(n);

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Producto cepillo = new Producto("cepillo", 15, 10); 
        Producto cama = new Producto("cama", 40, 5); 
        Producto champu = new Producto("champú", 7, 150); 
        Scanner entrada = new Scanner(System.in); 
        int opcion = entrada.nextInt();
        int total=0;
        if (opcion == 1){
            comprar(cepillo, opcion);
            total = total + cepillo.getPrecio();
        }
        if (opcion == 2){
            comprar(cama, opcion);
        }
        if (opcion == 3){
            comprar(champu, opcion);
        }
        
        System.out.println(cepillo.toString());
        System.out.println(cama.toString());
        System.out.println(champu.toString());
        System.out.println(total);
    }
    
}
