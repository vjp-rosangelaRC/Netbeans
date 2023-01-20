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
    public float calcularSalarioBruto(String tipo, float ventasMes, float horasExtra) {
        Scanner entrada = new Scanner(System.in);

        String tipo1 = "vendedor", tipo2 = "encargado";
        float horas = 0, salarioBase = 0, prima = 0, salarioBruto;
        boolean iguales;     

        // Falta el equals
        iguales = tipo1.equalsIgnoreCase(tipo);

        // Diferencia entre encargado y vendedor
        if (iguales) {
            salarioBase = 1000;

        } else {
            if (!iguales) {
                salarioBase = 1500;
            } else {
                System.out.println("Está mal escrito");
            }
        }

        // Primas
        if (ventasMes >= 1000) {
            prima = 100;
        } else {
            if (ventasMes >= 1500) {
                prima = 200;
            }
        }

        salarioBruto = (salarioBase + prima);
        horasExtra = (salarioBruto + (horas * 20/*euros*/));

        return salarioBruto;
    }

    public float calculaSalarioNeto(float salarioBruto) {
        float retencion1 = 0.16F, retencion2 = 0.18F, salarioNeto = 0;      

        if (salarioBruto < 1000) {
            salarioNeto = salarioBruto;
        } else {
            if (salarioBruto <= 1000) {
                salarioNeto = retencion1 * salarioBruto;
            } else {
                if (salarioBruto > 1500) {
                    salarioNeto = retencion2 * salarioBruto;
                }

            }
        }
        return salarioNeto;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        String tipo;
        
        // Pido los datos y los guardo en las variables
        System.out.println("Calcular el salario bruto");
        System.out.println("Introduzca su puesto (vendedor o encargado)");
        tipo = entrada.nextLine();
        
        
    }

}
