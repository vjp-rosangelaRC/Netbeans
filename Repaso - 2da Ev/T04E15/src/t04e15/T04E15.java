/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04e15;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T04E15 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n;
        n = entrada.nextInt(); 
        return n;
    }
    
    public static int suma (int n1, int n2){
        int suma; 
        suma = n1 + n2;
        return suma;
    }
    
    public static int resta (int n1, int n2){
        int resta; 
        resta = n1 - n2;
        return resta;
    }
    
    public static int mult (int n1, int n2){
        int mult; 
        mult = n1 * n2;
        return mult;
    }
    
    public static int div (int n1, int n2){
        int div; 
        
        try{
            div = n1 / n2;
        }
        catch(Exception e){
            System.out.println("No se puede dividir entre 0");
            
        }
        finally {
             div = n1 / 1;
        }
        
        return div;
    }
    
    public static void menu (){
        int n1, n2, opcion;
        
        System.out.println("N1");
        n1 = pedirN();
        System.out.println("N2");
        n2 = pedirN();
        
        do{
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = pedirN(); 
            
            switch(opcion){
                case 1:{
                    System.out.println("" + suma(n1, n2));
                    break;
                }
                
                case 2:{
                    resta(n1, n2); 
                    break;
                }
                
                case 3:{
                    mult(n1, n2); 
                    break;
                }
                
                case 4:{
                    div(n1, n2); 
                    break;
                }
                
                case 5:{
                    System.out.println("Saliendo");
                    break;
                }
                
                default:{
                    System.out.println("No válido");
                }
            }
            
            
            
            
        }while (opcion != 5);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
}
