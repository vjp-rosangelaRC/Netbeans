/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefactorizacion;

/**
 *
 * @author rdlrosac01
 */
public class contarPares {
    int contadorPares=0;
    for (int i=0; i<10; i++){
        contadorPares();
    }

    public void contadorPares() {
        if (i%2 == 0){
            contadorPares++;
        }
    }
    System.out.println ("Hay " + num + " números pares del 0 al 10");
}

