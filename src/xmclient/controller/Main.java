/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

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
    
        try {
            
            //Testing -----------------------------------------------
            List<Double> arrayLecturas = new ArrayList<>();
            Double lecturasEjemplo = 0.0;
            for (int i = 0; i < 24; i++) {
                lecturasEjemplo++;
                arrayLecturas.add(lecturasEjemplo);
            }            
            DTOLecturas lecturas = new DTOLecturas(arrayLecturas, new Date(), "12345", Boolean.FALSE);
            //Testing -----------------------------------------------
            
            
            //Replace this list with the array of data to send  ***********
            ArrayList<DTOLecturas>  listaLecturas = new ArrayList();
            listaLecturas.add(lecturas);
            //**************************************************************
            
            //This is the way how service must be called ------------------>
            XMClientController xMClientController = new XMClientController();   
                      
            System.out.println("Starting..");
            String processId;

            //Objects to inject
            IServiceConsumer serviceConsumer = new ServiceConsumer();
            IPreferencesManager preferencesManager = new PreferencesManager();

            //Report readings
            ProcessRequestResult respuesta = xMClientController.reportReadings(serviceConsumer, listaLecturas, preferencesManager);

            //In order to get report status
            ReportReadingProcessResult readingProcessResult = xMClientController.getProcessStatus(serviceConsumer, preferencesManager, respuesta.getProcessId());

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
