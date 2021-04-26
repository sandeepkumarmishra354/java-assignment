public class Account {
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

    public void setName(String name) {
        this.name = name;
    }
}
