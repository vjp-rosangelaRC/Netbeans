/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e29;

/**
 *
 * @author Ross
 */
public class Examen {
    private String nombre;
    private int aula;
    private String fecha;
    private String hora; 

    public Examen(String nombre, int aula, String fecha, String hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public Examen() {
        this.nombre = nombre;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Examen{" + "nombre=" + nombre + ", aula=" + aula + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
}
