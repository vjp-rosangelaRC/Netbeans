/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06ejerciciomail01;

/**
 *
 * @author rdlrosac01
 */



public class T06EjercicioMail01 {

    /**
     * @param args the command line arguments
     */
    final static int MAX = 100;
    
    public static void rellenarVector (int [] vector) {
        int i;
        
        for (i = 0; i < vector.length; i++){
            vector[i] = (int) ((Math.random() * 100) + 1);
            //System.out.println(vector[i]);
        }        
    }
    
    public static int sumarVectores (int [] vector){
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++){
            suma = suma + vector[i];
        }
        //System.out.println("La suma es: " + suma);
        return suma;
    }
    
    public static int mediaVectores (int [] vector){
        int media = 0;
        
        media = sumarVectores(vector) / MAX;    
        //System.out.println("La media es " + media);
        return media;
    }              
    
    public static void main(String[] args) {
        // TODO code application logic here
    int [] vector = new int [MAX];
    
    rellenarVector(vector);
    int suma = sumarVectores(vector);
    int media = mediaVectores(vector);
        System.out.println("La suma es " + suma);
        System.out.println("La media" + media);   
    }
    
}
