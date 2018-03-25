import java.sql.*;
import java.util.TreeMap;
import java.util.regex.*;
import java.util.*;
import java.util.Iterator;
import java.io.*;
class WorldDatabase{

    static TreeMap<Integer,ArrayList<String>> Question;
    static int quesno;
    public static void getQuestion() throws FileNotFoundException{
        Question = new TreeMap<Integer,ArrayList<String>>();
        Scanner sc = new Scanner(new File("WorldQues.txt"));
        int i = 1;
        ArrayList<String> AL = null;
        while(sc.hasNextLine()){
            String Lines = sc.nextLine();
            AL = new ArrayList();
            AL.add(Lines);
            Lines = sc.nextLine();
            AL.add(Lines);
            Question.put(i,AL);
            i++;
        }
        // Collection col = Question.values();
        // Iterator iter = col.iterator();
        // while(iter.hasNext()){
        //     System.out.println(iter.next());
        // }
            // System.out.println(Question);
        sc.close();
    }
    public static void getInput()throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        Scanner scc = new Scanner(new File("WorldQuesonly.txt"));
        while(scc.hasNextLine()){
            System.out.println(scc.nextLine());
        }
        System.out.println();
        System.out.println("Enter the no of the query to be executed");
        System.out.println();
        quesno = sc.nextInt();
        showDb();
    }
    public static void showDb(){
        try{
            BufferedReader head = new BufferedReader(new FileReader("head.html"));
            BufferedReader end = new BufferedReader(new FileReader("end.html"));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.html"));
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","");
            Statement stmt=con.createStatement();
            String query = Question.get(quesno).get(1);
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();

            while(head.ready()){
                String v = head.readLine();
                output.write(v);
                output.flush();
            }

            output.write("<tr>");
            for(int i = 1; i <= rsmd.getColumnCount(); i++){
                output.write("<td>"+rsmd.getColumnName(i)+ "</td>");
            }
            output.write("</tr>");

            while (rs.next()){
                output.write("<tr>");
                for(int i = 1; i <= rsmd.getColumnCount(); i++){
                    output.write("<td>"+rs.getString(i)+ "</td>");
                }    
                output.write("</tr>");
            }

            while(end.ready()){
                String v = end.readLine();
                output.write(v);
                output.flush();
            }

            // System.out.println();
            System.out.println("Your file will open");
        }
        catch(Exception e){
            System.out.println(e);
        }    
    }
    public static void main(String[] args) throws FileNotFoundException {
        getQuestion();
        getInput();
        String browser = "/usr/bin/./firefox";
        File file = new File("output.html");
        try {
            Runtime r = Runtime.getRuntime();
            r.exec(browser + " " + file.getPath());
            } 
            catch (Exception ex) {
            ex.printStackTrace();
            // JOptionPane.showMessageDialog(null, "Not a valid file!", "ERROR!",
            // JOptionPane.ERROR_MESSAGE);
            } 
    }
}