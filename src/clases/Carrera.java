package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Carrera {
    
    private String cod_car;
    private String nombre_car;
    private String duracion_car;
    private String descripcion;

    public Carrera(String cod_car, String nombre_car, String duracion_car, String descripcion) {
        this.cod_car = cod_car;
        this.nombre_car = nombre_car;
        this.duracion_car = duracion_car;
        this.descripcion = descripcion;
    }

    public Carrera() {
    }

    public String getCod_car() {
        return cod_car;
    }

    public void setCod_car(String cod_car) {
        this.cod_car = cod_car;
    }

    public String getNombre_car() {
        return nombre_car;
    }

    public void setNombre_car(String nombre_car) {
        this.nombre_car = nombre_car;
    }

    public String getDuracion_car() {
        return duracion_car;
    }

    public void setDuracion_car(String duracion_car) {
        this.duracion_car = duracion_car;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
}
