/*2.The  pattern  for  a  DVD  key  is  a  15  -digit  string  that  takes  the  following  form  YYXYX-XYYXX-XYYYY, where Y represents letters and X represents digits. 
Write  a  Java  program, DVDKeyValidator.javaapplication  that  gives  the  user  three attempts to enter a valid DVD key. If the user enters a valid DVD key, the following 
message should be outputted to the user: “Thank you for purchasing!” If the user fails to  enter  a  valid  DVD  key  within  three  attempts,  the  following  message  should  be 
outputted to the user: “Invalid key! Please purchase a valid key!” */
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
class DVDKeyValidator{
    static String key = "";
    static int count = 0;
    static Matcher m;
    public DVDKeyValidator(){

    }
    public static void keyValue(){
        System.out.println("Enter The Key");
        Scanner scanner = new Scanner(System.in);
        key = scanner.next();
        count++;
        match();
    }
    public static void match(){
        String myPattern = "[A-Z]{2}[0-9][A-Z][0-9][-][0-9][A-Z]{2}[0-9]{2}[-][0-9][A-Z]{4}";
        Pattern p = Pattern.compile(myPattern);
        m = p.matcher(key);
        if(m.matches()){
            System.out.println("Key is valid");
            count = 0;
        }
        else{
            if(count < 3){
                System.out.println("Key is Invalid ReEnter");
                keyValue();
            }
            else{
                System.out.println("Please Buy new Key");
            }
        }
    }
    public static void main(String args[]){
        DVDKeyValidator obj = new DVDKeyValidator();
        obj.keyValue();
    }  
}