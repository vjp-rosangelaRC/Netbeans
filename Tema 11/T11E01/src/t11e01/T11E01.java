/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T11E01 {

    /**
     * @param args the command line arguments
     */
    public static final int MAX = 31; 
    
    public static int pedirN(){
        int n; 
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt(); 
        return n;
    }
    
    public static int generarAletorio(){
        int n; 
        n = (int) Math.floor(Math.random()*50);
        return n;
    }
    
    public static int generarAletorioaString(){
        int n; 
        n = (int) Math.floor(Math.random()*7);
        return n;
    }
    
    public static void rellenarDias(ArrayList<Dia> diaConSemana) {
        String[] diasDeLaSemana = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int n = generarAletorioaString();
        
        for (int i = 0; i < MAX; i++) {
            Dia dias = new Dia(diasDeLaSemana[n], generarAletorio()); 
            diaConSemana.add(dias);
            if (n > 7){
                n = 0;
            }
        }
    }
    
    public static void insertarMapa (Map<Integer, Dia> mapa, ArrayList<Dia> diaConSemana){
        mapa.put(diaConSemana, dia);
    }
    
    
    public static void mostrarMapa (Map<Integer, Dia> mapa){
        
    }
    
    public static void menu (ArrayList<Dia> diaConSemana){
        int opcion; 
        
        do{
            System.out.println("1. Rellenar de forma aleatoria las temperaturas. Además el día 1 del mes no tiene porqué ser un Lunes, será un día aleatorio de la semana.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Día o días más calurosos del mes. ");
            System.out.println("5. Salir del programa.");
            System.out.println("Seleccione opción");
            opcion = pedirN(); 
            
            switch(opcion){
                case 1:{
                    rellenarDias(diaConSemana);
                    break;
                }
                
                case 2:{
                    /****************************/
                    break;
                }
                
                case 3: {
                    /****************************/
                    break;
                }
                
                case 4: {
                    /****************************/
                    break;
                }
                
                case 5:{
                    System.out.println("Saliendo... ");
                }
                default:{
                    System.out.println("No es una opción válida");
                }
            }
        }while(opcion != 5);
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, Dia> mapa = new HashMap<>();
        ArrayList<Dia> diaConSemana = new ArrayList<>();
        
        menu(diaConSemana);
        
        
    }
    
}
