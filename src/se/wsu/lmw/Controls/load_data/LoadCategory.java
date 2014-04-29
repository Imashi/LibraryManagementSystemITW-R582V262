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
public class LoadCategory {
private static String max_category_id;
private static String category_id;
public static Vector selectAllCategory(){
        Vector v=new Vector();
        try {

            ResultSet rs=DB.myConnection().createStatement().executeQuery("select * from category");
            while(rs.next()){
                v.add(rs.getString(3));
            }
        } catch (Exception e) {
        }
        return v;
    }
    
    public static String getMaxCategoryID(){
    try {

             ResultSet rs=DB.myConnection().createStatement().executeQuery("select max(CategoryID) from category");
             
            while(rs.next()){
                max_category_id=Integer.toString(rs.getInt(1)+1);                
            }

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error @ LoadCategoryID  class not found exception");
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null, "Error @ LoadCategoryID  SQL exception");
        }
        return max_category_id;
    }
    public static String getCategoryID(String CategoryName){
        try {

            ResultSet rs=DB.myConnection().createStatement().executeQuery("select* from category where CategoryName='"+CategoryName+"'");
            while(rs.next()){
                category_id=rs.getString(1);                
            }

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error @ LoadCategoryID  class not found exception");
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null, "Error @ LoadCategoryID  SQL exception");
        }
        return category_id;
    }
}
