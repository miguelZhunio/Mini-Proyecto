package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Persona {
    private String cedula_per;
    private String nombre_per;
    private String apellido_per;
    private String pais_per;
    private String correo_per;
    private String password_per;

    public Persona() {
        
    }

    public Persona(String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        this.cedula_per = cedula_per;
        this.nombre_per = nombre_per;
        this.apellido_per = apellido_per;
        this.pais_per = pais_per;
        this.correo_per = correo_per;
        this.password_per = password_per;
    }
    
    /**
     * @return the cedula_per
     */
    public String getCedula_per() {
        return cedula_per;
    }

    /**
     * @param cedula_per the cedula_per to set
     */
    public void setCedula_per(String cedula_per) {
        this.cedula_per = cedula_per;
    }

    /**
     * @return the nombre_per
     */
    public String getNombre_per() {
        return nombre_per;
    }

    /**
     * @param nombre_per the nombre_per to set
     */
    public void setNombre_per(String nombre_per) {
        this.nombre_per = nombre_per;
    }

    /**
     * @return the apellido_per
     */
    public String getApellido_per() {
        return apellido_per;
    }

    /**
     * @param apellido_per the apellido_per to set
     */
    public void setApellido_per(String apellido_per) {
        this.apellido_per = apellido_per;
    }

    /**
     * @return the pais_per
     */
    public String getPais_per() {
        return pais_per;
    }

    /**
     * @param pais_per the pais_per to set
     */
    public void setPais_per(String pais_per) {
        this.pais_per = pais_per;
    }

    /**
     * @return the correo_per
     */
    public String getCorreo_per() {
        return correo_per;
    }

    /**
     * @param correo_per the correo_per to set
     */
    public void setCorreo_per(String correo_per) {
        this.correo_per = correo_per;
    }

    /**
     * @return the password_per
     */
    public String getPassword_per() {
        return password_per;
    }

    /**
     * @param password_per the password_per to set
     */
    public void setPassword_per(String password_per) {
        this.password_per = password_per;
    }
    
    
}
