/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sample.jtree.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bahrie
 */
public class DatabaseUtilities {

    private static Connection conn;

    public static Connection getConnection(){
        if(conn==null){
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","admin");
               
            } catch (SQLException ex) {
                //Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
             //   System.err.println(ex.printStackTrace());
                
            }
        }
        return conn;
    }

}
