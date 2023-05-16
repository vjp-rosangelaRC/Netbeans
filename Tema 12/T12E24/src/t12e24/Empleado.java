/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e24;

import java.io.Serializable;

/**
 *
 * @author Ross
 */
public class Empleado implements Serializable{

    private String nombre;
    private int numeroHoras;
    private float tarifaHora;

    public Empleado(String nombre, int numeroHoras, float tarifaHora) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.tarifaHora = tarifaHora;
    }

    public Empleado() {
        this.nombre = "";
        this.numeroHoras = 0;
        this.tarifaHora = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public float getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(float tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public float calcularSueldo() {
        float sueldoBruto = 0;

        if (this.numeroHoras <= 40) {
            sueldoBruto = this.numeroHoras * this.tarifaHora;
        } else {
            sueldoBruto = (float) (40 * tarifaHora + (numeroHoras - 40) * tarifaHora * 1.5);
        }
        return sueldoBruto;
    }

    @Override
    public String toString() {
        return nombre + " trabajó " + numeroHoras + " horas, cobra " + tarifaHora + " euros la hora por lo que le corresponde un sueldo de " + calcularSueldo() + " euros";
    }

}
