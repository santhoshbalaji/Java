import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
class CreateDB{
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql:java","postgres","");
            Statement stmt=con.createStatement();
            String query = "select * from one";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                System.out.println(rs.getString(1));
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }       
    }
}