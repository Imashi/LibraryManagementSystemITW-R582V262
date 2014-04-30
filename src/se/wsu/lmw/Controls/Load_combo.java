/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.wsu.lmw.Controls;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import se.wsu.lmw.Database.DB;

/**
 *
 * @author Ravimal Kumaranayaka
 */
public class Load_combo {
    ResultSet resultSet=null;
     public ResultSet getCat() throws ClassNotFoundException
        {
        try {
            try {
                resultSet = DB.myConnection().createStatement().executeQuery("SELECT CategoryName FROM category");
            } catch (SQLException ex) {
                Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultSet;
        }
     
     public ResultSet getrackno() throws ClassNotFoundException
        {
        try {
            try {
                resultSet = DB.myConnection().createStatement().executeQuery("SELECT RackID FROM rack");
            } catch (SQLException ex) {
                Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultSet;
        }
        
    
}
