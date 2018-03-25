package DatabaseManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * This class is used to perform all SQL functions
 * 
 * This class uses some of the interfaces from java.sql
 * 
 * @author Santhosh
 * @version 1.0
 * @since 2017-11-18
 * @see java.sql
 */
public class Sql {

    public Connection con = null;
    public Statement stmt = null;
    public ResultSet rs = null;
    public ResultSetMetaData rsmd = null;
    public PreparedStatement pstmt = null;
    public TreeMap<Integer, String> databases;

    // No arguments constructor
    /**
     * Default Constructor.
     * 
     * Constructs a new Sql that makes a connection with SQL
     */
    public Sql() throws Exception {
        init();
    }

    /**
     * Constructor
     * 
     * Constructs a new Sql that makes a connection with SQL
     * @param dbname (required) requires a String name of the Database 
     */
    // Database name passed single argument constructor
    public Sql(String dbName) throws Exception {
        init();
        selectDatabase(dbName);
    }

    /**
     * Constructor
     * 
     * Constructs a new Sql that makes a connection with SQL
     * @param dbkey (required) requires a int value of the Databases present
     */
    // Database number passed single argument constructor
    public Sql(int dbkey) throws Exception {
        init();
        selectDatabase(dbkey);
    }

    /**
     * inti()
     * 
     * This method will makes the connection
     * @exception throws SQLException
     */
    // Initialize method will make connection with sql
    public void init() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
        databases = new TreeMap<Integer, String>();
        this.stmt = this.con.createStatement();
        String query = "show databases";
        this.rs = this.stmt.executeQuery(query);
        int i = 1;
        while (this.rs.next()) {
            String db = this.rs.getString(1);
            databases.put(i, db);
            i++;
        }
    }

    /**
     * showDatabase
     * 
     * Display the Databases present
     * @exception throws SQLException
     */
    // showDatabase method display the databases in mysql
    public void showDatabase() throws Exception {
        for (int i = 1; i < databases.size(); i++) {
            System.out.println(databases.get(i));
            this.rs = stmt.executeQuery("show databases");
            this.rsmd = rs.getMetaData();
        }
    }

    /**
     * selectDatabase(dbName)
     * 
     * select a database in SQL
     * @param dbname (required) requires a String name of the Database 
     * @exception throws SQLException
     */
    // select Database method will select the database name passed likely 'use daName'
    public void selectDatabase(String dbName) throws Exception {
        String getdb = "";
        this.stmt = this.con.createStatement();
        String query = "use " + dbName + ";";
        this.rs = this.stmt.executeQuery(query);
        System.out.println(this.rs.toString());
    }

    /**
     * selectDatabase(dbKey)
     * 
     * select database in SQL
     * @param dbkey (required) requires a int value of the Databases present
     * @deprecated 
     * @exception throws SQLException
     */
    // this method will select the database from the user provided number of database
    public void selectDatabase(int dbkey) throws Exception {
        String getdb = "";
        if (dbkey < databases.size()) {
            getdb = (String) databases.get(dbkey);
        } else {
            System.out.println("Enter a valid number");
        }
        this.stmt = this.con.createStatement();
        String query = "use " + getdb + ";";
        this.rs = this.stmt.executeQuery(query);
        // System.out.println(this.rs.toString());
    }

    /**
     * selectDatabase()
     * 
     * Displays the given databases in the SQL and select the database from the user by using Scanner
     * @exception throws SQLException
     */
    // this method will be used to display the available databases and select database from the user
    public void selectDatabase() throws Exception {
        String getdb = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of the database from the above list - ");
        int dbKey = scanner.nextInt();
        if (dbKey < databases.size()) {
            getdb = (String) databases.get(dbKey);
        } else {
            System.out.println("Enter a valid number");
        }
        this.stmt = this.con.createStatement();
        String query = "use " + getdb + ";";
        this.rs = this.stmt.executeQuery(query);
        System.out.println(this.rs.toString());
        scanner.close();
    }

    /**
     * showTables()
     * 
     * Displays the tables present in the Database
     * @exception throws SQLException
     */
    // this method shows the available tables in the database
    public void showTables() throws Exception {
        // init();
        this.stmt = this.con.createStatement();
        String query = "show tables;";
        this.rs = this.stmt.executeQuery(query);
        while (this.rs.next()) {
            System.out.println(this.rs.getString(1));
        }
    }

    /**
     * deleteDatabase()
     * 
     * Delate the database from the Sql
     * @param dbname (required) required the database name to delete
     */
    // this method will delete the database of the given name
    public void deleteDatabase(String dbname) throws Exception {
        init();
        this.stmt = this.con.createStatement();
        String query = "drop database " + dbname + ";";
        int i = this.stmt.executeUpdate(query);
        System.out.println(i);
    }

    /**
     * createDatabase()
     * 
     * Creates a database from the given name
     * @param dbName (required) required to create a database from the given name
     */
    // this method create database or can be used to drop the existing table and create a new database on the same name
    public void createDatabase(String dbName) throws Exception {
        this.stmt = this.con.createStatement();
        int record = this.stmt.executeUpdate("drop database if exists " + dbName + ";");
        record += this.stmt.executeUpdate("create database " + dbName);
    }

    // createTable method will create a table in the provided database
    public void createTable(String dbname) throws Exception {
        selectDatabase(dbname);
        Scanner scanner = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        this.stmt = this.con.createStatement();
        this.rs = this.stmt.executeQuery("use " + dbname);
        System.out.print("Enter the name of the table to create - ");
        String tableName = scanner.next();
        System.out.println();
        System.out.print("Enter the columns - ");
        int cols = scanner.nextInt();
        System.out.println();
        String ss = "";
        String query = "create table " + tableName + " ( ";
        for (int i = 0; i < cols; i++) {
            System.out.print("Enter the name of the column:" + (i + 1) + " - ");
            if (i == 0) {
                ss = scanner.nextLine();
            }
            String s = scanner.nextLine();
            query += s + " ";
            System.out.print("Enter the datatype of the column:" + (1 + i) + " - ");
            String d = scanner.nextLine();
            if (i != (cols - 1))
                query += d + " , ";
            else
                query += d;

            System.out.println();
        }
        System.out.println();
        query += " );";
        System.out.println(query + " -" + ss + ";");
        int record = this.stmt.executeUpdate(query);
        System.out.println(record + " enteries recorded");
        scanner.close();
    }

    // this method will provide the types of datatypes presented in the table.This method requires only Table name .Database name should be selected by selectdatabase method
    public String[] descType(String tablename) throws Exception {
        // selectDatabase(dbname);
        this.stmt = this.con.createStatement();
        // this.rs = this.stmt.executeQuery("use world");
        this.rs = this.stmt.executeQuery("select * from " + tablename);
        this.rsmd = this.rs.getMetaData();
        String datatype[] = new String[this.rsmd.getColumnCount()];
        for (int i = 0; i < this.rsmd.getColumnCount(); i++) {
            datatype[i] = this.rsmd.getColumnTypeName(i + 1);
        }
        return datatype;
    }

    public String[] descType(String dbname, String tablename) throws Exception {
        selectDatabase(dbname);
        String[] datatype = descType(tablename);
        return datatype;
    }

    // this method will perform desc method from sql.This method requires Database name and Table name
    public void desc(String dbname, String tablename) throws Exception {
        selectDatabase(dbname);
        desc(tablename);

    }

    // this method will perform desc method from sql.This method requires only Table name
    public void desc(String tablename) throws Exception {
        this.stmt = this.con.createStatement();
        this.rs = this.stmt.executeQuery("desc " + tablename);
        this.rsmd = this.rs.getMetaData();
        String foramt = "%s\t| %s\t| %s\t| %s";
        for (int i = 0; i < this.rsmd.getColumnCount(); i++) {
            if (i != this.rsmd.getColumnCount() - 1) {
                System.out.print(this.rsmd.getColumnName(i + 1) + "\t|\t");
            } else
                System.out.print(this.rsmd.getColumnName(i + 1));
        }
        System.out.println();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        while (this.rs.next()) {
            for (int i = 0; i < this.rsmd.getColumnCount(); i++) {
                if (i != this.rsmd.getColumnCount() - 1) {
                    System.out.print(this.rs.getString(i + 1) + "\t|\t");
                } else
                    System.out.print(this.rs.getString(i + 1));
            }
            System.out.println();
        }
    }

    // this method will be used by insertTable method
    public String Dbmethod(String name) throws Exception {
        name = name.toUpperCase();
        String setInt[] = { "INTEGER", "INT", "SMALLINT", "TINYINT", "MEDIUMINT", "BIGINT", "DECIMAL", "NUMERIC" };
        String setDouble[] = { "FLOAT", "DOUBLE" };
        String setString[] = { "CHAR", "VARCHAR", "BINARY", "VARBINARY" };
        if (Arrays.asList(setInt).contains(name)) {
            return "setInt";
        } else if (Arrays.asList(setDouble).contains(name)) {
            return "setDouble";
        } else if (Arrays.asList(setString).contains(name)) {
            return "setString";
        } else
            return "hi";
    }

    // this method is used to insert a table in a database.This method requires Database name and Table name
    public int insertTable(String dbname, String tablename) throws Exception {
        selectDatabase(dbname);
        int i = insertTable(tablename);
        return i;
    }

    // this method is used to insert a table in a database.This method requires only Table name .Database name should be selected by selectdatabase method
    public int insertTable(String tablename) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String noOfdatatypes[] = descType(tablename);
        String qm = "";
        for (int i = 0; i < noOfdatatypes.length; i++) {
            if (i != noOfdatatypes.length - 1)
                qm += "?,";
            else
                qm += "?";
        }
        System.out.println("Enter the values of the datatypes with respectively");
        System.out.println();
        String query = "insert into " + tablename + " values (" + qm + ")";
        this.pstmt = this.con.prepareStatement(query);
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i < noOfdatatypes.length; i++) {
            String n = Dbmethod(noOfdatatypes[i]);
            System.out.println("Enter the value of this datatype " + noOfdatatypes[i] + " of this column "
                    + this.rsmd.getColumnLabel(i + 1) + "(" + this.rsmd.getColumnDisplaySize(i + 1) + ")");
            list.add(scanner.next());
            if (n.equals("setInt")) {
                this.pstmt.setInt((i + 1), Integer.valueOf((String) list.get(i))); 
            } else if (n.equals("setDouble")) {
                this.pstmt.setDouble((i + 1), (Double) list.get(i));
            } else if (n.equals("setString")) {
                this.pstmt.setString((i + 1), (String) list.get(i));
            }
        }
        int i = this.pstmt.executeUpdate();
        // System.out.println(i + " records inserted");
        // System.out.println(list);
        scanner.close();
        return i;
    }

    // this method will update a value in a row of a column.This method requires where condition 
    public void updateRow(String tablename) throws Exception {
        // selectDatabase(dbname);
        this.stmt = this.con.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values to set - ");
        int cols = scanner.nextInt();
        String query = "update " + tablename + " set ";
        System.out.println("");
        for (int i = 0; i < cols; i++) {
            System.out.print("Enter the name of the column:" + (i + 1) + " - ");
            if (i == 0) {
                String ss = scanner.nextLine();
            }
            String s = scanner.nextLine();
            query += s + " = ";
            System.out.print("Enter the Value of the column:" + (1 + i) + " - ");
            String d = scanner.nextLine();
            if (i != (cols - 1))
                query += "'" + d + "' , ";
            else
                query += "'" + d + "'";

            System.out.println();
        }
        query += " where ";
        System.out.println("Enter the where condition");
        String condition = scanner.nextLine();
        query += condition + ";";
        this.stmt.executeUpdate(query);
        scanner.close();
    }

    // 
    public void updateRow(String dbName, String tablename) throws Exception {
        selectDatabase(dbName);
        updateRow(tablename);
    }

    // 
    public void deleteRow(String tablename) throws Exception {
        String query = "delete from " + tablename + " where ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the condition");
        query += scanner.nextLine();
        System.out.println(query);
        this.stmt.executeUpdate(query);
        scanner.close();
    }

    // 
    public void executeUpdate() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the query");
        // String s = scanner.nextLine();
        String query = scanner.nextLine();
        System.out.println(this.stmt.executeUpdate(query) + " - Records added");
    }

    //
    public void executeQuery() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the query");
        // String s = scanner.nextLine();
        String query = scanner.nextLine();
        this.rs = this.stmt.executeQuery(query);
        // System.out.println(query);
        this.rsmd = this.rs.getMetaData();
        while (this.rs.next()) {
            for (int i = 0; i < this.rsmd.getColumnCount(); i++) {
                System.out.print(this.rs.getString(i + 1) + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

    // 
    public void executeQuery(String query) throws Exception {
        this.rs = this.stmt.executeQuery(query);
        // System.out.println(query);
        this.rsmd = this.rs.getMetaData();
        // while (this.rs.next()) {
        //     for (int i = 0; i < this.rsmd.getColumnCount(); i++) {
        //         System.out.print(this.rs.getString(i + 1) + "\t");
        //     }
        //     System.out.println();
        // }
    }

    // this method will insert a .sql file
    public void insertDotSql(File fr) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fr));
        this.stmt = this.con.createStatement();
        while (br.ready()) {
            String q = br.readLine();
            System.out.println(q);
            if (!(q.isEmpty()))
                this.stmt.executeUpdate(q);
        }
    }

    /**
     * 
     */
    public void toHTML() throws Exception{
        BufferedReader head = new BufferedReader(new FileReader("head.html"));
        BufferedReader end = new BufferedReader(new FileReader("end.html"));
        File file = new File("output.html");
        file.createNewFile();
        BufferedWriter output = new BufferedWriter(new FileWriter(file));

        while (head.ready()) {
            String v = head.readLine();
            output.write(v);
            output.flush();
        }

        output.write("<tr>");
        for (int i = 1; i <= this.rsmd.getColumnCount(); i++) {
            output.write("<td>" + this.rsmd.getColumnName(i) + "</td>");
        }
        output.write("</tr>");

        while (this.rs.next()) {
            output.write("<tr>");
            for (int i = 1; i <= this.rsmd.getColumnCount(); i++) {
                output.write("<td>" + this.rs.getString(i) + "</td>");
            }
            output.write("</tr>");
        }

        while (end.ready()) {
            String v = end.readLine();
            output.write(v);
            output.flush();
        }
    }

    public void toHTML(ResultSet rs) throws Exception{
        this.rs = rs;
        this.rsmd = rs.getMetaData();
        toHTML();
    }
}
