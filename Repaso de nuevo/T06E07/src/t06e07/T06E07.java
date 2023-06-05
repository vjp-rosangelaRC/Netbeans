/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e07;

/**
 *
 * @author Ross
 */
public class T06E07 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 50);
        return n;
    }

    public static void rellenarVector(int[] vector, int[] diez) {
        int n;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = generarAleatorio();
            n = vector[i];
            mostrarVector(vector,diez, n);
        }
    }

    public static void mostrarVector(int[] vector, int[] diez, int aleatorio) {
        diez[0] = vector[0];
        int j = 0, pos = 0;
        boolean encontrada = false;

        for (int i = 0; i < diez.length; i++) {
            diez[i] = -1;
        }

        while (!encontrada && j < diez.length) {
            if (aleatorio > diez[j]) {
                pos = j;
                encontrada = true;
            }
            j++;
        }

        if (encontrada) {
            for (int i = diez.length - 1; i > pos; i--) {
                diez[i] = diez[i - 1];
            }
            diez[pos] = aleatorio;
        }
        
    }
    
    public static void mostrar(int[] diez){
        for (int i = 0; i < diez.length; i++) {
            System.out.println(diez[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] quince = new int[15];
        int[] diez = new int[10];
        rellenarVector(quince, diez);
        System.out.println("Mostrar");
        mostrar(diez);
       
        

    }

}
