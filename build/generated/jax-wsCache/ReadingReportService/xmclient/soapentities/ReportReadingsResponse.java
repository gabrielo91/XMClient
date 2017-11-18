
package xmclient.soapentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportReadingsResult" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ProcessRequestResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportReadingsResult"
})
@XmlRootElement(name = "ReportReadingsResponse", namespace = "http://tempuri.org/")
public class ReportReadingsResponse {

    @XmlElementRef(name = "ReportReadingsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessRequestResult> reportReadingsResult;

    /**
     * Obtiene el valor de la propiedad reportReadingsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessRequestResult }{@code >}
     *     
     */
    public JAXBElement<ProcessRequestResult> getReportReadingsResult() {
        return reportReadingsResult;
    }

    /**
     * Define el valor de la propiedad reportReadingsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessRequestResult }{@code >}
     *     
     */
    public void setReportReadingsResult(JAXBElement<ProcessRequestResult> value) {
        this.reportReadingsResult = value;
    }

}
