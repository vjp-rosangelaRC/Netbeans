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
public class Direccion {
    private int numero;
    private int piso;
    private String calle;
    private String ciudad;

    public Direccion(int numero, int piso, String calle, String ciudad) {
        this.numero = numero;
        this.piso = piso;
        this.calle = calle;
        this.ciudad = ciudad;
    }
    
     public Direccion() {
        this.numero = 0;
        this.piso = 0;
        this.calle = "";
        this.ciudad = "";
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
