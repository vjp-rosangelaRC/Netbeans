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
        int n; 
        n = (int) Math.floor(Math.random()*50);
        return n; 
    }
    
    public static void rellenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= generarAleatorio();
        }
    }
    
    public static void diezMayores(int[] vectorAuxiliar) {
        for (int i = 0; i < vectorAuxiliar.length; i++) {
            vectorAuxiliar[i] = -1;
        }
    }
    
    public static void insertarMayores(int[] vectorAuxiliar, int aleatorio){
        boolean encontrado = false; 
        int posicion = 0, i = 0; 
        
        while (encontrado == false && (i < vectorAuxiliar.length)){
            if (aleatorio > vectorAuxiliar[i]){
                posicion = i;
                encontrado = true; 
            }
            i++;
        }
        
        if (encontrado){
            for (i = vectorAuxiliar.length -1; i > posicion; i--) {
                vectorAuxiliar[i] = vectorAuxiliar[i-1];
            }
            vectorAuxiliar[posicion] = aleatorio;
        }
        
    }
    
    
    public static void mostrarVector(int[] vectorAuxilair){
        for (int i = 0; i < vectorAuxilair.length; i++) {
            System.out.println(vectorAuxilair[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[15];
        int[] vectorAuxiliar = new int[10];
        
        rellenarVector(vector);
        
        
        diezMayores(vectorAuxiliar);
        insertarMayores(vectorAuxiliar, generarAleatorio());
        mostrarVector(vectorAuxiliar);
        
        
    }
    
}
