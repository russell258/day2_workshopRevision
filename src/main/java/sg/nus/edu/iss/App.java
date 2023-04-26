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
    }
}
