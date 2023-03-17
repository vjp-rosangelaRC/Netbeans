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
            /*El mapa tiene una clave que define el lugar del índice
            En este caso podemos asignarle la i, pero tiene que empezar en 1 y ser
            mayor O IGUAL a 31*/
            
            mapa.put(mapa.size(), diaConSemana.get(i));
        }
    }

    public static void mostrarMapa(Map<Integer, Dia> mapa, ArrayList<Dia> diaConSemana) {
        Iterator<Integer> it = mapa.keySet().iterator(); //Esto inicializa el it para que apunte a la primera clave del mapa
        int i;

        while (it.hasNext()) {//Esto nos retorna la clave, ahora quiero que me devuelva el elemento 
            //asociado a esta clave
            i = (int) it.next();
            System.out.println("El día " + diaConSemana.get(i).getNombreDia() + " hubo una temperatura de " + diaConSemana.get(i).getTemperatura());
            i++;
        }
        /*Con el for each*/
        /*
        for (Integer clave:  mapa.keyset() ){
            diaAux = mapa.get(clave); → me retorna el objeto asociado a esta clave
            sout(diaAux.toString);
        }
        El Integer especifíco qué tipo de dato uso, y en clave guardo los índices
        Se puede inicializar el it sin darle el tipo de dato, por eso se hace el 
        cast explícito
        
        */
    }

    public static int mostrarMedia(ArrayList<Dia> diaConSemana) {
        int media, suma = 0;
        for (int i = 0; i < diaConSemana.size(); i++) {
            suma = suma + diaConSemana.get(i).getTemperatura();
        }
        media = suma / MAX;
        return media;
        //Esto con un for each o un iterador
        /*
         for (Integer clave:mapa.keyset()){
         suma... 
          
         }
         con el iterador 
        
        it<integer> ... 
        while (...){
        suma... 
        }
         */
    }

    public static void diaMasCaluroso(ArrayList<Dia> diaConSemana, Map<Integer, Dia> mapa) {
        Iterator itCaluroso = mapa.keySet().iterator();
        int masCaluroso, i, contador;
        contador = 0;
        masCaluroso = diaConSemana.get(0).getTemperatura();
        /*
        Aquí un iterador o un for each 
        Cuando acabo el primer recorrigo con el iterador este estaría apuntando al 
        siguiente del último (que sería nulo) y tendría que volver inicializarlo a 
        0 para que empiece de nuevo: it = mapa.keyset().iterator();
        NO hace falta declararlo de nuevo, solo que apunte al principio
        Pero para el poner el mayor a 0, usamos el que no tiene índices, no hay día 
        con clave 0. 
        En este ejercicio se puede poner
        mapa.get(1).getTemp.
        Pero lo ideal sería con el método next. Así me retorna el primer día. 
        */
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
        //NO usar arrayList aquí, vale con que se guarden en el mapa

        menu(diaConSemana, mapa);
        //CORREGIR LOS BUCLES Y USAR FOR EACH O ITERADORES
    }

}
