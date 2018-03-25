import java.util.Calendar;  
 class CalendarExample {  
   public static void main(String[] args) {  
   Calendar kavi = Calendar.getInstance();  
   System.out.println("The current date is : " + kavi.getTime());  
   kavi.roll(Calendar.DATE, -35);  
   System.out.println("35 days before: " + kavi.getTime());  
  //  kavi.add(Calendar.MONTH, 4);  
  //  System.out.println("4 months later: " + kavi.getTime());  
  //  kavi.add(Calendar.YEAR, 2);  
  //  System.out.println("2 years later: " + kavi.getTime());  
   }  
} 
