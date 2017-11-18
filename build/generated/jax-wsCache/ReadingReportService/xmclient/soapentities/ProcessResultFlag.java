
package xmclient.soapentities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcessResultFlag.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessResultFlag">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessResultFlag")
@XmlEnum
public enum ProcessResultFlag {

    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ProcessResultFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessResultFlag fromValue(String v) {
        for (ProcessResultFlag c: ProcessResultFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
