/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e15;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E15 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in); 
        int n = entrada.nextInt(); 
        return n; 
    }
    
    public static Socio datosSocios(){
        Socio socioAux = new Socio("Pepe", pedirN()); 
        return socioAux; 
    }
    
    public static void rellenarPelis(Pelicula[] peliculas){
        
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i] = new Pelicula();
            peliculas[i].rellenarSocios();
            peliculas[i].setTitulo("Nom" + i);
            peliculas[i].setCoste(200+i);
        }
    }
    
    public static void mostrarPelis(Pelicula[] peliculas){
        for(Pelicula p:peliculas){
            System.out.println(p.toString());
        }
    }
    
    public static void menu(Pelicula[] peliculas){
        int opcion;
        
        do{
            System.out.println("Rellenar pelis");
            System.out.println("Mostrar datos");
            System.out.println("Mas rentabke");
            System.out.println("Menos rentable");
            System.out.println("BEneficio neto por nombre + info");
            System.out.println("Socio más que cantidad");
            opcion = pedirN(); 
            
            switch(opcion){
                case 1:{
                    rellenarPelis(peliculas);
                    break;
                }
                
                case 2: {
                    mostrarPelis(peliculas);
                    break;
                }
                
                
                
                case 7: {
                    System.out.println("Salir");
                }
                default:{
                    System.out.println("No valido");
                }
            }
            
        }while (opcion != 7);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula[] peliculas = new Pelicula[3];
        
        menu(peliculas);
    }
    
}
