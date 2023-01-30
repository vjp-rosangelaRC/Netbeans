/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomail03;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class EjercicioMail03 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }
    
    public static int generarAleatorio(){
        int aleatorio = (int) ((Math.random()*300)+1) ;
        return aleatorio;
    }
    
    public static int[] rellenarVector(int [] vector){
        int i;
        
        for (i = 0; i < vector.length; i++){
            vector [i] = generarAleatorio();
            // System.out.println("El valor generado es: " + vector[i]);
        } 
        
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
        System.out.println("¿Digito final?");
        int n = pedirN();
        
        for (int i = 0; i < vector.length; i++){
            //String numero = vector[i] + "";
            int resto = vector[i] % 10;
            if (resto == n){
                System.out.println("Coinciden en el último dígito: " + vector[i]);
            } /*else {
                System.out.println("aaa");
            }*/
        }       
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Tamaño del vector?");
        int n = pedirN();
        int [] vector = new int[n];
                
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
}
