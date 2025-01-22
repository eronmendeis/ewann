/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Proj;

import java.sql.DriverManager;
import java.sql.*;


/**
 *
 * @author Eron
 */
public class ConnectionProvider {   
    
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizmb", "root", "wahwahwah");
            return con;
        }
        catch(Exception e){
        return null;
        }
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String insert_into_question_values) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            
}
