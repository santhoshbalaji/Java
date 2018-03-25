import java.sql.*;
import java.util.TreeMap;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class DatabaseManager{

    public Connection con = null;
    public Statement stmt = null;
    public ResultSet rs = null;
    public ResultSetMetaData rsmd = null;
    public PreparedStatement pstmt = null;
    public TreeMap<Integer,String> databases;

    // No arguments constructor
    public DatabaseManager() throws Exception{
        init();
    }

    // Database name passed single argument constructor
    public DatabaseManager(String dbName)throws Exception{
        init();
        selectDatabase(dbName);
    }
    // Database number passed single argument constructor
    public DatabaseManager(int dbkey)throws Exception{
        init();
        selectDatabase(dbkey);
    }

    // Initialize method will make connection with sql
    public void init()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
        databases = new TreeMap<Integer,String>();
        stmt = con.createStatement();
        String query = "show databases";
        rs = stmt.executeQuery(query);
        int i = 1;
        while(rs.next()){
            String db = rs.getString(1);
            databases.put(i,db);
            i++;
        }
    }

    // showDatabase method display the databases in mysql
    public void showDatabase()throws Exception{
        init();
        for(int i = 1; i< databases.size();i++){
            System.out.println(databases.get(i));
        }
    }

    // select Database method will select the database name passed likely 'use daName'
    public void selectDatabase(String dbName)throws Exception{
        String getdb ="" ;
        init();
        // for(int i = 1; i < databases.size(); i++){
        //     getdb = databases.get(i);
        //     if(getdb.equals(dbName)){
        //         break;
        //     }
        // }
        stmt = con.createStatement();
        String query = "use "+dbName+";";
        rs = stmt.executeQuery(query);
        System.out.println(rs.toString());
    }

    // this method will select the database from the user provided number of database
    public void selectDatabase(int dbkey)throws Exception{
        String getdb ="" ;
        init();
        if(dbkey < databases.size()){
            getdb = (String)databases.get(dbkey);
        }
        else{
            System.out.println("Enter a valid number");
        }
        stmt = con.createStatement();
        String query = "use "+getdb+";";
        rs = stmt.executeQuery(query);
        // System.out.println(rs.toString());
    }

    // this method will be used to display the available databases and select database from the user
    public void selectDatabase()throws Exception{
        String getdb = "";
        init();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of the database from the above list - ");
        int dbKey = scanner.nextInt();
        if(dbKey < databases.size()){
            getdb = (String)databases.get(dbKey);
        }
        else{
            System.out.println("Enter a valid number");
        }
        stmt = con.createStatement();
        String query = "use "+getdb+";";
        rs = stmt.executeQuery(query);
        System.out.println(rs.toString());
        scanner.close();
    }

    // this method shows the available tables in the database
    public void showTables()throws Exception{
        // init();
        stmt = con.createStatement();
        String query = "show tables;";
        rs = stmt.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
    }

    // this method will delete the database of the given name
    public void deleteDatabase(String dbname)throws Exception{
        init();
        stmt = con.createStatement();
        String query = "drop database "+dbname+";";
        int i = stmt.executeUpdate(query);
        System.out.println(i);
    }

    // this method create database or can be used to drop the existing table and create a new database on the same name
    public void createDatabase(String dbName)throws Exception{
        stmt = con.createStatement();
        int record = stmt.executeUpdate("drop database if exists "+dbName+";");
        record += stmt.executeUpdate("create database "+dbName);
    }

    // createTable method will create a table in the provided database
    public void createTable(String dbname)throws Exception{
        selectDatabase(dbname);
        Scanner scanner = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        stmt = con.createStatement();
        rs = stmt.executeQuery("use "+dbname);
        System.out.print("Enter the name of the table to create - ");
        String tableName = scanner.next();
        System.out.println(); 
        System.out.print("Enter the columns - ");
        int cols = scanner.nextInt();
        System.out.println(); 
        String ss = "";
        String query = "create table "+tableName+" ( ";
        for(int i = 0 ; i < cols; i ++){
            System.out.print("Enter the name of the column:"+(i+1)+" - ");
            if(i == 0){
                ss = scanner.nextLine();
            }
            String s = scanner.nextLine();
            query += s+" ";
            System.out.print("Enter the datatype of the column:"+(1+i)+" - ");
            String d = scanner.nextLine();
            if(i != (cols-1))
                query += d+" , ";
            else
                query += d;    
            
            System.out.println();    
        }
        System.out.println();
        query += " );";
        System.out.println(query+" -"+ss+";");
        int record = stmt.executeUpdate(query);
        System.out.println(record+" enteries recorded");
        scanner.close();
    }

    
    // this method will provide the types of datatypes presented in the table.This method requires only Table name .Database name should be selected by selectdatabase method
    public String[] descType(String tablename)throws Exception{
        // selectDatabase(dbname);
        stmt = con.createStatement();
        // rs = stmt.executeQuery("use world");
        rs = stmt.executeQuery("select * from "+tablename);
        rsmd = rs.getMetaData();
        String datatype[] = new String[rsmd.getColumnCount()];
        for(int i = 0; i < rsmd.getColumnCount(); i++){
            datatype[i] = rsmd.getColumnTypeName(i+1);
        }
        return datatype;
    }

     public String[] descType(String dbname,String tablename)throws Exception{
        selectDatabase(dbname);
        String[] datatype = descType(tablename);
        return datatype;
    }

    // this method will perform desc method from sql.This method requires Database name and Table name
    public void desc(String dbname,String tablename)throws Exception{
        selectDatabase(dbname);
        desc(tablename);
    }

    // this method will perform desc method from sql.This method requires only Table name
    public void desc(String tablename)throws Exception{
        stmt = con.createStatement();
        rs = stmt.executeQuery("desc "+tablename);
        rsmd = rs.getMetaData();
        while(rs.next()){
            for(int i = 0; i < rsmd.getColumnCount(); i++){
                System.out.print(rs.getString(i+1)+"\t");
            }
            System.out.println();
        }    
    }

    // this method will be used by insertTable method
    public String Dbmethod(String name)throws Exception{
        name = name.toUpperCase();
        String setInt[] = {"INTEGER","INT","SMALLINT","TINYINT","MEDIUMINT","BIGINT","DECIMAL","NUMERIC"};
        String setDouble[] = {"FLOAT","DOUBLE"};
        String setString[] = {"CHAR","VARCHAR","BINARY","VARBINARY"};
        if(Arrays.asList(setInt).contains(name)){
            return "setInt";
        }
        else if(Arrays.asList(setDouble).contains(name)){
            return "setDouble";
        }
        else if(Arrays.asList(setString).contains(name)){
            return "setString";
        }
        else
            return "hi";
    }

    // this method is used to insert a table in a database.This method requires Database name and Table name
    public int insertTable(String dbname,String tablename)throws Exception{
        Scanner scanner = new Scanner(System.in);
        String noOfdatatypes[] = descType(dbname,tablename);
        String qm = "";
        for(int i = 0; i < noOfdatatypes.length; i++){
            if(i != noOfdatatypes.length-1)
                qm += "?,";
            else
                qm += "?";    
        }
        System.out.println("Enter the values of the datatypes with respectively");
        System.out.println();
        String query = "insert into "+tablename+" values ("+qm+")";
        pstmt = con.prepareStatement(query);
        ArrayList<Object> list = new ArrayList<Object>();
        for(int i = 0; i < noOfdatatypes.length; i++){
            String n = Dbmethod(noOfdatatypes[i]);
            System.out.println("Enter the value of this datatype "+noOfdatatypes[i] + " of this column " +rsmd.getColumnLabel(i+1)+"("+rsmd.getColumnDisplaySize(i+1)+")" ) ;
            list.add(scanner.next());
            if(n.equals("setInt")){
                pstmt.setInt((i+1), Integer.valueOf((String)list.get(i)));
            }
            else if(n.equals("setDouble")){
                pstmt.setDouble((i+1), (Double)list.get(i));
            }
            else if(n.equals("setString")){
                pstmt.setString((i+1),(String)list.get(i));
            }
        }
        int i = pstmt.executeUpdate();
        scanner.close();
        return i;
    }

    // this method is used to insert a table in a database.This method requires only Table name .Database name should be selected by selectdatabase method
    public int insertTable(String tablename)throws Exception{
        Scanner scanner = new Scanner(System.in);
        String noOfdatatypes[] = descType(tablename);
        String qm = "";
        for(int i = 0; i < noOfdatatypes.length; i++){
            if(i != noOfdatatypes.length-1)
                qm += "?,";
            else
                qm += "?";    
        }
        System.out.println("Enter the values of the datatypes with respectively");
        System.out.println();
        String query = "insert into "+tablename+" values ("+qm+")";
        pstmt = con.prepareStatement(query);
        ArrayList<Object> list = new ArrayList<Object>();
        for(int i = 0; i < noOfdatatypes.length; i++){
            String n = Dbmethod(noOfdatatypes[i]);
            System.out.println("Enter the value of this datatype "+noOfdatatypes[i] + " of this column " + rsmd.getColumnLabel(i+1)+"("+rsmd.getColumnDisplaySize(i+1)+")") ;
            list.add(scanner.next());
            if(n.equals("setInt")){
                pstmt.setInt((i+1), Integer.valueOf((String)list.get(i)));
            }
            else if(n.equals("setDouble")){
                pstmt.setDouble((i+1), (Double)list.get(i));
            }
            else if(n.equals("setString")){
                pstmt.setString((i+1),(String)list.get(i));
            }
        }
        int i = pstmt.executeUpdate();
        // System.out.println(i + " records inserted");
        // System.out.println(list);
        scanner.close();
        return i;
    }

    // this method will update a value in a row of a column.This method requires where condition 
    public void update(String dbname,String tablename)throws Exception{
        selectDatabase(dbname);
        stmt = con.createStatement();

    }

    // this method will insert a .sql file
    public void insertDotSql(File fr)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(fr));
        stmt = con.createStatement();
        while(br.ready()){
            String q = br.readLine();
            System.out.println(q);
            if(!(q.isEmpty()))
                stmt.executeUpdate(q);
        }
    }

    // main method to check the methods displayed above
    public static void main(String[] args)throws Exception {
        DatabaseManager db = new DatabaseManager();
        // db.showDatabase();
        // db.selectDatabase();
        // db.selectDatabase(1);
        // db.selectDatabase("java");
        // db.showTables();
        // db.deleteDatabase("world");
        // db.createDatabase("java");
        // db.createTable("java");
        // String d[] = db.descType("java");
        // for(int i = 0; i < d.length; i++){
        //     System.out.print(d[i]+"\t");
        // }
        // System.out.println();
        // db.insertTable("world", "java"); 
        // System.out.println(db.Dbmethod("int"));
        // db.insertDotSql(new File("/home/test/Downloads/world.sql"));
        // db.desc("java", "java1");    
    }
}