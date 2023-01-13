/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e16;

/**
 *
 * @author Ross
 */
public class Test {
     public static void main(String[] args) {
         Alumno alumno1 = new Alumno("alex",5);
         Alumno alumno2 = new Alumno("rosa",-5);
         Alumno alumno3 = new Alumno("cris",44);
         Alumno alumno4 = new Alumno("alex",6);
         Alumno alumno5 = new Alumno("alex",7);
         Alumno alumno6 = new Alumno("rosa",8);
         Alumno alumno7 = new Alumno("alex",9);
         Alumno alumno8 = new Alumno("alex",10);
         System.out.println(alumno1.getCalificacion());
         System.out.println(alumno2.getCalificacion());
         System.out.println(alumno3.getCalificacion());
         System.out.println(alumno4.getCalificacion());
         System.out.println(alumno5.getCalificacion());
         System.out.println(alumno6.getCalificacion());
         System.out.println(alumno7.getCalificacion());
         System.out.println(alumno8.getCalificacion());
    }
}
