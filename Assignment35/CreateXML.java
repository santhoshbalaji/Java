import java.io.*;
import java.sql.*;
import org.w3c.dom.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class CreateXML {
    public Statement stmt = null;
    public ResultSet rs = null;
    public ResultSetMetaData rsmd = null;
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document document = db.newDocument();
    Element Tablename = null;
    TransformerFactory transformerFactory = null;
     Transformer transformer = null;
     DOMSource source = null;
     StreamResult result = null;

    public CreateXML() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "");
        stmt = con.createStatement();
    }

    public void getTableName(String[] tableName) throws Exception {
        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Enter the table name");
        String[] tables = tableName;
        for(int i = 0; i < tables.length; i++ ){
            String query = "select * from "+tables[i];
            rs = stmt.executeQuery(query);
            rsmd = rs.getMetaData();
            generateXML();
            document.appendChild(Tablename);
        }
        transformerFactory = TransformerFactory.newInstance();
        transformer = transformerFactory.newTransformer();
        source = new DOMSource(document);
        result = new StreamResult(new File("DataDictionary.xml"));
        transformer.transform(source, result);    
    }

    public void generateXML() throws Exception {
        Tablename = document.createElement(rsmd.getTableName(1) + "s");
        int count = 0;
        while (rs.next()) {
            Element col = document.createElement(rsmd.getTableName(1));
            col.setAttribute("Column", "" + count);
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                Element rows = document.createElement(rsmd.getColumnName(i + 1));
                // col.setAttribute(rsmd.getColumnName(i + 1), rs.getString(i + 1));
                //  System.out.println(col.getNodeType());
                rows.setTextContent(rs.getString(i + 1));
                col.appendChild(rows);
            }
            count++;
            Tablename.appendChild(col);
        }
        
    }

    public static void main(String[] args) throws Exception {
        CreateXML cx = new CreateXML();
        String[] tables = {"city"};
        cx.getTableName(tables);
        // cx.getTableName("country");
    }
}