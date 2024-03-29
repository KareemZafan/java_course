package oop.day8;

public class BankAccount {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double balance;

    private long id ;

    private String holder;

    public BankAccount() {
    }

    public BankAccount(long id, String holder) {
        this.id = id;
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }


    public void withdraw(double value){
        balance -= value;
    }  public void deposit(double value){
        balance += value;
    }

    public double balanceInquiry(double value) {
        return getBalance();
    }


}
