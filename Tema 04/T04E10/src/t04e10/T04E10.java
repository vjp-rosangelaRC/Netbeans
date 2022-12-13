/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e10;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E10 {

    /**
     * @return 
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int n = entrada.nextInt();
        return n;
    }
    public static void multiplicar (int num){
        int i, resultado;
        for (i=0; i <11; i++){
            resultado = num *i;
            System.out.println(num + "x" + i + "=" + resultado);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        multiplicar(pedirN());
    }
    
}
