import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyDatabaseManager {

    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String db_url = "jdbc:mysql://localhost:3306/test";
    private final String username = "root";
    private final String password = null;
    private Connection connection = null;

    public void connect() throws Exception {
        Class.forName(driver);
        this.connection = DriverManager.getConnection(db_url, username, password);
    }

    public boolean close() {
        try {
            this.connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int insertItem(MyItem item) throws Exception {
        Statement statement = this.getStatement();
        String itemData = item.getDataStr();
        String sql = String.format("INSERT INTO Item (description,quantity,price) VALUES (%s)", itemData);
        int count = statement.executeUpdate(sql);
        statement.close();
        return count;
    }

    public MyItem getItem(int id) throws Exception {
        MyItem item = null;
        Statement statement = this.getStatement();
        String sql = String.format("SELECT * FROM Item WHERE id=%d", id);
        ResultSet result = statement.executeQuery(sql);
        if (result.next()) {
            item = new MyItem(result.getString("description"), result.getInt("quantity"), result.getInt("price"));
            item.setId(result.getInt("id"));
        }
        result.close();
        statement.close();
        return item;
    }

    public Statement getStatement() throws Exception {
        return this.connection.createStatement();
    }
}
