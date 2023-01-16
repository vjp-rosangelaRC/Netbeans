/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e19;

/**
 *
 * @author Ross
 */
public class Test {
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado1 = new Empleado("jose",40,5);
        Empleado empleado2 = new Empleado("paco",20,10);
        Empleado empleado3 = new Empleado("cris",40,7.50);
        Empleado empleado4 = new Empleado("cris2",60,6);
        Empleado empleado5 = new Empleado("cris3",2,8.20);
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println(empleado5.toString());
        //Así se pone el toString dentro del main
        // System.out.println("" + ;empleado1.toString();)
    }
}
