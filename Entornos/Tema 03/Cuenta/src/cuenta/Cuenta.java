/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    private String titular;
    private double cantidad;
    
    // COnstructor por defecto
    public Cuenta() {
        this.titular = "";
        this.cantidad = 0.0;
    }
    
    // Constructor parametrizado
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public static double ingresar (double cantidad){
        System.out.println("¿Cuánto quiere ingresar?");
        Scanner entrada = new Scanner(System.in);
        double ingreso = entrada.nextInt();
        
        if (cantidad <= 0){
            //nada
        } else {
            cantidad = cantidad + ingreso;
        }
        
        return cantidad;
    }
    
    public static double retirar (double cantidad){
        System.out.println("¿Cuánto quiere retirar?");
        Scanner entrada = new Scanner(System.in);
        double retirada = entrada.nextInt();
        
        if (retirada > cantidad){
            cantidad = 0;
        } else {
            cantidad = cantidad - retirada;
        }
        
        return cantidad;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
