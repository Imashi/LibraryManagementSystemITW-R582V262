package se.wsu.lmw.Controls;

import se.wsu.lmw.Database.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author imashi
 */
// method to generate the next bookId
public class GenerateBookID {
private static String maxid;
static String testvar;
public static String getBookID(){
        try {

            ResultSet rs=DB.myConnection().createStatement().executeQuery("select max(BookID) from book");
            while(rs.next()){    
            int ongoingId=(rs.getInt(1));
            int nextId=ongoingId+1;
            maxid=Integer.toString(nextId);
            }
    
        }catch (NullPointerException exception1) {
            JOptionPane.showMessageDialog(null, "Error @ GenerateBookID Nullpointer exception ");
            return maxid="1";
        } 
        catch (ClassNotFoundException eexception2) {
            JOptionPane.showMessageDialog(null, "Error @ GenerateBookID class not found exception");
        }catch(SQLException exception3){
            JOptionPane.showMessageDialog(null, "Error @ GenerateBookID SQL exception");
        }
        return maxid;
    }
}
