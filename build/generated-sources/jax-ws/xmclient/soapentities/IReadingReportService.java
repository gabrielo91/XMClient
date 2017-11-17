
package xmclient.soapentities;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IReadingReportService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IReadingReportService {


    /**
     * 
     * @param readings
     * @param userData
     * @return
     *     returns xmclient.soapentities.ProcessRequestResult
     */
    @WebMethod(operationName = "ReportReadings", action = "http://tempuri.org/IReadingReportService/ReportReadings")
    @WebResult(name = "ReportReadingsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReportReadings", targetNamespace = "http://tempuri.org/", className = "xmclient.soapentities.ReportReadings")
    @ResponseWrapper(localName = "ReportReadingsResponse", targetNamespace = "http://tempuri.org/", className = "xmclient.soapentities.ReportReadingsResponse")
    public ProcessRequestResult reportReadings(
        @WebParam(name = "readings", targetNamespace = "http://tempuri.org/")
        ArrayOfReadingReportItem readings,
        @WebParam(name = "userData", targetNamespace = "http://tempuri.org/")
        UserData userData);

    /**
     * 
     * @param userData
     * @param processId
     * @return
     *     returns xmclient.soapentities.ReportReadingProcessResult
     */
    @WebMethod(operationName = "GetProcessResult", action = "http://tempuri.org/IReadingReportService/GetProcessResult")
    @WebResult(name = "GetProcessResultResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProcessResult", targetNamespace = "http://tempuri.org/", className = "xmclient.soapentities.GetProcessResult")
    @ResponseWrapper(localName = "GetProcessResultResponse", targetNamespace = "http://tempuri.org/", className = "xmclient.soapentities.GetProcessResultResponse")
    public ReportReadingProcessResult getProcessResult(
        @WebParam(name = "processId", targetNamespace = "http://tempuri.org/")
        String processId,
        @WebParam(name = "userData", targetNamespace = "http://tempuri.org/")
        UserData userData);

    /**
     * 
     * @param userData
     * @return
     *     returns xmclient.soapentities.BorderStatusResult
     */
    @WebMethod(operationName = "GetBorderStatus", action = "http://tempuri.org/IReadingReportService/GetBorderStatus")
    @WebResult(name = "GetBorderStatusResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBorderStatus", targetNamespace = "http://tempuri.org/", className = "xmclient.soapentities.GetBorderStatus")
    @ResponseWrapper(localName = "GetBorderStatusResponse", targetNamespace = "http://tempuri.org/", className = "xmclient.soapentities.GetBorderStatusResponse")
    public BorderStatusResult getBorderStatus(
        @WebParam(name = "userData", targetNamespace = "http://tempuri.org/")
        UserData userData);

}
