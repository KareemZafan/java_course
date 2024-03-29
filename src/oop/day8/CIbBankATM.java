package oop.day8;

public class CIbBankATM extends ATM {
    private static final byte ADDITIONAL_VALUE = 3;

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
