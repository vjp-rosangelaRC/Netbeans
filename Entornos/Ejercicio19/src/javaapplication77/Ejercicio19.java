package javaapplication77;

/**
 *
 * @author XXXXX
 */
public class Ejercicio19 extends clasePrueba {
/*No he podido hacer el de suma ni el punto 6*/
    public static void main(String[] args) {
        int numero1 = 3, numero2 = 6, cociente;
        hacerCociente(numero1, numero2);
        resto(numero1, numero2);
        numero1 = incrementoA(numero1);
        numero1 = incrementoB(numero1);
        // 'numero1' será igual numero1 5 puesto que incrementemos en 1 el valor anterior
        cociente = ++numero1 + numero2++;
        System.out.println("El valor de a es: " + numero1);
        System.out.println("El valor de b es: " + numero2);
        System.out.println("El valor de c es: " + cociente);
        /**
         * 'a' será igual a 6 puesto que incrementemos en 1 el valor anterior
         * 'b' será igual a 7 puesto que su valor se incrementa en 1 'c' será
         * igual a 13, resultado de sumar los números anteriores
         */
        cociente = ++numero1 + ++numero2;
        System.out.println("El valor de a es: " + numero1);
        System.out.println("El valor de b es: " + numero2);
        System.out.println("El valor de c es: " + cociente);
        /**
         * 'a' será igual a 7 puesto que incrementemos en 1 el valor anterior
         * 'b' será igual a 8 puesto que su valor se incrementa en 1 'c' será
         * igual a 15, resultado de sumar los números anteriores
         */
    }

}
