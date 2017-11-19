/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import xmclient.soapclient.IServiceConsumer;
import xmclient.soapclient.ServiceConsumer;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.preferencesmanager.PreferencesManager;
import xmclient.soapentities.ProcessRequestResult;

/**
 *
 * @author Gabriel Ortega
 */
public class XMClientController {

    /**
     * Método para el envio de lecturas al servicio de XM
     * @throws Exception
     */
    public ProcessRequestResult enviarLecturas(ArrayList<DTOLecturas> listaLecturas) throws Exception {

        System.out.println("Starting..");
        
        //Objects to inject
        IServiceConsumer serviceConsumer = new ServiceConsumer();
        IPreferencesManager preferencesManager = new PreferencesManager();

        ProcessRequestResult respuesta = enviarLecturas(serviceConsumer, listaLecturas, preferencesManager);
        boolean resultadoOperacion = procesarRespuesta(respuesta);

        if (resultadoOperacion) {
            System.out.println("Succes Operation");
        } else {
            System.out.println("Error");
            System.out.println("Operation result message: " + respuesta.getErrorMessage().getValue());
        }
        
        System.out.println("Finished");
        return respuesta;
    }

    private ProcessRequestResult enviarLecturas(IServiceConsumer sender, ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws Exception {
        ProcessRequestResult result = sender.reportarLecturas(lecturas, preferences);
        return result;
    }

    /**
     * Devuelve un booleano basado en al respuesta del envìo de lecturas, indicando si la operación fue exitosa o no.
     * @param resultadoOperacion
     * @return 
     */
    public boolean procesarRespuesta(ProcessRequestResult resultadoOperacion) {
        return resultadoOperacion.isProcessAccepted();
    }

}
