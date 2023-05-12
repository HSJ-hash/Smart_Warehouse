/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Maneth
 */
public class DBConnect {
     private static Connection con;
     public static Connection connect() {
             

        try
        {
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/smartwarehouse","root","");
       
JOptionPane.showMessageDialog(null,"Connected");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Error connecting to the database"+e,"DB Form",JOptionPane.ERROR_MESSAGE);
        }

        return con;
    }
}
