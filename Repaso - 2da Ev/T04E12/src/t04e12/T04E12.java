/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e12;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E12 {

    /**
     * @param args the command line arguments
     */
    final static int CONTRA = 1234;

    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }

    public static boolean comprobarContra(int n) {
        boolean contrasenhaigual;

        if (n == CONTRA) {
            contrasenhaigual = true;
        } else {
            contrasenhaigual = false;
        }
        return contrasenhaigual;
    }

    public static void correctaONo(boolean n) {
        if (n == true) {
            System.out.println("La contraseña es correcta");
        } else {
            System.out.println("Pruebe de nuevo");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int n, i = 0;
        boolean salir, contraSi;
        
        do{
            salir = false;
            System.out.println("Pedir n");
            n = pedirN();
            contraSi = comprobarContra(n); 
            correctaONo(contraSi);
            i++;
            
            
        }while (i < 3 && contraSi == false);
        
        if (contraSi == false){
            System.out.println("No");
        }
        else {
            System.out.println("Intentos " + i); 
        }
        

    }

}
