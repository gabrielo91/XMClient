/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import xmclient.entities.SOAPServicesLecturasEntity;
import xmclient.soapentities.ArrayOfReadingReportItem;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.UserData;

/**
 *
 * @author Gabriel Ortega
 */
public class ServiceConsumer implements IServiceConsumer{

    @Override
    public String reportReadings(ArrayList<SOAPServicesLecturasEntity> lecturas) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    private static ProcessRequestResult reportReadings_1(ArrayOfReadingReportItem readings, UserData userData) {
        xmclient.soapentities.ReadingReportService service = new xmclient.soapentities.ReadingReportService();
        xmclient.soapentities.IReadingReportService port = service.getBasicHttpsBindingIReadingReportService();
        return port.reportReadings(readings, userData);
    }
}
