/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            
            System.out.println("Starting..");
            XMClientController xMClientController = new XMClientController();
            xMClientController.enviarLecturas();            
            System.out.println("Finishing");
            
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(XMClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método para el envio de lecturas al servicio de XM
     * @throws Exception 
     */
    public void enviarLecturas() throws Exception{
       
            //Replace this list with the array of data to send  ***********
            ArrayList<DTOLecturas>  listaLecturas = new ArrayList();
            //**************************************************************
            
            //Objects to inject
            IServiceConsumer serviceConsumer = new ServiceConsumer();
            IPreferencesManager preferencesManager = new PreferencesManager();

            ProcessRequestResult respuesta = enviarLecturas(serviceConsumer, listaLecturas, preferencesManager);
            boolean resultadoOperacion = procesarRespuesta(respuesta);
            
            if(resultadoOperacion){
                System.out.println("Succes Operation");
            } else {
                System.out.println("Operation result message: " + respuesta.getErrorMessage());     
            }                     
    }
    
    
    public ProcessRequestResult enviarLecturas(IServiceConsumer sender, ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws Exception {
        ProcessRequestResult result = sender.reportarLecturas(lecturas, preferences);
        return result;
    }

    public boolean procesarRespuesta(ProcessRequestResult resultadoOperacion) {
        return resultadoOperacion.isProcessAccepted();
    }

}
