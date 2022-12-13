/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e27;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T03E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, opcion, resultado;
        System.out.println("N1:");
        numero1 = entrada.nextInt();
        System.out.println("N2:");
        numero2 = entrada.nextInt();
        System.out.println("Menú: ");
        System.out.println("Pulse 1");
        System.out.println("Pulse 2");
        System.out.println("Pulse 3");
        System.out.println("Pulse 4");
        System.out.println("Pulse 5");
        opcion = entrada.nextInt();
        do{
            switch (opcion){
                case 1:{
                    resultado = numero1 + numero2;
                    System.out.println(resultado);
                    break;
                }
                case 2:{
                    resultado = numero1 - numero2;
                    System.out.println(resultado);
                    break;
                }
                case 3:{
                    resultado = numero1 * numero2;
                    System.out.println(resultado);
                    break;
                }
                case 4:{
                    try{
                    resultado = numero1 / numero2;
                    }
                    catch (ArithmeticException e){
                        resultado = 0;
                    }
                    System.out.println(resultado);
                    break;
                }
                case 5:{
                    System.out.println("Salir");
                    break;
                }
                default:{
                    System.out.println("Incorrecto");
                }
            }
            }while (opcion != 5);
                }    
        
        
        
        
        
        
    
   
}
