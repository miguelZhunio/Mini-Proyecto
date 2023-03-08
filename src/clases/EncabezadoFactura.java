package clases;

import java.util.Date;

/**
 *
 * @author PC01
 */
public class EncabezadoFactura {
    private int cod_fac;
    private Date fecha;
    private int iva;
    private double precioFinal;
    private double descuento;
    private double subtotal;
    private String ced_est;

    public EncabezadoFactura() {
        
    }

    public EncabezadoFactura(int cod_fac, Date fecha, int iva, double precioFinal, double descuento, double subtotal, String ced_est) {
        this.cod_fac = cod_fac;
        this.fecha = fecha;
        this.iva = iva;
        this.precioFinal = precioFinal;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.ced_est = ced_est;
    }

    /**
     * @return the cod_fac
     */
    public int getCod_fac() {
        return cod_fac;
    }

    /**
     * @param cod_fac the cod_fac to set
     */
    public void setCod_fac(int cod_fac) {
        this.cod_fac = cod_fac;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the iva
     */
    public int getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(int iva) {
        this.iva = iva;
    }

    /**
     * @return the precioFinal
     */
    public double getPrecioFinal() {
        return precioFinal;
    }

    /**
     * @param precioFinal the precioFinal to set
     */
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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
    
    
}
