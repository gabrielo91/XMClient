/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReportReadingProcessResult;

/**
 *
 * @author Gabriel Ortega
 */
public interface IServiceConsumer {
    /**
     * Permite enviar el reporte de lecturas al servicio soap establecido en las preferencias
     * @param lecturas
     * @param preferences: preferencias con los datos requeridos para consumir el servicio
     * @return
     * @throws Exception 
     */
    ProcessRequestResult reportReadings(ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws Exception;
    
    /**
     * Retorna un objeto con la informaciòn del estado de envio por cada una de las fronteras asi como tambien
     * el estado del proceso en su totalidad.
     * @param preferences
     * @param processId
     * @return
     * @throws Exception 
     */
    ReportReadingProcessResult getProcessStatus (IPreferencesManager preferences, String processId)throws Exception;
}
