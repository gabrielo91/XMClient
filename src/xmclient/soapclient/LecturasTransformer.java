/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.soapclient;

import java.util.GregorianCalendar;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import xmclient.entities.DTOLecturas;
import xmclient.soapentities.ArrayOfdouble;
import xmclient.soapentities.ObjectFactory;
import xmclient.soapentities.ReadingReportItem;

/**
 *
 * @author Gabriel Ortega
 */
public class LecturasTransformer {
    public static ReadingReportItem crearPaqueteLecturas(DTOLecturas paqueteLecturas) throws DatatypeConfigurationException {
        ReadingReportItem lecturas0PorFrontera = new ReadingReportItem();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> borderCode = factory.createReadingReportItemBorderCode(paqueteLecturas.getCodigoFrontera());
        
        GregorianCalendar xmlFechaInicio = new GregorianCalendar();
        xmlFechaInicio.setTime(paqueteLecturas.getFechaInicio());
        XMLGregorianCalendar startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(xmlFechaInicio);
        
        ArrayOfdouble arrayLecturas = new ArrayOfdouble();
        arrayLecturas.setDouble(paqueteLecturas.getLecturas());
                
        JAXBElement<ArrayOfdouble> readings = factory.createArrayOfdouble(arrayLecturas);
        lecturas0PorFrontera.setBorderCode(borderCode);
        lecturas0PorFrontera.setReadingCount(Integer.MIN_VALUE);
        lecturas0PorFrontera.setStartDate(startDate);
        lecturas0PorFrontera.setReadings(readings);
       
        //leer constantes y valores de archivoxml
        return lecturas0PorFrontera;
    }
}

