/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t10e12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ross
 */
public class T10E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Pepe");
        nombre.add("Ana");

        Iterator<String> it = nombre.iterator();
        String a;

        while (it.hasNext()) {
            a = it.next();
            System.out.println(a);
        }

    }

}
