/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e13;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class T07E13 {

    /**
     * @param args the command line arguments
     */
    public static void menuAlumno(Alumno[] alumnos) {
        int opcion;

        do {
            System.out.println(" M E N Ú ");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Rellenar datos de alumnos");
            System.out.println("2. Mostrar los datos de alumnos");
            System.out.println("3. Buscar alumnos con una media mayor que la introducida");
            System.out.println("4. Mostrar alumnos suspensos");
            System.out.println("5. Buscar si un alumno está matriculado o no");
            System.out.println("6. Salir");
            opcion = pedirN();

            switch (opcion) {
                case 1: {
                    rellenarDatos(alumnos);
                    break;
                }
                case 2: {
                    mostrarDatos(alumnos);
                }
                case 3:{
                    mediaMayorQueNumero();
                }
                
                default: {
                    System.out.println("No es una opción válida");
                }
            }
        } while (opcion != 6);

    }

    public static int pedirN() {
        Scanner entrada = new Scanner(System.in);
        int n;

        n = entrada.nextInt();
        return n;
    }

    public static String pedirS() {
        Scanner entrada = new Scanner(System.in);
        String s;

        s = entrada.nextLine();
        return s;
    }

    public static void rellenarDatos(Alumno[] alumnos) {
        int posicion, auxEdad, auxNota;
        String auxS;

        do {
            System.out.println("¿Qué código tiene el alumno que quiere introducir?");
            posicion = pedirN();
            posicion = posicion - 1;

            if (alumnos[posicion] == null) {
                System.out.println("¿Nombre del alumno?");
                auxS = pedirS();

                System.out.println("¿Edad del alumno?");
                auxEdad = pedirN();

                System.out.println("¿Media del alumno?");
                auxNota = pedirN();

                alumnos[posicion] = new Alumno(auxS, auxEdad, auxNota);

            } else {
                if (alumnos[posicion] != null) {
                    System.out.println("Este alumno ya existe en el sistema. Introduzca un alumno nuevo");
                }

            }
        } while (alumnos[posicion] != null);
    } // Aquí tengo que poner el do while solo en la parte de pedir la posición 
    
    public static void mostrarDatos(Alumno[] alumnos){
        for (int i = 0; i < alumnos.length; i++){
            System.out.println("El alumno " + alumnos[i].getNombre() + " tiene " + alumnos[i].getEdad() + " años y una media de " + alumnos[i].getNotaMedia());
        }
    }
    
    public static void mediaMayorQueNumero(){
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno1 = new Alumno("Pepe", 18, 5);
        Alumno alumno2 = new Alumno("Juan", 20, 7);
        Alumno alumno3 = new Alumno("María", 19, 9);

        /*System.out.println("El alumno 1 es " + alumno1.toString());
        System.out.println("El alumno 2 es " + alumno2.toString());
        System.out.println("El alumno 3 es " + alumno3.toString());*/
        // Aquí 13 ↑
        // Aquí 14 ↓

        Alumno[] alumnos = new Alumno[5];
        menuAlumno(alumnos);

    }

}
