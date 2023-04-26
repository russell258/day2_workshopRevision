package sg.nus.edu.iss;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

//create getter setter
// create constructor n params
// overload?
// override

public class BankAccount {
    private String accountName;
    private String accountNumber; //randomly genereated
    private float accountBalance; // check whether to use primitive or wrapper
    private ArrayList<String> accountTransactions; //should be arraylist cos will add on or append
    private boolean isClosed;
    private Date accountCreatedDate;
    private Date accountClosedDate;

    public BankAccount(){
    }

    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.accountBalance = 0.0f;
        this.isClosed = false;
        this.accountTransactions = new ArrayList<>();
        this.accountNumber = UUID.randomUUID().toString();
        java.util.Date date = new java.util.Date();
        this.setAccountCreatedDate(date);
    }

    public BankAccount(String accountName,  Float accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.isClosed = false;
        this.accountTransactions = new ArrayList<>();
        this.accountNumber = UUID.randomUUID().toString().toUpperCase();
        java.util.Date date = new java.util.Date();
        this.setAccountCreatedDate(date);
    }


    public String getAccountName() {
        return accountName;
    }

    // accountName cannot be set once it has been set in creation so remove it
    // public void setAccountName(String accountName) {
    //     this.accountName = accountName;
    // }
    public String getAccountNumber() {
        return accountNumber;
    }
    // accountNumber cannot be set once it has been set in creation so remove it
    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }
    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public ArrayList<String> getAccountTransactions() {
        return accountTransactions;
    }

    public Boolean getIsClosed() {
        return isClosed;
    }
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
        if (this.isClosed){
            java.util.Date date = new java.util.Date();
            this.setAccountClosedDate(date);
        }
    }
    public Date getAccountCreatedDate() {
        return accountCreatedDate;
    }
    public void setAccountCreatedDate(Date accountCreatedDate) {
        this.accountCreatedDate = accountCreatedDate;
    }
    public Date getAccountClosedDate() {
        return accountClosedDate;
    }
    public void setAccountClosedDate(Date accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }

    //deposit method
    public void deposit(Float depositAmount){
        if (depositAmount<0){
            System.out.println("Please enter a valid amount");
        }else if (isClosed){
            throw new IllegalArgumentException("Account was closed on "+this.getAccountClosedDate());
        }else{
            this.accountBalance += depositAmount;
            java.util.Date date = new java.util.Date();
            this.accountTransactions.add(depositAmount + " SGD was deposited on " + date);
            System.out.println(depositAmount + " SGD was deposited on " + date);
        }
    }
    
    //withdraw method
    public void withdraw(Float withdrawAmount){
        if (withdrawAmount<0){
            System.out.println("Please enter a valid amount");
        }else if (isClosed || withdrawAmount>this.accountBalance){
            throw new IllegalArgumentException("Account was closed on "+ this.getAccountClosedDate());
        }else{
            this.accountBalance -= withdrawAmount;
            java.util.Date date = new java.util.Date();
            this.accountTransactions.add(withdrawAmount + " SGD was withdrawn on " + date);
            System.out.println(withdrawAmount + " SGD was withdrawn on " + date);
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountBalance="
                + accountBalance + ", accountTransactions=" + accountTransactions + ", isClosed=" + isClosed
                + ", accountCreatedDate=" + accountCreatedDate + ", accountClosedDate=" + accountClosedDate + "]";
    }
    

}
