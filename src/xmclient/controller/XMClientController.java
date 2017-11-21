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
     * Método para el envio de lecturas al servicio de XM
     * @param listaLecturas
     * @return Retorna un objeto del tipo ProcessRequestResult con toda la información de la operación realizada
     * @throws Exception 
     */
    public ProcessRequestResult enviarLecturas(ArrayList<DTOLecturas> listaLecturas) throws Exception {

        System.out.println("Starting..");
        
        String processId;
        
        //Objects to inject
        IServiceConsumer serviceConsumer = new ServiceConsumer();
        IPreferencesManager preferencesManager = new PreferencesManager();

        ProcessRequestResult respuesta = reportReadings(serviceConsumer, listaLecturas, preferencesManager);
        boolean resultadoOperacion = procesarRespuesta(respuesta);

        if (resultadoOperacion) {
            System.out.println("Succes Operation");
            processId = respuesta.getProcessId();
            System.out.println("Process ID:" + processId);
           
        } else {
            System.out.println("Error");
            System.out.println("Operation result message: " + respuesta.getErrorMessage().getValue());
        }
        
        System.out.println("Finished");
        return respuesta;
    }
    
    private ProcessRequestResult reportReadings(IServiceConsumer serviceConsumer, ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws Exception {
        ProcessRequestResult result = serviceConsumer.reportReadings(lecturas, preferences);
        return result;
    }

    /**
     * Devuelve un booleano basado en al respuesta del envìo de lecturas, indicando si la operación fue exitosa o no.
     * @param resultadoOperacion
     * @return isProcessAccepted
     */
    public boolean procesarRespuesta(ProcessRequestResult resultadoOperacion) {
        return resultadoOperacion.isProcessAccepted();
    }
    
    /**
     * Método para conocer el estado del proceso, asi como el estado del envio de datos por cada una de las fronteras
     * @param serviceConsumer
     * @param processId
     * @return
     * @throws Exception 
     */
    private static ReportReadingProcessResult getProcessStatus(IServiceConsumer serviceConsumer, IPreferencesManager preferences, String processId) throws Exception {
        ReportReadingProcessResult result = serviceConsumer.getProcessStatus(preferences, processId);
        return result;
    }

}
