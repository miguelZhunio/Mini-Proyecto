package clases;

import com.db4o.ObjectContainer;



/**
 *
 * @author Zhunio Miguel
 */
public class Gerente extends Trabajador{
    private String tipo_ger;

    public Gerente() {
    }

    public Gerente(String tipo_ger, String titulo_tra, String fechaCobro_tra, String sueldo_tra, String cedula_per, String nombre_per, String apellido_per, String pais_per, String correo_per, String password_per) {
        super(titulo_tra, fechaCobro_tra, sueldo_tra, cedula_per, nombre_per, apellido_per, pais_per, correo_per, password_per);
        this.tipo_ger = tipo_ger;
    }

    public Gerente(String titulo_ger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Gerente(String NivelAux, Object object, String NombreAux, String ApellidoAux, String PaisAux, String CorreoAux, String ContraseñaAux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the tipo_ger
     */
    public String getTipo_ger() {
        return tipo_ger;
    }

    /**
     * @param tipo_ger the tipo_ger to set
     */
    public void setTipo_ger(String tipo_ger) {
        this.tipo_ger = tipo_ger;
    }

    public int Comprobar_Gerente(ObjectContainer basep, String txtCedulaCo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
