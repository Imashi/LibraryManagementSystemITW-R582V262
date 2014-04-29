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

       
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:jtds:sqlserver://IMASHI-PC/LMS_DB;instance=MSSQLSERVER;user=Imashi;password=imashi");

        return con;
    }
}
