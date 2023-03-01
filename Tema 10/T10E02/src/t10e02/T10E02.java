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
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n; 
        n = entrada.nextInt();
        return n;
    }
    
    public static int mayorDeLaLista (ArrayList lista){
        int mayor;
        mayor = (int) lista.get(0);
        
        for (int i=0; i < (lista.size() - 1); i++){
            if (mayor < (int) lista.get(i)){
                mayor = (int) lista.get(i);
            }
        }        
        return mayor;
    }
    
    public static int menorDeLaLista (ArrayList lista){
        int menor;
        menor = (int) lista.get(0);
        
        for (int i=0; i < (lista.size() - 1); i++){
            if (menor > (int) lista.get(i)){
                menor = (int) lista.get(i);
            }
        }        
        return menor;
    }
           
    public static int suma (ArrayList lista){
        int suma=0; 
        
        for (int i=0; i < (lista.size() - 1); i++){
            suma = suma + (int) (lista.get(i));
        }        
        return suma;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> lista = new ArrayList <Integer>();
        int n, suma, mayor, menor;
        
        do{
            System.out.println("Introduzca un número");
            n= pedirN();
            lista.add(n);
        }while(n >= 0);
        
        suma = suma(lista);
        mayor = mayorDeLaLista(lista);
        menor = menorDeLaLista(lista);
        
        System.out.println(lista);
        System.out.println("El número mayor de la lista es " + mayor);
        System.out.println("El número menor de la lista es " + menor);
        System.out.println("La suma es " + suma);
        
        
        
        
        
        
    }
    
}
