package se.wsu.lmw.Controls;

import se.wsu.lmw.Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author imashi
 */
 
public class GenerateMemberID {
private static String maxid;
private static Vector v2;
public static String getMemberID(){
        try {
 
            ResultSet rs=DB.myConnection().createStatement().executeQuery("select max(MemberID) from members");
            while(rs.next()){
                maxid=Integer.toString(rs.getInt(1)+1);                
            }
 
        } catch (ClassNotFoundException exception2) {
            JOptionPane.showMessageDialog(null, "Error @ GenerateMemberID class not found exception ");
        }catch(SQLException exception3){
            JOptionPane.showMessageDialog(null, "Error @ GenerateMemberID SQL exception ");
        }
        return maxid;
    }

}
