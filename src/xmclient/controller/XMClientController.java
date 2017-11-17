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
import xmclient.soapentities.ProcessRequestResult;

/**
 *
 * @author Gabriel Ortega
 */
public class XMClientController {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {

        System.out.println("Starting");

        //Replace this list with the array of data to send
        DTOLecturas listaLecturas = new DTOLecturas();
        
        //Objects to inject
        IServiceConsumer serviceConsumer = new ServiceConsumer();
      
        try {

            ProcessRequestResult respuesta = enviarLecturas(serviceConsumer, listaLecturas);
            boolean resultadoOperacion = procesarRespuesta(respuesta);

            System.out.println("Operation result message: " + respuesta.getErrorMessage());
            System.out.println("Finishing");
        } catch (Exception ex) {
            Logger.getLogger(XMClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public ProcessRequestResult enviarLecturas(IServiceConsumer sender, DTOLecturas lecturas) throws Exception {
        ProcessRequestResult result = sender.reportarLecturas(lecturas);
        return result;
    }

    public boolean procesarRespuesta(ProcessRequestResult resultadoOperacion) {
        return resultadoOperacion.isProcessAccepted();
    }

}
