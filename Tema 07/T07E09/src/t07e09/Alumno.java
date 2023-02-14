/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t07e09;

import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class Alumno {
    String nombreAlumno;
    Asignatura[] vAsignatura;

    public Alumno() {
        this.nombreAlumno = "";
        vAsignatura = new Asignatura[4];
        for (int i= 0; i < vAsignatura.length; i++){
            vAsignatura[i] = new Asignatura();
        }
    }
    /*Es en el constructor donde damos el tamaño del vector*/
    
    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.vAsignatura = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getvAsignatura() {
        return vAsignatura;
    }

    public void setvAsignatura(Asignatura[] vAsignatura) {
        this.vAsignatura = vAsignatura;
    }
    
   
    
    
    
}
