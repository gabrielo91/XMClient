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
 * Clase de utilidad para la transformación de objetos del proyecto a objetos del propios del servicio SOAP
 * @author Gabriel Ortega
 */
public class LecturasTransformer {
        
    /**
     * Permite convertir las lecturas empaquetadas en los DTO, en entidades propias del servicio SOAP a consumir
     * @param paqueteLecturas
     * @return ReadingReportItem
     * @throws DatatypeConfigurationException 
     */
    public static ReadingReportItem crearPaqueteLecturas(DTOLecturas paqueteLecturas) throws DatatypeConfigurationException, Exception {
        
        ReadingReportItem lecturasPorFrontera = new ReadingReportItem();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<String> borderCode = factory.createReadingReportItemBorderCode(paqueteLecturas.getCodigoFrontera());
        
        GregorianCalendar xmlFechaInicio = new GregorianCalendar();
        xmlFechaInicio.setTime(paqueteLecturas.getFechaInicio());
        XMLGregorianCalendar startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(xmlFechaInicio);
        
        ArrayOfdouble arrayLecturas = new ArrayOfdouble();
        arrayLecturas.getDouble().addAll(paqueteLecturas.getLecturas());                
        JAXBElement<ArrayOfdouble> readings = factory.createArrayOfdouble(arrayLecturas);
        
        lecturasPorFrontera.setBorderCode(borderCode);
        lecturasPorFrontera.setStartDate(startDate);
        lecturasPorFrontera.setReadings(readings);
        lecturasPorFrontera.setIsBackup(paqueteLecturas.getIsBackupBoolean());
        lecturasPorFrontera.setReadingCount(paqueteLecturas.READING_COUNT);
        lecturasPorFrontera.setReadingInterval(paqueteLecturas.READING_INTERVAL);
                
        return lecturasPorFrontera;
    }
}

