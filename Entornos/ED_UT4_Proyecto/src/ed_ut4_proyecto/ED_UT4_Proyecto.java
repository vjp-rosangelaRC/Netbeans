
package ed_ut4_proyecto;

import java.util.Scanner;

public class ED_UT4_Proyecto {
    
    public static void main(String[] args) {
        String t, n;
        float l, precioA;
        float rAct, rMax, rMin;
        boolean enc;
        Scanner teclado = new Scanner(System.in);
        Pelicula[] vPeliculas = new Pelicula[2];
        int opc;
        do{
            System.out.println("1. Rellenar");
            System.out.println("2. Mostrar");
            System.out.println("3. Mostrar + rentable");
            System.out.println("4. Mostrar - rentable");
            System.out.println("5. Buscar película");
            System.out.println("6. Salir");
            opc = teclado.nextInt();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            switch(opc) {
                case 1:
                    for(int i = 0;i < vPeliculas.length;i++){
                        vPeliculas[i] = new Pelicula();
                        System.out.println("Titulo: ");
                        t = teclado.nextLine();
                        vPeliculas[i].titulo = t;
                        System.out.println("Licencia: ");
                        l = teclado.nextFloat();
                        teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
                        vPeliculas[i].costeLicencia = l;          
                        for(int j = 0; j < vPeliculas[i].vSocios.length;j++){
                            vPeliculas[i].vSocios[j] = new Socio();
                            System.out.println("Nombre: ");
                            n = teclado.nextLine();
                            vPeliculas[i].vSocios[j].nombre = n;
                            System.out.println("Precio Abonado: ");
                            precioA = teclado.nextFloat();
                            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
                            vPeliculas[i].vSocios[j].precioAbonado = precioA;
                        }
                    }
                    break;
                case 2:
                    for(int i = 0;i < vPeliculas.length;i++){
                        vPeliculas[i].mostrarPelicula();
                    }
                    break;
                case 3:
                    rMax = vPeliculas[0].getRentabilidad();
                    t = vPeliculas[0].titulo;
                    for(int i = 0;i < vPeliculas.length;i++){
                        rAct = vPeliculas[i].getRentabilidad();
                        if  (rAct > rMax){
                            rMax = rAct; 
                            t = vPeliculas[i].titulo;
                        }
                    }
                    System.out.println("La perícula "+t+" con una rentabilidad de "+rMax+" euros.");
                    break;
                case 4:
                    rMin = vPeliculas[0].getRentabilidad();
                    t = vPeliculas[0].titulo;
                    for(int i = 0;i < vPeliculas.length;i++){
                        rAct = vPeliculas[i].getRentabilidad();
                        if  (rAct < rMin){
                            rMin = rAct; 
                            t = vPeliculas[i].titulo;
                        }
                    }
                    System.out.println("La perícula "+t+" con una rentabilidad de "+rMin+" euros.");
                    break;
                case 5:
                    System.out.println("Título: ");
                    t = teclado.nextLine();                  
                    int i = 0;
                    enc = false;
                    while((i < vPeliculas.length)&&(!enc)){
                        if  (vPeliculas[i].titulo.equalsIgnoreCase(t)){
                            enc = true;
                        }
                        else{
                            i++;
                        }
                    }
                    if  (enc){
                        vPeliculas[i].mostrarPelicula();
                        System.out.println(vPeliculas[i].getRentabilidad());
                    }
                    else{
                        System.out.println("La película no está registrada");
                    }
                    
                    break;
                case 6:
                    System.out.println("ADIÓS");
                    break;
            }
            
        }while(opc != 6);
    }
    
}