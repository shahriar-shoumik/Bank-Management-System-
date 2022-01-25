/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection cnn;
    
    public static Connection ConnectionDB()
    { 
        try
        { 
            Class.forName("org.sqlite.JDBC");
            Connection cnn=DriverManager.getConnection("jdbc:sqlite:\Bank.sqlite");
            return cnn;
        }catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null, e);
        }
         return null;
    }
      
}
