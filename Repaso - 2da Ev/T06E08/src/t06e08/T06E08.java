/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06e08;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T06E08 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Num");
        int n = entrada.nextInt();
        while (n > 99999) {
            System.out.println("Num");
            n = entrada.nextInt();
        }
        return n;
    }
    
    public static void cifras (int n, int[] aa){
        int n1, n2, n3, n4, n5; 
        
        n1 = (n/10000);
        n = n%10000;
        n2 = (n/1000);
        n = n%1000;
        n3 = (n/100);
        n = n%100;
        n4 = (n/10);
        n = n%10;
        n5 = n;
        
        aa[0]=n5; 
        aa[1]=n4;
        aa[2]=n3;
        aa[3]=n2;
        aa[4]=n1;
        
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] aa = new int[5];
        
        cifras(pedirN(), aa);
        mostrarVector(aa);
    }

}
