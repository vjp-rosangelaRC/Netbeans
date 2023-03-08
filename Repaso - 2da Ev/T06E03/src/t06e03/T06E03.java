/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e03;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E03 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int n; 
        n = (int) ((Math.random()*6)+1);
        return n;
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            vector[i]=generarAleatorio();
        }
    }
    
    public static void mostrarVector(int[] vector){
        System.out.println("Mostrar");
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }
    
    public static int pedirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        do{
        try{
            n = entrada.nextInt();
        }
        catch(Exception e){
            System.out.println("No");
            n = -1;
        }
        }while(n >= 0);
        return  n;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[pedirLongitud()];
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
}
