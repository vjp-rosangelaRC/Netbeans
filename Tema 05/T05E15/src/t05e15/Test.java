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

public class Test {
    //Método para mostrar los datos de empleado → no consigo hacerlo
    public String mostrarDatos (Empleado empleado1){
        String mostrarE1 = empleado1.getNombre() + empleado1.getDireccion() + empleado1.getSalario();
        return mostrarE1;
        
        
        
        // Empleado 1
    /*System.out.println("Empleado 1:");
    System.out.println("Nombre:" + empleado1.getNombre());
    System.out.println("Salario:" + empleado2.getSalario());
    System.out.println("Direccion");
    
    System.out.println("Calle:" + empleado2.getDireccion().getCalle());
    System.out.println("Numero:" + empleado2.getDireccion().getNumero());
    System.out.println("Puerta:" + empleado2.getDireccion().getPiso());
    System.out.println("Ciudad:" + empleado2.getDireccion().getCiudad());

    //Empleado 2
    //Empleado 3

        */
    }
    
    public static void main(String[] args) {
              
    // Creo las tres direcciones
    Direccion direccion1 = new Direccion();
    Direccion direccion2 = new Direccion();
    Direccion direccion3 = new Direccion();
    
    // Declaro las variables 
    String calle1 = "azul", calle2= "blanco", calle3= "amapola", ciudad1="Madrid", ciudad2="Cáceres", ciudad3="Plasencia";
    int numero1= 5, numero2=0, numero3=15, piso1=3, piso2=7, piso3=9;

    //Asigno valores    
    // Valores calle
    direccion1.setCalle(calle1);
    direccion2.setCalle(calle2);
    direccion3.setCalle(calle3);
    
    // Valores numero
    direccion1.setNumero(numero1);
    direccion2.setNumero(numero2);
    direccion3.setNumero(numero3);
    
    // Valores piso
    direccion1.setPiso(piso1);
    direccion2.setPiso(piso2);
    direccion3.setPiso(piso3);

    // Valores ciudad
    direccion1.setCiudad(ciudad1);
    direccion2.setCiudad(ciudad2);
    direccion3.setCiudad(ciudad3);
    
    
    // Creo 3 empleados
    Empleado empleado1 = new Empleado();
    Empleado empleado2 = new Empleado();
    Empleado empleado3 = new Empleado();
    
    //Declaro las variables
    String nombre1="Juan", nombre2="Pepe", nombre3="Ana";
    int salario1=500, salario2=380, salario3=580;
    
    //Valores nombre
    empleado1.setNombre(nombre1);
    empleado2.setNombre(nombre2);
    empleado3.setNombre(nombre3);

    //Valores salario
    empleado1.setSalario(salario1);
    empleado2.setSalario(salario2);
    empleado3.setSalario(salario3);
    
    // Valores dirección
    empleado1.setDireccion(direccion1);
    empleado2.setDireccion(direccion2);
    empleado3.setDireccion(direccion3);   

    //Muestro datos
        System.out.println("" + empleado1.mostrarDatos());
    }
}
