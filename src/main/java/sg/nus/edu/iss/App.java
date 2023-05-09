package sg.nus.edu.iss;


public class App 
{
    public static void main( String[] args ){
        BankAccount russell = new BankAccount("Russell", 10000);

        System.out.println(russell.toString());

        russell.deposit(9012);

        russell.withdraw(900);
        System.out.println(russell.toString());

        FixedDepositAccount meow = new FixedDepositAccount("fixxxxy", 400.0f);
        System.out.println(meow.toString());

        meow.setInterest(7);
        meow.setDuration(-12);
        meow.deposit(333.33f);
        meow.withdraw(332.1f);
        meow.getAccountBalance();

        meow.setDuration(-2);
        meow.setDuration(24);
        meow.setInterest(10);
    }
}
