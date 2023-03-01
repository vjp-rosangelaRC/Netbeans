/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E04 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static void rellenarArray(ArrayList<Integer> lista) {
        int n;
        
        System.out.println("Introduzca varios números");
        
        do {
            n = pedirN();
            lista.add(n);
        } while (n >= 0);
    }

    public static ArrayList aCero(ArrayList<Integer> lista) {
        ArrayList<Integer> listaB = new ArrayList<>();
        listaB = (ArrayList<Integer>) lista.clone();

        for (int i = 0; i < listaB.size() - 1; i++) {
            if (listaB.get(i) > 0) {
                
                for (int j = i+1; j < listaB.size() - 1; j++) {
                    if (listaB.get(i) == listaB.get(j)) {
                        listaB.set(j, 0);
                    }
                }
            }
        }
        return listaB;
    }
    /*En este caso tendría que usar index of y last index of dentro de un método
    que mire si es repetido
    Usa un método recorrer lista que llama al método sustituirporcero si está 
    repetido 
    No necesito que el for se recorra todo el bucle, solo cuando aparece el primero
    y el ultimo repetido*/

    public static void mostrarListas(ArrayList lista, ArrayList listaB) {
        System.out.println("La lista introducida es: " + lista);
        System.out.println("La lista modificada es " + listaB);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();

        rellenarArray(lista);
        listaB = aCero(lista);

        mostrarListas(lista, listaB);
    }

}
