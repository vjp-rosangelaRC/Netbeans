/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T11E06 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in); 
        n = entrada.nextInt(); 
        return n; 
    }
    
    public static String pedirS(){
        String n; 
        Scanner entrada = new Scanner(System.in); 
        n = entrada.nextLine(); 
        return n; 
    }
    
    public static Donacion anhadirDonacion(Campania campaniaAlfa){
        Donacion donacion1 = new Donacion();
                        
        System.out.println("¿Nombre donante?"); 
        donacion1.setNombreDonante(pedirS());
        
        System.out.println("¿Cantidad donada?");
        donacion1.setCantidadDonada(pedirN());
        
        campaniaAlfa.rellenarDonaciones(donacion1);
        
        return donacion1;
    }
    
    public static void mostrarDonaciones(Campania campaniaAlfa){ //Mejor dentro de la clase campaña
        Iterator<Donacion> iterador = campaniaAlfa.getDonaciones().iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
    
    public static void buscarDonantes(Campania campaniaAlfa){
        /*
        me tengo que recorrer todas las donaciones y si el nombre del donante 
        coincide con lo que estoy buscando paro y muestro la información. 
        Recibo por parámetros el nombre. Tratamos de hacer el programa lo más 
        genérico posible para poder reutilizarlo. 
        Para mostrar cuantas donaciones tengo en el conjunto tengo el método size
        que me devuelve el tamaño de ese conjunto.
        Para mostrar las donaciones igual que el mostrar anterior. 
        Para mostrar el total de la campaña un iterador que recoja los precios y
        que se vayan añadiendo a la variable suma con cada iteración. 
        */
        String nombre; 
        int num;
        ArrayList<Donacion> donacionAux = new ArrayList<>();
        
        System.out.println("¿Qué nombre quiere buscar?");
        nombre = pedirS(); 
        
        donacionAux = campaniaAlfa.getDonaciones();
        
        //donacionAux.buscarNombre(nombre);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Campania campaniaAlfa = new Campania();
        campaniaAlfa.setNombreCampania("Campaña Alfa");
        Donacion donacion;
        /*
        Sobre el ejercicio 7
        Necesitamos una estructura de datos dinámica, no vectores ni matrices. 
        Yo me creo la campaña pero no he añadido ninguna donación. 
        La búsqueda depende de la estructura de datos que nos hayamos creado (busqueda 
        lineal para ArrayList, para un mapa con clave el nombre de la campaña para 
        mostrar tendríamso que pedir el nombre de la campaña y con el método contains
        key ya accedo de manera directa.
        En este ejercicio tengo varios métodos en la clase campaña, así que aquí puedo
        ejecutar los métodos de la clase. 
        Para insertar campaña primero creamos uan campaña. Creamos el método de inserta 
        la donación en campaña también.
        Si la camapaña que me ha dado no existe necesitamos primero hacer una búsqueda 
        de la campaña y ver si existe o no. 
        En este caso el método del total me devuelve el total de cada campaña y luego
        el total recaudado suma todos los totales. 
        Para el obtener mayor donación tenemos un try catch para ver si no hay donaciones
        
        
        */
        
        int opcion; 
        
        do{
            System.out.println("1. Añadir donación.");
            System.out.println("2. Mostrar donaciones.");
            System.out.println("3. Mostrar donaciones por nombre de donante (Pediremos un nombre y mostraremos las donaciones cuyo donante coincida con el nombre dado).");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total dinero recaudado.");
            System.out.println("6. Ordenar donaciones (de mayor a menor importe de las donaciones)");
            System.out.println("7. Salir.");
            System.out.println("Introduzca un número");
            opcion = pedirN(); 
            
            switch(opcion){
                case 1:{
                    donacion = anhadirDonacion(campaniaAlfa);
                    break;
                }
                
                case 2:{
                    mostrarDonaciones(campaniaAlfa);
                    break;
                }
                
                case 3:{
                    buscarDonantes(campaniaAlfa);
                    break;
                }
                
                
                case 7:{
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    System.out.println("No es una opción válida");
                }
            }
        }while(opcion != 7);
        
    }
    
}
