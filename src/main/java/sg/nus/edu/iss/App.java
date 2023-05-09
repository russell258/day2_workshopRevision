package sg.nus.edu.iss;


public class App 
{
    public static void main( String[] args ){
        BankAccount russell = new BankAccount("Russell", 10000);

        System.out.println(russell.toString());

        russell.deposit(9012);

        russell.withdraw(91200);
        System.out.println(russell.toString());
    }
}
