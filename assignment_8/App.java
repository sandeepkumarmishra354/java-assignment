import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String args[]) {
        try {
            final MyDatabaseManager db = new MyDatabaseManager();
            final App app = new App();
            db.connect();
            // app.dropTable(db);
            app.createTable(db);
            app.insertAccounts(db);
            app.printWhereBalanceMoreThan(db, 10000);
        } catch (Exception excp) {
            excp.printStackTrace();
        }
    }

    private void createTable(MyDatabaseManager db) throws Exception {
        final String create_query = "CREATE TABLE IF NOT EXISTS Account"
                + "(id INTEGER NOT NULL AUTO_INCREMENT, accountNumber BIGINT, balance DOUBLE, accountType TEXT,name TEXT, PRIMARY KEY (id))";
        Statement crStatement = db.getStatement();
        crStatement.execute(create_query);
        crStatement.close();
    }

    private void dropTable(MyDatabaseManager db) throws Exception {
        Statement crStatement = db.getStatement();
        crStatement.execute("DROP TABLE IF EXISTS Account");
        crStatement.close();
    }

    // insert 10 records to database
    private void insertAccounts(MyDatabaseManager db) throws Exception {
        for (int i = 1; i <= 10; i++) {
            long accNo = 12153 * i;
            double balance = 1945.55 * i;
            String accHolder = "Account holder: " + i;
            String accType = (i % 2 == 0) ? "saving" : "current";
            Account account = new Account(accNo, balance, accType, accHolder);
            db.insertItem(account);
        }
    }

    // insert 10 records to database
    private void printWhereBalanceMoreThan(MyDatabaseManager db, double balance) throws Exception {
        ResultSet result = db.getWhereBalanceMoreThan(balance);
        while (result.next()) {
            Account account = new Account(result);
            System.out.println(String.format("acc no: %d\nname: %s\nacc type: %s\nbalance: %f\n",
                    account.getAccountNumber(), account.getName(), account.getAccountType(), account.getBalance()));
        }
        result.getStatement().close();
        result.close();
    }
}