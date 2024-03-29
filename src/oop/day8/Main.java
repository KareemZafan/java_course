package oop.day8;

public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(93299239,"Kareem Mohamed");
        myBankAccount.setName("CIB");
        myBankAccount.setBalance(10000);
        /*System.out.println(ahlyBankATM.balanceInquiry(myBankAccount));*/

        BankMisrATM misrATM = new BankMisrATM();
        misrATM.withdraw(myBankAccount,1000);
        String currentBalance = misrATM.balanceInquiry(myBankAccount);

        System.out.println(currentBalance);

        Vehicle ship = new Ship();
        ship.setMaxSpeed(100);
        ship.start();
        ship.stop();



    }
}
