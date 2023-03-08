/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e04;

/**
 *
 * @author Ross
 */
public class T06E04 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio(){
        int n; 
        n = (int) Math.floor((Math.random()*200)+100);
        return n;
    }
    
    public static void rellenarVector(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++ ){
                array[i][j] = generarAleatorio();
            }
        }
    }
    
    public static void mostrarPares(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j= 0; j < array[i].length; j++ ){
                if (array[i][j] % 2 == 0){
                    System.out.println(array[i][j]);
                }
                
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[4][3];
        
        rellenarVector(array);
        mostrarPares(array);
        
    }
    
}
