
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
 *         &lt;element name="GetBorderStatusResult" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}BorderStatusResult" minOccurs="0"/>
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
    "getBorderStatusResult"
})
@XmlRootElement(name = "GetBorderStatusResponse", namespace = "http://tempuri.org/")
public class GetBorderStatusResponse {

    @XmlElementRef(name = "GetBorderStatusResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BorderStatusResult> getBorderStatusResult;

    /**
     * Obtiene el valor de la propiedad getBorderStatusResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorderStatusResult }{@code >}
     *     
     */
    public JAXBElement<BorderStatusResult> getGetBorderStatusResult() {
        return getBorderStatusResult;
    }

    /**
     * Define el valor de la propiedad getBorderStatusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorderStatusResult }{@code >}
     *     
     */
    public void setGetBorderStatusResult(JAXBElement<BorderStatusResult> value) {
        this.getBorderStatusResult = value;
    }

}
