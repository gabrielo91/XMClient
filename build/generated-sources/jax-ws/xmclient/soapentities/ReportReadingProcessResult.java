
package xmclient.soapentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportReadingProcessResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportReadingProcessResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasValidationErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProcessDone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResultFlag" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ProcessResultFlag" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ArrayOfBorderResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportReadingProcessResult", propOrder = {
    "hasValidationErrors",
    "processDone",
    "resultFlag",
    "results"
})
public class ReportReadingProcessResult {

    @XmlElement(name = "HasValidationErrors")
    protected Boolean hasValidationErrors;
    @XmlElement(name = "ProcessDone")
    protected Boolean processDone;
    @XmlElement(name = "ResultFlag")
    protected ProcessResultFlag resultFlag;
    @XmlElementRef(name = "Results", namespace = "http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBorderResult> results;

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
     * Obtiene el valor de la propiedad processDone.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessDone() {
        return processDone;
    }

    /**
     * Define el valor de la propiedad processDone.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessDone(Boolean value) {
        this.processDone = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfBorderResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBorderResult> getResults() {
        return results;
    }

    /**
     * Define el valor de la propiedad results.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBorderResult }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfBorderResult> value) {
        this.results = value;
    }

}
