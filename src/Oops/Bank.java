package Oops;

public class Bank {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(balance-amount<0){
            System.out.println("Sorry You don't have that much balance...");
        }
        else{
            balance = balance - amount;
        }
    }

}
