/**
 * Esta clase contiene los atributos y métodos de la clase película
 *
 * @author Rosangela de la Rosa
 * @version 2.0 
 */
package ed_ut4_proyecto;

import java.util.Scanner;

public class ED_UT4_Proyecto {

    /**
     * Este es el método main. 
     * Dentro de él tenemos un menú con 6 opciones. 
     * El menú se encuentra dentro de un blucle do while, para que se repita
     * siempre que el usuario no pulse la opción 6 (salir). 
     * El menú es un switch con los métodos específicos de cada opción. Se usa 
     * la variable opción para seleccionar la opción correspondiente dentro del 
     * menú. 
     * El case 6 muestra un mensaje al salir del menú. 
     * También hay un default para controlar que el usuario seleccione alguna 
     * de las opciones posibles del menú.
     * 
     * Dentro de las variables del método usamos la utilidad Scanner de Java 
     * para permitir que el usuario pueda seleccionar las opciones del menú y 
     * rellenar los datos para el vector película que creamos. 
     */
    public static void main(String[] args) {

        String titulo;
        float rentabilidadMax, rentabilidadMin;
        int opcion;

        Scanner teclado = new Scanner(System.in);

        Pelicula[] vPeliculas = new Pelicula[2];

        do {
            System.out.println("1. Rellenar");
            System.out.println("2. Mostrar");
            System.out.println("3. Mostrar + rentable");
            System.out.println("4. Mostrar - rentable");
            System.out.println("5. Buscar película");
            System.out.println("6. Salir");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número           
            switch (opcion) {
                case 1:
                    rellenar(vPeliculas, teclado);
                    break;
                case 2:
                    mostrarPeliculas(vPeliculas);
                    break;
                case 3:
                    rentabilidadMax = vPeliculas[0].getRentabilidad();
                    mostrarMasRentable(vPeliculas, rentabilidadMax);
                    break;
                case 4:
                    rentabilidadMin = vPeliculas[0].getRentabilidad();
                    mostrarMenosRentable(vPeliculas, rentabilidadMin);
                    break;
                case 5:
                    System.out.println("Título: ");
                    titulo = teclado.nextLine();
                    buscarPelicula(vPeliculas, titulo);
                    break;
                case 6:
                    System.out.println("ADIÓS");
                    break;

                default:
                    System.out.println("No es una opción válida");
            }

        } while (opcion != 6);
    }

    /**
     * Método que nos pide el título de la película que queremos buscar y nos
     * muestra los datos de la película y su rentabilidad
     *
     * @param vPeliculas: Vector de objetos de tipo Película
     * @param titulo: Valor del título que se le pide al usuario
     */
    public static void buscarPelicula(Pelicula[] vPeliculas, String titulo) {
        int i = 0;
        boolean encontrado = false;
        while ((i < vPeliculas.length) && (!encontrado)) {
            if (vPeliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado) {
            vPeliculas[i].mostrarPelicula();
            System.out.println(vPeliculas[i].getRentabilidad());
        } else {
            System.out.println("La película no está registrada");
        }
    }

    /**
     * Método que muestra la película que es menos rentable (la rentabilidad se
     * calcula restando el precio de las licencias al ingreso)
     *
     * @param vPeliculas: Vector de objetos de tipo Película
     * @param rentabilidadMin: Se inicializa al primer valor del vector de
     * Películas
     */
    public static void mostrarMenosRentable(Pelicula[] vPeliculas, float rentabilidadMin) {
        float rentableActual = 0;
        String titulo = "";
        for (int i = 0; i < vPeliculas.length; i++) {
            rentableActual = vPeliculas[i].getRentabilidad();
            if (rentableActual < rentabilidadMin) {
                rentabilidadMin = rentableActual;
                titulo = vPeliculas[i].getTitulo();
            }
        }
        System.out.println("La película " + titulo + " con una rentabilidad de " + rentabilidadMin + " euros.");
    }

    /**
     * Método que muestra la película que es más rentable (la rentabilidad se
     * calcula restando el precio de las licencias al ingreso)
     *
     * @param rentabilidadMax: Se inicializa al primer valor del vector de
     * Películas
     * @param vPeliculas: Vector de objetos de tipo Película
     *
     */
    public static void mostrarMasRentable(Pelicula[] vPeliculas, float rentabilidadMax) {
        float rentableActual = 0;
        String titulo = "";
        for (int i = 0; i < vPeliculas.length; i++) {
            rentableActual = vPeliculas[i].getRentabilidad();
            if (rentableActual > rentabilidadMax) {
                rentabilidadMax = rentableActual;
                titulo = vPeliculas[i].getTitulo();
            }
        }
        System.out.println("La perícula " + titulo + " con una rentabilidad de " + rentabilidadMax + " euros.");
    }

    /**
     * Método que muestra el vector de Películas usando un bucle for
     *
     * @param vPeliculas: Vector de objetos de tipo Película
     */
    public static void mostrarPeliculas(Pelicula[] vPeliculas) {
        for (int i = 0; i < vPeliculas.length; i++) {
            vPeliculas[i].mostrarPelicula();
        }
    }

    /**
     * Método que rellena el vector de Películas usando los valores que
     * introduce el usuario por teclado
     *
     * @param vPeliculas: Vector de objetos de tipo Película
     * @param teclado: Scanner que hemos creado para recibir el input del
     * usuario.
     */
    public static void rellenar(Pelicula[] vPeliculas, Scanner teclado) {
        String titulo;
        float licencia;
        String nombre;
        float precioAbonado;
        for (int i = 0; i < vPeliculas.length; i++) {
            vPeliculas[i] = new Pelicula();
            System.out.println("Titulo: ");
            titulo = teclado.nextLine();
            vPeliculas[i].setTitulo(titulo);
            System.out.println("Licencia: ");
            licencia = teclado.nextFloat();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            vPeliculas[i].setCosteLicencia(licencia);

            for (int j = 0; j < vPeliculas[i].getvSocios().length; j++) {
                vPeliculas[i].getvSocios()[j] = new Socio();
                System.out.println("Nombre: ");
                nombre = teclado.nextLine();
                vPeliculas[i].getvSocios()[j].setNombre(nombre);
                System.out.println("Precio Abonado: ");
                precioAbonado = teclado.nextFloat();
                teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
                vPeliculas[i].getvSocios()[j].setPrecioAbonado(precioAbonado);
            }
        }
    }

}
