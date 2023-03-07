/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e03;

/**
 *
 * @author Ross
 */
public class T05E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rueda rueda1 = new Rueda();
        
        rueda1.setMaterial("caucho");
        rueda1.setPulgadas(15);
        
        Rueda rueda2 = new Rueda();
        rueda2.setMaterial("goma");
        rueda2.setPulgadas(10);
        
        System.out.println("Rueda 1 " + rueda1.getMaterial() + " - " + rueda1.getPulgadas());
        System.out.println("Rueda 2 " + rueda2.getMaterial() + " - " + rueda2.getPulgadas());
        
        Coche coche1 = new Coche("A", "a", rueda1);
        Coche coche2 = new Coche("A", "a", rueda2);
        Coche coche3 = new Coche("A", "a", rueda2);
        
        System.out.println(coche1.toString());
       
    }
    
}
