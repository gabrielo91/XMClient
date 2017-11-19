/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.controller;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import xmclient.entities.DTOLecturas;

/**
 *
 * @author Gabriel Ortega
 */
public class Main {
    public static void main(String[] args) {
    
        try {
            //Replace this list with the array of data to send  ***********
            ArrayList<DTOLecturas>  listaLecturas = new ArrayList();
            //**************************************************************
 
            //This is the way how service must be called ------------------>
            XMClientController xMClientController = new XMClientController();
            xMClientController.enviarLecturas(listaLecturas);
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
