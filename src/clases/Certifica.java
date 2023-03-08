package clases;

import java.util.Date;

/**
 *
 * @author Zhunio Miguel
 */
public class Certifica {
    private String cod_cer;
    private String cod_car;
    private String ced_est;
    private Date fecha_cer;
    private String mensaje;

    public Certifica() {
        super();
    }

    public Certifica(String cod_cer, String cod_car, String ced_est, Date fecha_cer, String mensaje) {
        this.cod_cer = cod_cer;
        this.cod_car = cod_car;
        this.ced_est = ced_est;
        this.fecha_cer = fecha_cer;
        this.mensaje = mensaje;
    }

    /**
     * @return the cod_cer
     */
    public String getCod_cer() {
        return cod_cer;
    }

    /**
     * @param cod_cer the cod_cer to set
     */
    public void setCod_cer(String cod_cer) {
        this.cod_cer = cod_cer;
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
     * @return the ced_est
     */
    public String getCed_est() {
        return ced_est;
    }

    /**
     * @param ced_est the ced_est to set
     */
    public void setCed_est(String ced_est) {
        this.ced_est = ced_est;
    }

    /**
     * @return the fecha_cer
     */
    public Date getFecha_cer() {
        return fecha_cer;
    }

    /**
     * @param fecha_cer the fecha_cer to set
     */
    public void setFecha_cer(Date fecha_cer) {
        this.fecha_cer = fecha_cer;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
