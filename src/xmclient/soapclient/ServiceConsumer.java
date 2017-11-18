/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.soapentities.ArrayOfReadingReportItem;
import xmclient.soapentities.IReadingReportService;
import xmclient.soapentities.ObjectFactory;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReadingReportItem;
import xmclient.soapentities.ReadingReportService;
import xmclient.soapentities.UserData;

/**
 *
 * @author Gabriel Ortega
 */
public class ServiceConsumer implements IServiceConsumer{

    /**
     * Procesa las lecturas, las empaqueta y las envia al servicio de reporte de lecturas de XM
     * @param lecturas
     * @param preferences
     * @return
     * @throws DatatypeConfigurationException 
     */
    @Override
    public ProcessRequestResult reportarLecturas(ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws DatatypeConfigurationException, Exception {
        
        UserData userData = getUserCredentials(preferences);
        ArrayOfReadingReportItem lecturasSoap = new ArrayOfReadingReportItem();  
        ArrayList <ReadingReportItem> paqueteLecturas = new ArrayList<>();
        ReadingReportItem lecturasPorFrontera;
        
        for (DTOLecturas lecturasPorMedidor: lecturas){
            lecturasPorFrontera = LecturasTransformer.crearPaqueteLecturas(lecturasPorMedidor);
            paqueteLecturas.add(lecturasPorFrontera);
        }
           
        lecturasSoap.getReadingReportItem().addAll(paqueteLecturas);
        ProcessRequestResult processRequestResult = reportReadingsToService(lecturasSoap, userData);
        return processRequestResult;
    }    

    /**
     * Permite consumir el servicio reportReadings
     * @param readings
     * @param userData
     * @return 
     */
    private static ProcessRequestResult reportReadingsToService(ArrayOfReadingReportItem readings, UserData userData) {
        ReadingReportService service = new ReadingReportService();
        IReadingReportService port = service.getBasicHttpsBindingIReadingReportService();
        ProcessRequestResult result = port.reportReadings(readings, userData);
        return result;
    }
    
    /**
     * Permite fijar las cabeceras de autenticación y demas parámetros de configuración para el consumodel servcio.
     * @param preferences
     * @return 
     */
    private UserData getUserCredentials(IPreferencesManager preferences) throws Exception {
        UserData userData = new UserData();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> userPassword = factory.createUserDataPassword(preferences.getPasword());
        JAXBElement<String> username = factory.createUserDataPassword(preferences.getUsername());                
        userData.setPassword(userPassword);
        userData.setUserName(username);
        return userData;
    }
}
