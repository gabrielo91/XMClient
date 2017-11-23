/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.persistence.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import xmclient.entities.DTOLecturas;
import xmclient.persistence.controller.IDBControl;

/**
 *
 * @author Gabriel Ortega
 */
public class DAOLecturas implements IDAOLecturas{

    IDBControl dBControl;
    
    public DAOLecturas(IDBControl dbcontrol) {
        this.dBControl = dbcontrol;
    }
    
    @Override
    public ArrayList<DTOLecturas> getLecturas() throws Exception {
        
        Connection conn = dBControl.getConnection();
        ArrayList<DTOLecturas> arrayListLecturas = new ArrayList<DTOLecturas>();
        DTOLecturas dTOLecturas;
        PreparedStatement stmt = null;
        String sql = "Se";
        
        return arrayListLecturas;
    }

}
