
package ed_ut4_proyecto;

public class Pelicula {
    private String titulo;
    private float costeLicencia;
    private Socio[] vSocios;

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
            System.out.println("    Socio: "+this.vSocios[i].getNombre()+" - Precio abonado: "+this.vSocios[i].getPrecioAbonado());
        }
    }
    
    public float getRentabilidad(){
        float rentabilidad, ingresos = 0;
        for(int i = 0; i < this.vSocios.length;i++){
            ingresos = ingresos + this.vSocios[i].getPrecioAbonado();
        }
        rentabilidad = ingresos - this.costeLicencia;
        return rentabilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(float costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socio[] getvSocios() {
        return vSocios;
    }

    public void setvSocios(Socio[] vSocios) {
        this.vSocios = vSocios;
    }
    
    
}