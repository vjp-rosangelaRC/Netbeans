/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication77;

/**
 *
 * @author rdlrosac01
 */
public class clasePrueba {
    private int numero1;
    private int numero2;  
    private int numero3; 

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
       
    
    
    public static int incrementoB(int numero1) {
        // 'numero1' será igual numero1 4 puesto que su valor se incrementa en 1
        ++numero1;
        System.out.println("El valor de a es: " + numero1);
        return numero1;
    }

    public static int incrementoA(int numero1) {
        // 'cociente' será igual numero1 3 puesto que '%' calcula el resto
        numero1++;
        System.out.println("El valor de a es: " + numero1);
        return numero1;
    }

    public static void resto(int numero1, int numero2) {
        int cociente;
        // 'cociente' será igual numero1 cero puesto que '/' calcula el cociente
        cociente = numero1 % numero2;
        System.out.println("El valor de c es: " + cociente);
    }

    public static void hacerCociente(int numero1, int numero2) {
        int cociente;
        cociente = numero1 / numero2;
        System.out.println("El valor de c es: " + cociente);
    }
    
}
