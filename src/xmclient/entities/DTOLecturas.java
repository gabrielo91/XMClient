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
    public final int READING_COUNT = 24;
    public final int READING_INTERVAL = 60;
    private List<Double> lecturas;
    private Date fechaInicio; 
    private String codigoFrontera;
    private Boolean isBackupBoolean;
    
    public DTOLecturas(List<Double> lecturas, Date fechaInicio, String codigoFrontera, Boolean isBackupBoolean) {
        this.lecturas = lecturas;
        this.fechaInicio = fechaInicio;
        this.codigoFrontera = codigoFrontera;
        this.isBackupBoolean = isBackupBoolean;
    }

    public List<Double> getLecturas() throws Exception {
        if(lecturas != null && lecturas.size() == 24){
            return lecturas;
        }else{
            throw new Exception("Size of readings array must be 24 ");
        }
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

    public Boolean getIsBackupBoolean() {
        return isBackupBoolean;
    }

    public void setIsBackupBoolean(Boolean isBackupBoolean) {
        this.isBackupBoolean = isBackupBoolean;
    }
    
    
}
