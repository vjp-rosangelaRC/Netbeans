/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e15;

/**
 *
 * @author Ross
 */
public class Test {
       
    public static void main(String[] args) {
        Direccion direccion1 = new  Direccion("leon",8,13,"plasencia");     
        Direccion direccion2 = new  Direccion("leon",9,14,"plasencia");     
        Direccion direccion3 = new  Direccion("leon",10,15,"plasencia"); 
        Empleado empleado1 = new Empleado("Jose",1000,direccion1);
        Empleado empleado2 = new Empleado("Jose",1000,direccion2);
        Empleado empleado3 = new Empleado("Jose",1000,direccion3);
        System.out.println("Empleado1:" + empleado1.getDatos());
        System.out.println("Empleado2:" + empleado2.getDatos());
        System.out.println("Empleado3:" + empleado3.getDatos());

    }
    
}
