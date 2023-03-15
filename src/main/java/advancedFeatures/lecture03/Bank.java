package advancedFeatures.lecture03;

import java.sql.Array;

public class Bank {
    private Account[] accounts;
    private int numOfAccounts;

    public Bank(int maxSize) {
        accounts = new Account[maxSize];
        numOfAccounts = 0;
    }


    public void addAccount(Account account) {
        if (numOfAccounts < accounts.length) {
            accounts[numOfAccounts] = account;
            numOfAccounts++;
        }
    }

    public Account findAccount(String accountNumber) {
        for (int i = 0; i < numOfAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null){
            account.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount){
        Account account = findAccount(accountNumber);
        if (account != null){
            account.withdraw(amount);
        }
    }

    public double getBalance(String accountNumber){
        Account account = findAccount(accountNumber);
        if (account != null){
            return account.getBalance();
        }
        return 0.0;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }
}
