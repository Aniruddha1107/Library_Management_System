package org.edu;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Conn {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            // For Mysql Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "1008");

//            For Oracle database
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##narendra", "1008");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public static void Close(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
