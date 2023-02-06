/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e01;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n;
        n = entrada.nextInt();
        return n;
    }
    
    public static int media (int suma, Notas [] vector){
        int media;
        media= suma/vector.length;        
        return media;        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Notas[] vector = new Notas [6]; 
        int n1, n2, n3, n4, n5, n6, suma;      
        
        System.out.println("Por favor, introduzca la nota de Programación:");
        n1 = pedirN();
        vector[0]= new Notas ("Programación", n1);
        
        System.out.println("Por favor, introduzca la nota de Lenguajes:");
        n2 = pedirN();
        vector[1]= new Notas ("Lenguajes", n2);
        
        System.out.println("Por favor, introduzca la nota de Bases:");
        n3 = pedirN();
        vector[2]= new Notas ("Bases", n3);
        
        System.out.println("Por favor, introduzca la nota de Entornos:");
        n4 = pedirN();
        vector[3]= new Notas ("Entornos", n4);
        
        System.out.println("Por favor, introduzca la nota de Sistemas:");
        n5 = pedirN();
        vector[4]= new Notas ("Sistemas", n5);
        
        System.out.println("Por favor, introduzca la nota de FOL:");
        n6 = pedirN();
        vector[5]= new Notas ("FOL", n6);
        
        suma = n1 + n2 + n3 + n4 + n5 + n6;
        
        System.out.println("La nota media es:");
        System.out.println(media(suma, vector));
        
    }
}
