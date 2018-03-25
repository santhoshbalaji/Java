import java.lang.reflect.Constructor;
import java.util.Calendar; 
class Sample {  
    public static void main(String[] args) throws ClassNotFoundException,SecurityException {  
       Calendar calendar = Calendar.getInstance();  
       Class cal = Class.forName("java.lang.Boolean");
       System.out.println(cal.getConstructors());
       Constructor C[] = cal.getConstructors();
       for (Constructor constructor : C) {
            System.out.println(constructor);
        }
       System.out.println("The current date is : " + calendar.getTime());  
       calendar.add(Calendar.DATE, -15);  
       System.out.println("15 days ago: " + calendar.getTime());  
       calendar.add(Calendar.MONTH, 4);  
       System.out.println("4 months later: " + calendar.getTime());  
       calendar.add(Calendar.YEAR, 2);  
       System.out.println("2 years later: " + calendar.getTime());  
    }  
}  