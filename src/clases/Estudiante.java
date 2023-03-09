package clases;

import com.db4o.ObjectContainer;
import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class Estudiante extends Persona{
    private String fechaInscripcion_est;
    private String nivel_est;

    public Estudiante(String fechaInscripcion_est, String nivel_est, String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        super(cedula_per, nombre_per, apellido_per, pais_per, correo_per, password_per);
        this.fechaInscripcion_est = fechaInscripcion_est;
        this.nivel_est = nivel_est;
    }

    public Estudiante() {
    }

    public String getFechaInscripcion_est() {
        return fechaInscripcion_est;
    }

    public void setFechaInscripcion_est(String fechaInscripcion_est) {
        this.fechaInscripcion_est = fechaInscripcion_est;
    }

    public String getNivel_est() {
        return nivel_est;
    }

    public void setNivel_est(String nivel_est) {
        this.nivel_est = nivel_est;
    }

    public int Comprobar_Estudiantes(ObjectContainer basep, String txtCedulaCo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    