package se.wsu.lmw.Controls.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author imashi
 */
public class Date1 {
   private static int num_of_days=0;
   public static String myDate(){
        String today;
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        today = dateFormat.format(calendar.getTime()).toString();
        return today;
    }
    //method for calculate the time period
    public static int getDatePeriod(String getDate,String returnDate){
         num_of_days=0;
         String date1[]=getDate.split("-");
         String date2[]=returnDate.split("-");
         int year= (Integer.parseInt(date1[0])-Integer.parseInt(date2[0]));
         int month=(Integer.parseInt(date1[1])-Integer.parseInt(date2[1]));
         int days=(Integer.parseInt(date1[2])-Integer.parseInt(date2[2]));          
         num_of_days=(year*365)+(month*30)+(days*1);
         return num_of_days;
    }
 }
