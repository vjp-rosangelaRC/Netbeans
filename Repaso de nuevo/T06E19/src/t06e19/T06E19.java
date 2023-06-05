/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e19;

/**
 *
 * @author rdlrosac01
 */
public class T06E19 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) Math.floor((Math.random() * 71) + 10);
        return n;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
        }
    }

    public static void mostrarMayor(int[] vector) {
        int mayor = vector[0];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[1];
            }
        }

        System.out.println("El num mayor es " + mayor);
    }

    public static void mostrarMenor(int[] vector) {
        int menor = vector[0];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[1];
            }
        }
        System.out.println("El num menor es " + menor);
    }
    
    public static void moda(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];

        rellenarVector(vector);
        mostrarMayor(vector);

    }

}
