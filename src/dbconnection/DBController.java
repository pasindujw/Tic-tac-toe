/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Upekka
 */
public class DBController {

    public int addNewUser(String UserName) throws ClassNotFoundException, SQLException {
        String query = "Insert into User(UserName) values('" + UserName + "')";
        Connection connection = DBConnection.getConnectionToDB();
        int res = DBHandler.setData(connection, query);
        return res;

    }

    public int updateUserStatistics(String UserName, int Winnings) throws ClassNotFoundException, SQLException {
        String query = "Update User set Winnings=" + Winnings + " where UserName='" + UserName + "'";
        Connection connection = DBConnection.getConnectionToDB();
        int res = DBHandler.setData(connection, query);
        return res;

    }

    public int searchUser(String UserName) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getConnectionToDB();
        Statement stm = connection.createStatement();
        String sql = "Select * From User where UserName='" + UserName + "'";
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {

            return 1;
        } else {
            return 0;
        }
    }

    public ResultSet getWinnings(String UserName) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getConnectionToDB();
        Statement stm = connection.createStatement();
        String sql = "Select * From User where UserName='" + UserName + "'";
        ResultSet rst = stm.executeQuery(sql);
        return rst;

    }

    public ResultSet getAllRecords() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getConnectionToDB();
        Statement stm = connection.createStatement();
        String sql = "Select * From User";
        ResultSet rst = stm.executeQuery(sql);
        return rst;
    }

}
