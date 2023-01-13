/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e15;

/**
 *
 * @author Ross
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;

    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getDatos(){
        String result = "";
        result += "\nNombre: " + this.getNombre() + 
                "\nSalario: " + this.getSalario() + 
                "\nDireccion: " +
                "\n\tCalle:" + this.direccion.getCalle() +
                "\n\tNumero: " + this.direccion.getNumero() + 
                "\n\tPiso: " + this.direccion.getPiso() + 
                "\n\tCiudad " + this.direccion.getCiudad();
        return result;
    }
    
    
}
