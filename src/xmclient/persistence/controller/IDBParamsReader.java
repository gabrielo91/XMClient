/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.persistence.controller;

/**
 *
 * @author Gabriel Ortega
 */
public interface IDBParamsReader {
        String getUsername()throws Exception;
        String getPasword()throws Exception;
        String getEndPoint()throws Exception;
        String getDriver ()throws Exception;
        String getPort ()throws Exception;
}
