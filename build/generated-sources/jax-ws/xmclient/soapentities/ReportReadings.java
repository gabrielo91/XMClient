
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
 *         &lt;element name="readings" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ArrayOfReadingReportItem" minOccurs="0"/>
 *         &lt;element name="userData" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}UserData" minOccurs="0"/>
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
    "readings",
    "userData"
})
@XmlRootElement(name = "ReportReadings", namespace = "http://tempuri.org/")
public class ReportReadings {

    @XmlElementRef(name = "readings", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReadingReportItem> readings;
    @XmlElementRef(name = "userData", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserData> userData;

    /**
     * Obtiene el valor de la propiedad readings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReadingReportItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReadingReportItem> getReadings() {
        return readings;
    }

    /**
     * Define el valor de la propiedad readings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReadingReportItem }{@code >}
     *     
     */
    public void setReadings(JAXBElement<ArrayOfReadingReportItem> value) {
        this.readings = value;
    }

    /**
     * Obtiene el valor de la propiedad userData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserData }{@code >}
     *     
     */
    public JAXBElement<UserData> getUserData() {
        return userData;
    }

    /**
     * Define el valor de la propiedad userData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserData }{@code >}
     *     
     */
    public void setUserData(JAXBElement<UserData> value) {
        this.userData = value;
    }

}
