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
    Asignatura[] notas;

    public Alumno() {
        this.nombreAlumno = "";
        this.notas = notas;
    }
    
    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
    
   
    
    
    
}
