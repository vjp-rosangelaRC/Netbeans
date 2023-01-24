/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05ea01;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class MenuNuevaArma {

    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        int opcionMenu = 0, alcance, numArmas = 0, tiempoEfectivo, balasMaximas;
        String opcion, opcionSi = "si", opcionNo = "no";
        boolean booleano = true, distancia, disponible;
        //Solo se puede crear un arma de cada tipo
        // El menú no sale usando el booleano
        // El booleano de 
        do {
            System.out.println("M   E   N   Ú:");
            System.out.println("¿Desea crear una nueva arma?");
            opcion = entrada.nextLine();

            if (opcion.equalsIgnoreCase(opcionSi)) {

                System.out.println("Pulse 1 para crear una bomba.");
                System.out.println("Pulse 2 para crear una cloroformo.");
                System.out.println("Pulse 3 para crear una Pistolas.");
                opcionMenu = entrada.nextInt();

                switch (opcionMenu) {
                    case 1: {
                        System.out.println("¿Qué alcance tiene su bomba?");
                        alcance = entrada.nextInt();

                        System.out.println("¿Es a distancia?");
                        opcion = entrada.nextLine();

                        if (opcion.equalsIgnoreCase(opcionSi)) {
                            distancia = true;
                        } else {
                            distancia = false;
                        };

                        System.out.println("¿Está disponible?");
                        opcion = entrada.nextLine();

                        if (opcion.equalsIgnoreCase(opcionSi)) {
                            disponible = true;
                        } else {
                            disponible = false;
                        }

                        numArmas++;
                        Bombas bomba = new Bombas(alcance, distancia, disponible, numArmas);
                        System.out.println("Ha creado una bomba con éxito");
                        break;
                    }
                    case 2: {
                        Cloroformo cloroformo = new Cloroformo();

                        System.out.println("¿Cuánto tiempo es efectivo (en segundos)? ");
                        tiempoEfectivo = entrada.nextInt();
                        cloroformo.setTiempoEfectivo(tiempoEfectivo);

                        System.out.println("¿Está disponible?");
                        opcion = entrada.nextLine();

                        if (opcion.equalsIgnoreCase(opcionSi)) {
                            disponible = true;
                        } else {
                            disponible = false;
                        };
                        cloroformo.setDisponible(disponible);

                        numArmas++;
                        System.out.println("Ha creado una cloroformo con éxito");
                        break;
                    }

                    case 3: {
                        Pistolas pistola = new Pistolas();

                        System.out.println("¿Cantidad de balas máximas?");
                        balasMaximas = entrada.nextInt();
                        pistola.setBalasMaximas(balasMaximas);

                        System.out.println("¿Está disponible?");
                        opcion = entrada.nextLine();

                        if (opcion.equalsIgnoreCase(opcionSi)) {
                            disponible = true;
                        } else {
                            disponible = false;
                        };
                        pistola.setDisponible(disponible);

                        numArmas++;
                        System.out.println("Ha creado una pistola con éxito");
                        break;
                    }

                    default: {
                        System.out.println("Introduzca una opción válida");
                    }
                }

            } else {
                if (opcion.equalsIgnoreCase(opcionNo)) {
                    opcionMenu = 4;
                    System.out.println("Ha creado" + numArmas + " armas");
                }
            };

        } while (opcionMenu != 4);

    }

}
