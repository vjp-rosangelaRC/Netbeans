/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T11E01 { // Hay que usar iterador o for each para todo

    /**
     * @param args the command line arguments
     */
    public static final int MAX = 31;

    public static int pedirN() {
        int n;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        return n;
    }

    public static int generarAletorio() {
        int n;
        n = (int) Math.floor(Math.random() * 50);
        return n;
    }

    public static int generarAletorioaString() {
        int n;
        n = (int) Math.floor(Math.random() * 7);
        return n;
    }

    public static void rellenarDias(ArrayList<Dia> diaConSemana, Map<Integer, Dia> mapa) {
        String[] diasDeLaSemana = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int n = generarAletorioaString();

        for (int i = 0; i < MAX; i++) {
            Dia dias = new Dia(diasDeLaSemana[n], generarAletorio());
            n++;
            diaConSemana.add(dias);
            if (n > 6) {
                n = 0;
            }
            mapa.put(mapa.size(), diaConSemana.get(i));
        }
    }

    public static void mostrarMapa(Map<Integer, Dia> mapa, ArrayList<Dia> diaConSemana) {
        Iterator it = mapa.keySet().iterator();
        int i;

        while (it.hasNext()) {
            i = (int) it.next();
            System.out.println("El día " + diaConSemana.get(i).getNombreDia() + " hubo una temperatura de " + diaConSemana.get(i).getTemperatura());
            i++;
        }
    }

    public static int mostrarMedia(ArrayList<Dia> diaConSemana) {
        int media, suma = 0;
        for (int i = 0; i < diaConSemana.size(); i++) {
            suma = suma + diaConSemana.get(i).getTemperatura();
        }
        media = suma / MAX;
        return media;
    }

    public static void diaMasCaluroso(ArrayList<Dia> diaConSemana, Map<Integer, Dia> mapa) {
        Iterator itCaluroso = mapa.keySet().iterator();
        int masCaluroso, i, contador;
        contador = 0;
        masCaluroso = diaConSemana.get(0).getTemperatura();

        for (i = 0; i < diaConSemana.size(); i++) {
            if (masCaluroso < diaConSemana.get(i).getTemperatura()) {
                masCaluroso = diaConSemana.get(i).getTemperatura();
                contador++;
            }
        }

        while (itCaluroso.hasNext()) { //Funciona regulunchi
            i = (int) itCaluroso.next();
            if (diaConSemana.get(i).getTemperatura() == masCaluroso) {
                if (contador > 0) {
                    System.out.println("Los días más calurosos han sido:");
                    System.out.println(diaConSemana.get(i).getNombreDia() + " " + i);
                    System.out.println("con una temperatura de " + diaConSemana.get(i).getTemperatura() + " grados");
                }
                if (contador == 0) {
                    System.out.println("El día más calurosos fue " + diaConSemana.get(i).getNombreDia() + " " + i + " y hubo una temperatura de " + diaConSemana.get(i).getTemperatura() + " grados");
                }
            }
            i++;
        }
    }

    public static void menu(ArrayList<Dia> diaConSemana, Map<Integer, Dia> mapa) {
        int opcion;

        do {
            System.out.println("1. Rellenar de forma aleatoria las temperaturas. Además el día 1 del mes no tiene porqué ser un Lunes, será un día aleatorio de la semana.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Día o días más calurosos del mes. ");
            System.out.println("5. Salir del programa.");
            System.out.println("Seleccione opción");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    rellenarDias(diaConSemana, mapa);
                    break;
                }

                case 2: {
                    mostrarMapa(mapa, diaConSemana);
                    break;
                }

                case 3: {
                    if (diaConSemana.size() <= 0) {
                        System.out.println("Debe rellenar primero el array");
                    } else {
                        System.out.println("La media es " + mostrarMedia(diaConSemana));
                    }
                    break;
                }

                case 4: {
                    if (diaConSemana.size() <= 0) {
                        System.out.println("Debe rellenar primero el array");
                    } else {
                        diaMasCaluroso(diaConSemana, mapa);
                    }
                    break;
                }

                case 5: {
                    System.out.println("Saliendo... ");
                    break;
                }
                default: {
                    System.out.println("No es una opción válida");
                }
            }
        } while (opcion != 5);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, Dia> mapa = new HashMap<>();
        ArrayList<Dia> diaConSemana = new ArrayList<>();

        menu(diaConSemana, mapa);
        //CORREGIR LOS BUCLES Y USAR FOR EACH O ITERADORES
    }

}
