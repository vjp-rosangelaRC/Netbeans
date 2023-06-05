/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e11;

/**
 *
 * @author Ross
 */
public class T06E11 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 10);
        return n;
    }

    public static void inicializarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = -1;
        }
    }

    public static void rellenarVector(int[] vector) {
        int n;
        boolean repetido;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == -1) {
                do {
                    n = generarAleatorio();
                    repetido = repetido(vector, n);
                } while (repetido);
                vector[i] = n;
            }
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static boolean repetido(int[] vector, int n) {
        boolean encontrado = false;
        int i = 0;
        while (i < vector.length && !encontrado) {
            if (vector[i] == n) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        inicializarVector(vector);
        rellenarVector(vector);
        mostrarVector(vector);
    }

}
