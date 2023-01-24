/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ea01;

/**
 *
 * @author Ross
 */
public class T05EA01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Armas arma1 = new Armas (true, 2);
        // No muestra  nada
        arma1.toString();
        
        System.out.println("Armas disponibles: ");
        
        Armas arma2 = new Armas();
        arma2.setDisponible(true);
        System.out.println(arma2.toString());
        
        
        //Creando un arma de cada tipo
        Bombas bomba = new Bombas (0, true, true, 0);
        System.out.println(bomba.toString());;
        
        Cloroformo cloroformo1 = new Cloroformo(30);
        System.out.println(cloroformo1.toString());
        
        Pistolas pistola = new Pistolas (6);
        System.out.println( pistola.toString());
        
        MenuNuevaArma.menu();
        
    }
    
}
