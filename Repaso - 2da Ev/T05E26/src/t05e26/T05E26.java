/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e26;

/**
 *
 * @author rdlrosac01
 */
public class T05E26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto papas = new Papas(170);
        Producto chocos = new Chocos(300);
        int contador = 0;
        boolean parar = false;

        do {
            if (papas.getStock() <= 1) {
                parar = true;
            } else {
                if (chocos.getStock() <= 1) {
                    parar = true;
                }
            }
            papas.actualizarStock(1);
            chocos.actualizarStock(0.5);
            contador++;

        } while (parar = false);

        System.out.println(papas.getStock());
        System.out.println(chocos.getStock());
        System.out.println((contador));

    }

}
