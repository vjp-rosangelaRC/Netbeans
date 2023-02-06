/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e02;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E02 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int) (Math.random() * 6 + 1);
        return aleatorio;
    }
    
    public static void rellenarVector(int vector[]) {
        int i;

        for (i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
        }
    }
    
    public static void mostrarVector (int [] vector){ //Con for each
        for (int n:vector){
            System.out.println(n);
        }
    }
    
    public static int longitudUsuario() {
        Scanner entrada = new Scanner(System.in);

        int longitud = 0;

        do {
            System.out.println("Por favor, introduzca una longitud para el vector:");
            try {
                longitud = entrada.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Introduzca un número entero");
                longitud = -1; //Le doy un valor -1 para que siga pidiendo longitud
            } finally {
                entrada.nextLine(); //Esto limpia el buffer
            } 
        } while (longitud < 1 || longitud > 10);
        return longitud;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int longitud, aleatorio;
        longitud = longitudUsuario();
        aleatorio = generarAleatorio();
        
        int[] vector = new int[longitud];
        
        rellenarVector(vector);
        
        System.out.println("El vector generado es");
        mostrarVector(vector);
        
    }
    
}
