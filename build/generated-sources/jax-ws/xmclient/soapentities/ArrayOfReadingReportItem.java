
package xmclient.soapentities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfReadingReportItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReadingReportItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadingReportItem" type="{http://schemas.datacontract.org/2004/07/Primestone.PrimeRead.ReadingReportServiceLibrary.DTOs}ReadingReportItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReadingReportItem", propOrder = {
    "readingReportItem"
})
public class ArrayOfReadingReportItem {

    @XmlElement(name = "ReadingReportItem", nillable = true)
    private List<ReadingReportItem> readingReportItem;

    /**
     * Gets the value of the readingReportItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingReportItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingReportItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingReportItem }
     * 
     * 
     */
    public List<ReadingReportItem> getReadingReportItem() {
        if (readingReportItem == null) {
            readingReportItem = new ArrayList<ReadingReportItem>();
        }
        return this.readingReportItem;
    }

    public void setReadingReportItem(List<ReadingReportItem> readingReportItem) {
        this.readingReportItem = readingReportItem;
    }

}
