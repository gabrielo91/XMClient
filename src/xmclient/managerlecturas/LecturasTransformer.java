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
public class LecturasTransformer implements ILecturasTransformer{

    @Override
    public ArrayList<SOAPServicesLecturasEntity> convertirLecturas(ArrayList<DTOLecturas> listaLecturas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
