/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import xmclient.soapclient.IServiceConsumer;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.soapentities.ArrayOfBorderResult;
import xmclient.soapentities.BorderResult;
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
    
    /**
     * Permite imprimir el resultado del envio de lecturas por cada una de las fronteras
     * @param result 
     */
    public void printProcessResult(ReportReadingProcessResult result){
        if(result != null){
            JAXBElement<ArrayOfBorderResult> arrayOfBorderResult = result.getResults();
            String resultado = "";
            System.out.println("1");
            if(arrayOfBorderResult != null){
                System.out.println("2");
                for (BorderResult frontera : arrayOfBorderResult.getValue().getBorderResult()) {
                    System.out.println("3");
                    resultado = resultado.format("IdFrotenra: %s Resultado: %s ErrorMessage: %s", frontera.getCode().getValue(), frontera.getResultFlag(), frontera.getErrorMessage().getValue()); 
                    System.out.println(resultado);
                };

            }
        }
        
    }

}
