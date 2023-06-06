/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e14;

/**
 *
 * @author Ross
 */
public class Asignatura {
    private String nomAsignatura; 
    private float nota; 

    public Asignatura(String nomAsignatura, float nota) {
        this.nomAsignatura = nomAsignatura;
        this.nota = nota;
    }
    
    public Asignatura() {
        this.nomAsignatura = "";
        this.nota = 0;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nomAsignatura=" + nomAsignatura + ", nota=" + nota + '}';
    }
    
    
}
