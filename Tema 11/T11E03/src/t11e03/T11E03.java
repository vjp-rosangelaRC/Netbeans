/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e03;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T11E03 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt();
        return n; 
    }
    
    public static String pedirS(){
        Scanner entrada = new Scanner(System.in);
        String n; 
        n = entrada.nextLine();
        return n; 
    }
    
    public static void aparcar(Autobuses[] autobusesAparcados){
        int posicion; 
        
        System.out.println("¿En qué posición quiere aparcar?");
        posicion = pedirN(); 
        
        while (autobusesAparcados[posicion] != null){
            System.out.println("Esta dársena está ocupada. Seleccione otra");
            System.out.println("¿En qué posición quiere aparcar?");
            posicion = pedirN();
        }
        
        System.out.println("Matrícula del bus:");
        autobusesAparcados[posicion].setMatriculas(pedirN());
        autobusesAparcados[posicion].guardarConductores();
    }
    
    public static void mostrarDarsenasLibres(Autobuses[] autobusesAparcados){
        for (int i = 0; i < autobusesAparcados.length; i++) {
             if (autobusesAparcados[i] == null){
                 System.out.println("La dársena " + i + " está libre");
             }
        }
    }
    
    public static void buscarAutobus(Autobuses[] autobusesAparcados){
        int matricula; 
        
        System.out.println("¿Qué matrícula busca?");
        matricula = pedirN(); 
        
        for (int i = 0; i < autobusesAparcados.length; i++) {
            if (autobusesAparcados[i].getMatriculas() == matricula){
                System.out.println("Info:" + autobusesAparcados[i].toString());
            }
        }
    }
    
    public static void buscarConductor(Autobuses[] autobusesAparcados){
        String nombre; 
        System.out.println("¿Qué nombre quiere buscar?");
        nombre = pedirS();
        
        for (int i = 0; i < autobusesAparcados.length; i++) {
            if (autobusesAparcados[i].getConductor().getNombre().equalsIgnoreCase(nombre)){
                System.out.println("La matrícula del autobús para este conductor es " + autobusesAparcados[i].getMatriculas());
            }
        }
    }
    
    public static int autobusMayorNumConductores(Autobuses[] autobusesAparcados){
        int contador; 
        contador = 0; 
        
        for (int i = 0; i < autobusesAparcados.length; i++) {
            if (autobusesAparcados[i].getConductor() != null){
                contador++; 
            }
        }
        //??
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Autobuses[] autobusesAparcados = new Autobuses[6];
        int opcion;
        
        do{
            System.out.println("Aparcar");
            System.out.println("Mostrar dársenas libres");
            System.out.println("Buscar autobús por matrícula");
            System.out.println("Buscar conductor");
            System.out.println("Ver el autobús con mayor número de conductores");           
            opcion = pedirN();
            
            switch(opcion){
                case 1:{
                    aparcar(autobusesAparcados);
                    break;
                }
                
                case 2:{
                    mostrarDarsenasLibres(autobusesAparcados);
                    break;
                }
                
                case 3:{
                    
                    break;
                }
                
                
                case 5:{
                    System.out.println("Saliendo");
                    break;
                }
                
                default:{
                    System.out.println("No es una opción válida");
                }
            }
        }while (opcion != 5);
        
    }
    
}
