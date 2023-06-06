/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e14;

import java.util.ArrayList;

/**
 *
 * @author Ross
 */
public class Alumno {

    private String nomAlumno;
    private ArrayList<Asignatura> asignaturas;

    public Alumno(String nomAlumno, ArrayList<Asignatura> asignaturas) {
        this.nomAlumno = nomAlumno;
        asignaturas = new ArrayList<>();
    }

    public Alumno() {
        this.nomAlumno = "";
        asignaturas = new ArrayList<>();
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void rellenarasignaturas() {
        Asignatura aux;
        for (int i = 0; i < 3; i++) {
            aux = new Asignatura("aa" + i+1, i+1);
            
            this.asignaturas.add(aux);
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nomAlumno=" + nomAlumno + ", asignaturas=" + asignaturas.toString() + '}';
    }

}
