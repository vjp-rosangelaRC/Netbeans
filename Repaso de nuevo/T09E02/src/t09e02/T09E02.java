/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t09e02;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T09E02 {

    /**
     * @param args the command line arguments
     */
    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        return n;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes, anho;
        System.out.println("Dia");
        dia = pedirN();
        System.out.println("Mes");
        mes = pedirN();
        System.out.println("Ano");
        anho = pedirN();

        LocalDate fechaNac = LocalDate.of(anho, mes, dia);
        int opc;

        do {
            System.out.println("Edad exacta");
            System.out.println("Dia semana nac");
            System.out.println("Estacion año nac");
            System.out.println("Dias vividos");
            System.out.println("Años cuando conducir");
            opc = pedirN();

            switch (opc) {
                case 1: {
                    LocalDate ahora = LocalDate.now();
                    Period tiempo = Period.between(fechaNac, ahora);
                    System.out.println("Años" + tiempo.getYears() + " meses " + tiempo.getMonths() + "dias" + tiempo.getDays());
                    break;
                }

                case 2: {
                    System.out.println("Naciste en " + fechaNac.getDayOfWeek());
                    break;
                }

                case 3: {

                    LocalDate hoy = LocalDate.now();
                    long dias;
                    dias = ChronoUnit.DAYS.between(fechaNac, hoy);
                    System.out.println("Has vivido " + dias + " días");
                }
            

          default:{
                    System.out.println("No vlaido");
                }
                
            }
            
        
    }
    while(opc 
!= 6);
        
        
        
    }
    
}
