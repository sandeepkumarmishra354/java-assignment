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

    public int insertItem(Account item) throws Exception {
        Statement statement = this.getStatement();
        String insertValues = item.getDataForSaving();
        String sql = String.format("INSERT INTO Account (accountNumber,balance,accountType,name) VALUES (%s)", insertValues);
        int count = statement.executeUpdate(sql);
        statement.close();
        return count;
    }

    public ResultSet getWhereBalanceMoreThan(double balance) throws Exception {
        Statement statement = this.getStatement();
        String sql = String.format("SELECT * FROM Account WHERE balance > %f", balance);
        ResultSet result = statement.executeQuery(sql);
        return result;
    }

    public Statement getStatement() throws Exception {
        return this.connection.createStatement();
    }
}
