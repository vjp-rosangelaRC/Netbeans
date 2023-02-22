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
                    break;
                }
                case 3:{
                    mediaMayorQueNumero(alumnos); /*No es la más alta, son todas */
                    break;
                }
                
                case 4:{
                    mediaSuspenso(alumnos);
                    break;
                }
                
                case 5:{
                    matriculado(alumnos);
                    break;
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
        boolean error;
        boolean celdaOcupada;

        do {
            celdaOcupada = false;
            error = false;
            System.out.println("¿Qué código tiene el alumno que quiere introducir?");
            posicion = pedirN();
            try {
                posicion = posicion - 1;
                if (alumnos[posicion] != null) {
                    System.out.println("Este alumno ya existe en el sistema. Introduzca un alumno nuevo");
                    celdaOcupada = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No es una opción válida");
                error = true;
            }     
            /*finally{
                alumnos[posicion] = null;
            }*/
        } while (celdaOcupada || error == true);
        
        if (alumnos[posicion] == null) { //Esto en principio sobra
            System.out.println("¿Nombre del alumno?");
            auxS = pedirS();

            System.out.println("¿Edad del alumno?");
            auxEdad = pedirN();

            System.out.println("¿Media del alumno?");
            auxNota = pedirN();

            alumnos[posicion] = new Alumno(auxS, auxEdad, auxNota);
        } 
    } // Aquí tengo que poner el do while solo en la parte de pedir la posición 

    public static void mostrarDatos(Alumno[] alumnos){
        
        for (int i = 0; i < alumnos.length; i++){
            if (alumnos[i] != null){
               System.out.println("El alumno " + alumnos[i].getNombre() + " tiene " + alumnos[i].getEdad() + " años y una media de " + alumnos[i].getNotaMedia()); 
            }
        }   
    }
    
    public static void mediaMayorQueNumero(Alumno[] alumnos){
        int numACompararar, aux, i; 
        aux = alumnos[0].getNotaMedia();
        
        System.out.println("Con qué quiere comparar la media");
        numACompararar = pedirN();
        // con un solo bucle for vale
        for(i = 0; i<alumnos.length; i++){
            if (alumnos[i] != null){
                if (alumnos[i].getNotaMedia() > numACompararar){
                    aux = alumnos[i].getNotaMedia();
                }
            }
        }   
        
        // Mostrar
        for(i=0; i<alumnos.length; i++){
            if (alumnos[i] != null){
                if(alumnos[i].getNotaMedia() == aux){
                   System.out.println("La nota media más alta es " + aux); 
                }
            }
        }
    }
    
    public static void mediaSuspenso (Alumno[] alumnos){
        int i; 
        String[] aux = new String[5];
        // Pide cuántos alumnos, no sacar los alumnos suspensos 
        aux[0] = alumnos[0].getNombre();
        
        for(i = 0; i<alumnos.length; i++){
            if (alumnos[i] != null){
                if (alumnos[i].getNotaMedia() < 5){
                    aux[i] = alumnos[i].getNombre();
                }
            }
        }   
        
        // Mostrar
        System.out.println("Los alumnos suspenso son ");
        for(i=0; i<alumnos.length; i++){
            if (aux[i] != null ){
                System.out.println(aux[i]);
            }
            
        }
    }
    
    public static void matriculado (Alumno[] alumnos){
        String nombreAlumno;
        int i; 
        String aux = "";
        boolean matriculado = false; // Este booleano sofbra y el bucle es While (en el
        // while sí habría que poner un booleano
        //luego faltaría también compronar si el [i] es nulo
        
        System.out.println("¿Qué alumno busca?");
        nombreAlumno = pedirS();
        
        for(i = 0; i<alumnos.length; i++){
            if (alumnos[i].getNombre()== nombreAlumno){
                System.out.println("El alumno " + nombreAlumno + " sí está matriculado.");
            }
        }   
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
