/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_;

import java.util.Scanner;

/**
 *
 * @author rdlrosac01
 */
public class Salario_ {

    /**
     * @param args the command line arguments
     */
    public static float calcularSalarioBruto(String tipo, float ventasMes, float horasExtra) {
        Scanner entrada = new Scanner(System.in);

        String vendedor = "vendedor", encargado = "encargado";
        float horas = 0, salarioBase = 0, prima = 0, salarioBruto;
        boolean iguales, iguales2;

        // Falta el equals
        iguales = vendedor.equalsIgnoreCase(tipo);
        iguales2 = encargado.equalsIgnoreCase(tipo);

        // Diferencia entre encargado y vendedor
        if (iguales == true) {
            salarioBase = 1000;
        }
        if (iguales2 == true) {
            salarioBase = 1500;
        }

        // Primas
        if (ventasMes > 0) {
            if (ventasMes >= 1000 && ventasMes < 1500) {
                prima = 100;
            } else {
                if (ventasMes >= 1500) {
                    prima = 200;
                }
            }
        }

        if (horasExtra > 0) {
            horasExtra = horas * 20/*euros*/;
        }

        salarioBruto = salarioBase + prima + horasExtra;

        return salarioBruto;
    }

    public static float calcularSalarioNeto(float salarioBruto) {
        float retencion1 = 0.16F, retencion2 = 0.18F, salarioNeto = 0, resta;

        if (salarioBruto < 1000) {
            salarioNeto = salarioBruto;
            System.out.println("Su salario neto es " + salarioNeto + " euros");
        }
        if (salarioBruto >= 1000 && salarioBruto < 1500) {
            resta = (retencion1 * salarioBruto);
            salarioNeto = salarioBruto - resta;
            System.out.println("Su salario neto es " + salarioNeto + " euros");
        }
        if (salarioBruto > 1500) {
            resta = (retencion2 * salarioBruto);
            salarioNeto = salarioBruto - resta;
            System.out.println("Su salario neto es " + salarioNeto + " euros");
        }

        System.out.println(salarioNeto);
        return salarioNeto;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String tipo;
        float ventasMes, horasExtra, salarioBruto;

        // Pido los datos y los guardo en las variables
        System.out.println("Calcular el salario bruto");
        System.out.println("Introduzca su puesto (vendedor o encargado)");
        tipo = entrada.nextLine();
        System.out.println("Introduzca las ventas mensuales:");
        ventasMes = entrada.nextInt();
        System.out.println("Introduzca las horas extra:");
        horasExtra = entrada.nextInt();

        // Ahora llamo métodos
        salarioBruto = calcularSalarioBruto(tipo, ventasMes, horasExtra);
        calcularSalarioNeto(salarioBruto);

    }

}
