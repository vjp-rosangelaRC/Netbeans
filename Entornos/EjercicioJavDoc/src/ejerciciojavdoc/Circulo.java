/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojavdoc;

/**
 *
 * @author rdlrosac01
 * @version 1.0
 */
public class Circulo {

    /**
     * @param centrox → Centro en la coordenada x
     * @param centroy → Centro en la coordenada y
     * @param radio → Radio del círculo
     */
    private double centroX;
    private double centroY;
    private double radio;
    /**
     * Método constructor parametrizado
     * @param cx → Centro en la coordenada x
     * @param cy → Centro en la coordenada y
     * @param r → Radio del círculo
     */
    public Circulo(double cx, double cy, double r) {
        centroX = cx;
        centroY = cy;
        radio = r;
    }
    /**
     * Método para devolver el centro de la coordenada x
     * @return Devuelve el valor del centro de la coordenada x
     */
    public double getCentroX() {
        return centroX;
    }
    /**
     * Método para devolver tamaño de la circunferencia del círculo
     * @return Devuelve el de la circunferencia del círculo
     */
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
    /**
     * Método para mover (??)
     * 
     */
    public void mueve(double deltaX, double deltaY) {
        centroX = centroX + deltaX;
        centroY = centroY + deltaY;
    }

    public void escala(double s) {
        radio = radio * s;
    }
}


