package se.wsu.lmw.Controls.load_data;

import java.sql.ResultSet;
import se.wsu.lmw.Database.DB;

public class Load_Kappam {

    private static String kappam = "0";

    /**
     *
     * @author imashi
     */
//method to load the kappam
    public static String Load_Kappam() {
        try {

            ResultSet rs = DB.myConnection().createStatement().executeQuery("select * from kappam ");
            while (rs.next()) {
                kappam = rs.getString("kappamValue");
            }

        } catch (Exception e) {
            System.out.println("Exception @ Settings 110");
        }
        return kappam;
    }
}
