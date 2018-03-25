import DatabaseManager.Sql;
public class SqlTest{
    public static void main(String[] args) throws Exception {
        Sql one = new Sql("world");
        // one.showTables();
        //one.showDatabase();
        // one.desc("java");
        // one.insertTable("java");
        one.executeQuery("select * from city");
        // one.executeUpdate();
        one.toHTML();
        // one.executeQuery();
        // one.updateRow("java");
        // one.executeQuery("select * from java");
        // one.deleteRow("java");
    }
}
