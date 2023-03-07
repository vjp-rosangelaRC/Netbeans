/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e09;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E09 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("N?");
        n = entrada.nextInt();
        return n;
    }

   
    public static int mayor(Numero n1, Numero n2, Numero n3){
        int mayor = 0;
        if (n1.getValor() > n2.getValor() && n1.getValor() > n3.getValor()){
            mayor = n1.getValor();
        }
        else {
            if (n2.getValor() > n1.getValor() && n2.getValor() > n3.getValor()){
                mayor = n2.getValor();
            }
            else{
                mayor = n3.getValor();
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        // TODO code application logic here
         Numero num2 = new Numero();
        num2.setValor(pedirN());
         Numero num = new Numero();
        num.setValor(pedirN());
        Numero num3 = new Numero();
        num3.setValor(pedirN());
        
        int mayor, n1;

        
        mayor = mayor(num3, num2, num);
        
        System.out.println(mayor);
        
    }

}
