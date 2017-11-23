/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmclient.persistence.controller;

import java.sql.Connection;

/**
 *
 * @author Gabriel Ortega
 */
public interface IDBControl {
    Connection  getConnection()  throws Exception;
} 
