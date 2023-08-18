package itTask;

import java.time.LocalDate;

public class Customer extends Hello {
    public Person person;
    public Double balance;
    public LocalDate date;

    public Customer(Person person, Double balance, LocalDate date) {
        this.person = person;
        this.balance = balance;
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public Double getBalance() {
        return balance;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String sayHello() {
        return "Hello customer";
    }

    @Override
    public String introduce() {
        return getPerson().name + ", " + getPerson().getPhoneNumber();
    }

}
