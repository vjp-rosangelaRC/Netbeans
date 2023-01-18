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
public class Direccion {

    /**
     * @param args the command line arguments
     */
    private String calle;
    private int numero;
    private int piso;
    private String ciudad; 

    // Faltan los constructores, que se crean debajo de los atributos
    /*
    public Direccio(){
        calle = ";
        numero = 0;
        piso = 0;
        ciudad="";
    }
    Este sería el constructor por defecto. 
    El parametrizado ↓ 
    public Direccio(String calle, int numero, int piso, String ciudad){
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad="";
    */
    
    
     // Setters y getters 
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    /*
    abajo del todo se inserta el toString, que nos genera un método toString que, si me creo una cirección, me muestra la dirección con el método toString*/

    @Override
    public String toString() {
        return "Direccion:\n\t Calle:" + calle + "\n\t Piso:" + numero + "\n\t Piso" + piso + "\n Ciudad:" + ciudad;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
