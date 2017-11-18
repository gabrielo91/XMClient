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
public interface IPreferencesManager {
    String getUsername()throws Exception;
    String getPasword()throws Exception;
    String getServiceEndPoint()throws Exception;
}
