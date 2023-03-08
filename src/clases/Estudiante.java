package clases;

import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class Estudiante extends Persona{
    private Date fechaInscripcion_est;
    private String nivel_est;

    public Estudiante() {
        super();
    }

    public Estudiante(Date fechaInscripcion_est, String nivel_est, String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        super(cedula_per, nombre_per, apellido_per, pais_per, correo_per, password_per);
        this.fechaInscripcion_est = fechaInscripcion_est;
        this.nivel_est = nivel_est;
    }
  
    /**
     * @return the fechaInscripcion_est
     */
    public Date getFechaInscripcion_est() {
        return fechaInscripcion_est;
    }

    /**
     * @param fechaInscripcion_est the fechaInscripcion_est to set
     */
    public void setFechaInscripcion_est(Date fechaInscripcion_est) {
        this.fechaInscripcion_est = fechaInscripcion_est;
    }

    /**
     * @return the nivel_est
     */
    public String getNivel_est() {
        return nivel_est;
    }

    /**
     * @param nivel_est the nivel_est to set
     */
    public void setNivel_est(String nivel_est) {
        this.nivel_est = nivel_est;
    }
}
