/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e15;

/**
 *
 * @author rdlrosac01
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;

    // Hacemos el constructor por defecto
    public Empleado() {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = new Direccion();
    }
    // También podemos poner a null un objeto, para indicar que no quiero crearme este elmento por defecto. 
    
    
    // Faltaba el constructor. Se hace atomáticamene, es el parametrizado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }  
    /*
    //Se podría crear otro constructor con la información más desglosada:
    public Empleado(String nombre, int salario, String calle, int numero, int piso, String ciudad) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = new Direccion(calle, numero, piso, ciudad);  //Esto debería salir automático, no a mano
    }
    */
    
    // Setters y getters 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
}
