import java.util.Calendar;
import java.util.Date;  
import java.util.TimeZone;
public class Calendar1{
    public static void main(String args[]){
        // gets the calendar.
        // Gets a calendar using the default time zone and locale.getInstance()
        Calendar cal = Calendar.getInstance();
         System.out.println("Time :"+cal.getTime());
        //  getFirstDayOfWeek().return int
        // cal.setFirstDayOfWeek(2);
         System.out.println("First day : "+cal.getFirstDayOfWeek());
        //  setFirstDayOfWeek().return int
         cal.setFirstDayOfWeek(Calendar.WEDNESDAY);
         System.out.println("After set :"+ cal.getFirstDayOfWeek());
        // getWeeksInWeekYear() returns int 
         System.out.println("set : "+cal.getWeeksInWeekYear());
        
        // get method.
         System.out.println("");
         System.out.println("");
         cal.set(Calendar.YEAR,2019);
         System.out.println("Year :"+cal.get(Calendar.YEAR));
         System.out.println("Month:"+cal.get(Calendar.MONTH));
         System.out.println("DATE :"+cal.get(Calendar.DATE));
         System.out.println(cal.getTime().toString());

         System.out.println("");
         System.out.println("");

         //  add(int field , int amount);
         cal.add(Calendar.YEAR , 9);
         System.out.println("Time  after adding year :  "+cal.getTime());
         cal.add(Calendar.HOUR , -7);
         System.out.println("Time after subtracting :"+cal.getTime());

         System.out.println("");
         System.out.println("");
         // clone() method .
          Calendar cal1 = (Calendar) cal.clone();
          System.out.println("cloned :" + cal.getTime());
        //   // clear()method.
        //   cal.clear(Calendar.YEAR);
        TimeZone TZ = cal.getTimeZone();
          System.out.println("The TimeZone  shows :" + TZ.getDisplayName());

          System.out.println("");
          System.out.println("");

        //give the maximum value of the year. returns (int)
          int d = cal.getActualMaximum(Calendar.YEAR);
          System.out.println("Maximum year :"+d);
    }
} 
