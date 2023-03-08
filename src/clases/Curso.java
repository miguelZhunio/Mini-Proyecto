package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Curso {
    private String cod_cur;
    private String nombre_cur;
    private String duracion;
    private double precio;
    private String silabo;
    private String deescripcion;
    private String id_pro;
    private String cod_car;

    public Curso() {
        
    }
    public Curso(String cod_cur, String nombre_cur, String duracion, double precio, String silabo, String deescripcion, String id_pro, String cod_car) {
        this.cod_cur = cod_cur;
        this.nombre_cur = nombre_cur;
        this.duracion = duracion;
        this.precio = precio;
        this.silabo = silabo;
        this.deescripcion = deescripcion;
        this.id_pro = id_pro;
        this.cod_car = cod_car;
    }

    
    /**
     * @return the cod_cur
     */
    public String getCod_cur() {
        return cod_cur;
    }

    /**
     * @param cod_cur the cod_cur to set
     */
    public void setCod_cur(String cod_cur) {
        this.cod_cur = cod_cur;
    }

    /**
     * @return the nombre_cur
     */
    public String getNombre_cur() {
        return nombre_cur;
    }

    /**
     * @param nombre_cur the nombre_cur to set
     */
    public void setNombre_cur(String nombre_cur) {
        this.nombre_cur = nombre_cur;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the silabo
     */
    public String getSilabo() {
        return silabo;
    }

    /**
     * @param silabo the silabo to set
     */
    public void setSilabo(String silabo) {
        this.silabo = silabo;
    }

    /**
     * @return the deescripcion
     */
    public String getDeescripcion() {
        return deescripcion;
    }

    /**
     * @param deescripcion the deescripcion to set
     */
    public void setDeescripcion(String deescripcion) {
        this.deescripcion = deescripcion;
    }

    /**
     * @return the id_pro
     */
    public String getId_pro() {
        return id_pro;
    }

    /**
     * @param id_pro the id_pro to set
     */
    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
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
    

    
}
