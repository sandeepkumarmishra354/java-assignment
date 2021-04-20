import java.sql.Statement;

public class App {

    private static MyDatabaseManager databaseManager = null;

    public static void main(String args[]) {
        try {
            databaseManager = new MyDatabaseManager();
            databaseManager.connect();
            // create a new table Item if table not exists.
            final String create_query = "CREATE TABLE IF NOT EXISTS Item"
                    + "(id INTEGER NOT NULL AUTO_INCREMENT, description TEXT(300), quantity INTEGER, price INTEGER, PRIMARY KEY (id))";
            Statement crStatement = databaseManager.getStatement();
            crStatement.execute(create_query);
            crStatement.close();
            // insert new items.
            addNewItems();
            readItems();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (databaseManager != null)
                databaseManager.close();
        }
    }

    private static void addNewItems() throws Exception {
        // create 10 new items and save in database
        for (int i = 1; i <= 10; i++) {
            String desc = "item description: " + i;
            int quantity = 2 * i;
            int price = 100 * i;
            MyItem item = new MyItem(desc, quantity, price);
            databaseManager.insertItem(item);
        }
    }

    private static void readItems() throws Exception {
        // read item by given id
        for (int i = 1; i <= 10; i++) {
            MyItem item = databaseManager.getItem(i);
            if(item != null)
                System.out.println(item.getFormattedData()+"\n------------");
        }
    }
}