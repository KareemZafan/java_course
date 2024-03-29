package oop.day8;

public class BankMisrATM extends ATM {

    public BankMisrATM() {
        this.setName("BanqueMisr");
    }

    private static final byte ADDITIONAL_VALUE = 5;

    @Override
    public void withdraw(BankAccount myBankAccount, double amount) {
        if (myBankAccount.getName().equals(getName())) {
            myBankAccount.setBalance(myBankAccount.getBalance() - amount);
        } else {
            myBankAccount.setBalance(myBankAccount.getBalance() - amount - ADDITIONAL_VALUE);
        }
        setBalance(getBalance() - amount);
    }

    @Override
    public String balanceInquiry(BankAccount myBankAccount) {
        if (myBankAccount.getName().equals(getName())) {
            myBankAccount.setBalance(myBankAccount.getBalance());
        } else {
            myBankAccount.setBalance(myBankAccount.getBalance() - ADDITIONAL_VALUE);
            setBalance(getBalance() + ADDITIONAL_VALUE);
        }

        return String.format("Balance = %.3f", myBankAccount.getBalance());
    }


}


