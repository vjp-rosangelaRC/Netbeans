/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e11;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E11 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN (){
        Scanner entrada = new Scanner(System.in); 
        int n; 
        n = entrada.nextInt();
        return n; 
    }
    
    public static int sumar (Numero n1, Numero n2){
        int suma; 
        suma = n1.getValor() + n2.getValor();
        return suma;
    }
    
    public static int mult (Numero n1, Numero n2){
        int mult;
        mult = n1.getValor() * n2.getValor(); 
        return mult;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Numero n1 = new Numero(); 
        n1.setValor(pedirN());
        Numero n2 = new Numero(); 
        n2.setValor(pedirN());
        
        if (n1.getValor() > 10){
            System.out.println("Se ha multiplicado y result" + mult(n1, n2));
        }
        else {
            System.out.println("Se ha sumado y result " + sumar(n1, n2));
        }
        
    }
    
}
