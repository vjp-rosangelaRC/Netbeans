/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e12;

/**
 *
 * @author Ross
 */
public class Triangulo {
    private int cateto1;
    private int cateto2;

    public Triangulo(int cateto1, int cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    public Triangulo() {
        this.cateto1 = 0;
        this.cateto2 = 0;
    }

    public int getCateto1() {
        return cateto1;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }
    
}
