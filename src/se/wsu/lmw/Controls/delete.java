/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.wsu.lmw.Controls;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import se.wsu.lmw.Controls.load_data.LoadAuthor;
import se.wsu.lmw.Database.DB;

/**
 *
 * @author imashi
 */
public class delete {
    
    public void delete_book(String mid) throws SQLException
            {
        try {
            
            
            DB.myConnection().createStatement().executeUpdate("delete from members where MemberID = '" + mid+ "'");
            
             
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(delete.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
  
}
