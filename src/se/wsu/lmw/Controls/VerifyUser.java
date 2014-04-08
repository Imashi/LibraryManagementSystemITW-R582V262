package se.wsu.lmw.Controls;

import se.wsu.lmw.Database.DB;
import java.sql.ResultSet;

public class VerifyUser {

    private static boolean status1 = false;
    private static boolean status2 = false;

    /**
     *
     * @author imashi
     */
//method to veryfy the user
    public static boolean verifyUser(String user, String pass) {
        status1 = false;
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from login where UserName='" + user + "' AND Password='" + pass + "'");
            while (rs.next()) {
                status1 = true;
            }

        } catch (Exception e) {
            System.out.println("Error @ Verify user ");
        }
        return status1;
    }
}
