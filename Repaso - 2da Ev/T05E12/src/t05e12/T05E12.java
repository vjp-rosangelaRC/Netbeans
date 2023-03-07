/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e12;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T05E12 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in); 
        n = entrada.nextInt();
        return n; 
    }
    
    public static int calcularHipotenusa (Triangulo triangulo){
        int hipo; 
        hipo = triangulo.getCateto1() + triangulo.getCateto2();
        return hipo;
    }
    
    public static void mostrar(int hipo){
        System.out.println("Resu" + hipo);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo triangulo = new Triangulo(); 
        triangulo.setCateto1(pedirN());
        triangulo.setCateto2(pedirN());
        
        mostrar(calcularHipotenusa(triangulo));
    }
    
}
