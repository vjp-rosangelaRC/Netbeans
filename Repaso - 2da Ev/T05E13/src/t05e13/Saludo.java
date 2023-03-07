/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e13;

/**
 *
 * @author Ross
 */
public class Saludo {
    private String frase; 

    public Saludo(String frase) {
        this.frase = frase;
    }
    
    public Saludo() {
        this.frase = "Hola, que tal";
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
}
