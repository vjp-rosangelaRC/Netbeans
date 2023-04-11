/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e07;

/**
 *
 * @author rdlrosac01
 */
public class T06E07 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int aleatorio; 
        aleatorio = (int) Math.floor(Math.random()*50);
        return aleatorio;
    }
    
    public static void rellenarArray(int[] arrayNumeros){
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = generarAleatorio();
            System.out.println(arrayNumeros[i]);
        }
    }
    
    public static void rellenarMayores(int[] mayores){
        for (int i = 0; i < mayores.length; i++) {
            mayores[i] = -1;
        }
    }
    
    public static void mostrarMayores(int[] arrayNumeros, int[] mayores){
        for (int i = 0; i < mayores.length; i++) {
            if (mayores[i] < 0){
                if (arrayNumeros[i] > mayores[i]){
                    mayores[i] = arrayNumeros[i];
                }
            }
        }
        
        for (int i = 0; i < mayores.length; i++) {
            System.out.println(mayores[i]);
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayNumeros = new int[15];
        int[] mayores = new int[10];
        
        
        rellenarArray(arrayNumeros);
        rellenarMayores(mayores);
        System.out.println("/////");
        mostrarMayores(arrayNumeros, mayores);
        
        
    }
    
}
