class BankAccount 
{
    String accountHolder;
    int accountNumber;
    double balance;
    BankAccount(String name, int accNo, double bal) 
    {
        accountHolder = name;
        accountNumber = accNo;
        balance = bal;
    }
    void deposit(double amount) 
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else 
        {
            System.out.println("Insufficient Balance");
        }
    }
    void display() 
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate = 5;
    SavingsAccount(String name, int accNo, double bal) 
    {
        super(name, accNo, bal);
    }
    void addInterest() 
    {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest Added: " + interest);
    }
}
class CurrentAccount extends BankAccount 
{
    double overdraftLimit = 1000;
    CurrentAccount(String name, int accNo, double bal) 
    {
        super(name, accNo, bal);
    }
    void checkOverdraft() 
    {
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
class Banking
{
    public static void main(String[] args) 
    {
        SavingsAccount s1 = new SavingsAccount("Dileep", 101, 5000);
        s1.deposit(2000);
        s1.withdraw(1000);
        s1.addInterest();
        s1.display();
        CurrentAccount c1 = new CurrentAccount("Kumar", 102, 3000);
        c1.deposit(1000);
        c1.checkOverdraft();
        c1.display();
    }
}