package clases;

import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class Profesor extends Trabajador{
    private String especialidad_pro;
    private String id_ger;

    public Profesor() {
        super();
    }

    public Profesor(String especialidad_pro, String id_ger, String titulo_tra, Date fechaCobro_tra, double sueldo_tra, String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        super(titulo_tra, fechaCobro_tra, sueldo_tra, cedula_per, nombre_per, apellido_per, pais_per, correo_per, password_per);
        this.especialidad_pro = especialidad_pro;
        this.id_ger = id_ger;
    }

    /**
     * @return the especialidad_pro
     */
    public String getEspecialidad_pro() {
        return especialidad_pro;
    }

    /**
     * @param especialidad_pro the especialidad_pro to set
     */
    public void setEspecialidad_pro(String especialidad_pro) {
        this.especialidad_pro = especialidad_pro;
    }

    /**
     * @return the id_ger
     */
    public String getId_ger() {
        return id_ger;
    }

    /**
     * @param id_ger the id_ger to set
     */
    public void setId_ger(String id_ger) {
        this.id_ger = id_ger;
    }
    
    
}
