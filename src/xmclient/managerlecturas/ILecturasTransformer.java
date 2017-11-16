/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.managerlecturas;

import java.util.ArrayList;
import xmclient.entities.DTOLecturas;
import xmclient.entities.SOAPServicesLecturasEntity;

/**
 *
 * @author Gabriel Ortega
 */
public interface ILecturasTransformer {

    ArrayList<SOAPServicesLecturasEntity> convertirLecturas(ArrayList<DTOLecturas> listaLecturas);

    
}
