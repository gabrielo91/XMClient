/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.preferencesmanager;

/**
 *
 * @author Gabriel Ortega
 */
public class PreferencesManager implements IPreferencesManager{

    public PreferencesManager() {
        //Gson gson = new Gson();
        //JsonReader reader = new JsonReader(new FileReader(filename));
    }
    
    @Override
    public String getUsername() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPasword() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServiceEndPoint() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
