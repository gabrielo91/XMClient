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
import xmclient.soapentities.ProcessRequestResult;

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
            ProcessRequestResult resultado = xMClientController.enviarLecturas(listaLecturas);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
