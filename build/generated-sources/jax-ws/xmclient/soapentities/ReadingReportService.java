
package xmclient.soapentities;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ReadingReportService", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/D:/DesarrolloXMCliente/GeneradorServicio/ReportReadings.wsdl")
public class ReadingReportService
    extends Service
{

    private final static URL READINGREPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException READINGREPORTSERVICE_EXCEPTION;
    private final static QName READINGREPORTSERVICE_QNAME = new QName("http://tempuri.org/", "ReadingReportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/DesarrolloXMCliente/GeneradorServicio/ReportReadings.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        READINGREPORTSERVICE_WSDL_LOCATION = url;
        READINGREPORTSERVICE_EXCEPTION = e;
    }

    public ReadingReportService() {
        super(__getWsdlLocation(), READINGREPORTSERVICE_QNAME);
    }

    public ReadingReportService(WebServiceFeature... features) {
        super(__getWsdlLocation(), READINGREPORTSERVICE_QNAME, features);
    }

    public ReadingReportService(URL wsdlLocation) {
        super(wsdlLocation, READINGREPORTSERVICE_QNAME);
    }

    public ReadingReportService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, READINGREPORTSERVICE_QNAME, features);
    }

    public ReadingReportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReadingReportService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IReadingReportService
     */
    @WebEndpoint(name = "BasicHttpsBinding_IReadingReportService")
    public IReadingReportService getBasicHttpsBindingIReadingReportService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_IReadingReportService"), IReadingReportService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IReadingReportService
     */
    @WebEndpoint(name = "BasicHttpsBinding_IReadingReportService")
    public IReadingReportService getBasicHttpsBindingIReadingReportService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpsBinding_IReadingReportService"), IReadingReportService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (READINGREPORTSERVICE_EXCEPTION!= null) {
            throw READINGREPORTSERVICE_EXCEPTION;
        }
        return READINGREPORTSERVICE_WSDL_LOCATION;
    }

}
