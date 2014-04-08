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
public class LoadAuthor {
private static String max_Author_id;
private static String v1;
public static Vector selectAllAuthor(){
Vector v=new Vector();
        try {
 
            ResultSet rs=DB.myConnection().createStatement().executeQuery("select * from author");
            while(rs.next()){
                v.add(rs.getString(2));
            }
 
        } catch (Exception e) {
        }
        return v;
    }
     public static String selectAllAuthorID(String authorname){
        try {
 
            ResultSet rs=DB.myConnection().createStatement().executeQuery("select * from author where AuthorName='"+authorname+"'");
            while(rs.next()){
                v1=(rs.getString(1));
            }
 
        } catch (Exception e) {
        }
        return v1;
    }
    public static String getMaxAithorID(){
        try {
             ResultSet rs=DB.myConnection().createStatement().executeQuery("select max(AuthorID) from author");
             while(rs.next()){
             max_Author_id=Integer.toString(rs.getInt(1)+1);                
            }
 
        } catch (ClassNotFoundException exception1) {
            JOptionPane.showMessageDialog(null, "Error @ LoadAuthor class not found exception");
        }catch(SQLException exception2){
            JOptionPane.showMessageDialog(null, "Error @ LoadAuthor SQL exception");
        }
        return max_Author_id;
    }
}
