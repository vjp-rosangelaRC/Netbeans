/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e03;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T06E03 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        return n;
    }
    
    public static int generarAleatorio(){
        int aleatorio; 
        aleatorio = (int) Math.floor((Math.random()*6)+1);
        return aleatorio;
    }
    
    public static int longitudVector() {

        int n;
        do {
            try {
                System.out.println("¿Qué longitud quiere darle al vector?");
                n = pedirN();
            } catch (Exception e) {
                System.out.println("No es un número válido");
                n = -1;
            }
        } while (n <= 0 || n > 10);
        return n;
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
        }
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n =  longitudVector();
        int[] vector = new int[n];
        
        rellenarVector(vector);
        mostrarVector(vector);
        
    }
    
}
