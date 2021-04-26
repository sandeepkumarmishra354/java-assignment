import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Account> accounts = new ArrayList<Account>();

    public static void main(String args[]) {
        final App app = new App();
        app.insertAccounts();
        app.printWhereBalanceMoreThan(10000);
    }

    // insert 10 records to database
    private void insertAccounts() {
        for (int i = 1; i <= 10; i++) {
            long accNo = 12153 * i;
            double balance = 1945.55 * i;
            String accHolder = "Account holder: " + i;
            String accType = (i % 2 == 0) ? "saving" : "current";
            Account account = new Account(accNo, balance, accType, accHolder);
            this.accounts.add(account);
        }
    }

    private void printWhereBalanceMoreThan(double balance) {
        for (int i=0; i<this.accounts.size(); i++) {
            Account account = this.accounts.get(i);
            if(account.getBalance() > balance) {
                String message = String.format("name: %s\nacc no: %d\nbalance: %f\ntype: %s\n", account.getName(),
                        account.getAccountNumber(), account.getBalance(), account.getAccountType());
                System.out.println(message);
            }
        }
    }
}