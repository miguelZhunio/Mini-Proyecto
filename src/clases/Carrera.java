package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Carrera {
    
    private String cod_car;
    private String duracion_car;
    private String descripcion;

    public Carrera() {
        super();
    }

    public Carrera(String cod_car, String duracion_car, String descripcion) {
        this.cod_car = cod_car;
        this.duracion_car = duracion_car;
        this.descripcion = descripcion;
    }

    /**
     * @return the cod_car
     */
    public String getCod_car() {
        return cod_car;
    }

    /**
     * @param cod_car the cod_car to set
     */
    public void setCod_car(String cod_car) {
        this.cod_car = cod_car;
    }

    /**
     * @return the duracion_car
     */
    public String getDuracion_car() {
        return duracion_car;
    }

    /**
     * @param duracion_car the duracion_car to set
     */
    public void setDuracion_car(String duracion_car) {
        this.duracion_car = duracion_car;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
