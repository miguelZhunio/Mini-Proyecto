package clases;

import com.db4o.ObjectContainer;
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

    public Profesor(String especialidad_pro, String id_ger, String titulo_tra, String fechaCobro_tra, String sueldo_tra, String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        super(titulo_tra, fechaCobro_tra, sueldo_tra, cedula_per, nombre_per, apellido_per, pais_per, correo_per, password_per);
        this.especialidad_pro = especialidad_pro;
        this.id_ger = id_ger;
    }

    public Profesor(String NivelAux, Object object, String NombreAux, String ApellidoAux, String PaisAux, String CorreoAux, String ContraseñaAux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Profesor(Object object, Object object0, Object object1, Object object2, String text, Object object3, Object object4, Object object5, Object object6, Object object7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int ConProfesor(ObjectContainer basep, String txtCedulaCo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
