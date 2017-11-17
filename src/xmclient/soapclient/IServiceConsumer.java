/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import xmclient.entities.DTOLecturas;
import xmclient.soapentities.ProcessRequestResult;

/**
 *
 * @author Gabriel Ortega
 */
public interface IServiceConsumer {
    ProcessRequestResult reportarLecturas(ArrayList<DTOLecturas> lecturas) throws Exception;
}
