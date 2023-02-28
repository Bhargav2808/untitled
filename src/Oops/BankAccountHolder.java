package Oops;

public class BankAccountHolder {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.setAccountNumber("03520100019389");
        System.out.println(bank.getBalance());

        bank.depositFund(4453434);
        System.out.println(bank.getBalance());

        bank.withdraw(54252578);
        System.out.println(bank.getBalance());

    }
}
