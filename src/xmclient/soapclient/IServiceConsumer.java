/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import xmclient.entities.SOAPServicesLecturasEntity;

/**
 *
 * @author Gabriel Ortega
 */
public interface IServiceConsumer {
    String reportReadings(ArrayList<SOAPServicesLecturasEntity> lecturas) throws Exception;
}
