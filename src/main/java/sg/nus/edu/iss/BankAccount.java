package sg.nus.edu.iss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BankAccount {
    private String name;
    private String accountNumber;
    private float accountBalance;
    private List<String> accountTransactions = new ArrayList<String>();
    private boolean isClosed = false;
    private Date accountCreatedDate;
    private Date accountClosedDate;

    public BankAccount(String name) {
        this.name = name;
        this.accountNumber = UUID.randomUUID().toString();
        this.accountBalance = 0.0f;
        java.util.Date date = new java.util.Date();
        this.accountCreatedDate = (Date) date;
    }

    public BankAccount(String name, float accountBalance) {
        this.name = name;
        this.accountNumber = UUID.randomUUID().toString().toUpperCase();
        this.accountBalance = accountBalance;
        java.util.Date date = new java.util.Date();
        this.accountCreatedDate = date;
    }

    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public String getAccountNumber() {
        return accountNumber;
    }
    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }
    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public List<String> getAccountTransactions() {
        return accountTransactions;
    }
    public void setAccountTransactions(List<String> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
    public boolean isClosed() {
        return isClosed;
    }
    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
    public Date getAccountCreatedDate() {
        return accountCreatedDate;
    }
    // public void setAccountCreatedDate(Date accountCreatedDate) {
    //     this.accountCreatedDate = accountCreatedDate;
    // }
    public Date getAccountClosedDate() {
        return accountClosedDate;
    }
    public void setAccountClosedDate(Date accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }

    public void deposit(float depositAmount){
        if (depositAmount > 0 && !isClosed){
            java.util.Date date = new java.util.Date();
            this.accountBalance += depositAmount;
            System.out.println("Deposit SGD" + depositAmount + " at " + date);
            this.accountTransactions.add("Deposit SGD" + depositAmount + " at " + date);
        }else{
            throw new IllegalArgumentException("Please enter valid amount");
        }
    }

    public void withdraw(float withdrawAmount){
        if (withdrawAmount > 0 && !isClosed && withdrawAmount<accountBalance){
            java.util.Date date = new java.util.Date();
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdraw SGD" + withdrawAmount + " at " + date);
            this.accountTransactions.add("withdraw SGD" + withdrawAmount + " at " + date);
        }else{
            throw new IllegalArgumentException("Please enter valid amount");
        }
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
                + ", accountTransactions=" + accountTransactions + ", isClosed=" + isClosed + ", accountCreatedDate="
                + accountCreatedDate + ", accountClosedDate=" + accountClosedDate + "]";
    }

}
