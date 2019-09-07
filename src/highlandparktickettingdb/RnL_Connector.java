/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlandparktickettingdb;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kartikugemuge
 */
public class RnL_Connector {
    
    public static Connection RnLpage(){
        Connection conn = null;

        try {
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:\\HanuMon5ter\\Users\\kartikugemuge\\Downloads\\Testt.sqlite3");
            //JOptionPane.showMessageDialog(null, "");
            return conn;
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }  
   }
        
    
    
    
}
