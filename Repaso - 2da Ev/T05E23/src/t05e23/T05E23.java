/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e23;

/**
 *
 * @author Ross
 */
public class T05E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo coche = new Taxi(0, "matricula", "modelo", 0);
        Vehiculo bus = new Autobus(0, "matricula", "modelo", 0); 
        System.out.println(bus.getMatricula());
    }
    
}
