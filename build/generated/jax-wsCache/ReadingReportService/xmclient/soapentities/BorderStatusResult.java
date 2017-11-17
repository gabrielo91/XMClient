
package xmclient.soapentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BorderStatusResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BorderStatusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultFlag" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ProcessResultFlag" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ArrayOfBorderStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorderStatusResult", propOrder = {
    "message",
    "resultFlag",
    "results"
})
public class BorderStatusResult {

    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "ResultFlag")
    protected ProcessResultFlag resultFlag;
    @XmlElementRef(name = "Results", namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBorderStatus> results;

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad resultFlag.
     * 
     * @return
     *     possible object is
     *     {@link ProcessResultFlag }
     *     
     */
    public ProcessResultFlag getResultFlag() {
        return resultFlag;
    }

    /**
     * Define el valor de la propiedad resultFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessResultFlag }
     *     
     */
    public void setResultFlag(ProcessResultFlag value) {
        this.resultFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad results.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBorderStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBorderStatus> getResults() {
        return results;
    }

    /**
     * Define el valor de la propiedad results.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBorderStatus }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfBorderStatus> value) {
        this.results = value;
    }

}
