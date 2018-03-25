 /*A software company provides an anti-virus protection tool for free to home users. The software is easy to install and requires users to enter a 25-digit license key upon 
installation. Your job is to return the favor by providing them with a program that randomly generates license keys which they can then
 use for their customers who wish to download and install their anti-virus software. Create a program, KeyGenerator.java that prompts the user for the number of keys 
that he/she wishes to generate, and then generates the specified number of license keys that take on the following pattern: ##???-??#??#-?#-?##-?##-?#?#?? 
The # symbol represents a number between 0-9 and the ? symbol represents a letter between A-Z. */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
class KeyGenerator{
    static int noOfKeys;
    static String key;
    public KeyGenerator(){

    }
    public static void getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Keys to generate");
        noOfKeys = scanner.nextInt();
        for(int i = 0; i < noOfKeys ; i++){
            Generate();
        }
    }
    public static void Generate(){
        char alf[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char no[] = {'0','1','2','3','4','5','6','7','8','9'};
        String myPattern = "[0-9]{2}[A-Z]{5}[0-9][A-Z]{2}[0-9][A-Z][0-9][A-Z][0-9]{2}[A-Z][0-9]{2}[A-Z][0-9][A-Z][0-9][A-Z]{2}";
        key = "";
        for(int i = 0; i < 25; i++){
            if(i == 0 || i == 1 || i == 7 || i == 10 || i == 12 || i == 14 || i == 15 || i == 17 || i == 18 || i == 20 || i == 22){
                double nos = Math.random() * 10;
                key += no[(int)nos];
            }
            else{
                double nos = Math.random() * 26;
                key += alf[(int)nos];
            }
        }
        System.out.println(key);
    }
    public static void main(String args[]){
        getValue();
    }
}