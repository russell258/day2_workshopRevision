package sg.nus.edu.iss;

public class FixedDepositAccount extends BankAccount{
    private float interest;
    private int duration;

    public FixedDepositAccount(String accountName, float accountBalance) {
        super(accountName, accountBalance);
        this.interest = 3;
        this.duration = 6;
    }

    public FixedDepositAccount(String accountName, float accountBalance, float interest) {
        super(accountName, accountBalance);
        this.interest = interest;
        this.duration = 6;
    }

    public FixedDepositAccount(String accountName, float accountBalance, float interest, int duration) {
        super(accountName, accountBalance);
        this.interest = interest;
        this.duration = duration;
    }


    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "FixedDepositAccount [interest=" + interest + ", duration=" + duration + ", accountNumber=" + this.getAccountNumber()+ ", accountBalance="+this.getAccountBalance()+"accountCreatedDate=" +this.getAccountCreatedDate()+ "]";
    }

    @Override
    public void withdraw(float withdrawAmount){
        System.out.println("Withdrawals cannot be made from a fixed deposit account.");
    }
    
    @Override
    public void deposit(float depositAmount){
        System.out.println("Deposits cannot be made into a fixed deposit account.");
    }

    @Override
    public float getAccountBalance(){
        float accountBalanceWithInt = super.getAccountBalance()*(float)(Math.pow((1.0f + this.interest/100.0f),((float)this.duration/12.0))); 
        return accountBalanceWithInt;
    }

}
