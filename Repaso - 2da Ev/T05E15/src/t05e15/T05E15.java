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
public class T05E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion dir1 = new Direccion(10, 15, "Caracol", "NY");
        Direccion dir2 = new Direccion(12, 1, "Pepe", "NY");
        Direccion dir3 = new Direccion(5, 5, "Caracol", "NY");
        
        Empleado emp1 = new Empleado("Pepe", 5000, dir1);
        Empleado emp2 = new Empleado("Juan", 500, dir2);
        Empleado emp3 = new Empleado("Maria", 50, dir3);
        
        System.out.println(emp1.toString());
    }
    
}
