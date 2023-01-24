/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ea03;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T05EA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Platos sopa = new Platos("Sopa", 5.25, 15);
        Platos espaguetis = new Platos("Espaguetis", 3.15, 20);
        Platos tacos = new Platos("Taco", 1.50, 5);
        Platos sandwich = new Platos("Sandwich", 3, 100);
        
        MenuPlatos.menu(sopa, espaguetis, tacos, sandwich);
        
       /* El ejercicio 4 ahora necesitaria almacenar el coste de hacer cada plato
       NEcesito crear un nuevo atributo en la clase Plato que sea private double coste
       Ahora tengo que ver cuál es el consumo y ver el beneficio neto. Para ello hago 
       un precio de la compra - coste y veo cuál es el beneficio neto.    */
       
    }

}
