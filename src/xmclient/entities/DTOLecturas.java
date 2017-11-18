/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.entities;
import java.util.Date;
import java.util.List;

/**
 * Contendor de lecturas y parametros por fronetera (medidor)
 * @author Gabriel Ortega
 */
public class DTOLecturas {
    
    public final String FORMATO_FECHA = "yyyy-MM-dd HH:mm:ss";
    private List<Double> lecturas;
    private Date fechaInicio; 
    private String codigoFrontera; 

    public DTOLecturas(List<Double> lecturas, Date fechaInicio) {
        this.lecturas = lecturas;
        this.fechaInicio = fechaInicio;
    }

    public DTOLecturas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Double> getLecturas() {
        return lecturas;
    }

    public void setLecturas(List<Double> lecturas) {
        this.lecturas = lecturas;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCodigoFrontera() {
        return codigoFrontera;
    }

    public void setCodigoFrontera(String codigoFrontera) {
        this.codigoFrontera = codigoFrontera;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    
}
