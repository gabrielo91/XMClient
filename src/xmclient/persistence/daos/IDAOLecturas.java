/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.persistence.daos;

import java.util.ArrayList;
import xmclient.entities.DTOLecturas;

/**
 *
 * @author USUARIO
 */
public interface IDAOLecturas {
    ArrayList<DTOLecturas> getLecturas() throws Exception;
}
