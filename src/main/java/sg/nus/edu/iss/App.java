package sg.nus.edu.iss;


public class App 
{
    public static void main( String[] args ){

        //create bankacct class

        //instantiate bankAcct class into one object here
        //call the get or set method to test
        // test the methods
        BankAccount bank1 = new BankAccount("Russell", 3000.00f);  
        bank1.deposit(20.00f);
        

        bank1.withdraw(50.00f);

        System.out.println(bank1.toString());

        FixedDepositAccount account2 = new FixedDepositAccount("Meow Meow", 2000.00f, 5, 18);
        System.out.println("Account Balance of fixed deposit =" + account2.getAccountBalance());
        account2.withdraw(100.0f);
        System.out.println("Account Balance of fixed deposit =" + account2.getAccountBalance());
        account2.deposit(100.0f);
        System.out.println("Account Balance of fixed deposit =" + account2.getAccountBalance());

        System.out.println(account2.toString());
        account2.setInterest(6);
        //account2.setInterest(10);

        account2.setDuration(18);
        account2.setDuration(10);

    }
}
