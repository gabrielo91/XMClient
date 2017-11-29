/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.util.ArrayList;
import xmclient.soapclient.IServiceConsumer;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReportReadingProcessResult;

/**
 *
 * @author Gabriel Ortega
 */
public class XMClientController {

    private IServiceConsumer serviceConsumer;    
    private IPreferencesManager preferences;

    public XMClientController(IServiceConsumer serviceConsumer, IPreferencesManager preferencesManager) {
        this.serviceConsumer = serviceConsumer;
        this.preferences = preferencesManager;
    }
       
    
    /**
     * Método para realizar el envio de lecturas al servicio de XM
     * @param lecturas
     * @return ProcessRequestResult
     * @throws Exception 
     */
    public ProcessRequestResult reportReadings(ArrayList<DTOLecturas> lecturas) throws Exception {
        ProcessRequestResult result = serviceConsumer.reportReadings(lecturas, preferences);
        return result;
    }
    
    /**
     * Método para conocer el estado del proceso, asi como el estado del envio de datos por cada una de las fronteras
     * @param processId
     * @return ReportReadingProcessResult
     * @throws Exception 
     */
    public ReportReadingProcessResult getProcessStatus(String processId) throws Exception {
        ReportReadingProcessResult result = serviceConsumer.getProcessStatus(preferences, processId);
        return result;
    }

}
