package ed_ut4_proyecto;

import java.util.Scanner;

public class ED_UT4_Proyecto {

    public static void main(String[] args) {
        String titulo;
        float rentableMax, rentableMin;
        boolean enc;
        Scanner teclado = new Scanner(System.in);
        Pelicula[] vPeliculas = new Pelicula[2];
        titulo = vPeliculas[0].titulo;
        int opc;
        do {
            System.out.println("1. Rellenar");
            System.out.println("2. Mostrar");
            System.out.println("3. Mostrar + rentable");
            System.out.println("4. Mostrar - rentable");
            System.out.println("5. Buscar película");
            System.out.println("6. Salir");
            opc = teclado.nextInt();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            switch (opc) {
                case 1:
                    rellenar(vPeliculas, teclado);
                    break;
                case 2:
                    mostrar(vPeliculas);
                    break;
                case 3:
                    rentableMax = vPeliculas[0].getRentabilidad();
                    mostrarMasRentable(vPeliculas, rentableMax, titulo);
                    break;
                case 4:
                    rentableMin = vPeliculas[0].getRentabilidad();
                    mostrarMenosRentable(vPeliculas, rentableMin, titulo);
                    break;
                case 5:
                    System.out.println("Título: ");
                    titulo = teclado.nextLine();
                    int i = 0;
                    enc = false;
                    buscarPelicula(i, vPeliculas, enc, titulo);

                    break;
                case 6:
                    System.out.println("ADIÓS");
                    break;
            }

        } while (opc != 6);
    }

    public static void buscarPelicula(int i, Pelicula[] vPeliculas, boolean enc, String titulo) {
        while ((i < vPeliculas.length) && (!enc)) {
            if (vPeliculas[i].titulo.equalsIgnoreCase(titulo)) {
                enc = true;
            } else {
                i++;
            }
        }
        if (enc) {
            vPeliculas[i].mostrarPelicula();
            System.out.println(vPeliculas[i].getRentabilidad());
        } else {
            System.out.println("La película no está registrada");
        }
    }

    public static void mostrarMenosRentable(Pelicula[] vPeliculas, float rentableMin, String titulo) {
        float rentableActual;
        for (int i = 0; i < vPeliculas.length; i++) {
            rentableActual = vPeliculas[i].getRentabilidad();
            if (rentableActual < rentableMin) {
                rentableMin = rentableActual;
                titulo = vPeliculas[i].titulo;
            }
        }
        System.out.println("La perícula " + titulo + " con una rentabilidad de " + rentableMin + " euros.");
    }

    public static void mostrarMasRentable(Pelicula[] vPeliculas, float rentableMax, String titulo) {
        float rentableActual;
        for (int i = 0; i < vPeliculas.length; i++) {
            rentableActual = vPeliculas[i].getRentabilidad();
            if (rentableActual > rentableMax) {
                rentableMax = rentableActual;
                titulo = vPeliculas[i].titulo;
            }
        }
        System.out.println("La perícula " + titulo + " con una rentabilidad de " + rentableMax + " euros.");
    }

    public static void mostrar(Pelicula[] vPeliculas) {
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
            vPeliculas[i].titulo = titulo;
            System.out.println("Licencia: ");
            licencia = teclado.nextFloat();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            vPeliculas[i].costeLicencia = licencia;
            for (int j = 0; j < vPeliculas[i].vSocios.length; j++) {
                vPeliculas[i].vSocios[j] = new Socio();
                System.out.println("Nombre: ");
                nombre = teclado.nextLine();
                vPeliculas[i].vSocios[j].nombre = nombre;
                System.out.println("Precio Abonado: ");
                precioAbonado = teclado.nextFloat();
                teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
                vPeliculas[i].vSocios[j].precioAbonado = precioAbonado;
            }
        }
    }

}
