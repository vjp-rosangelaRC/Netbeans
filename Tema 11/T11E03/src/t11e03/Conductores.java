/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t11e03;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class Conductores {
    private int dni; 
    private String nombre; 

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int pedirN(){
        Scanner entrada = new Scanner(System.in);
        int n; 
        n = entrada.nextInt();
        return n; 
    }
    
    public static String pedirS(){
        Scanner entrada = new Scanner(System.in);
        String n; 
        n = entrada.nextLine();
        return n; 
    }
    
    public void datosConductor(){
        String nombre; 
        int dni;
        System.out.println("¿Nombre?");
        nombre = pedirS();
        this.nombre = nombre;
        System.out.println("¿DNI?");
        dni = pedirN();
        this.dni = dni;
    }
    
    
}
