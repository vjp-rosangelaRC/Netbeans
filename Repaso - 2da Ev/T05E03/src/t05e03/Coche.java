/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e03;

/**
 *
 * @author Ross
 */
public class Coche {
    private String marca;
    private String modelo;
    private Rueda rueda; 

    public Coche(String marca, String modelo, Rueda rueda) {
        this.marca = marca;
        this.modelo = modelo;
        this.rueda = rueda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", rueda=" + rueda + '}';
    }
    
    
}
