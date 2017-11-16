/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import xmclient.managerlecturas.ILecturasTransformer;
import xmclient.managerlecturas.LecturasTransformer;
import xmclient.soapclient.IServiceConsumer;
import xmclient.soapclient.ServiceConsumer;
import xmclient.entities.DTOLecturas;
import xmclient.entities.SOAPServicesLecturasEntity;

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

        //Objects to inject
        ILecturasTransformer lecturasTransformer = new LecturasTransformer();
        IServiceConsumer serviceConsumer = new ServiceConsumer();

        try {

            //Replace this list with the array of data to send
            ArrayList<DTOLecturas> listaLecturas = new ArrayList();
            ArrayList<SOAPServicesLecturasEntity> listaLecturasSOAP = procesarLecturas(lecturasTransformer, listaLecturas);
            String respuesta = enviarLecturas(serviceConsumer, listaLecturasSOAP);
            int resultadoOperacion = procesarRespuesta(respuesta);

            System.out.println("Operation result code: " + resultadoOperacion);
            System.out.println("Finishing");
        } catch (Exception ex) {
            Logger.getLogger(XMClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<SOAPServicesLecturasEntity> procesarLecturas(ILecturasTransformer lecturasTransformer, ArrayList<DTOLecturas> listaLecturas) {
        ArrayList<SOAPServicesLecturasEntity> lecturasTransformadas = lecturasTransformer.convertirLecturas(listaLecturas);
        return lecturasTransformadas;
    }

    public String enviarLecturas(IServiceConsumer sender, ArrayList<SOAPServicesLecturasEntity> listaLecturasSOAP) throws Exception {
        String result = sender.reportReadings(listaLecturasSOAP);
        return result;
    }

    public Integer procesarRespuesta(String resultadoOperacion) {
        return null;
    }

}
