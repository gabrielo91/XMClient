/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.soapentities.ProcessRequestResult;

/**
 *
 * @author Gabriel Ortega
 */
public interface IServiceConsumer {
    /**
     * Permite enviar el reporte de lecturas al servicio soap establecido en las preferencias
     * @param lecturas
     * @param preferences: preferencias con los datos requeridos para consumir el servicio
     * @return
     * @throws Exception 
     */
    ProcessRequestResult reportarLecturas(ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws Exception;
}
