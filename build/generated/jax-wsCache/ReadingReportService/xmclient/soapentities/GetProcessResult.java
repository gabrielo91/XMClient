
package xmclient.soapentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="processId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
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
    "processId",
    "userData"
})
@XmlRootElement(name = "GetProcessResult", namespace = "http://tempuri.org/")
public class GetProcessResult {

    @XmlElement(namespace = "http://tempuri.org/")
    protected String processId;
    @XmlElementRef(name = "userData", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserData> userData;

    /**
     * Obtiene el valor de la propiedad processId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Define el valor de la propiedad processId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
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
