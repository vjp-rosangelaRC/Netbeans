/**
 * Esta clase contiene los atributos y métodos de la clase película
 *
 * @author Rosangela de la Rosa
 * @version 2.0 Hay que importar java.util.Scanner para trabajar con este
 * proyecto
 */
package ed_ut4_proyecto;

import java.util.Scanner;

public class ED_UT4_Proyecto {

    public static void main(String[] args) {
        /**
         * Atributos específicos del main
         */
        String titulo;
        float rentabilidadMax, rentabilidadMin;
        int opcion;
        /**
         * Se crea un escáner de nombre 'teclado'
         */
        Scanner teclado = new Scanner(System.in);
        /**
         * Se crea un vector de Película con dos celdas
         */
        Pelicula[] vPeliculas = new Pelicula[2];
        /**
         * Se crea el menú dentro de un do ... while para que solo acabe cuando
         * se selecciona la opción 6
         */

        do {
            System.out.println("1. Rellenar");
            System.out.println("2. Mostrar");
            System.out.println("3. Mostrar + rentable");
            System.out.println("4. Mostrar - rentable");
            System.out.println("5. Buscar película");
            System.out.println("6. Salir");
            /**
             * Se recoge el input del usuario
             */
            opcion = teclado.nextInt();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            /**
             * Aquí se inicia el switch con los métodos específicos de cada
             * parte. Se usa la variable opción para seleccionar la opción
             * correspondiente dentro del menú
             */
            switch (opcion) {
                case 1:
                    /**
                     * Método que rellena el vector de Películas usando los
                     * valores que introduce el usuario por teclado
                     *
                     * @param vPeliculas → Vector de películas
                     * @param teclado → Scanner que hemos creado para recibir el
                     * input del usuario.
                     */
                    rellenar(vPeliculas, teclado);
                    break;
                case 2:
                    /**
                     * Método que muestra el vector de Películas usando un bucle
                     * for
                     *
                     * @param vPeliculas → Vector de películas
                     */
                    mostrarPeliculas(vPeliculas);
                    break;
                case 3:
                    /**
                     * Método que muestra la película que es más rentable (la
                     * rentabilidad se calcula restando el precio de las
                     * licencias al ingreso)
                     *
                     * @param rentabilidadMax → Se inicializa al primer valor
                     * del vector de Películas
                     */
                    rentabilidadMax = vPeliculas[0].getRentabilidad();
                    mostrarMasRentable(vPeliculas, rentabilidadMax);
                    break;
                case 4:
                    /**
                     * Método que muestra la película que es menos rentable (la
                     * rentabilidad se calcula restando el precio de las
                     * licencias al ingreso)
                     *
                     * @param rentabilidadMin → Se inicializa al primer valor
                     * del vector de Películas
                     */
                    rentabilidadMin = vPeliculas[0].getRentabilidad();
                    mostrarMenosRentable(vPeliculas, rentabilidadMin);
                    break;
                case 5:
                    /**
                     * Método que nos pide el título de la película que queremos
                     * buscar y nos muestra los datos de la película y su
                     * rentabilidad
                     *
                     * @param vPeliculas → Vector de películas
                     * @param titulo → Valor del título que se le pide al
                     * usuario
                     */
                    System.out.println("Título: ");
                    titulo = teclado.nextLine();

                    buscarPelicula(vPeliculas, titulo);

                    break;
                case 6:
                    /**
                     * Mensaje que se muestra al salir del menú
                     */
                    System.out.println("ADIÓS");
                    break;

                /**
                 * Default para controlar que el usuario seleccione alguna de
                 * las opciones posibles del menú
                 */
                default:
                    System.out.println("No es una opción válida");
            }

        } while (opcion != 6);
    }

    /**
     *
     * @param vPeliculas
     * @param titulo
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

    public static void mostrarMenosRentable(Pelicula[] vPeliculas, float rentableMin) {
        float rentableActual = 0;
        String titulo = "";
        for (int i = 0; i < vPeliculas.length; i++) {
            rentableActual = vPeliculas[i].getRentabilidad();
            if (rentableActual < rentableMin) {
                rentableMin = rentableActual;
                titulo = vPeliculas[i].getTitulo();
            }
        }
        System.out.println("La perícula " + titulo + " con una rentabilidad de " + rentableMin + " euros.");
    }

    public static void mostrarMasRentable(Pelicula[] vPeliculas, float rentableMax) {
        float rentableActual = 0;
        String titulo = "";
        for (int i = 0; i < vPeliculas.length; i++) {
            rentableActual = vPeliculas[i].getRentabilidad();
            if (rentableActual > rentableMax) {
                rentableMax = rentableActual;
                titulo = vPeliculas[i].getTitulo();
            }
        }
        System.out.println("La perícula " + titulo + " con una rentabilidad de " + rentableMax + " euros.");
    }

    public static void mostrarPeliculas(Pelicula[] vPeliculas) {
        for (int i = 0; i < vPeliculas.length; i++) {
            vPeliculas[i].mostrarPelicula();
        }
    }

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
