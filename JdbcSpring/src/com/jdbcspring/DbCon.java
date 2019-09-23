/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbcspring;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A D M I N
 */
public class DbCon {
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           //Logger.getLogger(DbCon.class.getName()).log(Level.SEVERE, null, ex);
           ex.printStackTrace();
        }
}
   public static Connection getConnection() throws SQLException{
       return  DriverManager.getConnection("jdbc:mysql://localhost:3306/sp", "root", "root");
   }
}
