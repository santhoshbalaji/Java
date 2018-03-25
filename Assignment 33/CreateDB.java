import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
class CreateDB{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            Statement stmt=con.createStatement();
            String query="create database java";
            PreparedStatement pstmt = con.prepareStatement(query);
            query = "use java";
            ResultSet rs = stmt.executeQuery(query);
            query = "create table employee(Employee_Number int not null,First_Name varchar(45),Last_Name varchar(45),Date_of_Birth date,Gender enum('M','F'))";
            pstmt = con.prepareStatement(query);
            System.out.println(pstmt.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}