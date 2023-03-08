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
        double stock1, stock2;
        boolean parar = false;

        while (papas.getStock() > 0 && chocos.getStock() > 0) {

            papas.actualizarStock(1);
            chocos.actualizarStock(0.5);

            contador++;
        }

        System.out.println(papas.getStock());
        System.out.println(chocos.getStock());
        System.out.println((contador * 3));

    }

}
