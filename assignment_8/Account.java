import java.sql.ResultSet;

public class Account {
    private int id = -1;
    private long accountNumber;
    private double balance;
    private String accountType;
    private String name;

    public Account(long accNo, double blnce, String accType, String accHolder) {
        this.accountNumber = accNo;
        this.balance = blnce;
        this.accountType = accType;
        this.name = accHolder;
    }

    public Account(ResultSet resultSet) throws Exception {
        this.id = resultSet.getInt("id");
        this.accountNumber = resultSet.getLong("accountNumber");
        this.balance = resultSet.getDouble("balance");
        this.accountType = resultSet.getString("accountType");
        this.name = resultSet.getString("name");
    }

    /////////// getters ///////////
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /////////// setters ///////////
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //////////////////////////////////
    public String getDataForSaving() {
        return String.format("%d,%f,'%s','%s'", this.accountNumber, this.balance, this.accountType, this.name);
    }
}
