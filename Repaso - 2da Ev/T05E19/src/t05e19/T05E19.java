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
public class T05E19 {

    /**
     * @param args the command line arguments
     */
    public static int sueldo (Empleado emp){
        int sueldoBruto;
        
        if (emp.getHoras() > 40){
            sueldoBruto = emp.getHoras() * (emp.getTarifa()* (int) 1.5);
        }
        else {
            sueldoBruto = emp.getHoras() * emp.getTarifa();
        }
        
        return sueldoBruto;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado("Pepe", 45, 5);
        Empleado emp2 = new Empleado("Maria", 25, 7);
        Empleado emp3 = new Empleado("Kiko", 3, 10);
        
        System.out.println(sueldo(emp1));
        System.out.println(sueldo(emp2));
        System.out.println(sueldo(emp3));
        
        
    }
    
}
