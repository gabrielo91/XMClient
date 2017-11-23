/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.persistence.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Gabriel Ortega
 */
public class DBParamsReader implements IDBParamsReader{

    public final static String PATH_CONFIGURATION_FILE = "resources/dbparams.json";
    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";
    public final static String ENDPOINT = "endpoint";
    public final static String PORT = "port";
    public final static String DRIVER = "driver";
    
    
    private String username;
    private String password;
    private String endPoint;
    private String port;
    private String driver;
    
    
    public DBParamsReader() throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader(PATH_CONFIGURATION_FILE));
        JSONObject dbParams = (JSONObject) object;

        username = (String) dbParams.get(USERNAME);
        password = (String) dbParams.get(PASSWORD);
        endPoint = (String) dbParams.get(ENDPOINT);
        port = (String) dbParams.get(PORT);
        driver = (String) dbParams.get(DRIVER);
    }
    
    
    @Override
    public String getUsername() throws Exception {
        return username;
    }

    @Override
    public String getPasword() throws Exception {
        return password;
    }

    @Override
    public String getDriver() throws Exception {
        return driver;
    }

    @Override
    public String getEndPoint() throws Exception {
        return endPoint;
    }

    @Override
    public String getPort() throws Exception {
        return port;
    }
    
}
