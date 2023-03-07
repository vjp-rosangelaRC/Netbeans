/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E16 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n;
        do{
            n = entrada.nextInt(); 
        }while (n < 0 || n > 10);
        return n;
    }
    
    public static String pedirS(){
        Scanner entrada = new Scanner(System.in);
        String s;
        s = entrada.nextLine(); 
        return s;
    }
    
    public static void calcularNota (Alumno al){
        if (al.getNota() < 5){
            System.out.println("suspenso");
        }
        else {
            if (al.getNota() > 5 && al.getNota() < 7){
                System.out.println("bien");
            }
            else {
                System.out.println("aaa");
            }
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno al1 = new Alumno(pedirN(), pedirS());
        Alumno al2 = new Alumno(pedirN(), pedirS());
        Alumno al3 = new Alumno(pedirN(), pedirS());
        
        calcularNota(al1);
        calcularNota(al2);
        calcularNota(al3);
        
        
    }
    
}
