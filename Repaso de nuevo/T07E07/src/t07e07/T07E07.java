/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e07;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T07E07 {

    /**
     * @param args the command line arguments
     */
    public static int generarAleatorio() {
        int n = (int) Math.floor(Math.random() * 50);
        return n;
    }

    public static int generarAleDia() {
        int n = (int) Math.floor(Math.random() * 7);
        return n;
    }

    public static void rellenarTemps(Dia[] dias, String[] diasDeLaSemana) {
        
        int n = generarAleDia();
        
        for (int i = 0; i < dias.length; i++) {
            dias[i] = new Dia(diasDeLaSemana[n], generarAleatorio()); 
            n++;
            if (n >= 7) {
                n = 0;
            }
        }
    }

    public static void mostrarTemps(Dia[] dias) {
        for (Dia n : dias) {
            System.out.println("Dia " + n.getNom() + ":" + n.getTemp());
        }
    }
    
    public static int media(Dia[] dias){
        int sum = 0; 
        for (Dia n: dias){
            sum = sum + n.getTemp(); 
        }
        return (sum/dias.length);
    }
    
    public static void diasCalurosos(Dia[] dias, String[] diasDeLaSemana ){
        int mayor = dias[0].getTemp(); 
        
        for(Dia n: dias){
            if(mayor < n.getTemp()){
                mayor = n.getTemp(); 
            }
        }
        
        for(Dia m: dias){
            if (m.getTemp() == mayor){
                System.out.println("Mayor " + m.getNom() + ":" + m.getTemp());
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Dia[] dias = new Dia[30];
        String[] diasDeLaSemana = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Menu "
                    + "1. rellenar temps"
                    + "2. mostrar temps"
                    + "3. media"
                    + "4. dia más caluroso"
                    + "5. salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    rellenarTemps(dias, diasDeLaSemana);
                    break;
                }

                case 2: {
                    mostrarTemps(dias);
                    break;
                }
                
                case 3:{
                    System.out.println("media" + media(dias));
                    break;
                }
                
                case 4:{
                    diasCalurosos(dias, diasDeLaSemana);
                    break;
                }

                case 5: {
                    System.out.println("salir");
                    break;
                }
                default: {
                    System.out.println("No");
                }

            }
        } while (opcion != 5);
    }

}
