/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e27;

/**
 *
 * @author Ross
 */
public class Consumo {
    private int km; 
    private int litros;
    private int velMedia;
    private int pgas;

    public Consumo(int km, int litros, int velMedia, int pgas) {
        this.km = km;
        this.litros = litros;
        this.velMedia = velMedia;
        this.pgas = pgas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(int velMedia) {
        this.velMedia = velMedia;
    }

    public int getPgas() {
        return pgas;
    }

    public void setPgas(int pgas) {
        this.pgas = pgas;
    }
    
    public int getTiempo(){
        int tiempo; 
        tiempo = velMedia * km;
        return tiempo;
    }
    
    public int consumo(){
        int consumo;
        consumo = km*litros;
        return consumo;
    }
    
    public int consumoEuros(){
        int euros;
        euros = pgas*consumo();
        return euros;
    }

    @Override
    public String toString() {
        return "Consumo{" + "km=" + km + ", litros=" + litros + ", velMedia=" + velMedia + ", pgas=" + pgas + '}';
    }
}
