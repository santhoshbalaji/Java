import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
public class displayTable{
    public static void main(String ar[]){
        try{
            BufferedReader head = new BufferedReader(new FileReader("head.html"));
            BufferedReader end = new BufferedReader(new FileReader("end.html"));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.html"));
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            Statement stmt=con.createStatement();
            String query="use world";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(rs.toString());
            query = "select * from city";
            rs=stmt.executeQuery(query);
            ResultSetMetaData rr = rs.getMetaData();
            System.out.println(rr.getColumnCount());


            while(head.ready()){
                String v = head.readLine();
                output.write(v);
                output.flush();
            }

            output.write("<tr>");
            for(int i = 1; i <= rr.getColumnCount(); i++){
                output.write("<td>"+rr.getColumnName(i)+ "</td>");
            }
            output.write("</tr>");
            while (rs.next()){
                output.write("<tr>");
                for(int i = 1; i <= rr.getColumnCount(); i++){
                    output.write("<td>"+rs.getString(i)+ "</td>");
                }    
                output.write("</tr>");
            }
            
            
            while(end.ready()){
                String v = end.readLine();
                output.write(v);
                output.flush();
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e); 
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
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
