package advancedFeatures.lecture03;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, String accountNumber, double interestRate) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
