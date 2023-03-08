package clases;

/**
 *
 * @author Zhunio Miguel
 */
public class DetalleFactura {
    private String cod_det;
    private int cantidad;
    private double total;
    private String cod_fac;
    private String cod_cur;

    public DetalleFactura() {
        
    }

    public DetalleFactura(String cod_det, int cantidad, double total, String cod_fac, String cod_cur) {
        this.cod_det = cod_det;
        this.cantidad = cantidad;
        this.total = total;
        this.cod_fac = cod_fac;
        this.cod_cur = cod_cur;
    }

    /**
     * @return the cod_det
     */
    public String getCod_det() {
        return cod_det;
    }

    /**
     * @param cod_det the cod_det to set
     */
    public void setCod_det(String cod_det) {
        this.cod_det = cod_det;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the cod_fac
     */
    public String getCod_fac() {
        return cod_fac;
    }

    /**
     * @param cod_fac the cod_fac to set
     */
    public void setCod_fac(String cod_fac) {
        this.cod_fac = cod_fac;
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
    
}
