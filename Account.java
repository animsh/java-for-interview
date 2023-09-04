
public class Account {
    private String owner;
    private double balance;
    private double minimumBalance;

    public void deposit(double amount) {
        // implementation
    }

    public void withdraw(double amount) {
        // implementation
    }

    public int calculateCreditWorthiness() {
        // implementation
        return 100;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
