package ATM;

public abstract class Account {

    private String cardCC;
    private double balance;
    private double maxWithDrawal;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMaxWithDrawal() {
        return maxWithDrawal;
    }

    public void setMaxWithDrawal(double maxWithDrawal) {
        this.maxWithDrawal = maxWithDrawal;
    }
}
