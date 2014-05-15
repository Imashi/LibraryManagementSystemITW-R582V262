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
 * @author imashi
 */
public class GetBookDetails {
    
    
    ResultSet resultSet=null;
     public ResultSet getBook() throws ClassNotFoundException
        {
        try {
            try {
                resultSet = DB.myConnection().createStatement().executeQuery("SELECT * FROM book");
            } catch (SQLException ex) {
                Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultSet;
        }
     
     public ResultSet getBorrowed() throws ClassNotFoundException
        {
        try {
            try {
                resultSet = DB.myConnection().createStatement().executeQuery("SELECT * FROM borrowedbooks");
            } catch (SQLException ex) {
                Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Load_combo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return resultSet;
        }
    
}

