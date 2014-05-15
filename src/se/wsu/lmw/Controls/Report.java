/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.wsu.lmw.Controls;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @imashi
 */
public class Report {
     public void Create_report(){
     try{
            Document document=new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Booklist_Report.pdf"));
            document.open();
            document.add(new Paragraph("----------------------------------------Library-------------------------------------", FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.BLACK)));
            document.add(new Paragraph(new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            
            document.add(new Paragraph("_________________________________________",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.WHITE)));
            PdfPTable table=new PdfPTable(new float[]{ 35, 45, 35,45,45,45,45,45 });
            table.addCell("Book ID");
            table.addCell("Book name");
            table.addCell("Total Qty");
            table.addCell("Available Qty");
            table.addCell("Librarian ID");
            table.addCell("Rack ID");
            table.addCell("Category ID");
            table.addCell("Publisher ID");
       
            ResultSet result=new GetBookDetails().getBook();
        
            while(result.next()){
                
            table.addCell(result.getString(1));
            table.addCell(result.getString(2));
            table.addCell(result.getString(3));
            table.addCell(result.getString(4));
            table.addCell(result.getString(5));
            table.addCell(result.getString(6));
            table.addCell(result.getString(7));
            table.addCell(result.getString(9));
            
            
            
            }
            
           
            document.add(table);
            document.add(new Paragraph("_________________________________________",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.WHITE)));
            
            
            
            document.add(new Paragraph("_________________________________________",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.WHITE)));
              document.close();
           
            
           
            
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Booklist_Report.pdf");
             
         }
         catch(Exception e)
         {
             System.out.println(e);
             JOptionPane.showMessageDialog(null, "report not created", "Error", 3);
         }
     }
     
      public void Create_report2(){
     try{
            Document document=new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Borrowed_Booklist.pdf"));
            document.open();
            document.add(new Paragraph("----------------------------------------Library-------------------------------------", FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.BLACK)));
            document.add(new Paragraph(new Date().toString()));
            document.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            
            document.add(new Paragraph("_________________________________________",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.WHITE)));
            PdfPTable table=new PdfPTable(6);
            
            table.addCell("Member ID");
            table.addCell("Book ID");
            table.addCell("Librarian ID");
            table.addCell("Borrowed date");
            table.addCell("Returned date");
            table.addCell("Borrowed ID");
            
       
            ResultSet result=new GetBookDetails().getBorrowed();
        
            while(result.next()){
                
            table.addCell(result.getString(1));
            table.addCell(result.getString(2));
            table.addCell(result.getString(3));
            table.addCell(result.getString(4));
            table.addCell(result.getString(5));
            table.addCell(result.getString(6));
           
            
            
            
            }
            
           
            document.add(table);
            document.add(new Paragraph("_________________________________________",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.WHITE)));
            
            
            
            document.add(new Paragraph("_________________________________________",FontFactory.getFont(FontFactory.TIMES_BOLD,18,Font.BOLD, BaseColor.WHITE)));
              document.close();
           
            
           
            
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Borrowed_Booklist.pdf");
             
         }
         catch(Exception e)
         {
             System.out.println(e);
             JOptionPane.showMessageDialog(null, "report not created", "Error", 3);
         }
     }
    
}
