/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.preferencesmanager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import  org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Gabriel Ortega
 */
public class PreferencesManager implements IPreferencesManager{
    
    public final static String PATH_CONFIGURATION_FILE = "resources/config.json";
    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";
    public final static String CREDENTIALS = "credentials";
    public final static String SERVICE = "service";
    public final static String SERVICE_ENDPOINT = "service-endpoint";
            
    JSONParser parser;
    Object object;
    private String username;
    private String password;
    private String serviceEndPoint;
   
    
    public PreferencesManager() throws FileNotFoundException, IOException, ParseException {
        parser = new JSONParser();
        object = parser.parse(new FileReader(PATH_CONFIGURATION_FILE));
        JSONObject configData = (JSONObject) object;
        JSONObject credentials = (JSONObject) configData.get(CREDENTIALS);
        JSONObject serviceInfo = (JSONObject) configData.get(SERVICE);
        
        username = (String) credentials.get(USERNAME);
        password = (String) credentials.get(PASSWORD);
        serviceEndPoint = (String) serviceInfo.get(SERVICE_ENDPOINT);
        
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.println("serviceEndPoint: "+serviceEndPoint);
    }
    
    @Override
    public String getUsername() throws Exception {
        return this.username;
    }

    @Override
    public String getPasword() throws Exception {
        return this.password;
    }

    @Override
    public String getServiceEndPoint() throws Exception {
        return this.serviceEndPoint;
    }
    
}
