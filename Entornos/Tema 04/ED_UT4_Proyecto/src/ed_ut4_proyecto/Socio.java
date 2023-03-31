/**
 * Esta clase contiene los atributos y métodos de la clase Socio. 
 * Esta clase sirve para registrar un socio, usando su nombre y la cantidad
 * que abona para ver las películas
 *
 * @author Rosangela de la Rosa
 * @version 1.0
 */
package ed_ut4_proyecto;

public class Socio {

    /**
     * Atributos de la clase Socio
     */
    private String nombre;
    private float precioAbonado;

    /**
     * Crea un objeto Socio con valores predeterminados
     */
    public Socio() {
        this.nombre = "";
        this.precioAbonado = 0;
    }

    /**
     * Constructor parametrizado. Crea un objeto Socio con la información 
     * que recibe por parámetros
     *
     * @param nombre: nombre del objeto Socio que se quiere registrar
     * @param precioAbonado: precio que abona cada socio para ver películas
     */
    public Socio(String nombre, float precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    /**
     * Método para obtener el nombre del socio
     *
     * @return devuelve el nombre del objeto Socio registrado 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del socio
     *
     * @param nombre: Nombre que le asignamos al objeto Socio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la cantidad que ha abonado el socio
     *
     * @return devuelve la cantidad que ha abonado el socio
     */
    public float getPrecioAbonado() {
        return precioAbonado;
    }

    /**
     * Método para establecer la cantidad que abona el socio
     *
     * @param precioAbonado: Asignamos la cantidad que abona el socio
     */
    public void setPrecioAbonado(float precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

}
