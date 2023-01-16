/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;

/**
 *
 * @author rdlrosac01
 */
public class Test {
    
    public static void calificaciones(){
        int nota = getNota();
        
    }
    
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
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
    
}
