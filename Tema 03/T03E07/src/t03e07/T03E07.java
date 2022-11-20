/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03e07;
import java.util.Scanner;
/**
 *
 * @author Ross
 */
public class T03E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int diasemana;
        boolean laborable;
        System.out.println("Introduzca un día de la semana:");
        diasemana = entrada.nextInt(); 
                
        switch (diasemana) {
            case 1: {
                laborable=true;
                    if (laborable=true){
                        System.out.println("Es laborable");
                    }
                break;
            }
            case 2:
                {
                laborable=true;
                if (laborable=true){
                        System.out.println("Es laborable");
                    }
                break;
            }
            case 3:
                {
                laborable=true;
                if (laborable=true){
                        System.out.println("Es laborable");
                    }
                break;
            }
            case 4:
                {
                laborable=true;
                if (laborable=true){
                        System.out.println("Es laborable");
                    }
                break;
            }
            case 5:
                    laborable=true;
                    if (laborable=true){
                        System.out.println("Es laborable");
                    }
                    break;
            case 6:{
                laborable=false;
                if (laborable != true) {
                            System.out.println("No es laborable");
                        }
                break;
            }
            case 7:{
                    laborable=false;
                        if (laborable != true) {
                            System.out.println("No es laborable");
                        }
                    break;
            }
            default: {
                System.out.println("El día introducido no existe");
            }         
        
        }
        
        
        
    }
    
}
