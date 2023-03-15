package advancedFeatures.lecture03;

public abstract class Account {
    private double balance;
    private String accountNumber;

    public void deposit(double amount){
        balance += amount;

    }

    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Not enough funds");
            return;
        } else {
            System.out.println("Withdraw is made in sum " + amount);
        }
        balance -= amount;
    }


    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
