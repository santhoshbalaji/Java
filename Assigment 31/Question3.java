import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Question3{
    public static void main(String args[])throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Students.txt"));
        TreeMap<String,Integer> list = new TreeMap<String,Integer>();
        ArrayList arraylist = new ArrayList<String>();
        String text = "";
        while(scanner.hasNext()){
            text += scanner.next();
            arraylist.add(scanner.next());
        }
        String[] textarray = text.split(" ");
        for(int i = 0; i < textarray.length; i++){
            String n = textarray[i];
            int count = 0;
            for(int j = 0; j < textarray.length;j++){
                String o =  textarray[j];
                if(n.equals(o)){
                    count++;
                }
            }
            list.put(n,count);        
        }

        System.out.println(list);
    }   
}
