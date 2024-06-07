/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class BD {

  private static Connection conn = null;  
  
  public static Connection conectar()  {  
    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost/clinmed?user=root&password=bc616420&useSSL=true&useTimezone=true&serverTimezone=UTC");
        return conn;
    } catch (SQLException ex) {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
      
      	return null;
    }
  }
}

