/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e10e06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class E10E06 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static void introducirVentas(ArrayList<Integer> array, String[] mesesDelAnio) {
        System.out.println("Ventas");

        for (int i = 0; i < mesesDelAnio.length; i++) {
            System.out.println("Introduzca para el mes " + mesesDelAnio[i]);
            array.add(pedirN());
        }
    }

    public static void verVentas(ArrayList<Integer> array, String[] mesesDelAnio) {
        System.out.println("Ventas");

        for (int i = 0; i < mesesDelAnio.length; i++) {
            System.out.println(mesesDelAnio[i] + " :" + array.get(i));
        }
    }

    public static void verVentasAlReves(ArrayList<Integer> array, String[] mesesDelAnio) {
        System.out.println("Ventas inversas");

        for (int i = mesesDelAnio.length - 1; i >= 0; i--) {
            System.out.println(mesesDelAnio[i] + " :" + array.get(i));
            
        }
    }
    
    public static void mesConMasVentas(ArrayList<Integer> array, String[] mesesDelAnio){
        int mayor = array.get(0); 
        for(int i:array){
            if(i > mayor){
                mayor = i; 
            }
        }
        
        System.out.println("MAYOR");
        for(int i:array){
            if(i == mayor){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> array = new ArrayList<>();
        String[] mesesDelAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (int i = 0; i < mesesDelAnio.length; i++) {
            if (mesesDelAnio[i].indexOf("a") > 0 ){
                  
            System.out.println("Mes" + mesesDelAnio[i]);
            }
        }
        
        int opcion;

        do {
            System.out.println("Texto");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    introducirVentas(array, mesesDelAnio);
                    break;
                }

                case 2: {
                    verVentas(array, mesesDelAnio);
                    break;
                }

                case 3: {
                    verVentasAlReves(array, mesesDelAnio);
                    break;
                }

                case 4: {
                    mesConMasVentas(array, mesesDelAnio);
                    break;
                }

                case 7: {
                    System.out.println("Sali");
                    break;
                }
                default: {
                    System.out.println("No");
                }
            }

        } while (opcion != 7);
    }

}
