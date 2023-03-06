/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e21;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E21 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static int pedirN2(int n1) {
        Scanner entrada = new Scanner(System.in);
        int n;
        do {
            n = entrada.nextInt();
        } while (n < n1);
        return n;

    }
    
    public static void mostrar (int n1, int n2){
        int n, suma = 0;
        
        for (n = n1; n < n2; n++){
            if (n%2 == 0){
                suma = suma + n;
            }
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2;
        
        n1 = pedirN();
        n2 = pedirN2(n1);
        mostrar(n1, n2);
        
    }

}
