package oop.day8;

public abstract class ATM {
    private String name;
    private String location;
    private long id;

    private double balance;

    public ATM() {
    }

    public ATM(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract void withdraw(BankAccount myBankAccount, double amount);

    public abstract String balanceInquiry(BankAccount myBankAccount);


}
