/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t09e01;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T09E01 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt(); 
        return n; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate fechaNacimiento; 
        int dia, mes, anho; 
        System.out.println("Dia");
        dia = pedirN(); 
        System.out.println("Mes");
        mes = pedirN();
        System.out.println("Año");
        anho = pedirN(); 
        
        fechaNacimiento = LocalDate.of(dia, mes, anho);
        
        switch(fechaNacimiento.getMonthValue()){
            case 1 : {
                if(fechaNacimiento.getDayOfMonth() == 21){
                    System.out.println("Acuario");
                }
                else {
                    System.out.println("Capricornio");
                }
            }
            
        }
        
        
    }
    
}
