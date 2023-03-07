/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t05e24;

/**
 *
 * @author Ross
 */
public class T05E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Productos manzana = new ProductosFrescos("aaa", " aa", " 0 0", 0);
        Productos pescado = new ProductosCongelados(0, "ddd", 0);
        Productos judias = new ProductosRefrigerados(0, "", 0);
        
        System.out.println(manzana.toString());
        System.out.println(pescado.toString());
        System.out.println(judias.toString());
    }
}
