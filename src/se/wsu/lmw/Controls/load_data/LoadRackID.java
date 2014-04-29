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
public class LoadRackID {
    
private static String maxrackId;

//method to select the all rack ids 
public static Vector selectAllRackID(){
Vector v=new Vector();
        try {
 
            ResultSet rs=DB.myConnection().createStatement().executeQuery("select * from rack");
            while(rs.next()){
                v.add(rs.getString(1));
            }
        } catch (Exception e) {
        }
        return v;
    }

    // method to select the rackId from the rackcategory
    public static Vector selectRackID_from_rackCategory(String catname){
        
        Vector v=new Vector();
        try {
 
            ResultSet rs1=DB.myConnection().createStatement().executeQuery("select * from category where CategoryName='"+catname+"'");
            while(rs1.next()){
               String catID=rs1.getString(1);
 
                ResultSet rs2=DB.myConnection().createStatement().executeQuery("select * from rack_category where CategoryID='"+catID+"'");
                while(rs2.next()){
                    v.add(rs2.getString(1));
                }
            }
            
        } catch (Exception e) {
        }
        return v;
    }
    
    // method to get the next rack id
    public static String getMaxRackID(){
        try {
 
            ResultSet rs=DB.myConnection().createStatement().executeQuery("select max(RackID) from rack");
            while(rs.next()){
                maxrackId=Integer.toString(rs.getInt(1)+1);                
            }
 
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error @ LoadRack class not found exception");
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null, "Error @ LoadRack SQL exception");
        }
        return maxrackId;
    }
    
}
