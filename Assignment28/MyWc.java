/*Write a program MyWc.java so that it gives the same output as $ wc filename in the 
shell (display the number of lines, words and characters in the given file). Use Scanner 
class to read from the source file. 
$> java MyWc file*/ 
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
class MyWc{
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(args[0]);
        int Wordc = 0;
        int Linec = 0;
        String string = "";
        while(scanner.hasNextLine()){
           string += scanner.next();
            Linec++;
        }
        System.out.println(Linec + " " + Wordc + " " + string.length());
    }
}