/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T10E09 {

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
        String s;
        s = entrada.nextLine();
        return s;
    }
    
    public static int generarAleatorioSemana(){
        int n; 
        n = (int) Math.random()*6;
        return n;
    }
    
    public static int generarAleatorioDias(){
        int n; 
        n = (int) Math.random()*30;
        return n;        
    }
    
    public static void rellenarArray(String[] diasSemana, ArrayList<Dia> dia){
        int n, m;
        // falta el aux 
        m = generarAleatorioSemana(); //este llega hasta 7
        
        for (int i = 0; i < dia.size(); i++ ){
            n = generarAleatorioDias();
            dia.add(new Dia(diasSemana[m], n));
            m++;
            if (m > 7){
                m = 0;
            }
        }
        System.out.println(dia);
    }
    /*
    Aquí mejor hacerlo tipo
    diaN = newDia(nombre, temp); 
    ldias.add(diaN);
    */
    
    public static void mostrarArray(ArrayList<Dia> dia){
        for (int i = 0; i < dia.size(); i++){
            System.out.println(dia.get(i));
        }
    }
    
    public static int sacarMedia(ArrayList<Dia> dia){ //Aquí puedo usar un iterador también
        int media, suma; 
        suma = 0;
        
        for (int i=0; i < dia.size(); i++){
            suma = suma + dia.get(i);
        }
        
        media = suma/dia.size();
        return media;
    }
    
    public static void menu(String[] diasSemana, ArrayList<Dia> dia){
        int opcion; 
        
        do{
            System.out.println("1. Rellenar temperaturas de manera aleatoria:");
            System.out.println("2. Mostrar temperaturas:");
            System.out.println("3. Visualizar la temperatura media del mes");
            System.out.println("4. Dia más caluroso");
            System.out.println("5. Salir");
            opcion = pedirN();
            
            switch (opcion){
                case 1:{
                    rellenarArray(diasSemana, dia); //no funciona
                    break;
                }
                
                case 2:{
                    mostrarArray(dia);
                    break;
                }
                
                case 3:{
                    sacarMedia(dia);
                    break;
                }
                
                case 5:{
                    System.out.println("Saliendo");
                    break;
                }
                
                default:{
                    System.out.println("No es una opción válida.");
                }
            }
            
        }while(opcion != 5);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        ArrayList<Dia> dias = new ArrayList<>();
        menu(diasSemana, dias);
    }
    
}
