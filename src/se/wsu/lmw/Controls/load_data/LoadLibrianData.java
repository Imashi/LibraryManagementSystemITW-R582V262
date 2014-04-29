package se.wsu.lmw.Controls.load_data;

import java.sql.ResultSet;
import se.wsu.lmw.Database.DB;

public class LoadLibrianData {
private static String maxLID;
private static String librianName="Librian";

/**
 *
 * @author imashi
 */

// method to select the next librarian Id 
public static String LoadMaxLID(){
         try {

        ResultSet rs=DB.myConnection().createStatement().executeQuery("Select * from librian order by LibrianID ASC");
        while(rs.next()){
            maxLID=rs.getString("LibrianID");

            maxLID=Integer.toString(Integer.parseInt(maxLID)+1);
        }
        } catch (Exception e) {
        }
        return maxLID;
    }

    // method to load get the librarian name 
    public static String LoadLibrianName(String libID){
     try {

        ResultSet rs=DB.myConnection().createStatement().executeQuery("Select * from librian where LibrianID='"+libID+"'");
        while(rs.next()){
            librianName=rs.getString("LibrianName");            
        }
        
        } catch (Exception e) {
        }
        return librianName;
    }

}
