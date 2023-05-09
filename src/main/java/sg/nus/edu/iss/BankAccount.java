package sg.nus.edu.iss;

import java.sql.Date;
import java.util.List;

public class BankAccount {
    private String name;
    private String accountNumber;
    private float accountBalance;
    private List<String> accountTransactions;
    private boolean isClosed;
    private Date accountCreatedDate;
    private Date accountClosedDate;

    public BankAccount(String name, String accountNumber, float accountBalance, List<String> accountTransactions,
            boolean isClosed, Date accountCreatedDate, Date accountClosedDate) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountTransactions = accountTransactions;
        this.isClosed = isClosed;
        this.accountCreatedDate = accountCreatedDate;
        this.accountClosedDate = accountClosedDate;
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
    public void setAccountCreatedDate(Date accountCreatedDate) {
        this.accountCreatedDate = accountCreatedDate;
    }
    public Date getAccountClosedDate() {
        return accountClosedDate;
    }
    public void setAccountClosedDate(Date accountClosedDate) {
        this.accountClosedDate = accountClosedDate;
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
                + ", accountTransactions=" + accountTransactions + ", isClosed=" + isClosed + ", accountCreatedDate="
                + accountCreatedDate + ", accountClosedDate=" + accountClosedDate + "]";
    }

}
