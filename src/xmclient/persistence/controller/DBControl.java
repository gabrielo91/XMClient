/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.persistence.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase  para conectarse a la base de datos
 * @author Gabriel Ortega
 */
public class DBControl implements IDBControl{
    
    public static final String URL_BASE = "jdbc:oracle:thin";
    private final String username;
    private final String password;
    private final String endpoint;
    private final String port;
    private final String driver;

    public DBControl(IDBParamsReader params) throws Exception {
        username = params.getUsername();
        password = params.getPasword();
        endpoint = params.getEndPoint();
        port = params.getPort();
        driver = params.getDriver();
    }

    @Override
    public Connection getConnection() throws Exception{
  
        Class.forName(driver);
        String url = String.format("%s:@%s:%s:XE", URL_BASE, endpoint, port);
        Connection connection;
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }


}
