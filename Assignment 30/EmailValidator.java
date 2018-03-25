/*A  company  issues  email  domains  to  business  owners. The  email  domains  that  are issued take the following form user@companyname.extension, where user can be any 
combination  of  letters and  digits  not  longer  than  15  characters,  domain  can  be  any combination of letters and digits not longer than 8
 characters and extension is either in or com.Write an EmailValidator.java application that continuously prompts the user for a valid email address based on the above pattern. */
 import java.util.Scanner;
 import java.util.regex.Pattern;
 import java.util.regex.Matcher;
 import java.util.regex.PatternSyntaxException;
 class EmailValidator{
    static String mail;
    static Matcher m;
    public EmailValidator(){

    }
    public static void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mail id without space");
        mail = scanner.next();
        match();
    }
    public static void match(){
        String pattern = "[^@]{5,15}[@][a-z]{3,8}[.](com|in)";
        Pattern patrn = Pattern.compile(pattern);
        m = patrn.matcher(mail);
        if(m.matches()){
            System.out.println("Key is valid");
        }
        else{
            System.out.println("Key is Invalid");
        }
    }
    public static void main(String args[]){
        getData();
    }
 }