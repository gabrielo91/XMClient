/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.net.URL;
import java.util.ArrayList;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import xmclient.entities.DTOLecturas;
import xmclient.preferencesmanager.IPreferencesManager;
import xmclient.soapentities.ArrayOfReadingReportItem;
import xmclient.soapentities.IReadingReportService;
import xmclient.soapentities.ProcessRequestResult;
import xmclient.soapentities.ReadingReportItem;
import xmclient.soapentities.ReadingReportService;
import xmclient.soapentities.ReportReadingProcessResult;
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
    public ProcessRequestResult reportReadings(ArrayList<DTOLecturas> lecturas, IPreferencesManager preferences) throws DatatypeConfigurationException, Exception {
        
        ArrayOfReadingReportItem lecturasSoap = new ArrayOfReadingReportItem();  
        ArrayList <ReadingReportItem> paqueteLecturas = new ArrayList<>();
        ReadingReportItem lecturasPorFrontera;
        
        for (DTOLecturas lecturasPorMedidor: lecturas){
            lecturasPorFrontera = LecturasTransformer.crearPaqueteLecturas(lecturasPorMedidor);
            paqueteLecturas.add(lecturasPorFrontera);
        }
           
        lecturasSoap.getReadingReportItem().addAll(paqueteLecturas);
        ProcessRequestResult processRequestResult = reportReadingsToService(lecturasSoap, preferences);
        return processRequestResult;
    }    

    /**
     * Permite consumir el servicio reportReadings
     * @param readings
     * @param userData
     * @return ProcessRequestResult
     */
    private ProcessRequestResult reportReadingsToService(ArrayOfReadingReportItem readings, IPreferencesManager preferences) throws Exception {
        UserData userData = getUserCredentials(preferences);
        URL url = new URL(getEndPoint(preferences));
        QName qName = new QName("http://tempuri.org/", "ReadingReportService");
        Service service = Service.create(url, qName);
        IReadingReportService reportService = service.getPort(IReadingReportService.class);
        ProcessRequestResult result = reportService.reportReadings(readings, userData);
        return result;
    }
    
    /**
     * Permite retornar los datos de autenticación y demas parámetros de configuración para el consumodel servcio.
     * @param preferences
     * @return UserData
     */
    private UserData getUserCredentials(IPreferencesManager preferences) throws Exception {
        UserData userData = new UserData();             
        userData.setUserName(preferences.getUsername());
        userData.setPassword(preferences.getPasword());
        return userData;
    }
    
    /**
     * Retorna el endpoint del servicio a consumir
     * @param preferences
     * @return
     * @throws Exception 
     */
    private String getEndPoint(IPreferencesManager preferences)throws Exception {
        String endpoint = preferences.getServiceEndPoint();
        return endpoint;
    }
    
    /**
     * Permite conocer el estado del proceso de envio de lecturas
     * @param processId
     * @return
     * @throws Exception 
     */
    @Override
    public ReportReadingProcessResult getProcessStatus(IPreferencesManager preferences, String processId) throws Exception {
        ReadingReportService service = new ReadingReportService();
        IReadingReportService port = service.getBasicHttpsBindingIReadingReportService();
        UserData userData = getUserCredentials(preferences);
        ReportReadingProcessResult result = port.getProcessResult(processId, userData);
        return result;
    }
}