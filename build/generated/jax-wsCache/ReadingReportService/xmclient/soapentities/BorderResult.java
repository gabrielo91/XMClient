
package xmclient.soapentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BorderResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BorderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasValidationErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResultFlag" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ProcessResultFlag" minOccurs="0"/>
 *         &lt;element name="ValidationErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorderResult", propOrder = {
    "code",
    "errorMessage",
    "hasValidationErrors",
    "resultFlag",
    "validationErrorMessage"
})
public class BorderResult {

    @XmlElementRef(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "HasValidationErrors")
    protected Boolean hasValidationErrors;
    @XmlElement(name = "ResultFlag")
    protected ProcessResultFlag resultFlag;
    @XmlElementRef(name = "ValidationErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationErrorMessage;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode(JAXBElement<String> value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad hasValidationErrors.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasValidationErrors() {
        return hasValidationErrors;
    }

    /**
     * Define el valor de la propiedad hasValidationErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasValidationErrors(Boolean value) {
        this.hasValidationErrors = value;
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
     * Obtiene el valor de la propiedad validationErrorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationErrorMessage() {
        return validationErrorMessage;
    }

    /**
     * Define el valor de la propiedad validationErrorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationErrorMessage(JAXBElement<String> value) {
        this.validationErrorMessage = value;
    }

}
