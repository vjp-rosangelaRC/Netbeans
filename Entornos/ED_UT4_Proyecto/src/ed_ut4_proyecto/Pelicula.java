
package ed_ut4_proyecto;

public class Pelicula {
    String titulo;
    float costeLicencia;
    Socio[] vSocios;

    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0;
        this.vSocios = new Socio[2];
        for(int i = 0;i < this.vSocios.length;i++){
            this.vSocios[i] = new Socio();
        }
    }
    
    public Pelicula(String titulo, float costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.vSocios = new Socio[2];
        for(int i = 0;i < this.vSocios.length;i++){
            this.vSocios[i] = new Socio();
        }
    }
    
    public void mostrarPelicula(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Coste licencia: "+this.costeLicencia);
        for(int i = 0; i < this.vSocios.length;i++){
            System.out.println("    Socio: "+this.vSocios[i].nombre+" - Precio abonado: "+this.vSocios[i].precioAbonado);
        }
    }
    
    public float getRentabilidad(){
        float rentabilidad, ingresos = 0;
        for(int i = 0; i < this.vSocios.length;i++){
            ingresos = ingresos + this.vSocios[i].precioAbonado;
        }
        rentabilidad = ingresos - this.costeLicencia;
        return rentabilidad;
    }
    
}