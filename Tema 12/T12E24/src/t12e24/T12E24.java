/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t12e24;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ross
 */
public class T12E24 {

    /**
     * @param args the command line arguments
     */
    public static Empleado crearEmpleado(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del empleado: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce el número de horas trabajadas: ");
        int horas = entrada.nextInt();
        
        System.out.println("Introduce la tarifa por hora: ");
        float tarifa = entrada.nextFloat();
        
        System.out.println("Empleado creado con éxito.");
        Empleado empleado = new Empleado(nombre, horas, tarifa);
        
        return empleado;
    }
    
    public static void anhadirEmpleadoAArray(ArrayList<Empleado> empleados){
        empleados.add(crearEmpleado());
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        anhadirEmpleadoAArray(empleados);
        
    }
    
}
