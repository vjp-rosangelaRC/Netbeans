/**
 * Esta clase contiene los atributos y métodos de la clase película
 *
 * @author Rosangela de la Rosa
 * @version 2.0
 */
package ed_ut4_proyecto;

public class Pelicula {
    /**
     * Atributos de la clase Película
     */
    private String titulo;
    private float costeLicencia;
    private Socio[] vSocios;
/**
     * Constructor por defecto
     */
    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0;
        this.vSocios = new Socio[2];
        for(int i = 0;i < this.vSocios.length;i++){
            this.vSocios[i] = new Socio();
        }
    }
    /**
     * Constructor parametrizado
     * @param titulo → título de la película que quiero guardar
     * @param costeLicencia → precio de la licencia de la película
     */
    public Pelicula(String titulo, float costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.vSocios = new Socio[2];
        for(int i = 0;i < this.vSocios.length;i++){
            this.vSocios[i] = new Socio();
        }
    }
    /**
     * Método que nos muestra las películas (título de la película y el coste de la licencia) usando un bucle for
     */
    public void mostrarPelicula(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Coste licencia: "+this.costeLicencia);
        for(int i = 0; i < this.vSocios.length;i++){
            System.out.println("    Socio: "+this.vSocios[i].getNombre()+" - Precio abonado: "+this.vSocios[i].getPrecioAbonado());
        }
    }
    /**
     * Método que nos devuelve la rentabilidad de una película
     * @return valor que corresponde a los ingresos - coste de la licencia 
     */
    public float getRentabilidad(){
        float rentabilidad, ingresos = 0;
        for(int i = 0; i < this.vSocios.length;i++){
            ingresos = ingresos + this.vSocios[i].getPrecioAbonado();
        }
        rentabilidad = ingresos - this.costeLicencia;
        return rentabilidad;
    }
/**
 * Método para obtener el título de una película
 * @return nos devuelve el título de la película 
 */
    public String getTitulo() {
        return titulo;
    }
/**
 * Método para establecer el título de película
 * @param titulo → Título de la película que queremos guardar
 */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
/**
 * Método para obtener el coste de la licencia
 * @return nos devuelve el valor del coste de la licencia 
 */
    public float getCosteLicencia() {
        return costeLicencia;
    }
/**
 * Método para establecer el valor del coste de la licencia 
 * @param costeLicencia → valor que queremos que tenga el coste de la licencia
 */
    public void setCosteLicencia(float costeLicencia) {
        this.costeLicencia = costeLicencia;
    }
/**
 * Método para recuperar los socios que tenemos en cada película
 * @return un vector de socios con 2 celdas
 */
    public Socio[] getvSocios() {
        return vSocios;
    }
/**
 * Método para añadir información al vector de socios
 * @param vSocios → Introducimos información a los socios (nombre del socio que se quiere registrar y precio que abona cada socio para ver películas)
 */
    public void setvSocios(Socio[] vSocios) {
        this.vSocios = vSocios;
    }
    
    
}