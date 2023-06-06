/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ea03;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06EA03 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = pedirN();
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public static void vaciarCeldas(int[] vector, int posicion){
        int[] vectorAux = new int[3]; 
        
        for (int i = posicion; i < vector.length - 1; i++) {
            vector[i] = vector[i-1]; 
        }
        int n = vector.length - posicion - 1;
        vector[n] = -1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        
        int posicion; 
        System.out.println("Num?");
        rellenarVector(vector);
        System.out.println("Mostrar");
        mostrarVector(vector);
        
        System.out.println("Mostrar cambiado");
        System.out.println("Pos?");
        posicion = pedirN(); 
        vaciarCeldas(vector, posicion);
        
        mostrarVector(vector);
    }

}
