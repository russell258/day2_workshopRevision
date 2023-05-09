package sg.nus.edu.iss;

public class FixedDepositAccount extends BankAccount {
    private float interest = 3;
    private Integer duration = 6;
    private boolean isInterestSet = false;
    private boolean isDurationSet = false;


    public FixedDepositAccount(String name, Float accountBalance) {
        super(name, accountBalance);
    }

    public FixedDepositAccount(String name, float accountBalance, float interest) {
        super(name, accountBalance);
        this.interest = interest;
    }

    public FixedDepositAccount(String name, float accountBalance, float interest, Integer duration) {
        super(name, accountBalance);
        this.interest = interest;
        this.duration = duration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        if (!isInterestSet && interest>=0){
            this.interest = interest;
            this.isInterestSet = true;
        }else if (!isInterestSet && interest<0){
            System.out.println("Interest cannot be lower than 0");
        }else{
            throw new IllegalArgumentException("Interest has been set and can't be changed again");
        }

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (!isDurationSet && duration>=0){
            this.duration = duration;
            this.isDurationSet=true;
        }else if (!isDurationSet && duration<0){
            System.out.println("Duration cannot be lower than 0");
        }else{
            throw new IllegalArgumentException("Duration has been set and can't be changed again");
        }

    }

    public boolean isInterestSet() {
        return isInterestSet;
    }

    public void setInterestSet(boolean isInterestSet) {
        this.isInterestSet = isInterestSet;
    }

    public boolean isDurationSet() {
        return isDurationSet;
    }

    public void setDurationSet(boolean isDurationSet) {
        this.isDurationSet = isDurationSet;
    }

    @Override
    public void deposit(float depositAmount) {
        System.out.println("Unable to deposit into Fixed Deposit Account");
    }

    @Override
    public void withdraw(float withdrawAmount) {
        System.out.println("Unable to withdraw from Fixed Deposit Account");
    }

    @Override
    public float getAccountBalance() {
        System.out.println((float) (super.getAccountBalance()*Math.pow(((100.0+interest)/100),(this.duration/12.0))));
        return  (float) (super.getAccountBalance()*Math.pow(((100.0+interest)/100),(this.duration/12.0)));
    }

    
    

}
