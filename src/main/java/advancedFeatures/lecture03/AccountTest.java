package advancedFeatures.lecture03;

public class AccountTest {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(200, "EE1234567");
        Account savingsAccount = new SavingsAccount(300, "EE9876543", 2.3);

        checkingAccount.deposit(300);
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(400);
        System.out.println(checkingAccount.getBalance());

        System.out.println(checkingAccount.getAccountNumber());
        Bank bank = new Bank(4);
        bank.addAccount(checkingAccount);
        bank.addAccount(savingsAccount);

        bank.deposit("EE1234567", 100);
        System.out.println(bank.getBalance("EE1234567"));
    }
}
