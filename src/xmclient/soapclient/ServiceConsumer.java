/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import javax.xml.datatype.DatatypeConfigurationException;
import xmclient.entities.DTOLecturas;
import xmclient.soapentities.ArrayOfReadingReportItem;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReadingReportItem;
import xmclient.soapentities.UserData;

/**
 *
 * @author Gabriel Ortega
 */
public class ServiceConsumer implements IServiceConsumer{

    @Override
    public ProcessRequestResult reportarLecturas(ArrayList<DTOLecturas> lecturas) throws DatatypeConfigurationException {
        
        UserData userData = getUserCredentials();
        ArrayOfReadingReportItem lecturasSoap = new ArrayOfReadingReportItem();  
        ArrayList <ReadingReportItem> paqueteLecturas = new ArrayList<>();
        ReadingReportItem lecturasPorFrontera;
        
        for (DTOLecturas lecturasPorMedidor: lecturas){
            lecturasPorFrontera = LecturasTransformer.crearPaqueteLecturas(lecturasPorMedidor);
            paqueteLecturas.add(lecturasPorFrontera);
        }
        
        lecturasSoap.setReadingReportItem(paqueteLecturas);
        ProcessRequestResult processRequestResult = reportReadingsToService(lecturasSoap, userData);
        return processRequestResult;
    }    

    private static ProcessRequestResult reportReadingsToService(ArrayOfReadingReportItem readings, UserData userData) {
        xmclient.soapentities.ReadingReportService service = new xmclient.soapentities.ReadingReportService();
        xmclient.soapentities.IReadingReportService port = service.getBasicHttpsBindingIReadingReportService();
        return port.reportReadings(readings, userData);
    }

    private UserData getUserCredentials() {
        //read from file
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
