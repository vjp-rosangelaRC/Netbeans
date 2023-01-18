/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class Test {

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce nombre");
        nombre = entrada.nextLine();
        return nombre;
    }

    public static int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Introduce nota");
        nota = entrada.nextInt();
        return nota;
    }

    public static void mostrarNota(Alumno alumnoAuxiliar) {
        System.out.print("Alumno: " + alumnoAuxiliar.getNombre());
        switch (alumnoAuxiliar.getNota()) {
            case 0:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            // etc
        }

    }

    public static void main(String[] args) {

        /* 
        Alumno alumno1 = new Alumno("Julia", 8);
        Alumno alumno2 = new Alumno("Mari Carmen", 5);
        Alumno alumno3 = new Alumno("Elena", 9);
        
        System.out.println(alumno1.toString());
        // También se puede hacer 
        // Alumno alumno2 = new Alumno ("Pepe", 6);
        
        alumno1.getNombre();
        alumno1.getNota();
        alumno1.getCalificacion();
        
        // Como tengo que pedirle al usuario su nombre y nota creo dos métodos estáticos encima del main
        // Dentro del método pedir nota hago el bucle do while para que controle que los números que introduce son correcots
        nombre = pedirNombre();
        nota = pedirNota();
        // Tienen que ser estáticos para que no me tenga que crear un objeto alumno, poniendolo dentro de la clase alumno
        // Cuando ya tengo esto puedo pasar por parámetros el nombre con el setter y la nota con su setter
        alunno setNombre(nombre);
        //Con esto ya tengo la información de un alumno. 
        // Tendría que cream eun metodo estático encima del main o en la case alumno. L epuedo mandar un objeto de clase almno y con el getter mostrar una nota o ahcer un método aparte. 
        // Haciendo con lo de mandar objeto
        mostrarNotas(alumno1);
        //Haciendolo de la otra manera
        1.getNota() = nota;
        mostrasrNotas(nota);
    }
         */ String nombre;
        int nota;

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        System.out.println("Alumno 1:");
        nombre = pedirNombre();

        do {
            nota = pedirNota();
            if (nota < 0 || nota < 10) {
                System.out.println("Nota no valida");
            }

        } while (nota < 0 || nota > 10);

        alumno1.setNombre(nombre);
        alumno1.setNota(nota);
        mostrarNota(alumno1);
    }
}
