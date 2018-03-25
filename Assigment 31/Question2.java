import java.util.LinkedList;
import java.util.TreeMap;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Question2{
    public static void main(String args[]) throws FileNotFoundException,IOException{
        Scanner scanner = new Scanner(new File("Students.txt"));
        BufferedReader head = new BufferedReader(new FileReader("head.html"));
        BufferedReader end = new BufferedReader(new FileReader("end.html"));
        BufferedWriter output = new BufferedWriter(new FileWriter("output.html"));
        LinkedList<String> Id = new LinkedList<String>();
        LinkedList<String> Name = new LinkedList<String>();
        TreeMap<String,String> list = new TreeMap<String,String>();
        while(scanner.hasNextLine()){
            String s[] = scanner.nextLine().split(" ");
            Id.add(s[0]);
            Name.add(s[1]);
            list.put(s[0], s[1]);
        }

        while(head.ready()){
            String v = head.readLine();
            output.write(v);
            output.flush();
        }
        
        for(int i = 0; i < Id.size(); i++){
            String v = Id.get(i);
            String vv = Name.get(i);
            output.write("<tr><td>"+v+"</td><td>"+vv+"</td><tr>");
            output.flush();
        }

        while(end.ready()){
            String v = end.readLine();
            output.write(v);
            output.flush();
        }

        // System.out.println(Id+ " " +Name);
        // System.out.println(list);
    } 
}
