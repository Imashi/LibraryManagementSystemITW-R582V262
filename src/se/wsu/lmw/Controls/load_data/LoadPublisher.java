package se.wsu.lmw.Controls.load_data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import se.wsu.lmw.Database.DB;
/**
 *
 * @author imashi
 */

public class LoadPublisher {
private static String max_publisher_id;
private static String publisherID;
    
    // method to select the all publishers
    public static Vector selectAllPublisher(){
        Vector v=new Vector();
        try {

            ResultSet rs=DB.myConnection().createStatement().executeQuery("select * from publisher");
            while(rs.next()){
            v.add(rs.getString(2));
            }
        } catch (Exception e) {
        }
        return v;
    }
    
    //method to select the publisher id 
    public static String selectPublisherID(String publisherName){
        
        try {

            ResultSet rs=DB.myConnection().createStatement().executeQuery("select * from publisher where PublisherName='"+publisherName+"'");
            while(rs.next()){
            publisherID=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return publisherID;
    }
    //method to select the next publisher
    public static String getMaxPublisherID(){
        try {

            ResultSet rs=DB.myConnection().createStatement().executeQuery("select max(PublisherID) from publisher");
            String x="x";
            while(rs.next()){
            x="y";

            int publisherId=Integer.parseInt(rs.getString(1))+1;
            max_publisher_id=Integer.toString(publisherId);

                                
            }

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error @ Loadpublisher 63 class not found exception");
        }catch(SQLException exception2){
            JOptionPane.showMessageDialog(null, "Error @ Loadpublisher 65 SQL exception");
        }
        return max_publisher_id;
    }
}




