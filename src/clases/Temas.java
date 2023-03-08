package clases;

import java.io.File;

/**
 *
 * @author Zhunio Miguel
 */
public class Temas {
    private String cod_tem;
    private String  titulo_tem;
    private File contenido;
    private String cod_cur;

    public Temas() {
        
    }

    public Temas(String cod_tem, String titulo_tem, File contenido, String cod_cur) {
        this.cod_tem = cod_tem;
        this.titulo_tem = titulo_tem;
        this.contenido = contenido;
        this.cod_cur = cod_cur;
    }
 
    /**
     * @return the cod_tem
     */
    public String getCod_tem() {
        return cod_tem;
    }

    /**
     * @param cod_tem the cod_tem to set
     */
    public void setCod_tem(String cod_tem) {
        this.cod_tem = cod_tem;
    }

    /**
     * @return the titulo_tem
     */
    public String getTitulo_tem() {
        return titulo_tem;
    }

    /**
     * @param titulo_tem the titulo_tem to set
     */
    public void setTitulo_tem(String titulo_tem) {
        this.titulo_tem = titulo_tem;
    }

    /**
     * @return the contenido
     */
    public File getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(File contenido) {
        this.contenido = contenido;
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
