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

        System.out.println("Starting");

        try {
            PreferencesManager pref = new PreferencesManager();
        } catch (IOException ex) {
            Logger.getLogger(XMClientController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(XMClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Replace this list with the array of data to send
        ArrayList<DTOLecturas>  listaLecturas = new ArrayList();
        
        //Objects to inject
        IServiceConsumer serviceConsumer = new ServiceConsumer();
      
        try {

            //ProcessRequestResult respuesta = enviarLecturas(serviceConsumer, listaLecturas);
            //boolean resultadoOperacion = procesarRespuesta(respuesta);

            //System.out.println("Operation result message: " + respuesta.getErrorMessage());
            //System.out.println("Finishing");
        } catch (Exception ex) {
            Logger.getLogger(XMClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public ProcessRequestResult enviarLecturas(IServiceConsumer sender, ArrayList<DTOLecturas> lecturas) throws Exception {
        ProcessRequestResult result = sender.reportarLecturas(lecturas);
        return result;
    }

    public boolean procesarRespuesta(ProcessRequestResult resultadoOperacion) {
        return resultadoOperacion.isProcessAccepted();
    }

}
