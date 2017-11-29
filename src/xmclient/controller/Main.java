/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.preferencesmanager.PreferencesManager;
import xmclient.soapclient.IServiceConsumer;
import xmclient.soapclient.ServiceConsumer;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReportReadingProcessResult;

/**
 *
 * @author Gabriel Ortega
 */
public class Main {
    public static void main(String[] args) {
    
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        
        
        try {
            
            //Testing -----------------------------------------------
            List<Double> arrayLecturas = new ArrayList<>();
            Double lecturasEjemplo = 0.0;
            for (int i = 0; i < 24; i++) {
                //lecturasEjemplo++;
                arrayLecturas.add(lecturasEjemplo);
            }            
            //DTOLecturas lecturas = new DTOLecturas(arrayLecturas, new Date(), "Frt22508", Boolean.FALSE);
            DTOLecturas lecturas = new DTOLecturas(arrayLecturas, new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-28"), "Frt22508", Boolean.FALSE);
            //Testing -----------------------------------------------
                        
            //Replace this list with the array of data to send  ***********
            ArrayList<DTOLecturas>  listaLecturas = new ArrayList();
            listaLecturas.add(lecturas);
            //**************************************************************
            
            //This is the way how service must be called ------------------>
            //Objects to inject
            IServiceConsumer serviceConsumer = new ServiceConsumer();
            IPreferencesManager preferences = new PreferencesManager();
            
            XMClientController xMClientController = new XMClientController(serviceConsumer, preferences);    
                      
            System.out.println("Starting..");
            String processId;

            
            
            
            //Report readings
            ProcessRequestResult respuesta = xMClientController.reportReadings(listaLecturas);

            //In order to get report status
            ReportReadingProcessResult readingProcessResult = xMClientController.getProcessStatus(respuesta.getProcessId());

            if (respuesta.isProcessAccepted()) {
                System.out.println("Succes Operation");
                processId = respuesta.getProcessId();
                System.out.println("Process ID:" + processId);

            } else {
                System.out.println("Error");
                System.out.println("Operation result message: " + respuesta.getErrorMessage().getValue());
            }

            System.out.println("Finished");
            // ------------------------------------------------------------->
  
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
