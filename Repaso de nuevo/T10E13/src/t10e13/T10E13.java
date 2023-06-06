/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T10E13 {

    /**
     * @param args the command line arguments
     */
    public static void introducirDatos(String[] mesesDelAnio, ArrayList<Venta> ventas) {
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < mesesDelAnio.length; i++) {
            System.out.println("Introduzca para el mes " + mesesDelAnio[i]);
            
            Venta vventas = new Venta(mesesDelAnio[i], entrada.nextInt());
            ventas.add(vventas); 
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ArrayList<Venta> ventas = new ArrayList<>();
        String[] mesesDelAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int opcion;

        do {
            System.out.println("Menu");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    introducirDatos(mesesDelAnio, ventas);
                    break;
                }
                
                case 2:{
                    for(Venta v:ventas){
                        System.out.println(v.toString());
                    }
                    break;
                }
                
                case 3:{
                    int suma = 0; 
                    for(Venta v:ventas){
                        suma = suma + v.getVentasCochesMes();
                    }
                    System.out.println("Total " + suma);
                    break;
                }
                
                case 4:{
                    int suma = 0;
                    for (int i = 0; i < mesesDelAnio.length; i++) {
                        if(mesesDelAnio[i].indexOf("a") > 0){
                            suma = suma + ventas.get(i).getVentasCochesMes(); 
                        }
                    }
                    System.out.println("sum" + suma);
                    break;
                }
                
                case 5:{
                    int mayor = ventas.get(0).getVentasCochesMes(); 
                    
                    for(Venta v:ventas){
                        if(mayor < v.getVentasCochesMes() ){
                            mayor = v.getVentasCochesMes();
                        }
                    }
                    
                    for (int i = 0; i < mesesDelAnio.length; i++) {
                        if(ventas.get(i).getVentasCochesMes() == mayor){
                            System.out.println(ventas.get(i).toString());
                        }
                    }
                    
                    break;                     
                }

                case 6: {
                    System.out.println("Salir");
                    break;
                }

                default: {
                    System.out.println("No valido");
                }
            }

        } while (opcion != 6);

    }

}
