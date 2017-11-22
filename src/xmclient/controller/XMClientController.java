/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.util.ArrayList;
import xmclient.soapclient.IServiceConsumer;
import xmclient.soapclient.ServiceConsumer;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.preferencesmanager.PreferencesManager;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReportReadingProcessResult;

/**
 *
 * @author Gabriel Ortega
 */
public class XMClientController {

    /**
     * Método para realizar el envio de lecturas al servicio de XM
     * @param serviceConsumer
     * @param lecturas
     * @param preferences
     * @return ProcessRequestResult
     * @throws Exception 
     */
    public static ProcessRequestResult reportReadings(IServiceConsumer serviceConsumer, ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws Exception {
        ProcessRequestResult result = serviceConsumer.reportReadings(lecturas, preferences);
        return result;
    }
    
    /**
     * Método para conocer el estado del proceso, asi como el estado del envio de datos por cada una de las fronteras
     * @param serviceConsumer
     * @param processId
     * @return ReportReadingProcessResult
     * @throws Exception 
     */
    public static ReportReadingProcessResult getProcessStatus(IServiceConsumer serviceConsumer, IPreferencesManager preferences, String processId) throws Exception {
        ReportReadingProcessResult result = serviceConsumer.getProcessStatus(preferences, processId);
        return result;
    }

}
