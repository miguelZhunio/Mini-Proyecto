package clases;

import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class Trabajador extends Persona{
    private String titulo_tra;
    private String fechaCobro_tra;
    private String sueldo_tra;

    public Trabajador() {
        super();
    }

    public Trabajador(String titulo_tra, String fechaCobro_tra, String sueldo_tra, String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        super(cedula_per, nombre_per, apellido_per, pais_per, correo_per, password_per);
        this.titulo_tra = titulo_tra;
        this.fechaCobro_tra = fechaCobro_tra;
        this.sueldo_tra = sueldo_tra;
    }
  
    /**
     * @return the titulo_tra
     */
    public String getTitulo_tra() {
        return titulo_tra;
    }

    /**
     * @param titulo_tra the titulo_tra to set
     */
    public void setTitulo_tra(String titulo_tra) {
        this.titulo_tra = titulo_tra;
    }

    /**
     * @return the fechaCobro_tra
     */
    public String getFechaCobro_tra() {
        return fechaCobro_tra;
    }

    /**
     * @param fechaCobro_tra the fechaCobro_tra to set
     */
    public void setFechaCobro_tra(String fechaCobro_tra) {
        this.fechaCobro_tra = fechaCobro_tra;
    }

    /**
     * @return the sueldo_tra
     */
    public String getSueldo_tra() {
        return sueldo_tra;
    }

    /**
     * @param sueldo_tra the sueldo_tra to set
     */
    public void setSueldo_tra(String sueldo_tra) {
        this.sueldo_tra = sueldo_tra;
    }
    
}
