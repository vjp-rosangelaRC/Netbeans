/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E02 {

    /**
     * @param args the command line arguments
     */
     public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>(); 
        int n; 
        
        do{
            System.out.println("Introduzca num");
            n = pedirN();
            if(n != -1){
                lista.add(n);
            }
        }while(n != -1);
        
        System.out.println("Mostras");
        
        for(int l:lista){
            System.out.println(l);
        }
        
        int mayor = lista.get(0);
        for(int l:lista){
            if(l > mayor){
                mayor = l; 
            }
        }
        System.out.println("ma" + mayor);
        
        int menor = lista.get(0);
        for(int l:lista){
            if(l < menor){
                menor = l; 
            }
        }
        System.out.println("me" + menor);
        
        int suma = 0;
        for(int l:lista){
           suma = suma + l; 
        }
        System.out.println("ma" + suma);
    }
    
}
