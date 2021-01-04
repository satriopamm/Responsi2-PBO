/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PAMUNGKAS
 */
public class ConnectDB {
   
     public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/db_covid094","root","");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
}
}
       
      
    
    

