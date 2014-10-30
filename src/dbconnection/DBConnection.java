/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Upekka
 */
public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost/tictacdatabase";

    private static final String USER = "root";
    private static final String PASSWORD = "zeta";  //put your password here
    private static DBConnection dbconnection = null;
    private static Connection con = null;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbconnection == null) {
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }

    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException {
        return getDBConnection().con;
    }
}
