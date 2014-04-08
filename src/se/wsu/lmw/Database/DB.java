package se.wsu.lmw.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author imashi
 */
public class DB {

    private static Connection con;

    public static Connection myConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bentaralabudb", "root", "r900214");//

        return con;
    }
}
