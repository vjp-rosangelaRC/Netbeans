/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e19;

/**
 *
 * @author Ross
 */

//Si incluyo calcular tarifas dentro de la clase empleado lo puedo ejecutar para cada objeto de la clase empleado
/* public void calcularTarifas(){
int totalTarfica, restoHoras;
if (horas <=40){
totalTarifa = tarifa * horas;
sout ("su tarifa" + totalTarifa);
}
else {
restoHoras = horas % 40;
totalTarifa = (int) ((tarifa*1.5)*(restoHoras)+(horas- ...)
}*/
public class Empleado {
    private String nombre;
    private int horas;
    private double tarifa;

    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double getSueldo(){
        double sueldo = 0, horasExtra = 0, horas = 0;
        if(this.horas > 40){
            horasExtra = this.horas - 40;
        }
        horas = this.horas - horasExtra;
        sueldo = (horas * this.tarifa) + (horasExtra * (this.tarifa+(this.tarifa/2)));
        return sueldo;
    }

    public String toString() {
        return this.nombre + " trabajo " + this.horas + " horas, cobra " + this.tarifa +
                " euros la hora por lo que le corresponde un sueldo de " + this.getSueldo() + " euros.";
    }
    // Empleado1.toString y lo pongo dentro de un sout. 
    
}
