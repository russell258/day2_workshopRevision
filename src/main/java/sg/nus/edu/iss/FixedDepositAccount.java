package sg.nus.edu.iss;

public class FixedDepositAccount extends BankAccount{
    private float interest;
    private int duration;
    private boolean isInterestSet=false;
    private boolean isDurationSet=false;

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

    // can probably put more if conditions like no negative interest or < certain limit
    public void setInterest(float interest) {
        if (!isInterestSet){
            this.interest = interest;
            System.out.println("Interest has been changed to "+ this.interest+"%");
            isInterestSet = true;
        }else{
            throw new IllegalArgumentException("Interest has been changed once and cannot be changed again");
        }
    }

    public int getDuration() {
        return duration;
    }

    // can probably put more if conditions like no negative duration
    public void setDuration(int duration) {
        if (!isDurationSet){
            this.duration = duration;
            System.out.println("Duration has been changed to "+ this.duration+" months");
            isDurationSet = true;
        }else{
            throw new IllegalArgumentException("Duration has been changed once and cannot be changed again");
        }
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
