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
public class Test {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    // Creo 2 objetos
    Rueda rueda1 = new Rueda();
    Rueda rueda2 = new Rueda();
    
    // Estableszco material y tamaño
    String _material = "algo"; 
    int pulgadas = 00;
    
    rueda1.establecerMaterial(_material);
    rueda1.establecerPulgadas(pulgadas);
    
    rueda2.establecerMaterial(_material);
    rueda2.establecerPulgadas(pulgadas);
    
    // Muestro en pantalla
    System.out.println("De rueda 1 el material es " + rueda1.obtenerMaterial() + " y el tamaño es " + rueda1.obtenerPulgadas());
    System.out.println("De rueda 2 el material es " + rueda2.obtenerMaterial() + " y el tamaño es " + rueda2.obtenerPulgadas());
    
    // Clase coche
    // Creo objetos de la clase coche
    Coche coche1 = new Coche();
    Coche coche2 = new Coche();
    Coche coche3 = new Coche();
    
    // Establezco marca y modelo
    String marca = "algo";
    String modelo = "algo";
    
    coche1.establecerMarca(marca);
    coche1.establecerModelo(modelo);
    
    coche2.establecerMarca(marca);
    coche2.establecerModelo(modelo);
    
    coche3.establecerMarca(marca);
    coche3.establecerModelo(modelo);
    
    // Establezo ruedas
    coche1.establecerRueda(rueda1);
    coche2.establecerRueda(rueda1);
    coche3.establecerRueda(rueda2);
    
    // Mostrar datos 
        System.out.println("El coche 1 es de la marca " + coche1.obtenerMarca() + ", su modelo es " + coche1.obtenerModelo() + ", su material de rueda es " + coche1.obtenerRueda().obtenerMaterial()+ " y el tamaño de su rueda es " + coche1.obtenerRueda().obtenerPulgadas());
        System.out.println("El coche 2 es de la marca " + coche2.obtenerMarca() + ", su modelo es " + coche2.obtenerModelo() + ", su material de rueda es " + coche2.obtenerRueda().obtenerMaterial() + " y el tamaño de su rueda es " + coche2.obtenerRueda().obtenerPulgadas());
        System.out.println("El coche 3 es de la marca " + coche3.obtenerMarca() + ", su modelo es " + coche3.obtenerModelo() + ", su material de rueda es " + coche3.obtenerRueda().obtenerMaterial() + " y el tamaño de su rueda es " + coche3.obtenerRueda().obtenerPulgadas());
    }
}
