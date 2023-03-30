package ed_ut4_proyecto;

import java.util.Scanner;

public class ED_UT4_Proyecto {

    public static void main(String[] args) {
        String titulo;
        float rentabilidadMax, rentabilidadMin;

        Scanner teclado = new Scanner(System.in);
        Pelicula[] vPeliculas = new Pelicula[2];

        int opcion;
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
